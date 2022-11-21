package aula036;

import java.util.Optional;

public class Address {
  private String publicPlace;
  private String number;
  private Optional<String> addressComplement;
  private String distric;
  private String city;
  private String state;
  private String zipCode;

  public String getPublicPlace() {
    return publicPlace;
  }

  public void setPublicPlace(String publicPlace) {
    this.publicPlace = publicPlace;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getDistric() {
    return distric;
  }

  public void setDistric(String distric) {
    this.distric = distric;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Optional<String> getAddressComplement() {
    return addressComplement;
  }

  public void setAddressComplement(Optional<String> addressComplement) {
    this.addressComplement = addressComplement;
  }

}
