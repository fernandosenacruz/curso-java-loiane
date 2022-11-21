package aula038;

public class Tenant extends Dweller {
  public Tenant(String block, String apartment, double condoValue) {
    super(block, apartment, condoValue);
  }

  private String name;
  private double rentAmount;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getRentAmount() {
    return rentAmount;
  }

  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }

  protected String payRentAmount() {
    return "Aluguel quitado!";
  }

  protected void payCondoValue(double condoValue) {
    super.setCondoValue(condoValue);
  }

}
