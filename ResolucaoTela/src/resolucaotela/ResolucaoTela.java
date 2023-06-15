/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Jefferson Sena
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension resolucao = tela.getScreenSize();
        System.out.print("A resolucao do sistema: ");
        System.out.print( resolucao.width + " x " + resolucao.height );
    }
    
}
