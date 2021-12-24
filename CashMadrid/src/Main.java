import java.util.*;

/**
 * Clase principal
 *  
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 */
public class Main {
	/**
	 * M�todo principal
	 * 
	 * @param args - Argumento principal
	 */
	public static void main(String[] args) {
 		/*
 		 * Select para rellenar los objetos Cliente con los datos de la tabla Cliente.
 		 * Cada registro de la tabla corresponder� a un objeto. 
 		 */
 		//Establecemos los datos de la query y la modalidad de retorno
		Query queryOBJ = new Query("*", Tab.CLIENTES, Statement.SELECT);
		//ejecutamos la query y recuperamos el resultado en un array de Objetos
		Object[] obj = queryOBJ.execute();
		//declaramos el array de Clientes especificando como tama�o por defecto la cantidad de registros
		Cliente[] cli = new Cliente[obj.length];
		
		//rellenamos el array de clientes; un cliente por registro, un objeto por cliente, todo en un mismo array
		for (int i = 0;i < obj.length;i++) {
			cli[i] = (Cliente) obj[i];
		}
		
		//lo mostramos en consola para demostrar que se ha hecho correctamente
		System.out.println(Arrays.toString(cli));
	}
}