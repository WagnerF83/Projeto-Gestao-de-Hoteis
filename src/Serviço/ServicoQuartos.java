package Serviço;
import Entidades.Quartos;
import java.util.ArrayList;
import Repositório.RepositorioQuartos;

public class ServicoQuartos {

    private RepositorioQuartos repositorio;

    public ServicoQuartos(RepositorioQuartos repositorio){
        this.repositorio = repositorio;
    }

    public boolean validarQuarto(ArrayList<Quartos> quarto){
        for(Quartos quartos : quarto){
            if(quartos.getQtdatual() > 0){
                System.out.println("Quarto não disponível!");
                return false;
            }
        }
        return true;
    }

    public boolean adicionarQuarto(ArrayList<Quartos> quarto){
        if(validarQuarto(quarto)){
            for(Quartos quartos : quarto){
                repositorio.adicionarQuarto(quartos);
                return true;
            }
        }
        return false;
    }
     public boolean removerQuarto(int id){
        return repositorio.removerQuarto(id);
     }
    
}
