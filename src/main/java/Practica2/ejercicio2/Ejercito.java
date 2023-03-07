package Practica2.ejercicio2;

public class Ejercito implements IHandler{
    private IHandler next;
    private Cabo cabo = new Cabo();
    private Coronel coronel = new Coronel();
    private Teniente teniente = new Teniente();
    private General general = new General();
    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void orden(String tarea) {
        this.setNext(cabo);
        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.next.orden(tarea);
    }
}
