/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.waboWabo.negocio;

/**
 * Contiene metodos para realizar operaciones aritmeticas de una calculadora.
 * @author alumnog
 */
public class Operacion {
    private static Operacion instancia;

    //Aqui es donde se implementa el patron singletón.
    public static Operacion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Operacion();
        }

        return instancia;
    }

    /**
     * Metodo para sumar dos valores.
     * @param numero1 Dato numero 1 a sumar.
     * @param numero2 Dato numero 2 a sumar.
     * @return El resultado de la suma.
     */
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /**
     * Metodo para restar dos valores
     * @param numero1 Dato numero 1 a restar.
     * @param numero2 Dato numero 2 a restar.
     * @return El resultado de la resta.
     */
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    /**
     * Metodo para multiplicar dos valores.
     * @param numero1 Dato numero 1 a multiplicar.
     * @param numero2 Dato numero 2 a multiplicar.
     * @return El resultado de la multiplicacion.
     */
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /**
     * Metodo para la division de dos numero.
     * @param numero1 Dividendo.
     * @param numero2 Divisor.
     * @return Cociente de la division. 
     */
    public double dividir(double numero1, double numero2) {
        double r = 0.0;
        //Try catch para evitar que truene el codigo en caso de que el divisor sea 0.
        try{         
            r = numero1 / numero2;          
        }catch(ArithmeticException a){
            
        }  
        return r;
    }

}
