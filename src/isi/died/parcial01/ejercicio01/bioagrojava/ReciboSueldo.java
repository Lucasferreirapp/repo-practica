package isi.died.parcial01.ejercicio01.bioagrojava;

import java.time.Month;

public class ReciboSueldo {
	private int numero;
	private Month mes;
	private double totalDelPago;
	private Empleado empleado;
	
	public ReciboSueldo( Month mes,double totalDelPago, Empleado empleado ) {
		this.mes = mes;
		this.totalDelPago = totalDelPago;
		this.empleado = empleado;	
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Month getMes() {
		return mes;
	}
	public void setMes(Month mes) {
		this.mes = mes;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public double getTotalDelPago() {
		return totalDelPago;
	}
	public void setTotalDelPago(double totalDelPago) {
		this.totalDelPago = totalDelPago;
	}
}
