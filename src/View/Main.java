package View;
import Entidades.Hospede;
import Entidades.Quartos;
import Entidades.Reserva;

public class Main{

    public static void main( String[] args ){

        Hospede h1 = new Hospede("Paulo", 189872109, "18/06/2001", "29.523.421-9", "brasileiro", "Rua da paçoca 12", "819876-4562");
         System.out.println(h1);

        Quartos q1 = new Quartos( 5, 2, 9, "Disponível", "Casal");
        System.out.println(q1);

        Reserva r1 = new Reserva(12345, "2025-03-10", "2025-03-15", "Cartão de Crédito", 1500.75f);
        System.out.println(r1);
    }
}