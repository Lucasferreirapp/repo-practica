package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.dominio.*;
import isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws PersonalizadaException, NoPerteneceCatedraException {
		
		try {
			if(!d.getCatedras().contains(m)) {
				throw new NoPerteneceCatedraException();
			}
			Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
			d.agregarInscripcion(insc);
			a.addCursada(insc);
			m.addInscripcion(insc);
			// DESCOMENTAR Y gestionar excepcion
			 DB.guardar(insc);
			
		}
		catch (BaseDeDatosExcepcion e) {
			e.printStackTrace();
			throw new PersonalizadaException(e.getMessage());
		}
		catch (NoPerteneceCatedraException e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	
	public void registrarNota(int nota, Examen examen) {
		examen.setNota(nota);
		Alumno alumno = examen.getAlumno();
		List<Inscripcion> materiasCursadas = alumno.getMateriasCursadas();
		Materia materiaExamen = examen.getMateria();
		
        if(nota >= 6) {
        	for(int i=0; i<alumno.getMateriasCursadas().size(); i++) {
        		Inscripcion inscripcionActual = materiasCursadas.get(i);
        		Materia materiaActual = inscripcionActual.getMateria();
        		if(materiaActual.equals(materiaExamen)) {
        			inscripcionActual.setEstado(Estado.PROMOCIONADO);
        		}
        	}
        }
    }
	
//	Se me cerro la encuesta :( no pude terminar

}
