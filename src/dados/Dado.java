
package dados;

import java.util.Random;
public class Dado {
  private int valor;
  private static Random r;
  public Dado(){
    r= new Random();
    this.lanzar();
  }
  public int getValor(){
    return valor;
  }
  public void lanzar(){
    valor=r.nextInt(6)+1;
  }

}