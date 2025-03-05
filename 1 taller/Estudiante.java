public class Estudiante {
    String nombre;
    int edad;
    String curso;
  //Cree al menos un objeto de cada clase utilizando diferentes constructores.
    public Estudiante(){
       this.nombre ="desconocido";
       this.edad = 0;
       this.curso = "desconocido";
    }
  //Un constructor que acepte como parámetros el nombre y la edad.
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        

    }   
    
    // Llamada al constructor anterior usando `this()`
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre; 
        this.edad = edad;
        this.curso = curso;

    }

    
    public String obtenerDatos(){
      String dato = "";
      dato = dato + "NOMBRE : " + nombre + ";";
      dato += "EDAD: " + edad + ";";
      dato += "CURSO: " + curso + "; ";
      return dato;
  }

}
