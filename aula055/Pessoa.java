package aula055;

import aula055.enums.TipoDoc;

public class Pessoa {
  private TipoDoc tipo;
  private String numDoc;
  private String nome;

  public Pessoa() {
  }

  public Pessoa(TipoDoc tipo, String numDoc, String nome) {
    this.tipo = tipo;
    this.numDoc = numDoc;
    this.nome = nome;
  }

  public TipoDoc getTipo() {
    return tipo;
  }

  public void setTipo(TipoDoc tipo) {
    this.tipo = tipo;
  }

  public String getNumDoc() {
    return numDoc;
  }

  public void setNumDoc(String numDoc) {
    this.numDoc = numDoc;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return nome +"\n" + tipo + ": " + numDoc;
  }

}
