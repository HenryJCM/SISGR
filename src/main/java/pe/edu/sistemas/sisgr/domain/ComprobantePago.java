package pe.edu.sistemas.sisgr.domain;
// Generated 02/05/2018 07:58:08 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ComprobantePago generated by hbm2java
 */
@Entity
@Table(name = "comprobante_pago", catalog = "dbbuensabor")
public class ComprobantePago implements java.io.Serializable {

	private Integer idcomprobantePago;
	private Pedido pedido;
	private String comprobantePagoTipo;
	private Integer comprobanteIddescuento;

	public ComprobantePago() {
	}

	public ComprobantePago(Pedido pedido) {
		this.pedido = pedido;
	}

	public ComprobantePago(Pedido pedido, String comprobantePagoTipo, Integer comprobanteIddescuento) {
		this.pedido = pedido;
		this.comprobantePagoTipo = comprobantePagoTipo;
		this.comprobanteIddescuento = comprobanteIddescuento;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDCOMPROBANTE_PAGO", unique = true, nullable = false)
	public Integer getIdcomprobantePago() {
		return this.idcomprobantePago;
	}

	public void setIdcomprobantePago(Integer idcomprobantePago) {
		this.idcomprobantePago = idcomprobantePago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPROBANTE_IDPEDIDO", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Column(name = "COMPROBANTE_PAGO_TIPO", length = 45)
	public String getComprobantePagoTipo() {
		return this.comprobantePagoTipo;
	}

	public void setComprobantePagoTipo(String comprobantePagoTipo) {
		this.comprobantePagoTipo = comprobantePagoTipo;
	}

	@Column(name = "COMPROBANTE_IDDESCUENTO")
	public Integer getComprobanteIddescuento() {
		return this.comprobanteIddescuento;
	}

	public void setComprobanteIddescuento(Integer comprobanteIddescuento) {
		this.comprobanteIddescuento = comprobanteIddescuento;
	}

}
