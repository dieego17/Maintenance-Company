package ejercicioInternetServicios;

import java.time.LocalDate;

public abstract class Servicio {

	protected String trabajador;
	protected LocalDate fechaInicio;
	protected String cliente;
	
	protected Servicio() {
	}

	protected Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
		this.trabajador = trabajador;
		this.fechaInicio = fechaInicio;
		this.cliente = cliente;
	}

	protected String getTrabajador() {
		return trabajador;
	}

	protected void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	protected String getCliente() {
		return cliente;
	}

	protected void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public abstract double costeMaterial();
	public abstract double costeManoObra();
	public abstract double costeTotal();
	public abstract String detalleServicio();
	
	
	
}
