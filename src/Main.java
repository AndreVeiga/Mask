public class Main {
    public static void main(String[] args) {
        // 1.234.567,8
        String number = "1234,8";
        String maskFromNumber = Mask.getMaskFromNumber(number);
        System.out.println("Mask: " + maskFromNumber);
    }

}
