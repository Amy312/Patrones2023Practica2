package Practica2.ejercicio6;


public class AppMain {
    public static void main (String[] args) {

        DevChat devChat = new DevChat();

        Desarrollador dev1 = new Desarrollador("Jose", devChat);
        Desarrollador dev2 = new Desarrollador("Amy", devChat);

        dev1.setDestino(dev2);
        dev2.setPersonal(true);

        dev2.setDestino(dev1);
        dev1.setPersonal(true);
        Desarrollador dev3 = new Desarrollador("Vale", devChat);
        Desarrollador dev4 = new Desarrollador("Juan", devChat);
        Desarrollador dev5 = new Desarrollador("Joaquin", devChat);
        Desarrollador dev6 = new Desarrollador("Jhosep", devChat);
        Desarrollador dev7 = new Desarrollador("Hugo", devChat);
        Desarrollador dev8 = new Desarrollador("Ander", devChat);
        Desarrollador dev9 = new Desarrollador("Luis", devChat);
        Desarrollador dev10 = new Desarrollador("Julio", devChat);

        devChat.addUsuarioChat(dev1)
                .addUsuarioChat(dev2)
                .addUsuarioChat(dev3)
                .addUsuarioChat(dev4)
                .addUsuarioChat(dev5)
                .addUsuarioChat(dev6)
                .addUsuarioChat(dev7)
                .addUsuarioChat(dev8)
                .addUsuarioChat(dev9)
                .addUsuarioChat(dev10);

        dev1.setTarea("Cambio de backlog");

        dev1.enviar(dev1.getTarea());
        dev2.enviar("Confirmado");

        dev10.setTarea("Codigo subido");
        dev10.enviar(dev10.getTarea());
    }
}
