package semana3;

import java.util.Date;

public class Persona {
	
	// atributos
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private String sexo;
	private int ci;
	private String direccion;
	private int telefono;
	
	// constructor
	public Persona(String nombre, String apellido, Date fechaDeNacimiento, String sexo, int ci, String direccion,
			int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sexo = sexo;
		this.ci = ci;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	// metodos
	public int calcularEdad() {
		// TODO: Devolver la cantidad de años de fecha actual - this.fechaDeNacimiento
		//       en formato entero
		return 0;
	}

}
