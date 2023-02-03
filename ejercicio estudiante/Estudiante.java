import java.util.Arrays;


public class Estudiante implements Comparable<Estudiante>{
public String nombre;
public int edad;
public int altura;

public Estudiante(String nombre, int edad,int altura){
this.nombre = nombre;
this.edad=edad;
this.altura=altura;
}


@Override
public String toString() {
    // TODO Auto-generated method stub
    return "nombre: " + nombre + " - Altura: " + altura + " - Edad: " + edad;
}
@Override
public int compareTo(Estudiante o) {
int resultado=0;
if(this.altura<o.altura){resultado=-1;}
else if (this.altura>o.altura) {resultado=1;}

else {
    if (this.edad<o.edad){resultado=-1;}
    else if (this.edad>o.edad) {resultado=1;}
}
    return resultado;
}
public static void main(String[] args) {
    Estudiante[] estudiantes = new Estudiante[]{
        new Estudiante("Patri", 12, 170),
        new Estudiante("Manuel", 43, 189),
        new Estudiante("Javier", 72, 189),
        new Estudiante("Alicia", 52, 168),
        new Estudiante("Alberto", 35, 189)
    };

    System.out.println("Estudiantes sin ordenar:");
    for (int i = 0; i <estudiantes.length; i++)
    System.out.println(estudiantes[i]);

System.out.println("___________________________________________________________________________________________________________________________________________________________________________"
);

System.out.println("");

System.out.println("Estudiantes ordenados:");
    Arrays.sort(estudiantes);

    for (int i = 0; i <estudiantes.length; i++)
    System.out.println(
        estudiantes[i]);
}
}