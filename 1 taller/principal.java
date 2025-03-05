public class principal {
    
}
//Muestre los detalles de los objetos utilizando el método toString().
public Estudiante(String nombre, int edad,String curso){
    this.nombre = nombre;
    this.edad = edad;
    this.curso = curso;

}    

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", curso: " + curso;
    }

    public static void main(String[] args) {
        Estudiante Estuddiante1 = new Estudiante("Ana", 28, "Ingeniera");
        System.out.println(Estuddiante1.toString());
 }