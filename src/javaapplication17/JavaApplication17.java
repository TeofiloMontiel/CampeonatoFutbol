/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
   
    int golesfavor=0;
    int golescontra=0;
    int puntos=0;
    int diferenciagoles;
    int perdidos=0;
    int ganados=0;
    int empatados=0;
            
    for (int partidos = 1; partidos <= 10; partidos++){
        
        System.out.println("Ingrese los goles a favor del partido número "+partidos);
        int golesF = intro.nextInt();
        golesfavor=golesfavor+golesF;
        
        System.out.println("Ingrese los goles en contra del partido número "+partidos);
        int golesC = intro.nextInt();
        golescontra=golescontra+golesC;
        
        if (golesF>golesC){
            puntos=puntos+3;
            ganados++;}
        if (golesF<golesC){
            puntos=puntos+0;
            perdidos++;}
        if (golesF==golesC){
            puntos=puntos+1;
            empatados++;}
    }
    diferenciagoles = golesfavor-golescontra;
        System.out.println("Los resultados son \n"
                + "Puntos = "+puntos+"\n"
                + "Diferencia de golpes = "+diferenciagoles+"\n"
                + "Partidos ganados = "+ganados+"\n"
                + "Partidos empatados = "+empatados+"\n"
                + "Partidos perdidos = "+perdidos+"\n"
                + "Goles a favor = "+golesfavor+"\n"
                + "Goles en contra = "+golescontra);
        if (puntos<10)
            System.out.println("El equipo a quedado en liguilla de promoción");
        if (puntos>=10 && puntos<20)
            System.out.println("El equipo no a quedado en ninguna liguilla");
        if (puntos>20)
            System.out.println("El equipo a quedado en liguilla de Campeonato");
    }
    } 
