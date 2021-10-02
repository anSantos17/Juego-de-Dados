
package dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ArchivosJ {
 
    Jugador j;
    private ArrayList<Jugador> jugadores;
    
    public ArchivosJ(){
        j = new Jugador();
        jugadores = new ArrayList<>();
    }

    public void grabar(String c ,String n, float s){
        
        try{
            FileWriter archivo = new FileWriter("archivojugador.txt", true);
            try(BufferedWriter almacen = new BufferedWriter(archivo)){
            almacen.write(c +";" +n+";"+ s + "\n");
            almacen.close();
            }
            archivo.close();
        }catch(Exception ex){}
        j.registrarse(c, n, s);
    }
        
    public ArrayList leer(String c ,String n, float s){
        try{
            FileReader archivo = new FileReader("archivojugador.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            Jugador nuevo = new Jugador(c,n,s);
            for (int i = 0; i<jugadores.size(); i++){
                jugadores.add(nuevo);
            }
        }catch(Exception ex){
           
        }return jugadores; 
    }
    
    public void agregarJugador(String c ,String n, float s){
        Jugador nuevo = new Jugador(c,n,s);
        jugadores.add(nuevo);
    }
    
    public String buscarJugadorr(String usuario, String contraseña, float saldo){
        for (int i =0; i<jugadores.size(); i++){
            if (usuario == jugadores.get(i).getNombre()){
                if(contraseña ==jugadores.get(i).getContraseña()){
                    j.registrarse(usuario, contraseña, saldo);
                }
                String s = "Usuario ya existe";
                return s;
            }
        }return null;
    }
    public String buscarJugadori(String usuario, String contraseña){
        for (int i =0; i<jugadores.size(); i++){
            if (usuario != jugadores.get(i).getNombre()){
                
                String s = "Usuario no existe";
                return s;
            }else{
                if(contraseña ==jugadores.get(i).getContraseña()){
                    j.iniciarSesion(usuario, contraseña);
                    float g = jugadores.get(i).getSaldoInicial();
                    String s = String.valueOf(g);
                    System.out.println(s);
                    return s;
                }
            }
        }String s = "Usuario no existe";
         return s;
    }
    
}
