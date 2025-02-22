package Serviço;
import Entidades.Reserva;

public class ServicoReserva {
    
    public void fazerReserva(Reserva Reserva){
        System.out.println("A reserva " + Reserva.getNum_reserva() + "foi realizado, com o valor de R$" + Reserva.getPreco_total());
    }
    
}
