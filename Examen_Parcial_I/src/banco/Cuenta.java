package banco;

public class Cuenta {

    private int saldo;			//	DEFINIMOS VARIABLES
    private int saldoInicial;	//

    public Cuenta(int saldo){		//	CLASE CUENTA QUE LE DA LOS DATOS A LAS VARIABLES
        this.saldoInicial=saldo;
        this.saldo=saldo;
    }
    public synchronized void hacerMovimiento(int cantidad){	// SUMAMOS MAS LA CANTIDAD QUE NOS DA
        this.saldo = this.saldo+cantidad;
    }
    public boolean esSimulacionCorrecta(){
        if (this.saldo==this.saldoInicial) return true;	// ABRIMOS UNA CONDICIONAL DICIENDO QUE SALDO SEA IGUAL A SALDO INICIAL
        return false;
    }
    public int getSaldo(){
        return this.saldo;	// RETORNAMOS EL SALDO
    }
}