package semana3;

import java.sql.Date;

public class Socio extends Persona {
	//Atributos
	private Date fechaIngreso;
	private int frecuencia;
	//Constructor
public Socio(String nombre, String apellido, Date fechaIngreso, int frecuencia) {
	super(nombre, apellido);
	this.fechaIngreso=fechaIngreso;
	this.frecuencia=frecuencia;
	
}
public void crear(Socio socio ) {
	//
	
}
	
	
	
	

}
