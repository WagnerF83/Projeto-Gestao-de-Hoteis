package Serviço;
import Entidades.Quartos;
import java.util.ArrayList;
import Repositório.RepositorioQuartos;

public class ServicoQuartos {

    private RepositorioQuartos quartosRepositorio;

    public QuartosServico(RepositorioQuartos quartosRepositorio){
        this.quartosRepositorio = quartosRepositorio;
    }

    public boolean validarQuarto(){
        
            if(quartos.getQtdatual() > 0){
                System.out.println("Quarto não disponível!");
                return false;
            }
                System.out.println("Quarto validado com sucesso!")
                quartosRepositorio.cadastrar(quartos);
                return true; 
        
        
    }

    public void cadastrar (Quartos quartos){
        quartosRepositorio.salvar(quartos);
    }

    public void excluir(Quartos quartos){
        quartosRepositorio.remover(quartos);
    }

    public void listar(Quartos quartos){
        quartosRepositorio.listarQuartos().forEach(System.out::println);
    }
}

