public class Main {

    public static String getkoma(String sString, int iCounter) {
        String sTemp = "";
        int iLen = sString.length();
        int iFound = 0;

        // Tambahkan koma di akhir string
        sString = sString + ",";

        for (int iI = 0; iI < iLen; iI++) { //25x looping
            char sKoma = sString.charAt(iI);//ambil 1 character
            if (sKoma == ',') {
                iFound++; //nambah 2x
                if (iFound == iCounter) {
                    return sTemp;
                }
                sTemp = ""; // inisialisasi lgi  ke "" jika tidak sama dgn 2 ,
            } else {// jika tidak menemukan ,
                sTemp += sKoma;// stemp=stemp+koma=>stemp ke isi nilai string=>(apple,banana,orange,grape)                      
            }
        }
        return sTemp;
    }

    public static void main(String[] args) {
        String sString = "apple,banana,orange,grape";
        int iCounter = 4;
        System.out.println("String ke-" + iCounter + " dari '" + sString + "' adalah: " + getkoma(sString, iCounter)); //isinya 'banana'
    }
}
