package com.alexaperador.agenda;

import java.util.Date;
import java.util.Objects;

public class Contacte {
    private String nombre;
    private String email;
    private String telefon;
    private Date fechaNacimiento;

    public Contacte(String nombre, String email, String telefon, Date fechaNacimiento) {
        this.nombre = nombre;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
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
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacte contacte = (Contacte) o;
        return Objects.equals(nombre, contacte.nombre) && Objects.equals(email, contacte.email) && Objects.equals(telefon, contacte.telefon) && Objects.equals(fechaNacimiento, contacte.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, email, telefon, fechaNacimiento);
    }
}
