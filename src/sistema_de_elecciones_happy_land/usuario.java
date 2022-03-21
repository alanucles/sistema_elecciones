/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_elecciones_happy_land;


/**
 *
 * @author APeña
 */
public class usuario {
    
    public static String nombreUsuarioGlobal;
    public static String contrasenaGlobal;

    
    
     //valores privados
    private String nombreUsuario;
    private String contrasena;
    
    
        //constructor

    public usuario() {
        this.nombreUsuario="";
        this.contrasena="";
    }

    public static String getContrasenaGlobal() {
        return contrasenaGlobal;
    }
    public static void setContrasenaGlobal(String contrasenaGlobal) {
        usuario.contrasenaGlobal = contrasenaGlobal;
    }
    public static String getNombreUsuarioGlobal() {
        return nombreUsuarioGlobal;
    }
    public static void setNombreUsuarioGlobal(String nombreUsuarioGlobal) {
        usuario.nombreUsuarioGlobal = nombreUsuarioGlobal;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
}
