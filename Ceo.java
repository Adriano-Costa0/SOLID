import src.interfaces.CeoInterface;

class Ceo implements CeoInterface {
  public String nome = "";
  public String sobrenome = "";
  public int valorHora = 0;
  public int level = 0;
  
  public Ceo(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.valorHora = 80;
    this.level = 1;
  }

  @Override
  public void calcularSalario() {
    double base = valorHora * 8 * 30;
    System.out.println("O salario do Ceo " + this.nome +  " é de R$ " + base + (base / level) + " Reais");
  }

  @Override
  public void levantarBalanço() {
    System.out.println("Balanço do mes ainda não foi finalizado");
  }

  @Override
  public void gerarRelatorioDePerformance() {
    System.out.println("A performance do CEO está em 80%");
  }



  
}