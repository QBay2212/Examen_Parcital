package banco;

public class HiloCliente implements Runnable{
    Cuenta cuenta;
    int cantidad;

    public HiloCliente(Cuenta cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        //FORZAMOS LA MAQUINARIA: REPETIMOS LA OPERACI�N MUCH�SIMAS VECES PARA INTENTAR VERIFICAR SI LA SIMULACI�N ES CORRECTA
        for (int i=0; i<100; i++){
            cuenta.hacerMovimiento(cantidad);
        }
    }
}
