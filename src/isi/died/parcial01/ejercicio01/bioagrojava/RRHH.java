package isi.died.parcial01.ejercicio01.bioagrojava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class RRHH {

	
	public ArrayList<ReciboSueldo> generarRecibos( ArrayList<Empleado> empleados){
		
		return (ArrayList<ReciboSueldo>) empleados.stream()
				.map(empleado -> new ReciboSueldo(LocalDate.now().getMonth(), empleado.calcularSueldo(),empleado))
				.collect(Collectors.toList());
	}
}
