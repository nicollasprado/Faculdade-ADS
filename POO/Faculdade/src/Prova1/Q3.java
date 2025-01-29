package Prova1;/*
* [BEE 1253] Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições. Coloque um comentário com o texto “TADS”.
Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.
Saída
Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.
* */


import java.util.Scanner;

public class Q3 {

    public static String charsetToString(char[] decodedCharset){
        String stringDecoded = "";
        for(int i=0; i < decodedCharset.length; i++){
            stringDecoded += decodedCharset[i];
        }
        return stringDecoded;
    }

    public static char[] shiftChar(char[] codedCharset, int shiftAmount){
        char[] decodedCharset = new char[codedCharset.length];
        for(int i=0; i < codedCharset.length; i++) {
            int asciiShifted = codedCharset[i] + shiftAmount;
            if (asciiShifted > 90) {
                asciiShifted -= 26;
            }
            decodedCharset[i] = (char) asciiShifted;
        }
        return decodedCharset;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtTests = input.nextInt();
        for(int i=0; i < qtTests; i++){
            String rawStr = input.next();
            rawStr = rawStr.toUpperCase();
            int shiftAmount = input.nextInt();
            char[] codedCharset = new char[rawStr.length()];
            for(int z=0; z < rawStr.length(); z++){
                codedCharset[z] = rawStr.charAt(z);
            }
            char[] decodedCharset = shiftChar(codedCharset, shiftAmount);
            String decodedString = charsetToString(decodedCharset);
            System.out.println(decodedString);
        }
    }
}