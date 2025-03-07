package Entidades;

public class Pessoa{
   
    public String nome;
    public int cpf;
    public int idade;
    protected String rg;
    protected String nacionalidade;
   
    public Pessoa (String nome, int cpf, String data_nascimento, String rg, String nacionalidade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
        this.nacionalidade = nacionalidade;
    }
        
         public void setNome(String novonome){
            this.nome=novonome;
        }
         public String getNome(){
            return this.nome;
         }

         public void setCpf (int novocpf){
            this.cpf=novocpf;
         }
         public int getCpf(){
            return this.cpf;
         }

         public void setIdade( int novaidade){
            this.idade=novaidade;
         }
         public int getIdade(){
            return this.idade;
         }

         protected void setRg( String novorg){
            this.rg=novorg;
         }
         protected String getRg(){
            return this.rg;
         }

         protected void setNacionalidade( String novanacionalidade){
            this.nacionalidade = novanacionalidade;
         }
         protected String getNacionalidade(){
            return this.nacionalidade;
         }
} 

        