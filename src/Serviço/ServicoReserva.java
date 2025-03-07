package Serviço;
import Entidades.Reserva;
import java.util.ArrayList;
import Repositório.RepositorioReserva;

public class ServicoReserva {
    private RepositorioReserva repositorio;

    public ServicoReserva(RepositorioReserva repositorio){
        this.repositorio = repositorio;
    }
    public boolean validarReserva(ArrayList<Reserva> reservas){
        for(Reserva reserva : reservas){
            if(reserva.getPreco_total() < 750){
                System.out.println("Valor inválido para a reserva: " + reserva.getNum_reserva());
                return false;
            }       
        }
        return true;
    }

    public boolean adicionarReserva(ArrayList<Reserva> listares){
        
        if(validarReserva(listares)){
            for(Reserva reserva : listares){
                repositorio.adicionarReserva(reserva);
            }
            return true;
        }
        return false;
        
    }
    
    
}
