package Practica2.ejercicio7;

public class PrestamoBancario {
    private static PrestamoBancario instance = null;
    private int prestamo;
    private int saldo;

    private PrestamoBancario(){
        prestamo = 0;
        saldo = 0;
    }
    private synchronized static void create(){
        if (instance == null){
            instance = new PrestamoBancario();
        }
    }


    // global access
    public static PrestamoBancario getInstance(){
        if (instance == null){
            create();
        }
        return instance;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
        saldo = prestamo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void pagar(int monto){
        saldo-=monto;
        System.out.println("Monto pagado: " + monto);
        System.out.println("Saldo a deber: " + saldo);

    }
}
