package aula038;

public class Syndic extends Dweller {
  public Syndic(String block, String apartment, double condoValue) {
    super(block, apartment, condoValue);
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected void conveneAssembly(String name) {
    System.out.println(name + " convocou uma assembléia!");
  }

}
