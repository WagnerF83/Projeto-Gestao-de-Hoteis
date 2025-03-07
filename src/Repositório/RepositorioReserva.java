package Repositório;
import java.util.ArrayList;
import Entidades.Reserva;

public class RepositorioReserva {
    ArrayList<Reserva> listaR = new ArrayList <>();

    public void adicionarReserva(Reserva reserva){
        listaR.add(reserva);
    }
    
    public void removerReserva(Reserva reserva){
        listaR.remove(reserva);
    }

    public void listaR(){
        for(Reserva lista : listaR){
                System.out.println(lista);
    }
}
}
