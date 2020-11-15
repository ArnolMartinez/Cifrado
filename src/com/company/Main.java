package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner entrada= new Scanner(System.in);
        char valor[]=new char[5];
        char cifrado[]=new char[5];
        System.out.println("Ingrese una contraseña de 5 caracteres: ");
        valor=entrada.next().toCharArray();

        cifrado[0]=valor[2];
        cifrado[1]=valor[0];
        cifrado[2]=valor[4];
        cifrado[3]=valor[1];
        cifrado[4]=valor[3];
        for(int x=0;x<5;x++){
            System.out.println("original: "+valor[x]+" cifrado: "+cifrado[x]);
        }
    }
}
