package semana3;

import java.sql.Date;

public class Socio extends Persona {
	//Atributos
	private Date fechaIngreso;
	private int frecuencia;
	//Constructor
public Socio(String nombre, String apellido,Date fechaNacimiento, String sexo, int ci, String direccion,int telefono, double altura, Date fechaIngreso, int frecuencia) {
	super(nombre, apellido, altura, fechaNacimiento, sexo, ci, direccion, telefono);
	this.fechaIngreso=fechaIngreso;
	this.frecuencia=frecuencia;
	
	
}

 

}





