package ejercicioInternetServicios;

import java.time.LocalDate;
import java.util.ArrayList;

import ejercicioInternetSuperheroes.Figura;

public class AppPrueba {

	public static void main(String[] args) {
		
		
		ArrayList <Servicio> listaServicios =  new ArrayList<>();

		
		TrabajoPintura tp1 = new TrabajoPintura("Diego", LocalDate.now(), "Rubio", 30, 5);
		RevisionAlarma ra1 = new RevisionAlarma("Adrián", LocalDate.now(), "Marta", 4);
		
		tp1.detalleServicio();
		ra1.detalleServicio();
		
		System.out.println("----------------------------------------------");
		
		listaServicios.add(tp1);
		listaServicios.add(ra1);
		double costeTotalTrabajos = 0;
		double costeTotalSueldos = 0;
		for(Servicio s : listaServicios) {
			costeTotalTrabajos += s.costeTotal();
			costeTotalSueldos += s.costeManoObra();
		}
		System.out.println("El coste total de todos los trabajos es de "+Math.floor(costeTotalTrabajos)+"€");
		System.out.println("El sueldo total de todos los trabajadores es de "+Math.floor(costeTotalSueldos)+"€");
		

	}

}
