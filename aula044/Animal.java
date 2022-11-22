package aula044;

public abstract class Animal {
  private String name;

  public abstract String sound();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
