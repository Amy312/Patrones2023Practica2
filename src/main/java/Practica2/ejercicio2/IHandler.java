package Practica2.ejercicio2;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void orden(String tarea);

}
