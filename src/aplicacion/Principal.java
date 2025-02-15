package aplicacion;

import mates.Matematicas;

public class Principal {

    /**
		 * Inicializa el metodo de matematicas con el parametro que le pasamos
		 * @param args El numero de pasos que va a dar
		 */
    public static void main(String[] args) {
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
    }
}
// comentario

