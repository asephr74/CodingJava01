import java.text.DecimalFormat;

public class Main {
    private static final String[] satuan = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"};
    private static final String[] belasan = {"", "Sebelas", "Dua Belas", "Tiga Belas", "Empat Belas", "Lima Belas", "Enam Belas", "Tujuh Belas", "Delapan Belas", "Sembilan Belas"};
    private static final String[] puluhan = {"", "Sepuluh", "Dua Puluh", "Tiga Puluh", "Empat Puluh", "Lima Puluh", "Enam Puluh", "Tujuh Puluh", "Delapan Puluh", "Sembilan Puluh"};
    private static final String[] ribuan = {"", "Ribu", "Juta", "Miliar", "Triliun"};

    public static void main(String[] args) {
        double amount = 2155000;
        System.out.println(convertToWords(amount));
    }

    public static String convertToWords(double number) {
        if (number == 0) {
            return "Nol Rupiah";
        }

        long integerPart = (long) number;
        int fractionPart = (int) Math.round((number - integerPart) * 100);

        String integerWords = convertIntegerToWords(integerPart);
        String fractionWords = convertIntegerToWords(fractionPart);

        return integerWords + " Rupiah" + (fractionPart > 0 ? " dan " + fractionWords + " Sen" : "");
    }

    private static String convertIntegerToWords(long number) {
        if (number == 0) {
            return "";
        }

        String words = "";
        int index = 0;

        while (number > 0) {
            int chunk = (int) (number % 1000);
            if (chunk != 0) {
                String chunkWords = convertChunkToWords(chunk);
                words = chunkWords + " " + ribuan[index] + " " + words;
            }
            number /= 1000;
            index++;
        }

        return words.trim();
    }

    private static String convertChunkToWords(int number) {
        String words = "";

        if (number > 99) {
            words += satuan[number / 100] + " Ratus ";
            number %= 100;
        }

        if (number > 10 && number < 20) {
            words += belasan[number - 10] + " ";
        } else {
            if (number > 9) {
                words += puluhan[number / 10] + " ";
                number %= 10;
            }

            if (number > 0) {
                words += satuan[number] + " ";
            }
        }

        return words.trim();
    }
}