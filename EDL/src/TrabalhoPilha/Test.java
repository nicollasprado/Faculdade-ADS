package TrabalhoPilha;

public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack(Integer.class);

        stack.pushV(1);
        stack.pushV(2);
        stack.pushV(3);
        stack.pushV(4);
        stack.pushV(5);
        stack.pushV(6);
        stack.pushV(7);
        stack.pushV(8);
        stack.pushV(9);
        stack.pushP(20);
        stack.pushP(23);
        stack.pushP(24);
        stack.pushP(25);
        stack.pushP(26);
        stack.pushP(27);
        stack.pushP(28);
        stack.pushP(29);
        stack.pushP(30);
        stack.pushP(32);
        stack.print();
        System.out.println(" ");
        System.out.println(stack.getSize());
        System.out.println(stack.getCapacity());
        stack.popV();
        stack.print();
        System.out.println(" ");
        System.out.println(stack.getSize());
        System.out.println(stack.getCapacity());
        stack.popP();
        stack.popP();
        stack.popP();
        stack.popP();
        stack.popP();
        stack.popP();
        stack.popP();
        stack.popV();
        stack.popV();
        stack.popV();
        stack.print();
        System.out.println(" ");
        System.out.println(stack.getSize());
        System.out.println(stack.getCapacity() * 0.3);
    }
}
