package isi.died.parcial01.ejercicio01.bioagrojava;

import java.time.LocalDate;

public class Venta {
	private int nroVenta;
	private LocalDate fecha;
	private double montoTotal;
	public int getNroVenta() {
		return nroVenta;
	}
	
	public Venta(int nroVenta, LocalDate fecha, double montoTotal) {
		this.nroVenta = nroVenta;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
	}

	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
}
