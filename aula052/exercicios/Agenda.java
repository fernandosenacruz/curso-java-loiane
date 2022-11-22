package aula052.exercicios;

public class Agenda {
  private Contato[] contatos;

  public Agenda() {
    contatos = new Contato[5];
  }

  /**
   * @param contato
   * @throws AgendaCheiaException
   */
  public void add(Contato contato) throws AgendaCheiaException {
    boolean agendaCheia = true;

    if (agendaCheia) {
      throw new AgendaCheiaException();
    }

    for (int i = 0; i < contatos.length; i++) {
      if (contatos[i] != null) {
        contatos[i] = contato;
        agendaCheia = false;
      }
    }

  }

  /**
   * @param nome
   * @return the contato
   * @throws NaoEncontradoException
   */
  public Contato buscaPorNome(String nome) throws NaoEncontradoException {
    for (Contato contato : contatos) {
      if (contato != null && contato.getNome().equalsIgnoreCase(nome)) {
        return contato;
      }
    }

    throw new NaoEncontradoException(nome);
  }

  @Override
  public String toString() {
    String result = "";

    for (Contato contato : contatos) {
      result += contato.toString() + "\n";
    }

    return result;
  }
}
