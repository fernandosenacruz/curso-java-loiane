package aula044.exercicios;

public class Cubo extends Figura3D {
  private double aresta;

  /**
   * @return the aresta
   */
  public double getAresta() {
    return aresta;
  }

  /**
   * @param aresta the aresta to set
   */
  public void setAresta(double aresta) {
    this.aresta = aresta;
  }

  @Override
  public double calcularArea() {
    return Math.pow(aresta, 2) * 6;
  }

  @Override
  public double calcularVolume() {
    return Math.pow(aresta, 3);
  }
}
