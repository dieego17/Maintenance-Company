package ejercicioInternetServicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
	
	private double superficie;
	private double precioPintura;
	
	public TrabajoPintura() {
	}

	public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie,
			double precioPintura) {
		super(trabajador, fechaInicio, cliente);
		this.superficie = superficie;
		this.precioPintura = precioPintura;
	}
	

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getPrecioPintura() {
		return precioPintura;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}

	
	
	@Override
	public double costeMaterial() {
		return (superficie/7.8)*precioPintura;
	}

	@Override
	public double costeManoObra() {
		return (superficie/10)*9.5;
	}

	public double costeAdicional() {
		return 1.15;
	}
	@Override
	public double costeTotal() {
		double costeTotal = 0;
		if(superficie < 50) {
			costeTotal = costeMaterial()+ costeManoObra()*costeAdicional(); 
		}else {
			costeTotal = costeMaterial()+costeManoObra();
		}
		return costeTotal;
	}

	@Override
	public String detalleServicio() {
		System.out.println("TRABAJO DE PINTURA");
		System.out.println("Cliente: "+cliente);
		System.out.println("Fecha inicio: "+fechaInicio);
		System.out.println("---------------------------------------");
		System.out.println("Pintor: "+trabajador);
		System.out.println("Coste Material......"+costeMaterial()+"€");
		System.out.println("Coste Mano Obra......"+costeManoObra()+"€");
		System.out.println("Coste Adicional......"+costeAdicional()+"%");
		System.out.println("TOTAL......"+costeTotal()+"€");
		System.out.println("------------------------------------------");
		return null;
	}
	
//	public static void main(String[] args) {
//		TrabajoPintura tp1 = new TrabajoPintura("Diego", LocalDate.now(), "Rubio", 30, 5);
//		tp1.detalleServicio();
//	}

}
