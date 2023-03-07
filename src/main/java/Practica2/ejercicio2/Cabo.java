package Practica2.ejercicio2;

public class Cabo implements IHandler{
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
        if((tarea.toLowerCase()).equals("limpiezas")){
            System.out.println("INFO --> El cabo :se encargara de las limpiezas");
        } else{
            System.out.println("WARN --> No puede realizar esta tarea el cabo,\nse la enviará a su superior");
            next.orden(tarea);
        }
    }
}
