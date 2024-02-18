package cuentas;

/**
 * Esta clase representa una cuenta bancaria.
 */

public class CCuenta {
	
	/**
	 * Iniciamos el nombre del titular de la cuenta.
	 */


    private String nombre;
    
    /**
     * Número de cuenta.
     */
    private String cuenta;
    
    /**
     * Saldo en la cuenta.
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInteres;
    
    /**
     * Constructor sin parametros.
     */

    public CCuenta()
    {
    }
    /**
     * Constructor con parametros.
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interes
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Método para obtener el saldo actual de la cuenta.
     * @return Devuelve el saldo actual.
     */

    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método para ingresar en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si no hay suficiente saldo o la cantidad es negativa.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0) {
			throw new Exception ("No se puede retirar una cantidad negativa");
		}
        if (estado()< cantidad) {
			throw new Exception ("No se hay suficiente saldo");
		}
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
