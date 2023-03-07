package Practica2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements ICanal{
    private List<Usuario> chat = new ArrayList<>();

    public Whatsapp addUsuarioChat(Usuario usuario){
        chat.add(usuario);
        return this;
    }
    @Override
    public void send(String message, Usuario usuario) {
        if(usuario.isPersonal()){
            usuario.getDestino().recibir(message);
        }else{
            for(Usuario user: chat){
                if(usuario!=user){
                    user.recibir(message);

                }
            }
        }
    }
}
