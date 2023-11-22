package org.mvazquez.api.apisaludos.controllers;

import java.util.List;

import org.mvazquez.api.apisaludos.models.Saludos;
import org.mvazquez.api.apisaludos.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class SaludoController {

	@Autowired 
	SaludoService service;
	
	@GetMapping("/saludos/")
	public ResponseEntity<List<Saludos>> index() throws CRUDException{
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/saludos/{id}")
	public ResponseEntity<Object> saludo(@PathVariable()int id) throws CRUDException{
		return ResponseEntity.ok(service.findById(id));
	}
	
	@PostMapping("/saludos")
	public ResponseEntity<ControllerResponse> post(@RequestBody() Saludos nuevo){
		try {
			service.addNew(nuevo);
			return ResponseEntity.ok(ControllerResponse.builder()
					.operacion("POST Nuevo")
					.success(true)
					.mensaje("Automovil nuevo registrado")
					.entidadAfectada(nuevo)
					.build());
		} catch (Exception e){
			return ResponseEntity.internalServerError()
					.body(ControllerResponse.builder()
					.operacion("POST")
					.success(false)
					.mensaje(e.getMessage())
					.entidadAfectada(null)
					.build()); 
		}
	}

	@PutMapping("/saludos/{id}")
	public ResponseEntity<ControllerResponse> put(@RequestBody() Saludos exist){
		try {
			service.update(exist);
			return ResponseEntity.ok(ControllerResponse
										.builder()
										.operacion("PUT Existente")
										.success(true)
										.mensaje("Automovil modificadodo")
										.entidadAfectada(exist)
										.build());
		}catch (Exception e) {
			return ResponseEntity.internalServerError().body(ControllerResponse.builder()
																.operacion("Update")
																.success(false)
																.mensaje(e.getMessage())
																.entidadAfectada(null)
																.build());
		}	
	}
	
	@RequestMapping(value="/saludos/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ControllerResponse> delete(@PathVariable()int id){
		try {
			service.delete(id);
			return ResponseEntity.ok(ControllerResponse
					.builder()
					.operacion("DELETE Existente")
					.success(true)
					.mensaje("Automovil eliminado")
					.entidadAfectada(id)
					.build());
		}catch (Exception e){
			return ResponseEntity.internalServerError().body(ControllerResponse
					.builder()
					.operacion("DELETE")
					.success(false)
					.mensaje(e.getMessage())
					.entidadAfectada(null)
					.build());
		}
	}
}
