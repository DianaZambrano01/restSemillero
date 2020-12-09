package com.clearminds.smo.dzh.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.dzh.dtos.Estudiante;
import com.clearminds.dzh.excepciones.BDDException;
import com.clearminds.dzh.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar (Estudiante estudiante){
		ServicioEstudiante srv = new ServicioEstudiante();
		
		try {
			srv.insertEstudiante(estudiante);
		} catch (BDDException e) {
			
			e.printStackTrace();
		}
	}
	@Path("/actualizar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar (Estudiante estudiante){
		ServicioEstudiante srv = new ServicioEstudiante();
		
		try {
			srv.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
