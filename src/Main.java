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
    Servicio servicio2=new Servicio(TipoServicio.CORTE_DE_PELO.BAÑO,"un baño reconfortante para su mascota",60.00,7000);
    Servicio servicio3=new Servicio(TipoServicio.LIMPIEZA_DE_OIDOS,"se hace una limpieza en la cabidad auricular de su mascota",45,5000);
    Turno turno1 = new Turno("20/06/2025 a las 17:30", Estado.PROGRAMADO, mascota1, servicio1);
    Turno turno2 = new Turno("01/06/2025 a las 16:00", Estado.PROGRAMADO, mascota5, servicio1);
    Turno turno3 = new Turno("02/06/2025 a las 10:00", Estado.CANCELADO, mascota2, servicio2);
    Turno turno4 = new Turno("02/06/2025 a las 11:00", Estado.REALIZADO, mascota3, servicio3);
    Turno turno5 = new Turno("03/06/2025 a las 15:00", Estado.PROGRAMADO, mascota4, servicio2);
    Turno turno6 = new Turno("03/06/2025 a las 16:30", Estado.REALIZADO, mascota1, servicio1);
    Turno turno7 = new Turno("04/06/2025 a las 12:00", Estado.PROGRAMADO, mascota5, servicio3);
    Turno turno8 = new Turno("04/06/2025 a las 13:30", Estado.CANCELADO, mascota2, servicio1);
    Turno turno9 = new Turno("05/06/2025 a las 14:00", Estado.PROGRAMADO, mascota3, servicio2);
    Turno turno10 = new Turno("05/06/2025 a las 15:30", Estado.REALIZADO, mascota4, servicio3);
    Mascota[] listaMascota = new Mascota[5];
    listaMascota[0] = mascota1;
    listaMascota[1] = mascota2;
    listaMascota[2] = mascota3;
    listaMascota[3] = mascota4;
    listaMascota[4] = mascota5;
    Turno[] turnos = new Turno[10];
    turnos[0] = turno1;
    turnos[1] = turno2;
    turnos[2] = turno3;
    turnos[3] = turno4;
    turnos[4] = turno5;
    turnos[5] = turno6;
    turnos[6] = turno7;
    turnos[7] = turno8;
    turnos[8] = turno9;
    turnos[9] = turno10;

    buscarMascotaPorNombre(listaMascota);


    System.out.println(turno1.toString());
    turno2.mostrarDatos();
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
      }
      if (mascota[i].getEspecie().equals(Especie.GATO)) {
        cantGatos++;
      }
      if (mascota[i].getEspecie().equals(Especie.LORO)) {
        cantLoros++;
      }
      if (mascota[i].getEspecie().equals(Especie.COBAYO)) {
        cantCobayo++;
      }
    }
    System.out.println("la cantidad de perros asociados es: " + cantPerros +
        "\n la cantidad de gatos asociados es: " + cantGatos +
        "\n la cantidad de loros asociados es: " + cantLoros +
        "\n la cantidad de cobayos asociados es: " + cantCobayo);
  }

  public static void contarTurnosPorEstado(Turno[] turnos) {
    int programados = 0;
    int cancelados = 0;
    int realizados = 0;

    for (int i = 0; i < turnos.length; i++) {
      Turno turno = turnos[i];
      if (turno != null) {
        switch (turno.getEstado()) {
          case PROGRAMADO:
            programados++;
            break;
          case CANCELADO:
            cancelados++;
            break;
          case REALIZADO:
            realizados++;
            break;
        }
      }
    }

    System.out.println("Turnos programados: " + programados);
    System.out.println("Turnos cancelados: " + cancelados);
    System.out.println("Turnos realizados: " + realizados);
  }
}//cierre class