package aula044.exercicios;

public class Piramide extends Figura3D {
  private double altura;
  private double arestaBase;
  private double apotema;
  private int numPoligonoBase;
  private Figura2D base;

  /**
   * 
   * @return the altura
   */
  public double getAltura() {
    return altura;
  }

  /**
   * 
   * @param altura the altura to set
   */
  public void setAltura(double altura) {
    this.altura = altura;
  }

  /**
   * 
   * @return the arestaBase
   */
  public double getArestaBase() {
    return arestaBase;
  }

  /**
   * 
   * @param arestaBase the arestaBase to set
   */
  public void setArestaBase(double arestaBase) {
    this.arestaBase = arestaBase;
  }

  /**
   * 
   * @return the apotema
   */
  public double getApotema() {
    return apotema;
  }

  /**
   * 
   * @param apotema the apotema to set
   */
  public void setApotema(double apotema) {
    this.apotema = apotema;
  }

  /**
   * 
   * @return the base
   */
  public Figura2D getBase() {
    return base;
  }

  /**
   * 
   * @param base the base to set
   */
  public void setBase(Figura2D base) {
    this.base = base;
  }

  public int getNumPoligonoBase() {
    return numPoligonoBase;
  }

  public void setNumPoligonoBase(int numPoligonoBase) {
    this.numPoligonoBase = numPoligonoBase;
  }

  @Override
  public double calcularArea() {
    if (base != null) {
      return (numPoligonoBase * ((apotema * arestaBase) / 2)) + base.calcularArea();
    }

    return 0;
  }

  @Override
  public double calcularVolume() {
    if (base != null) {
      return (base.calcularArea() * altura) / 3;
    }

    return 0;
  }
}
