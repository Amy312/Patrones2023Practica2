package Practica2.ejercicio1;

public class AppMain {

    public static void main(String[] args) throws Exception {
        Tutor tutor = new Tutor();
        Revision revision = new Revision();


        Tesis tesis = new Tesis();

        tesis.setDate("12/02/2023")
                .setTesis("Los panes son deliciosos,\nEl azucar es dulce")
                .setRevisado(true)
                .setPuntuacion(60);

        revision.setTesis(tesis);
        tutor.createCommit("1", revision.crearRevision());

        tesis.setDate("15/02/2023")
                .setTesis("Los panes son deliciosos,\nEl azucar es dulce,\nLas rosas rojas")
                .setRevisado(true)
                .setPuntuacion(70);

        revision.setTesis(tesis);
        tutor.createCommit("2", revision.crearRevision());

        tesis.setDate("02/03/2023")
                .setTesis("Los panes son deliciosos,\nEl azucar es dulce,\nLas rosas rojas,\nLas violetas azules")
                .setRevisado(true)
                .setPuntuacion(80);

        revision.setTesis(tesis);
        tutor.createCommit("3", revision.crearRevision());

        tesis.setDate("05/03/2023")
                .setTesis("Los panes son deliciosos,\nEl azucar es dulce,\nLas rosas rojas,\nLas violetas azules\nY el cielo azul")
                .setRevisado(true)
                .setPuntuacion(90);

        revision.setTesis(tesis);
        tutor.createCommit("4", revision.crearRevision());


        tesis.setDate("06/03/2023")
                .setTesis("Los panes son deliciosos,\nEl azucar es dulce,\nLas rosas rojas,\nLas violetas azules\nY el cielo azul\nY no se que escribir")
                .setRevisado(false)
                .setPuntuacion(0);

        revision.setTesis(tesis);
        tutor.createCommit("5", revision.crearRevision());


        System.out.println("Se muestra la 5ta versión -->");
        tesis.showInfo();


        tesis = revision.enviarTesis(tutor.getCommit("3"));
        System.out.println("Se muetra la 3ra versión -->");
        tesis.showInfo();
    }
}
