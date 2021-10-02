
package dados;

public class Juego {
  int numLanzamiento;
  int priLanzamiento;
  int valLanzamiento;
  private Dados dados;
  Jugador j;

  public Juego(){
    this.numLanzamiento=0;
    this.priLanzamiento=0;
    this.valLanzamiento=0;
    dados = new Dados();
    j = new Jugador();
  }

  public void jugar(float x){
    dados.lanzar();
    String g;
    this.priLanzamiento = dados.getSuma();
    if(numLanzamiento==0){
      if (this.priLanzamiento == 11 ||this.priLanzamiento ==7){
      g = "gano";
          j.apostar(g,x);
      apostar1(g);
      }else if(this.priLanzamiento == 2 ||this.priLanzamiento ==3||this.priLanzamiento ==12){
          g = "perdio";
       j.apostar(g,x);
       apostar1(g);
      }else{
        numLanzamiento+=1;
      }
    }else{
      dados.lanzar();
      valLanzamiento=dados.getSuma();
      if(valLanzamiento==7){
        numLanzamiento=0;
         g = "perdio";
        j.apostar(g,x);
        apostar1(g);
      }else if(valLanzamiento==priLanzamiento) {
        numLanzamiento=0;
        g = "gano";
        j.apostar(g,x);
        apostar1(g);
      }
    }
  }
  public String apostar1(String estadoJuego){
      if(estadoJuego == "gano"){
         String gano = "Ganaste";
          return gano;
      }else {
          String perdio = "Perdiste";
          return perdio;
      }      
  }

}