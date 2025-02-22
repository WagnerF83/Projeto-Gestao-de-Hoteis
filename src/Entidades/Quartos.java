package Entidades;

public class Quartos{

    public int capacidade; 
    public int num_banheiros; //numero de banheiros
    public int numq; //numero do quarto
    public String estado; // Disponivel ou ocupado
    protected String tipo; //tipo de quarto(solteiro, casal, suite, etc.)

    public Quartos (int capacidade, int num_banheiros, int numq, String estado, String tipo){
        this.capacidade = capacidade;
        this.num_banheiros = num_banheiros;
        this.numq = numq;
        this.estado = estado;
        this.tipo = tipo;
    }
    
    
        public void setCapacidade( int novacap){
            this.capacidade = novacap;
        }
        public int getCapacidade(){
            return this.capacidade;
        }

        public void setNum_banheiros( int novonumban){
            this.num_banheiros = novonumban;
        }
        public int getNum_banheiros(){
            return this.num_banheiros;
        }
        
        public void setNumq( int novo_num){
            this.numq=novo_num;
        }
        public int getNumq(){
            return this.numq;
        }
        public void setEstado( String novoest){
            this.estado = novoest;
        }
        public String getEstado(){
            return this.estado;
        }
        protected void setTipo( String novotip){
            this.tipo=novotip;
        }
        protected String getTipo(){
            return this.tipo;
        }
}