public class SubString_method {
    public static void main(String[] args) {

        String str = "abcd";
        printSubString(str);

    }

    public static void printSubString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));

            }

        }

    }
}
