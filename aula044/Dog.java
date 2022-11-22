package aula044;

import aula044.interfaces.Pet;

public class Dog extends Mammal implements Pet {
  private String name;
  private String race;

  @Override
  public void breastfeed() {
  }

  @Override
  public String sound() {
    return "Latir";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  @Override
  public void play() {
    System.out.println("Brincando com o doguinho...");    
  }

}
