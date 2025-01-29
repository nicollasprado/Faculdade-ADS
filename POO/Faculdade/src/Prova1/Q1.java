package Prova1;/*
* Reescreva o programa a seguir usando ‘if’ ao invés de ‘switch’.Coloque um comentário com o texto “TADS”.

int dia = 3;
String nomeDia;
switch (dia) {
    case 1: nomeDia = "Domingo"; break;
    case 2: nomeDia = "Segunda"; break;
    case 3: nomeDia = "Terca"; break;
    default: nomeDia = "Dia Invalido"; break;
}
System.out.println(nomeDia);
* */

public class Q1 {

    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;
        if(dia == 1){
            nomeDia = "Domingo";
        }else if(dia == 2){
            nomeDia = "Segunda";
        }else if(dia == 3){
            nomeDia = "Terca";
        }else {
            nomeDia = "Dia invalido";
        }
        System.out.println(nomeDia);
    }
}
