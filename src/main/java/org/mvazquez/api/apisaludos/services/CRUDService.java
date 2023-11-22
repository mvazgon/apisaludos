package org.mvazquez.api.apisaludos.services;

import java.util.*;

/*
 * This interface we can define the methods to class implements this and override its.  
 */

public interface CRUDService<T>{
	/*^
	 * Define this method how public to add new object T, 
	 * @param a object T 
	 * @return void, if it fall then write a message by the CRUDException object
	 */
	public void addNew(T nuevo) throws CRUDException;
	
	/*
	 * Define this method how public update data of one object T
	 * @param a object T
	 * @return void, if it fail then write a message by the CRUDException object
	 */
	public void update(T existente) throws CRUDException;
	
	/*
	 * Define this method how public to delete a object T
	 * @param int id
	 * @return void, if it fail then write a message by the CRUDException object
	 */
	public void delete(int id) throws CRUDException;
	
	/*
	 * Define this method to return a list of objects T
	 * @param void
	 * @return a List of object, the List will can be empty
	 */
	public List<T> findAll() throws CRUDException;
	
	/*
	 * Define this method to return a object T
	 * @param id
	 * @return a object T, if it fail then write a message by the CRUDException object
	 */
	public T findById(int id) throws CRUDException;

}
