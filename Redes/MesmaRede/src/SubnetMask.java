public class SubnetMask {
    private String binaryEquivalent;
    private String subnetMask;

    public SubnetMask(String subnetMask){
        this.subnetMask = subnetMask;
        generateBinaryEquivalent();
    }

    public void generateBinaryEquivalent(){
        String ipStr = this.subnetMask;
        ipStr += ".";
        String[] binaryString = new String[4];
        int binaryStringIndex = 0;
        String binaryStrBuffer = "";
        String buffer = "";
        int auxBufferIndex = 0;
        int iteredBits = 0;
        String numBlock = "";
        int numBlockInt = 0;
        boolean parsing = false;
        while(auxBufferIndex < ipStr.length()){
            buffer = Character.toString(ipStr.charAt(auxBufferIndex));
            if(!buffer.equals(".")){
                numBlock += buffer;
                auxBufferIndex++;
            }else{
                if (!parsing) {
                    numBlockInt = Integer.parseInt(numBlock);
                }
                if (iteredBits < 8 && numBlockInt == 0) {
                    binaryStrBuffer = "0" + binaryStrBuffer;
                } else if (numBlockInt == 0 && iteredBits == 8) {
                    binaryString[binaryStringIndex] = binaryStrBuffer;
                    binaryStringIndex++;
                    auxBufferIndex++;
                    numBlock = "";
                    binaryStrBuffer = "";
                    numBlockInt = 0;
                    iteredBits = -1;
                    parsing = false;
                } else {
                    parsing = true;
                    binaryStrBuffer = (numBlockInt % 2) + binaryStrBuffer;
                    numBlockInt /= 2;
                }
                iteredBits++;
            }
        }
        for(int i=0; i < 4; i++){
            if(i == 0){
                this.binaryEquivalent = binaryString[0] + ".";
            }else if(i == 3){
                this.binaryEquivalent += binaryString[3];
            }else{
                this.binaryEquivalent += binaryString[i] + ".";
            }
        }
    }


    public String getBinaryEquivalent() {
        return binaryEquivalent;
    }

    public void setBinaryEquivalent(String binaryEquivalent) {
        this.binaryEquivalent = binaryEquivalent;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }
}
