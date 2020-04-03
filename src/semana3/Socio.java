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
// public void calcularDescuento(Cuota cuota) {	
public void mostrarNombreApellidosyFechadeIgreso() {

}
}
public class TestHerencia1{
	public static void main (String[] args) {
		Socio socio1=new Socio("Pepe","Macri","1,66","23/08/1999","3");
		socio1.crear(socio1);
		socio1.mostrarNombreApellidosyFechadeIgreso();
	}
	}
	
	
	

}
