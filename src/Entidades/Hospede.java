package Entidades;

public class Hospede extends Pessoa {
    private String endereco;
    private String num_celular;

    public Hospede (String nome, int cpf, String data_nascimento, String rg, String nacionalidade, String endereco, String num_celular){
        super( nome, cpf, data_nascimento, rg, nacionalidade);  
        
        this.endereco = endereco;
        this.num_celular = num_celular;
    }


protected void setEndereco( String novoendereco ){
    this.endereco = novoendereco;
}
protected String getEndereco(){
    return this.endereco;
}

public void setNum_celular( String novonum){
    this.num_celular= novonum;
}
public String getNum_celular(){
    return this.num_celular;
}
}