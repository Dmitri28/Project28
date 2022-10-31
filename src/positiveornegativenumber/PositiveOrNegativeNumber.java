/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positiveornegativenumber;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PositiveOrNegativeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     
        Scanner n=new Scanner(System.in);
        int m=n.nextInt();
        if(m!=-0){
            System.out.println("It is posetive");
            
        }else{
            System.out.println("It is negative");
        }
         
     }
     
    }
    

