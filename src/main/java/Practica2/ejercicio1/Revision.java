package Practica2.ejercicio1;

public class Revision { // Originator

    private Tesis tesis;

    public void setTesis(Tesis tesis){
        this.tesis = new Tesis();
        this.tesis.setDate(tesis.getDate())
                .setTesis(tesis.getTesis())
                .setRevisado(tesis.isRevisado())
                .setPuntuacion(tesis.getPuntuacion());
    }

    public Memento crearRevision(){
        return new Memento(this.tesis);
    }

    public Tesis enviarTesis(Memento memento){
        this.tesis = memento.getTesis();
        return this.tesis;
    }
}
