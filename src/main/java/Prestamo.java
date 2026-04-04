package main.java;

import java.util.Date;

public class Prestamo {
    private int idPrestamo;
    private Aprendiz aprendiz;
    private Equipo equipo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean activo = true;

    public Prestamo(int idPrestamo, Aprendiz aprendiz, Equipo equipo, Date fechaPrestamo) {
        if (aprendiz == null || equipo == null || fechaPrestamo == null) {
            throw new IllegalArgumentException("Prestamo no puede ser nulo.");
        }
        this.idPrestamo = idPrestamo;
        this.aprendiz = aprendiz;
        this.equipo = equipo;
        this.fechaPrestamo = fechaPrestamo;
    }

    //Apartado getter

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public Aprendiz getAprendiz() {
        return aprendiz;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isActivo() {
        return activo;
    }

    //Apartado setter

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setAprendiz(Aprendiz aprendiz) {
        if (aprendiz == null) {
            throw new IllegalArgumentException("Aprendiz no puede ser nulo.");
        }
        this.aprendiz = aprendiz;
    }

    public void setEquipo(Equipo equipo) {
        if (equipo == null) {
            throw new IllegalArgumentException("Equipo no puede ser nulo.");
        }
        this.equipo = equipo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        if (fechaPrestamo == null) {
            throw new IllegalArgumentException("Fecha de prestamo no puede ser nulo.");
        }
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void cerrar(Date fechaDevolucion){
        if (activo == false){
            throw new IllegalArgumentException("Préstamo ya esta Cerrado");
        }else {
            this.fechaDevolucion = fechaDevolucion;
            activo = false;
        }
    }

    @Override
    public String toString() {
        return "========================================================="+"\n"+
                "Id préstamo:"+idPrestamo+"\n"+
                "Información Aprendiz: "+aprendiz+"\n"+
                "Informacion Equipo: "+equipo+"\n"+
                "Fecha prestamo: "+fechaPrestamo+"\n"+
                "Fecha Devolucion: "+fechaDevolucion+"\n"+
                "Esta Activo?: "+activo+"\n"+
                "========================================================="+"\n";
    }
}
