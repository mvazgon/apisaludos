package org.mvazquez.api.apisaludos.models;

import lombok.*;

/*
 * Esta clase la decoramos con las anotaciones:
 * @ToString() para podedr sacar la info del saludo
 * @AllArgsConstructor para crear un objeto con argumentos
 * @NoArgsConstructor para crear objetos vacios. 
 */
@ToString()
@AllArgsConstructor()
@NoArgsConstructor()
public class Saludos {
	/*
	 * Creamos con estas anotaciones Getter y Setters de la propiedd
	 */
	@Getter @Setter
	private int id;
	
	@Getter @Setter
	private String saludo;
}
