package main.java;

public class Aprendiz {
    private String documento;
    private String nombre;
    private String ficha;
    private String telefono;

    public Aprendiz(String documento, String nombre, String ficha, String telefono) {
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("El documento no puede estar vacío");
        }
        this.documento = documento;
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
        if (ficha == null || ficha.isEmpty()) {
            throw new IllegalArgumentException("El número de ficha no puede estar vacío");
        }
        this.ficha = ficha;
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        if (telefono.length() < 10) {
            throw new IllegalArgumentException("El numero de teléfono tiene que tener un min de 10 caracteres");
        }
        this.telefono = telefono;
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("El documento no puede estar vacío");
        }
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        if (ficha == null || ficha.isEmpty()) {
            throw new IllegalArgumentException("El número de ficha no puede estar vacío");
        }
        this.ficha = ficha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        if (telefono.length() < 10) {
            throw new IllegalArgumentException("El numero de teléfono tiene que tener un min de 10 caracteres");
        }
        this.telefono = telefono;
    }

    public String toString() {
        return
                "========================================"+"\n"+
                "Num documento: "+documento+"\n"+
                "Nombre aprendiz: "+nombre+"\n"+
                "Num ficha: "+ficha+"\n"+
                "Telefono aprendiz: "+telefono+"\n"+
                "========================================"+"\n";
    }
}
