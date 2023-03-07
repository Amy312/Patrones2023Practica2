package Practica2.ejercicio1;

public class Tesis {

    private String date;
    private String tesis;
    private boolean revisado;
    private int puntuacion;




    public String getDate() {
        return date;
    }

    public Tesis setDate(String date) {
        this.date = date;
        return this;
    }

    public String getTesis() {
        return tesis;
    }

    public Tesis setTesis(String tesis) {
        this.tesis = tesis;
        return this;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public Tesis setRevisado(boolean revisado) {
        this.revisado = revisado;
        return this;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public Tesis setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
        return this;
    }

    public void showInfo(){
        System.out.println("--- Tesis ---");
        System.out.println("Fecha: " + date);
        System.out.println("Tesis: \n" + tesis);
        System.out.println("Revisado: " + revisado);
        System.out.println("Puntaje: " + puntuacion + "\n");
    }
}
