package Practica2.ejercicio7;

public class Cliente {
    private String name;
    private String ci;
    private int prestamo;
    Banco banco = new Banco();

    public Cliente(String name, String ci, Banco banco) {
        this.name = name;
        this.ci = ci;
        this.banco = banco;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
        PrestamoBancario.getInstance().setPrestamo(prestamo);
    }

    public void pagar(int monto){
        banco.pago(monto);
    }
}
