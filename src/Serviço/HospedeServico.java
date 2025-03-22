package Serviço;
import Entidades.Hospede;
import java.util.ArrayList;
import Repositório.RepositorioHospede;

public class ServicoHospede {
    private RepositorioHospede hospedeRepositorio;

    public HospedeServico( RepositorioHospede hospederepositorio){
        this.hospedeRepositorio = hospedeRepositorio;
    }

    public void cadastrar(Hospede hospede){
        hospedeRepositorio.salvar(hospede);
    }
    
    public void excluir(Hospede hospede){
        hospedeRepositorio.remover(hospede);
    }

    public void listar(){
        hospedeRepositorio.listarHospede().forEach(System.out::println);
    }
}

