/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Angela
 */
public class Jugador {
    private  String nombre;
  private String contraseña;
  private float saldoInicial;

  
  public Jugador(String c, String n, float s){
    this.nombre =c;
    this.contraseña =n;
    this.saldoInicial = s;

  }
  public Jugador(){
    this.nombre ="";
    this.contraseña ="";
    this.saldoInicial = 0;

  }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
  

  public void registrarse( String nombre, String contraseña, float saldo){
    this.nombre = nombre;
    this.contraseña = contraseña;
    this.saldoInicial = saldo;
  }

  public String iniciarSesion(String nnombre, String ncontraseña){
    if (this.nombre == nnombre){
      if(this.contraseña == ncontraseña){
           String saldo = String.valueOf(this.saldoInicial);
            return saldo;
      }else{
          String aviso = "Contraseña incorrecta";
        return aviso;
      }
    }else{
        String aviso = "Usuario incorrecto";
        return aviso;
    }

  }

  public void apostar(String estadoJuego, float valApostado){

    if(estadoJuego == "gano"){
      this.saldoInicial = this.saldoInicial + valApostado;
    }else{
      this.saldoInicial = this.saldoInicial - valApostado;
    }
  }


}