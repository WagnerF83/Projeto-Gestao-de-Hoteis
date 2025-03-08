package View;

import Entidades.Hospede;
import Entidades.Quartos;
import Entidades.Reserva;
import Repositório.RepositorioHospede;
import Repositório.RepositorioQuartos;
import Repositório.RepositorioReserva;
import Serviço.ServicoHospede;
import Serviço.ServicoQuartos;
import Serviço.ServicoReserva;

public class Main{

    public static void main( String[] args ){

        RepositorioHospede repositorio = new RepositorioHospede();
        ServicoHospede servico = new ServicoHospede(repositorio);
        ArrayList<Hospede> hospede = new ArrayList<>();

        RepositorioQuartos repositorioqua = new RepositorioQuartos();
        ServicoQuartos servicoqua = new ServicoQuartos(repositorioqua);
        ArrayList<Quartos> quarto = new ArrayList<>();

        RepositorioReserva repositoriore = new RepositorioReserva();
        ServicoReserva servicore = new ServicoReserva(repositoriore);
        ArrayList<Reserva> reserva = new ArrayList<>();

        hospede.add(new Hospede("Paulo", 123456779, "19/03/2004", "null", "null", "null", "null"));
        hospede.add(new Hospede("Carmila", 432234564, "20/07/2002", "null", "null", "null", "null"));
        servico.validarIdade(hospede);
        servico.adicionarHospede(hospede);
        servico.removerHospede(2);
        repositorio.listaH();

        System.out.println("");

        

}
}