public class Main {

    public static String getkoma(String sString, int iCounter) {
        String sTemp = "";
        int iLen = sString.length();
        int iFound = 0;

        // Tambahkan koma di akhir string
        sString = sString + ",";

        for (int iI = 0; iI < iLen; iI++) {
            char sKoma = sString.charAt(iI);
            if (sKoma == ',') {
                iFound++;
                if (iFound == iCounter) {
                    return sTemp;
                }
                sTemp = "";
            } else {
                sTemp += sKoma;
            }
        }
        return sTemp;
    }

    public static void main(String[] args) {
        String sString = "apple,banana,orange,grape";
        int iCounter = 4;
        System.out.println("String ke-" + iCounter + " dari '" + sString + "' adalah: " + getkoma(sString, iCounter));
    }
}