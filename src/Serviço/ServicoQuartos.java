package Serviço;
import Entidades.Quartos;

public class ServicoQuartos {

    public void verificarQuarto(Quartos Quarto){
        System.out.println("O quarto " + Quarto.getNumq() + " esta " + Quarto.getEstado());
    }
    
}
