package isi.died.parcial01.ejercicio01.bioagrojava;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contratado extends Empleado{

	private int horasTrabajadas;
	private double costoPorHora;
	private double objetivoVenta;
	
	public Contratado(int cuil, String nombre, LocalDate fechaNac, String email, ArrayList<Venta> ventas,
			int horasTrabajadas, double costoPorHora, double objetivoVenta) {
		super(cuil, nombre, fechaNac, email, ventas);
		this.horasTrabajadas = horasTrabajadas;
		this.costoPorHora = costoPorHora;
		this.objetivoVenta = objetivoVenta;
	}

	@Override
	public double calcularSueldo() {
		double cincoHorasPorCosto = this.costoPorHora * 5;
		double montoTotal = this.costoPorHora * this.horasTrabajadas;
		double objetivo = 0;
		int contadorVentas = 0;
		
		for(Venta venta:this.ventas) {
			contadorVentas++;
			objetivo += venta.getMontoTotal();
		}
		if(objetivo >= this.objetivoVenta) {
			montoTotal += cincoHorasPorCosto * contadorVentas;
		}
		
		if(this.getFechaNac().getMonthValue() == LocalDate.now().getMonthValue()) {
			montoTotal += montoTotal*0.5;
		}
		
		return montoTotal;
	}
	
	
	
}
