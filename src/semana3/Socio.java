package semana3;

import java.sql.Date;

public class Socio extends Persona {
	//Atributos
	private Date fechaIngreso;
	private int frecuencia;
	//Constructor
public Socio(String nombre, String apellido,double altura, Date fechaIngreso, int frecuencia) {
	super(nombre, apellido, altura);
	this.fechaIngreso=fechaIngreso;
	this.frecuencia=frecuencia;
	
}
public void crear(Socio socio ) {
	// Este metodo crea un nuevo socio

	
}
 //public void calcularDescuento(Cuota cuota) {	


}

//}



