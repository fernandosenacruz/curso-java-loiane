package aula036;

public class Contact {
  private String name;
  private Address address;
  private Phone[] phoneNunber;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Phone[] getPhoneNunber() {
    return phoneNunber;
  }

  public void setPhoneNunber(Phone[] phoneNunber) {
    this.phoneNunber = phoneNunber;
  }

}
