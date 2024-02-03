package ejercicioInternetServicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
	
	private int numAlarmas;
	

	public RevisionAlarma() {
	}
	

	public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente, int numAlarmas) {
		super(trabajador, fechaInicio, cliente);
		this.numAlarmas = numAlarmas;
		this.trabajador = "Revisor Especialista Contraincendios";
	}


	public int getNumAlarmas() {
		return numAlarmas;
	}


	public void setNumAlarmas(int numAlarmas) {
		this.numAlarmas = numAlarmas;
	}


	@Override
	public double costeMaterial() {
		return 0;
	}

	@Override
	public double costeManoObra() {
		return (numAlarmas/3)*40;
	}

	@Override
	public double costeTotal() {
		return costeManoObra();
	}

	@Override
	public String detalleServicio() {
		System.out.println("REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS");
		System.out.println("Cliente: "+cliente);
		System.out.println("Fecha revisión: "+LocalDate.now());
		System.out.println("------------------------------------------");
		System.out.println("TOTAL:........"+costeTotal());
		System.out.println("------------------------------------------");
		return null;
	}

	

}
