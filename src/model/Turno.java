package model;

public class Turno {
  private int id;
  private String fechayHoraDelTurno;
  private String estado;
  private static int cantT;
  private Mascota mascota;
  private Servicio servicio;

  public Turno(String fechayHoraDelTurno, String estado, Mascota mascota, Servicio servicio) {
    cantT++;
    this.id = cantT;
    this.fechayHoraDelTurno = fechayHoraDelTurno;
    this.estado = estado;
    this.mascota = mascota;   // Aca se relaciona el turno con la mascota
    this.servicio = servicio;
  }

  public String getFechayHoraDelTurno() {
    return fechayHoraDelTurno;
  }

  public void setFechayHoraDelTurno(String fechayHoraDelTurno) {
    this.fechayHoraDelTurno = fechayHoraDelTurno;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public static int getCantT() {
    return cantT;
  }

  public static void setCantT(int cantT) {
    Turno.cantT = cantT;
  }

  public Mascota getMascota() {
    return mascota;
  }

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }

  public Servicio getServicio() {
    return servicio;
  }

  public void setServicio(Servicio servicio) {
    this.servicio = servicio;
  }

  @Override
  public String toString() {
    return "Turno " +
        "id=" + id +
        ", Fecha y Hora Del Turno= '" + fechayHoraDelTurno +
        ", estado= " + estado + '\'' +
        "\n mascota= " + mascota +
        "\n servicio= " + servicio ;
  }


  public void mostrarDatos() {
    System.out.println(toString());
  }
}