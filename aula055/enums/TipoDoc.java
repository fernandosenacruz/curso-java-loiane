package aula055.enums;

import utils.GeraCPFCNPJ;

public enum TipoDoc {
  CPF {
    @Override
    public String geraNumDoc() {
      return GeraCPFCNPJ.cpf();
    }
  },
  CNPJ {
    @Override
    public String geraNumDoc() {
      return GeraCPFCNPJ.cnpj();
    }
  };

  /**
   * @return the number of document
   */
  public abstract String geraNumDoc();
}
