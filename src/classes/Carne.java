package src.classes;
import src.interfaces.Produto;

public class Carne extends Produto{
  public Carne(String nome){
    this.nome = nome;
    this.categoria = "carne";
    this.codigo = "CA123123";
  }

  @Override
  public void definePreço() {
    this.preço = 19.4;
  }
  
}
