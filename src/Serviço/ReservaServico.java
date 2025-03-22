package Serviço;
import Entidades.Reserva;
import java.util.ArrayList;
import Repositório.RepositorioReserva;

public class ServicoReserva {
    private RepositorioReserva reservaRepositorio;

    public ServicoReserva(RepositorioReserva reservaRepositorio){
        this.reservaRepositorio = reservaRepositorio;
    }
    public boolean validarReserva(){
        
            if(reserva.getPreco_total() < 750){
                System.out.println("Valor inválido para a reserva: " + reserva.getNum_reserva());
                return false;
            }       
            System.out.println("Reserva concluída!")
            reservaRepositorio.cadastrar(reserva);
            return true;
    }
    
    public void cadastrar(Reserva reserva){
        reservaRepositorio.salvar(reserva);
    }

    public void excluir(Reserva reserva){
        reservaRepositorio.remover(reserva);
    }

    public void listar(Reserva reserva){
        reservaRepositorio.listarReserva().forEach(System.out::println);
    }
}
