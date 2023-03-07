package Practica2.ejercicio7;


public class AppMain {
    public static void main (String []args){

        Banco banco = new Banco();
        Cliente cliente = new Cliente("Marco", "120000", banco);
        cliente.setPrestamo(124000);

        cliente.pagar(1500);

        cliente.pagar(500);

        cliente.pagar(50000);

        cliente.pagar(72000);




    }
}
