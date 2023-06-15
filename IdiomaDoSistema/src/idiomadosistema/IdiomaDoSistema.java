/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Jefferson Sena
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma da maquina:  ");
        System.out.print(idioma.getDisplayLanguage());
        
    }
    
}
