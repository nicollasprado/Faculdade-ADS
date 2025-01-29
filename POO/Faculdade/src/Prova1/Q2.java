package Prova1;/*
* [BEE 1164] Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo, o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não .Coloque um comentário com o texto “TADS”.
Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.
Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo com a especificação fornecida.
* */

import java.util.Scanner;

public class Q2 {

    public static boolean testPerfectNum(int[] numDivisors, int num){
        int divisorsSum = 1;
        for(int i=0; i < numDivisors.length; i++){
            divisorsSum += numDivisors[i];
        }

        if(divisorsSum == num){
            return true;
        }else{
            return false;
        }
    }

    public static int[] getDivisors(int testNum){
        int qtDivisors = 0;
        for(int j=2; j < testNum; j++){
            if(testNum % j == 0){
                qtDivisors++;
            }
        }

        int[] divisors = new int[qtDivisors];
        int supportIndex = 0;
        for(int i = testNum-1; i > 1; i--){
            if(testNum % i == 0){
                divisors[supportIndex] = i;
                supportIndex++;
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtTests = input.nextInt();
        int[] nums = new int[qtTests];
        for(int i = 0; i < qtTests; i++){
            nums[i] = input.nextInt();
        }

        for(int j = 0; j < nums.length; j++){
            int[] numDivisors = getDivisors(nums[j]);
            if(testPerfectNum(numDivisors, nums[j])){
                System.out.println(nums[j] + " é Perfeito");
            }else{
                System.out.println(nums[j] + " não é Perfeito");
            }
        }
    }
}
