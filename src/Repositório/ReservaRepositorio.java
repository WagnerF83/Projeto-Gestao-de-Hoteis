package Repositório;
import java.util.ArrayList;
import Entidades.Reserva;

public class RepositorioReserva {
    private ArrayList<Reserva> listaR;

    public ReservaRepositorio(ArrayList<Reserva> reservas){
        this.listaR = reservas;
    }
    public void salvar(Reserva reserva){
        this.litaR.add(reserva);
    }

    public boolean remover(Reserva reserva){
        return listaR.remove(reserva);
    }

    public ArrayList<Reserva> listarReserva(){
        return listaR;
    }

    public void alterarReserva(Reserva reserva){
        for(Reserva reservas: listaR){
            if(reservas.equals(reserva)){
                reservas.setPreco_total(reserva.getPreco_total)
            }
        }
    }
}
