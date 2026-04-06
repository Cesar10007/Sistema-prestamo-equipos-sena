package main.java;

import java.util.ArrayList;
import java.util.Date;

public class InventarioPrestamo {
    private ArrayList<Aprendiz> aprendices;
    private ArrayList<Equipo> equipos;
    private ArrayList<Prestamo> prestamos;

    public InventarioPrestamo(){
        aprendices=new ArrayList<>();
        equipos=new ArrayList<>();
        prestamos=new ArrayList<>();
    }

    public void registrarAprendiz(Aprendiz aprendiz){
        if (aprendiz==null){
            throw new IllegalArgumentException("El aprendiz no puede ser nulo");
        }
        aprendices.add(aprendiz);
    }
    public void registrarEquipo(Equipo equipo){
        if (equipo==null){
            throw new IllegalArgumentException("El equipo no puede ser nulo");
        }
        equipos.add(equipo);
    }

    public void listarEquipos(){
        if (equipos.isEmpty()){
            System.out.println("No hay  equipos registrados");
            return;
        }
        for (Equipo equipo:equipos){
            System.out.println(equipo);
        }
    }


    public Equipo buscarEquipoPorCodigo(String codigo) {
        for (Equipo equipo : equipos) {
            if (equipo.getCodigo().equals(codigo)) {
                System.out.println(equipo);
                return equipo;
            }
        }
        System.out.println("Equipo no encontrado");
        return null;
    }

    public Aprendiz buscarAprendizPorDocumento(String documento) {
        for (Aprendiz aprendiz:aprendices){
            if (aprendiz.getDocumento().equals(documento)){
                return aprendiz;
            }
        }
        System.out.println("El aprendiz no existe");
        return null;
    }

    public Prestamo prestarEquipo(String codigoEquipo, String documentoAprendiz){
        Equipo equipo = buscarEquipoPorCodigo(codigoEquipo);
        Aprendiz aprendiz = buscarAprendizPorDocumento(documentoAprendiz);

        if (equipo==null){
            throw new IllegalArgumentException("No existen el equipo ingresado");
        }
        if (aprendiz==null){
            throw new IllegalArgumentException("No existen el aprendiz ingresado");
        }
        if (equipo.isDisponible()==false){
            throw new IllegalArgumentException("El equipo no esta disponible");
        }
        Prestamo prestamo = new Prestamo(prestamos.size() + 1, aprendiz, equipo, new Date());
        equipo.marcarPrestado();
        prestamos.add(prestamo);
        return prestamo;
    }


    public void listarPrestamosActivos(){
        if (prestamos.isEmpty()){
            System.out.println("No hay prestamos registrados");
            return;
        }
        for (Prestamo prestamo:prestamos){
            if (prestamo.isActivo()){
                System.out.println(prestamo);
            }
        }

    }
    public Prestamo buscarPrestamoPorId(int idPrestamo){
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIdPrestamo()==idPrestamo) {
                System.out.println(prestamo);
                return prestamo;
            }
        }
        System.out.println("Id préstamo no encontrado");
        return null;
    }


    public void devolverEquipo(int idPrestamo){
        Prestamo prestamo = buscarPrestamoPorId(idPrestamo);
        if (prestamo==null){
            throw new IllegalArgumentException("El equipo no existe");
        }
        if (prestamo.isActivo()==false){
            throw new IllegalArgumentException("El equipo no esta disponible existe");
        }
            prestamo.getEquipo().marcarDevuelto();
            prestamo.cerrar(new Date());
    }


}
