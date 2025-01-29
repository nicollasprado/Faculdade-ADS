import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro endereço IP: ");
        IP firstIp = new IP(input.next());
        System.out.println("Digite o Segundo endereço IP: ");
        IP secondIp = new IP(input.next());
        System.out.println("Digite a mascara de subrede: ");
        SubnetMask subnetMask = new SubnetMask(input.next());

        String firstIpNoDots = firstIp.getBinaryEquivalent().replace(".", "");
        String secondIpNoDots = secondIp.getBinaryEquivalent().replace(".", "");
        String maskNoDots = subnetMask.getBinaryEquivalent().replace(".", "");

        String firstIpAND = "";
        String secondIpAND = "";
        for(int i=0; i<32; i++){
            firstIpAND += Integer.toString(Character.getNumericValue(firstIpNoDots.charAt(i)) & Character.getNumericValue(maskNoDots.charAt(i)));
            secondIpAND += Integer.toString(Character.getNumericValue(secondIpNoDots.charAt(i)) & Character.getNumericValue(maskNoDots.charAt(i)));
        }

        if(firstIpAND.equals(secondIpAND)){
            System.out.println("Sao da mesma rede!");
        }else{
            System.out.println("Nao sao da mesma rede");
        }
        System.out.println(firstIpAND);
        System.out.println(secondIpAND);
    }
}