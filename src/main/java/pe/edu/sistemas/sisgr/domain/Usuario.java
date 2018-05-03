package pe.edu.sistemas.sisgr.domain;
// Generated 02/05/2018 07:58:08 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "dbbuensabor")
public class Usuario implements java.io.Serializable {

	private Integer idusuario;
	private Persona persona;
	private String usuarioUsuario;
	private String usuarioContrasena;
	private Set<Rol> rols = new HashSet<Rol>(0);

	public Usuario() {
	}

	public Usuario(Persona persona, String usuarioUsuario, String usuarioContrasena, Set<Rol> rols) {
		this.persona = persona;
		this.usuarioUsuario = usuarioUsuario;
		this.usuarioContrasena = usuarioContrasena;
		this.rols = rols;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDUSUARIO", unique = true, nullable = false)
	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USUARIO_IDPERSONA")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "USUARIO_USUARIO", length = 45)
	public String getUsuarioUsuario() {
		return this.usuarioUsuario;
	}

	public void setUsuarioUsuario(String usuarioUsuario) {
		this.usuarioUsuario = usuarioUsuario;
	}

	@Column(name = "USUARIO_CONTRASENA")
	public String getUsuarioContrasena() {
		return this.usuarioContrasena;
	}

	public void setUsuarioContrasena(String usuarioContrasena) {
		this.usuarioContrasena = usuarioContrasena;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_rol", catalog = "dbbuensabor", joinColumns = {
			@JoinColumn(name = "USR_ROL_IDUSUARIO", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "USR_ROL_IDROL", nullable = false, updatable = false) })
	public Set<Rol> getRols() {
		return this.rols;
	}

	public void setRols(Set<Rol> rols) {
		this.rols = rols;
	}

}
