import java.util.Scanner;

//EL PROGRAMA PIDE INTRODUCIR UN NUMERO , SI ES MAYOR A CERO SE EJECUTARA LAS OPERACIONES 
//Primeramente en una variable llamada digito se guardara el reciduo del numero entre 10
//Si el residuo es 3,7,8 o 9 El numero afortunado se incrementara en 1 de lo contrario el numero no afortunadoi se incrementara en 1
//de esta manera entrara a otro condicional donde si el numero afortunado es mayor 
//se imprime el numero que el usuario asigno y si es o no afortunado dependiendo de si se cumple la condicion

public class Codigo5 {

	public static void main(String[] args) {
		// Se importo la libreria scanner y el argumento System.in
		Scanner s = new Scanner(System.in);
		// Se corrigio las comillas
		System.out.print("Introduzca un número: ");
		// se cambio el tipo de dato String a int y cambie el nombre de las variables con mas contexto
		int numero = s.nextInt();
		int numeroAux = numero;

		int numAfortunado = 0;
		int numNoAfortunado = 0;

		//cambie el while por if 
	
		if (numero > 0) {
			int digito =numero % 10;
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				numAfortunado++;
			} else {
				numNoAfortunado++;

				numero /= 10;
			}
			if (numAfortunado > numNoAfortunado) {
				// Se escribio correctamente println
				System.out.println("El " + numeroAux + " es un número afortunado.");
			
			} else {
				System.out.println("El " + numeroAux + " no es un número afortunado.");
			
			}

		}
	}

}
