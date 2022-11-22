package aula052.exercicios;

public class Contato {
  private int _id = 0;
  private String nome;
  private String telefone;
  private String email;
  private int contador;

  public Contato() {
    contador++;
    _id = contador;
  }

  /**
   * @return the id
   */
  public int get_id() {
    return _id;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the telefone
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * @param telefone the telefone to set
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Contato [_id: " + _id + ", nome: " + nome + ", telefone: " + telefone + ", email: " + email + ", contador: "
        + contador + "]";
  }
}
