package Practica2.ejercicio7;


public class Cajero implements IHandler{
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
        double porcentaje = ((double)monto/(double)PrestamoBancario.getInstance().getPrestamo()) * 100.0;
        if(porcentaje<25 && PrestamoBancario.getInstance().getSaldo()>0){
            System.out.println("INFO --> El cajero: se encargara del pago de " + monto);
            PrestamoBancario.getInstance().pagar(monto);
            if(PrestamoBancario.getInstance().getSaldo()<=0){
                next.pago(0);
            }
        } else{
            System.out.println("WARN --> No puede realizar este el cajero,\nse la enviará a su superior");
            next.pago(monto);
        }
    }


}
