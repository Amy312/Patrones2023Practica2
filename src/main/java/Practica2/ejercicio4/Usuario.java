package Practica2.ejercicio4;

public class Usuario {
    protected ICanal canal;
    private boolean personal;
    private String name;
    private Usuario destino;

    public Usuario(String name, ICanal canal) {
        this.name = name;
        this.canal = canal;
    }

    public boolean isPersonal() {
        return personal;
    }

    public void setPersonal(boolean personal) {
        this.personal = personal;
    }

    public Usuario getDestino() {
        return destino;
    }

    public void setDestino(Usuario destino) {
        this.destino = destino;
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
