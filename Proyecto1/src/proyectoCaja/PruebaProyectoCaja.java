package proyectoCaja;

public class PruebaProyectoCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProyectoCaja proyectoCaja1 = new ProyectoCaja(5, 1, 9);
		
		int volumen = proyectoCaja1.calcularVolumenArgumentos(5, 1, 9);
		System.out.println("Resultado volumen: " + volumen);
	}

}
