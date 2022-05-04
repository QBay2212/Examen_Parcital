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
        //FORZAMOS LA MAQUINARIA: REPETIMOS LA OPERACIÓN MUCHÍSIMAS VECES PARA INTENTAR VERIFICAR SI LA SIMULACIÓN ES CORRECTA
        for (int i=0; i<100; i++){
            cuenta.hacerMovimiento(cantidad);
        }
    }
}
