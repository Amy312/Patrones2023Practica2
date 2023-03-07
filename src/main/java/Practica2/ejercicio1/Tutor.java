package Practica2.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Tutor { //CareTaker
    private Map<String,Memento> commitMap = new HashMap<>();

    public void createCommit(String hashCodeTesis, Memento memento){
        commitMap.put(hashCodeTesis,memento);
    }

    public Memento getCommit(String hashCodeTesis) throws Exception {
        if ( !commitMap.containsKey(hashCodeTesis))
            throw new Exception("ERROR! la tesis no existe: "+hashCodeTesis);
        return commitMap.get(hashCodeTesis);
    }
}
