package Practica2.ejercicio7;

public class Supervisor implements IHandler {
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
        if (porcentaje >=50 && PrestamoBancario.getInstance().getSaldo()>0) {
            System.out.println("INFO --> El supervisor: se encargara del pago de " + monto);
            PrestamoBancario.getInstance().pagar(monto);
            System.out.println("¿Le gustaria obtener un nuevo prestamo?");
            if(PrestamoBancario.getInstance().getSaldo()<=0){
                next.pago(0);
            }

        } else {
            System.out.println("WARN --> No puede realizar este el supervisor,\nse la enviará a su superior");
            next.pago(monto);
        }
    }
}