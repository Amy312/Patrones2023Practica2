package Practica2.ejercicio3;

import java.util.List;

public interface IStrategyValue {
    void busquedaModelo(List<Celular> celulares, String modelo);
    void busquedaPrecio(List<Celular> celulares, int precio );

}
