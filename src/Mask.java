public abstract class Mask {

    public static String getMaskFromNumber(String number){
        int length = number.substring(number.indexOf(",") + 1).length();

        String maskPartial = length > 0 ? (length > 1 ? "##.###.###,##" : "##.###.###,#") : "##.###.###";

        number = number.replaceAll("[^0-9]", "");
        StringBuilder out = new StringBuilder();

        String mask = maskPartial.substring(number.length() - (length - 1));

        int indiceMask = 0;
        for (int indice = 0; indice < number.length();  indice++) {
            if (mask.charAt(indiceMask) == '#') {
                out.append(number.charAt(indice));
            } else {
                out.append(mask.charAt(indiceMask));
                out.append(number.charAt(indice));
                indiceMask++;
            }
            indiceMask++;
        }

        return out.toString();
    }
}
