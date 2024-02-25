package src.interfaces;

public abstract class Funcionario implements BaseFuncionario {
  public String nome = "";
  public String sobrenome = "";
  public int valorHora = 0;
  public int level = 0;
  public BaseFuncionario superior = null;
  

  public abstract void definirSuperior(BaseFuncionario superior);
}
