package Repositório;
import java.util.ArrayList;
import Entidades.Quartos;

public class RepositorioQuartos {
    ArrayList<Quartos> listaQ = new ArrayList <>();

    public void adicionarQuarto(Quartos quarto){
        listaQ.add(quarto);
    }

    public boolean removerQuarto(int ID){
        for(Quartos quarto : listaQ){
            if(quarto.getNumq() == ID){
                listaQ.remove(quarto);
                return true;
            }
        }
        return false;
    }

    public void listaQuar(){
        for(Quartos lista : listaQ){
            System.out.println(lista);
        }
    }
    
}
