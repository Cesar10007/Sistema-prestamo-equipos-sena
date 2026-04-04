package main.java;

public class Equipo {
    private String codigo;
    private String nombre;
    private String categoria;
    private boolean disponible = true;

    public Equipo(String codigo, String nombre, String categoria) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
        if (categoria == null || categoria.isEmpty()) {
            throw new IllegalArgumentException("Categoria no puede ir vacío");
        }
        this.categoria = categoria;


    }
    // Apartado de setters

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isEmpty()) {
            throw new IllegalArgumentException("Categoria no puede ir vacío");
        }
        this.categoria = categoria;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    // Apartado de getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Funciones de préstamo

    public void marcarPrestado() {
        if (disponible == false) {
            throw new IllegalArgumentException("El equipo ya esta prestado, no se esta disponible.");
        }
        this.disponible = false;
    }

    public void marcarDevuelto() {
        if (disponible == true) {
            throw new IllegalArgumentException("El equipo esta devuelto,esta disponible.");
        }
        this.disponible = true;
    }

    public String toString() {
        return "===================================================="+"\n"+
                "Código equipo: "+codigo+"\n"+
                "Nombre equipo: "+nombre+"\n"+
                "Categoria equipo: "+categoria+"\n"+
                "Disponible: "+disponible+"\n"+
                "===================================================="+"\n";
    }
}
