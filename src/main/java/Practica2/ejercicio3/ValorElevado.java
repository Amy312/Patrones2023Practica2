package Practica2.ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValorElevado implements IStrategyValue{

    private Map<String , List<Celular> > listaModelos = new HashMap<>();
    private Map<Integer , List<Celular> > listaPrecio = new HashMap<>();

    @Override
    public void busquedaModelo(List<Celular> celulares, String modelo) {
        for (Celular celular: celulares){
            listaModelos.put(celular.getModelo(), new ArrayList<>());
        }

        for(Celular celular: celulares){
            listaModelos.get(celular.getModelo()).add(celular);
        }

        for(Celular celular : listaModelos.get(modelo)){
            celular.showInfo();
        }
    }

    @Override
    public void busquedaPrecio(List<Celular> celulares, int precio) {
        for (Celular celular: celulares){
            listaPrecio.put(celular.getPrecio(), new ArrayList<>());
        }
        for(Celular celular: celulares){
            listaPrecio.get(celular.getPrecio()).add(celular);
        }

        for(int price: listaPrecio.keySet()){
            if(price<=precio){
                for(Celular celular: listaPrecio.get(price)){
                    celular.showInfo();
                }
            }
        }

    }
}
