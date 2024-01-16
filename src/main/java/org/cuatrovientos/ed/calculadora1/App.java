package org.cuatrovientos.ed.calculadora1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        if (args.length != 3) {
            System.out.println("Por favor, proporciona la operación (suma, resta, multiplicación o división) y dos números.");
            return;
        }

        String operacion = args[0];
        double num1 = Double.parseDouble(args[1]);//FIXME cambiar nombre
        double num2 = Double.parseDouble(args[2]);

        double resultadoOperacion = 0.0;

        operaciones(operacion, num1, num2, resultadoOperacion);
    }

	/**
	 * @param operacion nombre del tipo de operacion a realizar
	 * @param num1 primer numero de la operacion
	 * @param num2 segundo numero de la operacion
	 * @param resultadoOperacion variable que guarda el resultado de la operacion de los 2 numeros
	 * 
	 * TODO acabar algo
	 */
	private static void operaciones(String operacion, double num1, double num2, double resultadoOperacion) {
		switch (operacion.toLowerCase()) {
            case "suma":
                resultadoOperacion = num1 + num2;
                break;
            case "resta":
                resultadoOperacion = num1 - num2;
                break;
            case "multiplicacion":
                resultadoOperacion = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultadoOperacion = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida. Las operaciones permitidas son suma, resta, multiplicación y división.");
                return;
              
        }

        System.out.println("El resultado de la operación " + operacion + " es: " + resultadoOperacion);
	}
  }

