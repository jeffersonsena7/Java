/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Jefferson Sena
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        //cconvertendo de int para string
        int idade = 30;
        String valor = Integer.toString(idade);
        String.out.println(valor);*/
        
        /*
        //convertendo de string para int 
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);*/
        
        //convertendo de string para Float
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f", idade);
    }
    
}
