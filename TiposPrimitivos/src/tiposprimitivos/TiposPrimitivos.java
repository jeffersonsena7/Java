/* Isso é comentario de multiplas linhas
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/** Comentario para documentação
 *
 * @author Jefferson Sena
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); //para string nextLine
        
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); 
        //System.out.print("A nota e " + nota);
        //para saltar linha coloca println
        System.out.println("A nota e " + nota);
        //print formatado
        System.out.printf("A nota de %S e %.2f \n",nome, nota);
    }
    
}
