package clases;

public class PruebaPersona {

	public static void main(String[] args) {
		/* Se quita esta creación de objeto ya que con la creación de abajo se solventa, 
		 * se crea directamente y se asigna el constructor
		Persona persona1; */
		
		Persona persona1 = new Persona();
		
		persona1.nombre = "Silvana";
		persona1.apellido = "Hernandez";
		persona1.desplegarInformacion();
	}

}
