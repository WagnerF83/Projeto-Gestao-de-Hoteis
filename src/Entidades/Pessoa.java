package Entidades;

public class Pessoa{
   
    public String nome;
    public String cpf;
    public String data_nascimento;
    protected String rg;
    protected String nacionalidade;
   
    public Pessoa (String nome, String cpf, String data_nascimento, String rg, String nacionalidade){
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.rg = rg;
        this.nacionalidade = nacionalidade;
    }
        
         public void setNome(String novonome){
            this.nome=novonome;
        }
         public String getNome(){
            return this.nome;
         }

         public void setCpf (String novocpf){
            this.cpf=novocpf;
         }
         public String getCpf(){
            return this.cpf;
         }

         public void setData_nascimento( String novadata){
            this.data_nascimento=novadata;
         }
         public String getData_nascimento(){
            return this.data_nascimento;
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

        