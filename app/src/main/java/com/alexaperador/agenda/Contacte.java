package com.alexaperador.agenda;

import java.util.Date;
import java.util.Objects;

public class Contacte {
    private String nombre;
    private String primerApellido;

    private String segundoApellido;
    private String email;
    private String telefon;
    private String fechaNacimiento;

    public Contacte(String nombre, String primerApellido, String segundoApellido, String email, String telefon, String fechaNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.telefon = telefon;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String  getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacte{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacte contacte = (Contacte) o;
        return Objects.equals(nombre, contacte.nombre) && Objects.equals(primerApellido, contacte.primerApellido) && Objects.equals(segundoApellido, contacte.segundoApellido) && Objects.equals(email, contacte.email) && Objects.equals(telefon, contacte.telefon) && Objects.equals(fechaNacimiento, contacte.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, primerApellido, segundoApellido, email, telefon, fechaNacimiento);
    }
}
