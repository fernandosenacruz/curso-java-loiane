package aula044.exercicios;

public class Cilindro extends Figura3D {
  private double altura;
  private double raio;

  /**
   * @return the altura
   */
  public double getAltura() {
    return altura;
  }

  /**
   * @param altura the altura to set
   */
  public void setAltura(double altura) {
    this.altura = altura;
  }

  /**
   * @return the raio
   */
  public double getRaio() {
    return raio;
  }

  /**
   * @param raio the raio to set
   */
  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    double areaBase = Math.PI * Math.pow(raio, 2);
    double areaLateral = 2 * Math.PI * raio * altura;
    double areaTotal = 2 * areaBase + areaLateral;

    return areaTotal;
  }

  @Override
  public double calcularVolume() {
    return Math.PI * Math.pow(raio, 2) * altura;
  }
}
