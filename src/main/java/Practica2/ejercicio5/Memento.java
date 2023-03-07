package Practica2.ejercicio5;

public class Memento {
    private Code code;

    public Memento(Code code){
        this.code = code;
    }

    public Code getCode(){
        return code;
    }
}
