package Practica2.ejercicio7;

public class Banco implements IHandler{

    private IHandler next;
    private Cajero cajero = new Cajero();
    private AgenteCredito agenteCredito = new AgenteCredito();
    private Encargado encargado = new Encargado();
    private Supervisor supervisor = new Supervisor();
    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void pago(int monto) {
        this.setNext(cajero);
        cajero.setNext(agenteCredito);
        agenteCredito.setNext(supervisor);
        supervisor.setNext(encargado);

        this.next.pago(monto);
    }
}
