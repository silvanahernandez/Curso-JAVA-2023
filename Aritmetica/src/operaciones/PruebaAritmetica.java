package operaciones;

public class PruebaAritmetica {

	public static void main(String[] args) {
		Aritmetica aritmetica1 = new Aritmetica();
		System.out.println("Resultado aritmetica1 = " + aritmetica1.a);
		System.out.println("Resultado aritmetica1 = " + aritmetica1.b);
		
		Aritmetica aritmetica2 = new Aritmetica(5, 8);
		System.out.println("Resultado aritmetica2 = " + aritmetica2.a);
		System.out.println("Resultado aritmetica2 = " + aritmetica2.b);
		
		
		/*aritmetica1.a = 3;
		aritmetica1.b = 2;
		aritmetica1.sumar();
		
		int resultado = aritmetica1.sumaConRetorno();
		System.out.println("Resultado2 = " + resultado);
		
		resultado = aritmetica1.sumarConArgumentos(5, 8);
		System.out.println("Resultado usando argumentos = " + resultado);*/
		
	}

}
