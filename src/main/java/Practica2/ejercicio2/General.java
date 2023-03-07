package Practica2.ejercicio2;

public class General implements IHandler{
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
        if((tarea.toLowerCase()).equals("entrevistas")){
            System.out.println("INFO --> El general :se encargara de las entrevistas");
        } else{
            System.out.println("WARN --> No puede realizar esta tarea el general,\nse la enviará al expediente");
        }
    }
}

