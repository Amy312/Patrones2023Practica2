package Practica2.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class DevChat implements ICanal{
    private List<Desarrollador> chat = new ArrayList<>();

    public DevChat addUsuarioChat(Desarrollador desarrollador){
        chat.add(desarrollador);
        return this;
    }
    @Override
    public void send(String message, Desarrollador desarrollador) {
        if(desarrollador.isPersonal()){
            desarrollador.getDestino().recibir(message);
        }else{
            for(Desarrollador dev: chat){
                if(desarrollador!=dev){
                    dev.recibir(message);

                }
            }
        }
    }
}
