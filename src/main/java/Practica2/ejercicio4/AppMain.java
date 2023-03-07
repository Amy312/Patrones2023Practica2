package Practica2.ejercicio4;

public class AppMain {
    public static void main (String[] args) {

        Whatsapp whatsapp = new Whatsapp();

        Usuario user1 = new Usuario("Jose", whatsapp);
        Usuario user2 = new Usuario("Amy", whatsapp);

        user1.setDestino(user2);
        user1.setPersonal(true);

        user2.setDestino(user1);
        user2.setPersonal(true);
        Usuario user3 = new Usuario("Vale", whatsapp);
        Usuario user4 = new Usuario("Juan", whatsapp);
        Usuario user5 = new Usuario("Joaquin", whatsapp);
        Usuario user6 = new Usuario("Jhosep", whatsapp);
        Usuario user7 = new Usuario("Hugo", whatsapp);
        Usuario user8 = new Usuario("Ander", whatsapp);
        Usuario user9 = new Usuario("Luis", whatsapp);
        Usuario user10 = new Usuario("Julio", whatsapp);

        whatsapp.addUsuarioChat(user1)
                .addUsuarioChat(user2)
                .addUsuarioChat(user3)
                .addUsuarioChat(user4)
                .addUsuarioChat(user5)
                .addUsuarioChat(user6)
                .addUsuarioChat(user7)
                .addUsuarioChat(user8)
                .addUsuarioChat(user9)
                .addUsuarioChat(user10);

        user1.enviar("Hola user 2");
        user2.enviar("Hola user 1");

        user10.enviar("Hola a todos :D");
    }
}
