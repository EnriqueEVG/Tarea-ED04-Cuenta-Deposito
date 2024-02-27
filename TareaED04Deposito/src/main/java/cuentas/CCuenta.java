/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author enrique
 * @version 1.3
 * @since 2024/02/27
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor CCuenta vacio
     */
    public CCuenta()
    {
    }

    /**
     *  Constructor CCuenta en el que se da valor a los parametros:
     * @param nom es el nombre de la persona de la que es la cuenta
     * @param cue es el número de cuenta de la persona de quién es la cuenta
     * @param sal es el saldo que hay en la ceunta
     * @param tipo es el tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return nombre devuleve el nombre del Objeto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre da al atributo nombre el nombre nombre del Objeto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return cuenta devuelve el valor de la cuenta del Objeto
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * @param cuenta a al atributo cuenta la cuenta del Objeto
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * @return saldo devuelve el saldo para el objeto en cuestión
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo da el saldo para el objeto en cuestión
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return tipoInteres obtiene el tipo de interes para el objeto en cuestión
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * 
     * @param tipoInterés introduce un tipo de interés para el objeto en cuestión
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
   
    
    /**
     * 
     * @return saldo, devuelve el saldo de la cuenta 
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad representa la cantidad de dinero que se quiere ingresar en la cuenta
     * @throws Exception si la cantidad a ingresar es menor que cero activa una excepción y da un mensaje de error
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * 
     * @param cantidad es el importe de la cantidad a retirar de la cuenta
     * @throws Exception activa una excepción si la cantidad es menor o igual a
     * cero o la cantidad que hay en la cuenta es menor que la cantidad a sacar
     * y da los correspondientes mensajes de error
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
