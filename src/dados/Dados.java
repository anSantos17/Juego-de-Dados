
package dados;

public class Dados {
  private Dado dado1;
  private Dado dado2;

  public Dados(){
    dado1=new Dado();
    dado2=new Dado();
  }

  public void lanzar(){
    dado1.lanzar();
    dado2.lanzar();
  }

  public int getSuma(){
    return dado1.getValor()+dado2.getValor();
  }


}
