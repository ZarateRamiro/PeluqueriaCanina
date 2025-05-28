package model;

public class Servicio {
  private int id;
  private TipoServicio tipoDeServicio;
  private String descripcion;
  private double TiempoEstimado;
  private double precio;
  private static int cantS;

  public Servicio(TipoServicio tipoDeServicio, String descripcion, double tiempoEstimado, double precio) {
    cantS++;
    this.id = cantS;
    this.tipoDeServicio = tipoDeServicio;
    this.descripcion = descripcion;
    TiempoEstimado = tiempoEstimado;
    this.precio = precio;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public TipoServicio getTipoDeServicio() {
    return tipoDeServicio;
  }

  public void setTipoDeServicio(TipoServicio tipoDeServicio) {
    this.tipoDeServicio = tipoDeServicio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getTiempoEstimado() {
    return TiempoEstimado;
  }

  public void setTiempoEstimado(double tiempoEstimado) {
    TiempoEstimado = tiempoEstimado;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Servicio " +
        "id= " + id +
        ", tipo De Servicio= " + tipoDeServicio + '\'' +
        ", descripcion= " + descripcion + '\'' +
        ", Tiempo Estimado= " + TiempoEstimado +
        ", precio= " + precio;
  }
  public static double calcularIva(double precio){
   final double  iva=21;
    return (precio*iva)/100;
  }

  public void mostrarDatos() {
    System.out.println(toString());
  }
  public boolean esServicioLargo(double tiempoEstimado){
    boolean largo=true;
     if(tiempoEstimado>60){
       largo=true;}
     else {largo=false;}
     return largo;
  }
}