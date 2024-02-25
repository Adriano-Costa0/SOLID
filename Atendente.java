import src.interfaces.BaseFuncionario;
import src.interfaces.Funcionario;

public class Atendente extends Funcionario {

  public Atendente(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.valorHora = 15;
    this.level = 4;
  }

  @Override
  public void calcularSalario() {
    System.out.println("O salario do Atendente " + this.nome +  " é de R$ " +valorHora * 8 * 30 + " Reais");
  }

  @Override
  public void definirSuperior(BaseFuncionario superior) {
    System.err.println("O novo superior sera " + nome);
    
  }
}