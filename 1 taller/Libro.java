
public class Libro {

    String titulo;
    String autor;
    int numeroDepaginas;
//Un constructor por defecto.

    public Libro() {
        this.titulo = "desconocido";
        this.autor = " desconocido";
        this.numeroDepaginas = 0;
    }
    //Un constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta).

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDepaginas = paginas;
    }

    public String obtenerDatos(){
        String datos = "";
        datos = datos + "TITULO: " + titulo + ";";
        datos += "AUTOR: " + autor + ";";
        datos += "NUMERO DEPAGINAS: " + numeroDepaginas + "; ";
        return datos;
    }

    @Override
    public String toString(){
        String datos = "";
        datos = datos + "TITULO: " + titulo + "\n";
        datos += "AUTOR: " + autor + "\n";
        datos += "NUMERO DEPAGINAS: " + numeroDepaginas + "\n";
        return datos;
    }
}
