package semana3;

import java.util.Date;

public class Funcionario extends Persona {
	
	// Atributos
	private Date horario;
	private String cargo;
		
	//Constructor
	public Funcionario(String nombre, String apellido, Date fechaDeNacimiento, String sexo,
			int ci, String direccion, int telefono, Date horario, String cargo) {
		super(nombre, apellido, fechaDeNacimiento, sexo, ci, direccion, telefono);
		this.horario = horario;
		this.cargo = cargo;
	}	
	
	// Metodos
	// No requiere método crear ya que lo hace por medio del Constructor

}
