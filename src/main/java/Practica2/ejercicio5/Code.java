package Practica2.ejercicio5;

public class Code {
    private String version;
    private String comment;
    private String code;
    private Developer developer;

    public Code(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getComment() {
        return comment;
    }

    public String getCode() {
        return code;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public Code setVersion(String name) {
        this.version = name;
        return this;
    }

    public Code setComment(String comment) {
        this.comment = comment;
        return this;

    }

    public Code setCode(String code) {
        this.code = code;
        return this;

    }

    public Code setDeveloper(Developer developer) {
        this.developer = developer;
        return this;
    }

    public void showInfo(){
        System.out.println(" ----> Commit ");
        System.out.println("version: " + version);
        System.out.println("comment: " + comment);
        System.out.println("code: \n" + code);
        System.out.println("developer: ");
        developer.showInfo();
        System.out.println(" --------- \n");


    }
}
