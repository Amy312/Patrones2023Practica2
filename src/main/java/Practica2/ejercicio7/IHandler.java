package Practica2.ejercicio7;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void pago(int monto);
}
