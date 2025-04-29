package Pilha.Lista;

import java.util.Scanner;
import java.util.Stack;

public class AlgoritmoBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String brackets = input.nextLine();
        Stack<Character> open = new Stack<>();
        boolean valid = true;

        for(int i = 0; i < brackets.length(); i++) {
            if(!valid){
                break;
            }

            char current = brackets.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                open.add(current);
            }else {
                switch(current){
                    case ')':
                        if(open.pop() != '(') {
                            valid = false;
                        }
                        break;
                    case ']':
                        if(open.pop() != '[') {
                            valid = false;
                        }
                        break;
                    case '}':
                        if(open.pop() != '{') {
                            valid = false;
                        }
                        break;
                }
            }
        }

        System.out.println(valid);
    }
}
