package Entidades;

public class Reserva{

    public int num_reserva; //codigo da reserva
    public String data_checkin;
    public String data_checkout;
    public String forma_pagamento;
    public float preco_total;

    public Reserva(int num_reserva, String data_checkin, String data_checkout, String forma_pagamento, float preco_total){
        this.num_reserva = num_reserva;
        this.data_checkin = data_checkin;
        this.data_checkout = data_checkout;
        this.forma_pagamento=forma_pagamento;
        this.preco_total = preco_total;
    }


    public void setNum_reserva( int novareserva){
        this.num_reserva = novareserva;
    }
    public int getNum_reserva(){
        return this.num_reserva;
    }

    public void setData_checkin( String novain){
        this.data_checkin = novain;
    }
    public String getData_checkin(){
        return this.data_checkin;
    }

    public void setData_checkout( String novaout){
        this.data_checkout = novaout;
    }
    public String getData_checkout(){
        return this.data_checkout;
    }
    public void setforma_pagamento( String novo_pag){
        this.forma_pagamento=novo_pag;
    }
    public String getforma_pagamento(){
        return this.forma_pagamento;
    }
    public void setPreco_total( float novopreco){
        this.preco_total = novopreco;
    }
    public float getPreco_total(){
        return this.preco_total;
    }
}