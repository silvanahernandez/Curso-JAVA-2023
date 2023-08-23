package operaciones;

public class Aritmetica {
	//ATRIBUTOS
	int a;
	int b;
	
	//METODOS DE LA CLASE
	public void sumar() {
		int resultado = a + b;
		System.out.println("Resultado = " + resultado);
	}
	
	//CONSTRUCTOR VACIO
	public Aritmetica() {
		System.out.println("Ejecutando el constructor");
	}
	
	//SOBRECARGA DE CONSTRUCTORES ES CUANDO HAY 2 O MAS CONSTRUCTORES
	//EN UNA MISMA CLASE
	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando el constructor con argumentos");
	}
	
	//METODO CON RETORNO
	public int sumaConRetorno() {
		return this.a + this.b;
	}
	
	public int sumarConArgumentos(int a, int b) {
		this.a = a; //El argumento a se asigna al atributo this.a
		this.b = b; //El argumento b se asigna al atributo this.b
		
		//return a + b;
		return this.sumaConRetorno();
	}
}

