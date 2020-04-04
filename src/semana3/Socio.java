package semana3;

import java.sql.Date;

public class Socio extends Persona {
	//Atributos
	private Date fechaIngreso;
	private int frecuencia;
	//Constructor
public Socio(String nombre, String apellido,Date fechaDeNacimiento, String sexo, int ci, String direccion,int telefono, double altura, Date fechaIngreso, int frecuencia) {
	super(nombre, apellido, fechaDeNacimiento, sexo, ci, direccion, telefono);
	this.fechaIngreso=fechaIngreso;
	this.frecuencia=frecuencia;
		
}
//Metodo
 private void calcularDescuento(Cuota cuota) {
	  
	 // TODO: devuelve el valor de la cuota, utilizando los datos de Clase Cuota.
 }

}





