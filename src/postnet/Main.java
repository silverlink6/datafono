/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 *
 * @author 1dam
 */
public class Main {
    public static void main(String[] args){
        //Creas el Datafono
        Posnet posnet= new Posnet();
        
        //Te creas a Persona
        Persona pers= new Persona("43249776M", "Pepe", "Gomez", "666666666", "pepe@gmail.com");
        
       TarjetaDeCredito tarj= new TarjetaDeCredito("Bamkiaaaaa", "44444444440", 15000, EntidadFinanciera.BIRZA, pers);
       
       //Te muestra la tarjeta
       System.out.println("Tarjeta:");
       System.out.println(tarj);
       
       //Te muestra el Ticket con la tarjeta, la cantidad a abonar y la cantidad de cuotas
       System.out.println("Tiket:");
       Ticket ticket= posnet.efectuarPago(tarj, 10000, 5);
       System.out.println(ticket);
       
       //Te muestra la Tarjeta tras el pago
       System.out.println("Tarjeta post pago:");
       System.out.println(tarj);
}
}
