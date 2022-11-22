package aula052;

public class CustomException extends Exception {
  public CustomException(int number01, int number02) {
    super();
    this.number01 = number01;
    this.number02 = number02;
  }

  private int number01;
  private int number02;

  /**
   * 
   * @return the number01
   */
  public int getNumber01() {
    return number01;
  }

  /**
   * 
   * @param number01 the number01 to set
   */
  public void setNumber01(int number01) {
    this.number01 = number01;
  }

  /**
   * 
   * @return the number02
   */
  public int getNumber02() {
    return number02;
  }

  /**
   * 
   * @param number02 the number02 to set
   */
  public void setNumber02(int number02) {
    this.number02 = number02;
  }

  @Override
  public String toString() {
    return number01 + " / " + number02 + " não é um inteiro";
  }

}
