package postnet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Crea un datafono con sus atributos y metodos
 * @author 1dam
 */

public class Posnet {
    public static final double RECARGO_POR_CUOTA= 0.03;
    public static final int MIN_CANT_CUOTA= 1;
    public static final int MAX_CANT_CUOTA= 6;

    /**
     * Contrustor con el que se efectua el pago
     * @param tarjeta: se pasará la tarjeta con la que se paga
     * @param montoAbonar: el total que se quiere pagar
     * @param cantCuota
     * @return deuekve un Ticket con los campos si se puede efectuar el pago sino dará null
     */
    
    public Ticket efectuarPago (TarjetaDeCredito tarjeta, double montoAbonar, int cantCuota){
  
        
        Ticket ticket= null;
        if (datosValidos(tarjeta, montoAbonar, cantCuota)){
            double montoTotal= montoAbonar+ montoAbonar* recargoCuota(cantCuota);
        }
        return ticket;
        
       
    }
    
    /**
     * Comprueba que los datos introducidos son corectos
     * @param tarjeta
     * @param monto
     * @param cuota
     * @return devuelve si tarjetaValida montoValido cuotaValida son correctos sino da null
     */
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuota){
        boolean tarjetaValida= tarjeta!=null;
        boolean montoValido= monto>0;
        boolean cuotaValida= cuota >= MIN_CANT_CUOTA && cuota <= MAX_CANT_CUOTA;
        return tarjetaValida&&montoValido&&cuotaValida;
    }
    
    /**
     * Metodo que devuelve el calculo de la cantidad del recargo de la cuota
     * @param cantCuota
     * @return recargoCuota
     */
    
    private double recargoCuota(int cantCuota){
        return ((cantCuota-1)*RECARGO_POR_CUOTA) ;
    }
}
