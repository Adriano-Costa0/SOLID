import src.interfaces.BaseFuncionario;
import src.interfaces.Funcionario;
import src.interfaces.SuperiorInterface;

public class Gerente extends Funcionario implements SuperiorInterface  {
  public Gerente(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.valorHora = 35;
    this.level = 3;
  }

  @Override
  public void calcularSalario() {
    double base = valorHora * 8 * 30;
    System.out.println("O salario do Gerente " + this.nome +  " é de R$ " + base + (base / level) + " Reais");
  }

  @Override
  public void gerarRelatorioDePerformance() {
    System.out.println("A performance do Gerente está em 90%");
  }

  @Override
  public void definirSuperior(BaseFuncionario superior) {
    System.err.println("O novo superior sera " + nome);
    
  }

  

}