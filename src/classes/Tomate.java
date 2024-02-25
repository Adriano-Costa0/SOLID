package src.classes;
import src.interfaces.Produto;

public class Tomate extends Produto{
  public Tomate(String nome){
    this.nome = nome;
    this.categoria = "verduras";
    this.codigo = "VE123123";
  }

  @Override
  public void definePreço() {
    this.preço = 9.99;
  }
  
}
