package model;

import java.util.Scanner;

public class Mascota {
  private int id;
  private String nombre;
  private Especie especie;
  private String raza;
  private int edad;
  private String nombreDelDueño;
  private static int cantM;

  public Mascota(String nombre, Especie especie, String raza, int edad, String nombreDelDueño) {
    cantM++;
    this.id = cantM;
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.nombreDelDueño = nombreDelDueño;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Especie getEspecie() {
    return especie;
  }

  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombreDelDueño() {
    return nombreDelDueño;
  }

  public void setNombreDelDueño(String nombreDelDueño) {
    this.nombreDelDueño = nombreDelDueño;
  }

  @Override
  public String toString() {
    return "Mascota " +
        "id= " + id +
        ", nombre= " + nombre + '\'' +
        ", especie= " + especie + '\'' +
        ", raza= " + raza + '\'' +
        ", edad= " + edad +
        ", nombre Del Dueño=" + nombreDelDueño;
  }



  public void mostrarDatos() {
    System.out.println(toString());
  }
}
