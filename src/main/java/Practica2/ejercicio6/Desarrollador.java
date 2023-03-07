package Practica2.ejercicio6;


public class Desarrollador {

    protected ICanal canal;
    private boolean personal;
    private String name;
    private String tarea;
    private Desarrollador destino;

    public Desarrollador(String name, ICanal canal) {
        this.name = name;
        this.canal = canal;
    }

    public String getTarea() {
        return tarea;
    }

    public Desarrollador setTarea(String tarea) {
        this.tarea = tarea;
        return this;
    }

    public boolean isPersonal() {
        return personal;
    }

    public Desarrollador setPersonal(boolean personal) {
        this.personal = personal;
        return this;
    }

    public Desarrollador getDestino() {
        return destino;
    }

    public Desarrollador setDestino(Desarrollador destino) {
        this.destino = destino;
        return this;
    }

    public void enviar(String msg){
        this.canal.send(msg, this);
    }
    public void recibir(String msg){
        this.showInfo();
        System.out.println("INFO > recibido > "+msg+"\n");

    }

    public void showInfo(){
        System.out.println(" ---------------- ");
        System.out.println("Nombre: " + name);
    }
}
