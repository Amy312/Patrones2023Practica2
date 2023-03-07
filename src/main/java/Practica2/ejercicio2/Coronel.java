package Practica2.ejercicio2;

public class Coronel implements IHandler{
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
        if((tarea.toLowerCase()).equals("manifestaciones") || (tarea.toLowerCase()).equals("desbloqueos")){
            System.out.println("INFO --> El coronel :se encargara de los " + tarea.toLowerCase());
        } else{
            System.out.println("WARN --> No puede realizar esta tarea el coronel,\nse la enviará a su superior");
            next.orden(tarea);
        }
    }
}
