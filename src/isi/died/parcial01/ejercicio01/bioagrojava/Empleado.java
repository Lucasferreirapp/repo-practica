package isi.died.parcial01.ejercicio01.bioagrojava;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Empleado {

	protected int cuil;
	protected String nombre;
	protected LocalDate fechaNac;
	protected String email;
	protected ArrayList<Venta> ventas;
	
	public Empleado(int cuil, String nombre, LocalDate fechaNac, String email, ArrayList<Venta> ventas) {
		this.cuil = cuil;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.email = email;
		this.ventas = ventas;
	}
	
	public abstract double calcularSueldo();
	
	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	
	
}
