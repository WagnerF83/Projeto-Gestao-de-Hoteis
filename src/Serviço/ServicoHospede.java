package Serviço;
import Entidades.Hospede;
import java.util.ArrayList;
import Repositório.RepositorioHospede;

public class ServicoHospede {
    private RepositorioHospede repositorio;

    public ServicoHospede( RepositorioHospede repositorio){
        this.repositorio = repositorio;
    }

    public void fazerCadastro(Hospede Hospede){
        System.out.println("O cadastro de " + Hospede.getNome() + " foi realizado!");
    }

    public boolean validarIdade(ArrayList<Hospede> hospedes) {
        for( Hospede hospede : hospedes){
            if(hospede.getIdade() < 18){
                System.out.println("Usuário não atende aos requisitos!");
                return false;
                
            }   {
                System.out.println("Usuário verificado com sucesso!");
                
 
            }

        }
        return true;
    }

    public boolean adicionarHospede(ArrayList<Hospede> hospedes){
        boolean adicionar = false;
        for(Hospede hospede : hospedes){
            if(hospede.getIdade() >= 18){
                repositorio.adicionarHospede(hospede);
                adicionar = true;
    
            }
        }
        return adicionar;
    }
    
}
