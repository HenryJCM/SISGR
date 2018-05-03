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
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name = "rol", catalog = "dbbuensabor")
public class Rol implements java.io.Serializable {

	private Integer idrol;
	private String rolNombre;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public Rol() {
	}

	public Rol(String rolNombre, Set<Usuario> usuarios) {
		this.rolNombre = rolNombre;
		this.usuarios = usuarios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDROL", unique = true, nullable = false)
	public Integer getIdrol() {
		return this.idrol;
	}

	public void setIdrol(Integer idrol) {
		this.idrol = idrol;
	}

	@Column(name = "ROL_NOMBRE", length = 100)
	public String getRolNombre() {
		return this.rolNombre;
	}

	public void setRolNombre(String rolNombre) {
		this.rolNombre = rolNombre;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_rol", catalog = "dbbuensabor", joinColumns = {
			@JoinColumn(name = "USR_ROL_IDROL", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "USR_ROL_IDUSUARIO", nullable = false, updatable = false) })
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
