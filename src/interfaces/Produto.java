package src.interfaces;

public abstract class Produto {
  public String codigo = "";
  public String nome = "";
  public String categoria = "";
  public Double preço = null;

  public abstract void definePreço();

}
