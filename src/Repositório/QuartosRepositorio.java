package Repositório;
import java.util.ArrayList;
import Entidades.Quartos;

public class RepositorioQuartos {
    private ArrayList<Quartos> listaQ;

    public QuartosRepositorio(ArrayList<Quartos> quarto){
        this.listaQ = quarto;
    }

    public void salvar(Quartos quarto){
        this.litaQ.add(quarto);
    }

    public boolean remover(Quartos quarto){
        return listaQ.remove(quarto);
    }

    public ArrayList<Quartos> listarQuartos(){
        return listaQ;
    }

    public void alterarReserva(Reserva reserva){
        for(Quartos quarto: listaQ){
            if(quarto.equals(quartos)){
                quarto.setNumq(quartos.getNumq)
            }
        }
    }
    
}
