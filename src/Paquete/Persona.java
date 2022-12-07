/* Deberan crear la clase persona que tiene como atributos nombre y apellido,
ambos de tipo String; la clase tiene sus metodos getters y setters para cada atributo
Deberan crear una segunda clase donde estara el metodo main como conocemos. Creen 5
objetos aleatorios, es importante que sean nombres y apellidos en español
Teniendo los 5 objetos, agregarlos a una lista.
Crear la logica para ordenar alfabeticamente la lista y mostrar en consola de acuerdo
al siguiente criterio.
-Ordenar por nombre.
-Ordenar por apellido.
-Ordernar inversamente el apellido.





 */
package Paquete;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String n, String a) {
        this.nombre = n;
        this.apellido = a;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
