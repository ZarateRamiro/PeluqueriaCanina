import model.*;

public class Main {
  public static void main(String[] args) {
      Mascota mascota1=new Mascota("Toto", Especie.PERRO,"Ladador",34,"ramiro");
      Servicio servicio1=new Servicio(TipoServicio.CORTE_DE_PELO,"se le cortara el pelo al perro", 2.30,8000);
      Turno turno1=new Turno("20/06/2025 a las 17:30", "programado",mascota1,servicio1);


    System.out.println(turno1.toString());
  }//cierre main
}//cierre class