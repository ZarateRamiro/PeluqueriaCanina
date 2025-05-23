import model.*;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Mascota mascota1 = new Mascota("Toto", Especie.PERRO, "Ladador", 34, "ramiro");
    Mascota mascota2 = new Mascota("Drako", Especie.PERRO, "bulldog", 25, "Luis");
    Mascota mascota3 = new Mascota("Lucho", Especie.GATO, "siames", 30, "Maca");
    Mascota mascota4 = new Mascota("Tomi", Especie.PERRO, "bulldog frances", 70, "Karol");
    Mascota mascota5 = new Mascota("Duki", Especie.PERRO, "salchicha", 5, "Romulo");
    Servicio servicio1 = new Servicio(TipoServicio.CORTE_DE_PELO, "se le cortara el pelo al perro", 2.30, 8000);
    Turno turno1 = new Turno("20/06/2025 a las 17:30", "programado", mascota1, servicio1);
    Mascota[] listaMascota = new Mascota[5];
    listaMascota[0] = mascota1;
    listaMascota[1] = mascota2;
    listaMascota[2] = mascota3;
    listaMascota[3] = mascota4;
    listaMascota[4] = mascota5;
    Turno[] turnos = new Turno[10];
    buscarMascotaPorNombre(listaMascota);


    System.out.println(turno1.toString());
    contarPorEspecie(listaMascota);
    /*
    -----------  --------------------------
    -------    ---       ------------------
    -------  -------     -------------------
    -------  --------   --------------------
    -------  -------  ---------------------
    -------          ----------------------
    -------   ----     --------------------
    -------  -------    -------------------
    -------  --------    -----------------
    -------  --------    ----------------
     */

  }//cierre main

  public static void buscarMascotaPorNombre(Mascota mascota[]) {
    Scanner sc = new Scanner(System.in);
    String buscarNombre;
    System.out.println("ingrese el nombre de la mascota que desea buscar: ");
    buscarNombre = sc.nextLine();
    for (int i = 0; i < mascota.length; i++) {
      if (mascota[i].getNombre().equals(buscarNombre.toUpperCase())) {
        System.out.println(mascota[i]);
      }
    }
  }//fin funcion buscarMascotaPorNombre

  public static void contarPorEspecie(Mascota mascota[]) {
    int cantGatos = 0;
    int cantPerros = 0;
    int cantLoros = 0;
    int cantCobayo = 0;
    for (int i = 0; i < mascota.length; i++) {
      if (mascota[i].getEspecie().equals(Especie.PERRO)) {
        cantPerros++;
      }if (mascota[i].getEspecie().equals(Especie.GATO)) {
        cantGatos++;
      }      if (mascota[i].getEspecie().equals(Especie.LORO)) {
        cantLoros++;
      }if (mascota[i].getEspecie().equals(Especie.COBAYO)) {
        cantCobayo++;
      }
    }
    System.out.println("la cantidad de perros asociados es: "+ cantPerros +
        "\n la cantidad de gatos asociados es: " +cantGatos +
        "\n la cantidad de loros asociados es: " + cantLoros +
        "\n la cantidad de cobayos asociados es: " + cantCobayo);
    }
  }//cierre class