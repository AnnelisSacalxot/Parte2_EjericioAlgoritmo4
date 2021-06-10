import java.util.*;

public class Ejercicio4_2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		 // como son 20 muestras le  indicamos de una vez
		double numMayor = 0, numMenor = 0, numeros;

		System.out.println("Digite 20 números para saber cual es el mayor y menos de ellos");

//Imprimimos resultado final y operaciones correspondientes para comparar el numero mayor y menor
 // como son 20 muestras le  indicamos de una vez
		
		for (int i = 0; i < 20 ; i++ ) {

			System.out.println("Ingrese número: "+(i+1));
			numeros = leer.nextDouble(); 

			if (i == 0) {

				numMenor = numeros;
				numMayor = numeros;

			} else if (numeros < numMenor) {

				numMenor = numeros;

			} if (numeros > numMayor) {
				
				numMayor = numeros;
			}
		}

		System.out.println("El número menor es: "+numMenor);
		System.out.println("El número mayor es: "+numMayor);

		 }
}