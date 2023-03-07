package Practica2.ejercicio3;

import java.util.List;

public class ValorMinimo implements IStrategyValue{
    @Override
    public void busquedaModelo(List<Celular> celulares, String modelo) {
        for(Celular celular: celulares){
            if((celular.getModelo()).equals(modelo)){
                celular.showInfo();
            }
        }

    }

    @Override
    public void busquedaPrecio(List<Celular> celulares, int precio) {
        for(Celular celular: celulares){
            if(celular.getPrecio() <= precio){
                celular.showInfo();
            }
        }
    }
}