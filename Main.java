import src.classes.Carne;
import src.classes.Sabao;

public class Main {
  public static void main(String[] args) {
    Ceo angelo = new Ceo("Angelo", "Justus");
    Gerente roberto = new Gerente("Roberto", "Martines");
    Atendente adriano = new Atendente("Adriano", "Costa");
    Venda venda = new Venda();

    Carne patinho = new Carne("Patinho");
    Carne paleta = new Carne("Paleta");
    Sabao sabao = new Sabao("Ype");


    angelo.calcularSalario();
    roberto.calcularSalario();
    adriano.calcularSalario();

    venda.adicionaProduto(sabao);
    venda.adicionaProduto(patinho);
    venda.adicionaProduto(paleta);
    
    venda.cancelaProduto(roberto);
    venda.calculaTotal();



    
  }
  
}