package Practica2.ejercicio5;

public class Developer implements IDeveloper{
    private String name;
    private String ci;

    public Developer(String name, String ci) {
        this.name = name;
        this.ci = ci;
    }

    @Override
    public void showInfo(){
        System.out.println(" - name: " + name);
        System.out.println(" - ci: " + ci);
    }

    @Override
    public void update(String message, Code code) {
        System.out.println(" ----> Notificación <----");
        this.showInfo();
        System.out.println(message);
        code.showInfo();

    }



    @Override
    public String getNotification() {
        return null;
    }
}
