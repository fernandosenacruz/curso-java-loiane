package aula036;

public class Relationship {
  public static void main(String[] args) {
    Contact contact = new Contact();
    Address address = new Address();
    Phone phone = new Phone();
    Phone[] phones = new Phone[1];

    address.setPublicPlace("Rua dos Bobos");
    address.setNumber("0");
    address.setDistric("Far");
    address.setState("Far");
    address.setCity("Away");
    address.setZipCode(" CEP: 00.000-001");

    phone.setType("mobile");
    phone.setCode("+55 81");
    phone.setNumber("99644-6357");

    phones[0] = phone;

    contact.setName("Ximira");
    contact.setAddress(address);
    contact.setPhoneNunber(phones);

    if (contact.getName() != null)
      System.out.println(contact.getName());

    if (contact.getAddress() != null) {
      System.out.print(contact.getAddress().getPublicPlace() + ", ");
      System.out.print(contact.getAddress().getNumber() + ", ");
      System.out.print(contact.getAddress().getDistric() + ", ");
      System.out.print(contact.getAddress().getState() + ", ");
      System.out.print(contact.getAddress().getCity() + ", ");
      System.out.println(contact.getAddress().getZipCode() + ".");
    }

    for (Phone p : phones)
      System.out.println(p.getCode() + " " + p.getNumber());

  }
}
