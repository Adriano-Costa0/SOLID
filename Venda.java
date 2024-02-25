import java.util.ArrayList;

import src.interfaces.Produto;

public class Venda {
  ArrayList<Produto> produtos = new ArrayList<Produto>();

  public void adicionaProduto(Produto item){
    this.produtos.add(item);
  }

  public void cancelaProduto( Gerente gerente){
    System.out.println(gerente.nome + " Cancelou o produto");
  }

  public void calculaTotal(){
    Double total = 0.0;
    for (Produto produto : produtos) {
      produto.definePreço();
      total += produto.preço;
    }

    System.err.println("O total da compra foi de R$" + total + " reais \n");
  }
}
