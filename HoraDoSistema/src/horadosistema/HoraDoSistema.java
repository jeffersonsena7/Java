/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.util.Date;

/**
 *
 * @author Jefferson Sena
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date(); //quando coloca new para criar o objeto
        System.out.print("A hora do sistema é");
        System.out.print(relogio.toString());
    }
    
}
