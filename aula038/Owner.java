package aula038;

public class Owner extends Dweller {
  public Owner(String block, String apartment, double condoValue) {
    super(block, apartment, condoValue);
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected void payCondoValue(double condoValue) {
    super.setCondoValue(condoValue);
  }

  protected String vote(String vote) {
    switch (vote) {
      case "sim":
        return "Sim";
      case "não":
        return "Não";

      default:
        return "Abstenção";
    }
  }
}
