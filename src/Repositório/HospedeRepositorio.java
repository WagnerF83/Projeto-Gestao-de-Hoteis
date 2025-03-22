package Repositório;
import java.util.ArrayList;
import Entidades.Hospede;

public class RepositorioHospede {
       private ArrayList<Hospede> listaH;

        public HospedeRepositorio(ArrayList<Hospede> hospedes){
                this.listaH = hospedes;
        }
        public void salvar(Hospede hospede ){
                this.litaH.add(hospede);
            }
        
            public boolean remover(Hospede hospede){
                return listaH.remove(hospede);
            }
        
            public ArrayList<Reserva> listarHospede(){
                return listaH;
            }
        
            public void alterarReserva(Hospede hospede){
                for(Hospede hospedes: listaH){
                    if(hospedes.equals(hospede)){
                        hospedes.setNome(hospede.getNome)
                    }
                }
            }
}
