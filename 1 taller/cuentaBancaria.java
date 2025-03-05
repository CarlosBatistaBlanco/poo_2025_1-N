public class cuentaBancaria {
    int numeroCuenta;
    int saldo;
    String tipoCuenta;
//Un constructor por defecto que asigne valores genéricos.
    public cuentaBancaria(){
        this.numeroCuenta = 0;
        this.saldo = 0;
        this.tipoCuenta = "desconosida";

    }
//Un constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta).
    public cuentaBancaria(int numeroCuenta, String tipoCuenta) {
     
       this.numeroCuenta = numeroCuenta;
       this.tipoCuenta = tipoCuenta; 
    }
    //Un constructor sobrecargado con tres parámetros (numeroCuenta, saldo, y tipoCuenta).

    public cuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta) {
     
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta; 
     }

     public String obtenerDatos(){
        String datos = "";
        datos = datos + "NUMEDECUENTA: " + numeroCuenta + ";";
        datos += "SALDO: " + saldo + ";";
        datos += "TIPOCUENTA: " + tipoCuenta + "; ";
        return datos;
    }
}
