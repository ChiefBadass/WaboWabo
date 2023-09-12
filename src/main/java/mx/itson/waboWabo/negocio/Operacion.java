/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.waboWabo.negocio;

/**
 *
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

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

}
