package Practica2.ejercicio7;

public class Encargado implements IHandler{
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
    public void pago(int monto) {
        if(PrestamoBancario.getInstance().getSaldo()<=0){
            System.out.println("INFO --> Ya no debe ningun prestamo,\nEl encargado le devolverá sus documentos ");
        } else{
            System.out.println("WARN --> No puede realizar este el encargado,\nse la enviará a su superior");
            next.pago(monto);
        }
    }

}
