package Practica2.ejercicio5;

public class AppMain {
    public static void main(String[] args) throws Exception {
        GitHub gitHub = new GitHub();
        Git git = new Git();

        Developer amy = new Developer("Ambar", "1968562");
        Developer monica = new Developer("Monica", "3234783");
        Developer vale = new Developer("Valeria", "6849165");
        Developer jose = new Developer("Jose", "7896241");
        Developer juan = new Developer("Juan", "1234567");


        gitHub.subscription(amy);
        gitHub.subscription(monica);
        gitHub.subscription(vale);
        gitHub.subscription(jose);
        gitHub.subscription(juan);

        Code project = new Code("1");

        project.setComment("1st Commit")
                .setDeveloper(amy)
                .setCode("#include <bits.strc++.h>");

        git.setCode(project);
        gitHub.createCommit(project.getVersion(), git.createCommitProject()); //notifica el cambio salvo al que lo hizo


        project.setVersion("2")
                .setComment("2nd Commit")
                .setDeveloper(jose)
                .setCode(project.getCode() + "\nusing namespace std;");

        git.setCode(project);
        gitHub.createCommit(project.getVersion(), git.createCommitProject());

        project.setVersion("3")
                .setComment("3rd Commit")
                .setDeveloper(monica)
                .setCode(project.getCode() + "\n\nint main(){");

        git.setCode(project);
        gitHub.createCommit(project.getVersion(), git.createCommitProject());

        project.setVersion("4")
                .setComment("4th Commit")
                .setDeveloper(juan)
                .setCode(project.getCode() + "\ncout << \"Hello World!\" << endl;");

        git.setCode(project);
        gitHub.createCommit(project.getVersion(), git.createCommitProject());


        project.setVersion("5")
                .setComment("5th Commit")
                .setDeveloper(vale)
                .setCode(project.getCode() + "\nreturn 0;\n}");

        git.setCode(project);
        gitHub.createCommit(project.getVersion(), git.createCommitProject());


        project = git.checkoutCommit(gitHub.getCommit("1"));

        gitHub.removeSubscription(amy);
        gitHub.removeSubscription(monica);
        gitHub.removeSubscription(vale);


        Developer luis = new Developer("Luis", "1849165");
        Developer ander = new Developer("Ander", "2896241");
        Developer julio = new Developer("Julio", "3234567");

        gitHub.subscription(luis);
        gitHub.subscription(ander);
        gitHub.subscription(julio);

        project = git.checkoutCommit(gitHub.getCommit("5"));



    }
}