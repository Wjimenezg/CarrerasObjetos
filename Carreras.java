package carreras;

import java.util.*;
public class Carreras {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       
       System.out.print("Ingrese el modelo del carro: ");
        String modelo = entrada.nextLine();

        System.out.print("Ingrese la marca del carro: ");
        String marca = entrada.nextLine();

        System.out.print("Ingrese la velocidad promedio del carro (en km/h): ");
        float velocidadPromedio = entrada.nextFloat();

        Carro carro = new Carro(modelo, marca, velocidadPromedio);

        System.out.println("\nSe ha creado el carro:");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Velocidad promedio: " + carro.getVelocidad() + " km/h");

        System.out.print("\n¿Cuántas vueltas desea registrar? ");
        int numVueltas = entrada.nextInt();

        for (int i = 1; i <= numVueltas; i++) {
            System.out.print("Ingrese el tiempo de la vuelta " + i + " (en segundos): ");
            float tiempoVuelta = entrada.nextFloat();
           // carro.agregar_vuelta(tiempoVuelta);
            carro.agregar_vuelta(tiempoVuelta, velocidadPromedio);
        }

        int numeroVueltas = carro.getNumero_vueltas();
        System.out.println("\nEl carro de marca " + carro.getMarca() + " ha dado " + numeroVueltas + " vueltas.");

        for (int i = 1; i <= numeroVueltas; i++) {
            float velocidadPromedioPorVuelta = carro.calcularVelocidadPromedioPorVuelta(i);
            System.out.println("Velocidad promedio en la vuelta " + i + ": " + velocidadPromedioPorVuelta + " km/h");
        }

       
    }
    
}
