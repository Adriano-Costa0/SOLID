package src.classes;
import src.interfaces.Produto;

public class Sabao extends Produto{
  public Sabao(String nome){
    this.nome = nome;
    this.categoria = "sabao";
    this.codigo = "SA123123";
  }
  
  @Override
  public void definePreço() {
   this.preço = 11.0;
  }
  
}
