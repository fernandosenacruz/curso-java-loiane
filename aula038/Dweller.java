package aula038;

public abstract class Dweller {
  private String block;
  private String apartment;
  private double condoValue;

  public Dweller(String block, String apartment, double condoValue) {
    this.block = block;
    this.apartment = apartment;
    this.condoValue = condoValue;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public double getCondoValue() {
    return condoValue;
  }

  public void setCondoValue(double condoValue) {
    this.condoValue = condoValue;
  }

}
