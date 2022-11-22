package aula044.exercicios;

public class Quadrado extends Figura2D {
  private double lado;

  /**
   * 
   * @return the quadrado
   */
  public double getLado() {
    return lado;
  }

  /**
   * 
   * @param lado the quadrado to set
   */
  public void setLado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return Math.pow(lado, 2);
  }
}
