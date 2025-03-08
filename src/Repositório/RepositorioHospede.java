package Repositório;
import java.util.ArrayList;
import Entidades.Hospede;

public class RepositorioHospede {
        ArrayList<Hospede> listaH = new ArrayList<>();

        public void adicionarHospede(Hospede hospede){
                listaH.add(hospede);
        }
        
        public void removeClienteID(int cpf){
                for(Hospede hospede : listaH){
                        if(hospede.getCpf() == cpf){
                                listaH.remove(hospede);
                        }

                }
        }
        public void atualizarHospede(ArrayList<Hospede> hospede){

        }

        public void listaH() {
                for(Hospede hospede : listaH){
                        System.out.println(hospede);
                }
        }

        public boolean removerHospede(int iD) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'removerHospede'");
        }
}
