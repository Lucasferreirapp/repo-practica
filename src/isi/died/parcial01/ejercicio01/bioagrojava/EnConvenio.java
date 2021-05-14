package isi.died.parcial01.ejercicio01.bioagrojava;

import java.time.LocalDate;
import java.util.ArrayList;

public class EnConvenio extends Empleado{
	
	private int antiguedad;
	private double sueldoBasico;
	

	public EnConvenio(int cuil, String nombre, LocalDate fechaNac, String email, ArrayList<Venta> ventas,
			int antiguedad, double sueldoBasico) {
		super(cuil, nombre, fechaNac, email, ventas);
		this.antiguedad = antiguedad;
		this.sueldoBasico = sueldoBasico;
	}

	@Override
	public double calcularSueldo() {
		double montoTotal = this.sueldoBasico;
		
		for(Venta venta:this.ventas) {
			montoTotal += venta.getMontoTotal()*0.3;
		}
		
		montoTotal = montoTotal * 0.86;
		
		if(this.getFechaNac().getMonthValue() == LocalDate.now().getMonthValue()) {
			montoTotal += montoTotal*0.5;
		}
		
		return montoTotal;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
}
