package Practica2.ejercicio5;

public class Git { //originator
    private Code code;
    public void setCode(Code code){
        this.code = new Code(code.getVersion());
        this.code.setComment(code.getComment())
                .setCode(code.getCode())
                .setDeveloper(code.getDeveloper());
    }

    public Memento createCommitProject(){
        return new Memento (this.code);
    }

    public Code checkoutCommit(Memento memento){
        this.code =memento.getCode();
        return this.code;
    }
}
