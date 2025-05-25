package Pilha.PilhaDuasFilas;

public class TestPilhaDuasFilas {
    public static void main(String[] args) {
        PilhaDuasFilasImpl stack = new PilhaDuasFilasImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.print();
        stack.pop();
        stack.print();
    }
}
