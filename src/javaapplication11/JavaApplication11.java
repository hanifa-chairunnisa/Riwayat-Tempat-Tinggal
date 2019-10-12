/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String batam;
        String kualaenok;
        String sumbawa;
        String inhil;
        
        Scanner input = new Scanner(System.in);   
    System.out.println("== RIWAYAT TEMPAT TINGGAL ==");
    System.out.println("2001-2004 : ");
    batam = input.next();
    System.out.println("2005-2007 : ");
    kualaenok = input.next();
    System.out.println("2008-2013 : ");
    sumbawa = input.next();
    System.out.println("2014-sekarang :");
    inhil = input.next();
    
    System.out.println("--------------------");
    System.out.println("2001-2004 : " + batam);
    System.out.println("2005-2007 : " + kualaenok);
    System.out.println("2008-2013 : " + sumbawa);
    System.out.println("20014-sekarang : " + inhil);
    }
    
}
