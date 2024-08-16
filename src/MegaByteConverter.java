public class MegaByteConverter {
    public static void main(String[] args) {
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int mb = kiloBytes / 1024;
            int kb= kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + mb + "MB" + "and" + kb + "kb");
        }
        // 1mb = 1024 kb (we are plugging kb so 1 kb/ 1024 = mb % is remainder
    }

}
