package org.mvazquez.api.apisaludos.services;

import java.util.List;
import org.apache.juli.logging.*;
import org.mvazquez.api.apisaludos.models.*;
import org.springframework.stereotype.Service;

/*
 * Esta clase nos crea un objeto saludo y hace su magia en cuanto a manipularlo.
 */

@Service
public class SaludoService implements CRUDService{

	Log log = LogFactory.getLog(Saludos.class);
	
	@Override
	public void addNew(Object nuevo) throws CRUDException {
		// TODO Auto-generated method stub
		log.info("Añadimos un nuevo saludo");
	}

	@Override
	public void update(Object existente) throws CRUDException {
		// TODO Auto-generated method stub
		log.info("Actualizamos un saludo que ya existe");
	}

	@Override
	public void delete(int id) throws CRUDException {
		// TODO Auto-generated method stub
		log.info("Borramos un saludo que ya existe, definido por su id");
	}

	@Override
	public List findAll() throws CRUDException {
		// TODO Auto-generated method stub
		log.info("Devolvemos todos los saludos registrados");
		return null;
	}

	@Override
	public Object findById(int id) throws CRUDException {
		// TODO Auto-generated method stub
		log.info("Devolvemos un saludo identificado por su id");
		return null;
	}
}
