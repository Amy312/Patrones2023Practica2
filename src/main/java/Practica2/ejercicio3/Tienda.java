package Practica2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Tienda { //context

    private List<Celular> celulares = new ArrayList<>();
    private String name;
    private IStrategyValue strategyValue;

    public Tienda(String name) {
        this.name = name;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public Tienda addCelular(Celular celular) {
        this.celulares.add(celular);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IStrategyValue getStrategyValue() {
        return strategyValue;
    }

    public void setStrategyValue(IStrategyValue strategyValue) {
        this.strategyValue = strategyValue;
    }

    public void buscar(String tipo, String valor){
        if((tipo.toLowerCase()).equals("modelo")){
            this.strategyValue.busquedaModelo(this.celulares, valor);
        }else if((tipo.toLowerCase()).equals("precio")){
            this.strategyValue.busquedaPrecio(this.celulares, Integer.parseInt(valor));
        } else{
            System.out.println("No es posible realizar la busqueda por " + tipo);
        }
    }
}
