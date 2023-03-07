package Practica2.ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GitHub implements IRepository{ //care taker
    private Map<String,Memento> commitMap = new HashMap<>();
    private List<IDeveloper> developerList = new ArrayList<>();

    public void createCommit(String hashCodeCommit, Memento memento){
        commitMap.put(hashCodeCommit,memento);
        this.notify(memento.getCode(), "se creo un nuevo commit");
    }

    public Memento getCommit(String hashCodeCommit) throws Exception {
        if ( !commitMap.containsKey(hashCodeCommit))
            throw new Exception("ERROR! el commit no existe: "+hashCodeCommit);
        else{
            this.notify(commitMap.get(hashCodeCommit).getCode(), "Se restauró un commit");
            return commitMap.get(hashCodeCommit);

        }
    }

    @Override
    public void subscription(IDeveloper developer) {
        developerList.add(developer);
        System.out.println("Se suscribio el desarrolador: ");
        developer.showInfo();
        System.out.println();
    }

    @Override
    public void removeSubscription(IDeveloper developer) {
        developerList.remove(developer);
        System.out.println("Se eliminó al desarrollador: ");
        developer.showInfo();
        System.out.println();

    }

    @Override
    public void notify(Code code, String message) {
        for(IDeveloper dev: developerList){
            if(code.getDeveloper()!=dev){
                dev.update(message, code);
            }
        }

    }
}
