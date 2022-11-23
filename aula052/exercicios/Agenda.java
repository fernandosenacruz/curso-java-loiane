package aula052.exercicios;

public class Agenda {
  private Contato[] contatos;

  public Agenda() {
    contatos = new Contato[5];
  }

  /**
   * @param contato
   * @return
   * @throws AgendaCheiaException
   */
  public void add(Contato contato) throws AgendaCheiaException {
    boolean cheia = true;

    for (int i = 0; i < contatos.length; i++) {
      if (contatos[i] == null) {
        contatos[i] = new Contato(contato);
        cheia = false;
        break;
      }
    }

    if (cheia) {
      throw new AgendaCheiaException();
    }
  }

  public String listarContatos() throws Exception {
    for (Contato contato : contatos) {
      if (contato != null) {
        return contato.toString() + "\n";
      } else {
        throw new Exception("Não há contatos cadastrados ainda");
      }
    }
    return null;
  }

  /**
   * @param nome
   * @return the contato
   * @throws NaoEncontradoException
   */
  public String buscaPorNome(String nome) throws NaoEncontradoException {
    for (Contato contato : contatos) {
      if (contato != null && contato.getNome().trim().equalsIgnoreCase(nome)) {
        return contato.toString();
      }
    }
    throw new NaoEncontradoException(nome);

  }

  @Override
  public String toString() {
    String result = "";

    for (Contato contato : contatos) {
      if (contato != null) {
        result += contato.toString() + "\n";
      }
    }

    return result;
  }
}
