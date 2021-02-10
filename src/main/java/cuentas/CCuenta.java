package cuentas;

/**
 * Esta clase crea una cuenta bancaria básica para el usuario. Controla el sueldo
 * el ingreso y la retirada de efectivo.
 * 
 * @author Ayose Figuera Alfonso
 * @version 0.5
 * 
 */

public class CCuenta {

    /**
     * Retorna el nombre de usuario de la cuenta.
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite cambiar el nombre del usuario.
     * @param nombre valor del nombre que deseamos modificar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el numero de la cuenta del usuario.
     * @return número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que permite modificar el número de cuenta del usuario.
     * @param cuenta número nueva cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Retorna el valor del saldo actual en la cuenta del usuario.
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que permite cambiar el valor del saldo
     * @param saldo nuevo valor del saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna el valor del tipo de interés de la cuenta.
     * @return valor del tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que permite cambiar el tipo de interés de la cuenta bancaria.
     * @param tipoInterés nuevo valor del tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Contructor básico de la cuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Contructor de la clase.
     * @param nom nombre del usuario.
     * @param cue numero de cuenta.
     * @param sal saldo actual en la cuenta.
     * @param tipo tipo de interes de la cuenta bancaria.
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Retorna el saldo actual de la cuenta.
     * @return saldo de la cualenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método que permite ingresar dinero en la cuenta. Suma el valor introducido  
     * al valor de la cuenta actual. No se permiten valores negativos.
     * @param cantidad dinero a ingresar en la cuenta.
     * @throws Exception Lanza un error si el valor introducido en negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
     /**
     * Método que permite al usuario retirar dinero de la cuenta.
     * El usuario introduce un valor a retirar y este se resta del saldo solo si
     * es posible..
     * @param cantidad dinero a retirar de la cuenta.
     * @throws Exception Lanza un error si el valor que quire retirar el usuario es mayor 
     * al de la cuenta. No puede retirar valores negativos.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
