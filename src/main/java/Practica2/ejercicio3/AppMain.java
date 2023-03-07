package Practica2.ejercicio3;

public class AppMain {
    public static void main(String []args) {

        Tienda tienda = new Tienda("Samsung3.0");
        tienda.addCelular(new Celular("A", "Galaxy1", "Alta", 1200))
                .addCelular(new Celular("B", "Galaxy2", "Alta", 1300))
                .addCelular(new Celular("C", "Galaxy3", "Alta", 1400))
                .addCelular(new Celular("A", "Galaxy4", "Alta", 1500))
                .addCelular(new Celular("B", "Galaxy5", "Alta", 1600))
                .addCelular(new Celular("C", "Galaxy6", "Alta", 1200))
                .addCelular(new Celular("C", "Galaxy7", "Alta", 1700));


        if(tienda.getCelulares().size()<=10){
            tienda.setStrategyValue(new ValorMinimo());
        } else{
            tienda.setStrategyValue(new ValorElevado());
        }
        System.out.println("Buscar el modelo A");
        tienda.buscar("modelo", "A");


        tienda.addCelular(new Celular("A", "Galaxy1", "Alta", 200))
                .addCelular(new Celular("B", "Galaxy2", "Alta", 1300))
                .addCelular(new Celular("C", "Galaxy3", "Alta", 1400))
                .addCelular(new Celular("A", "Galaxy4", "Alta", 500))
                .addCelular(new Celular("B", "Galaxy5", "Alta", 1600))
                .addCelular(new Celular("C", "Galaxy6", "Alta", 1200))
                .addCelular(new Celular("C", "Galaxy7", "Alta", 700));


        System.out.println("Buscar de un precio menor a 1500");
        if(tienda.getCelulares().size()<=10){
            tienda.setStrategyValue(new ValorMinimo());
        } else{
            tienda.setStrategyValue(new ValorElevado());
        }
        tienda.buscar("precio", "1500");
    }
}
