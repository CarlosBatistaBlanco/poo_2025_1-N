

public class TallerMain {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        String datos = libro1.obtenerDatos();
        System.out.println(datos);

        Libro libro2 = new Libro();
        datos = libro2.obtenerDatos();
        System.out.println(datos);

        Libro libro3 = null;
        libro3 = new Libro("Fundamentos de POO en Java", "Carlos Batista", 79);
        datos = libro3.obtenerDatos();
        System.out.println(datos);

        Libro libro4 = new Libro("Fundamentos de POO en C#", "Carlos Batista", 120);
        datos = libro4.obtenerDatos();
        System.out.println(datos);


        System.out.println(libro4);Estudiante estudiante2 = new Estudiante();
        String dato = estudiante2.obtenerDatos();
        System.out.println(dato);
      
        Estudiante estudiante3 = null;
        estudiante3 = new Estudiante( "carlos", 25 ,   " ingeniria en sistema ");
        dato = estudiante3.obtenerDatos();
        System.out.println(dato);

        cuentaBancaria cuentaBancaria1 = new  cuentaBancaria();
        datos = cuentaBancaria1.obtenerDatos();
        System.out.println(datos);

        cuentaBancaria cuentaBancaria2 =null;
        cuentaBancaria2 = new cuentaBancaria(12345678,"cuenta de ahorro" );
        datos = cuentaBancaria2.obtenerDatos();
        System.out.println(datos);
    
    
 



    }

    
}
