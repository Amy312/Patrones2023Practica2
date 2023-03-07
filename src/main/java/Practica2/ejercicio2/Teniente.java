package Practica2.ejercicio2;

public class Teniente implements IHandler{
    private IHandler next;
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
        if((tarea.toLowerCase()).equals("disciplina")){
            System.out.println("INFO --> El teniente :se encargara de impartir disciplina");
        } else{
            System.out.println("WARN --> No puede realizar esta tarea el teniente,\nse la enviará a su superior");
            next.orden(tarea);
        }
    }
}
