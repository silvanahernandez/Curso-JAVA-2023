package proyectoCaja;

public class ProyectoCaja {
	
	//Atributos de la clase
	int ancho;
	int alto;
	int profundo;
	
	//Constructor vacio
	public ProyectoCaja() {
		System.out.println("Constructor ejecutando");
	}
	
	//Sobrecarga de constructores
	public ProyectoCaja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		System.out.println("Constructor con argumentos ejecutando");
	}
	
	//Metodo de la clase sin retorno
	public void volumen () {
		int volumen = ancho * alto * profundo;
		System.out.println("Resultado del volumen:" + volumen);
	}
	
	//Metodo de la clase con retorno
	public int calcularVolumen() {
		return this.ancho * this.alto * this.profundo;
	}
	
	//Metodo de la clase con argumentos
	public int calcularVolumenArgumentos(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		return this.calcularVolumen();
	}
	

}
