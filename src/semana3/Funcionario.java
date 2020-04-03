package semana3;

import java.util.Date;

public class Funcionario extends Persona {
	
	//Atributos
	private Date horario;
	private String cargo;
	
	//Constructor
	public Funcionario(String nombre, String apellido, double altura, Date horario, String cargo) {
		super(nombre, apellido, altura);
		this.horario = horario;
		this.cargo = cargo;
	}
	
	//Metodos
	public void crear(Funcionario funcionario) {
		
		// TODO: Este método crea un funcionario, recibiendo un Funcionario como parametro
		//
	}
	
	

}
