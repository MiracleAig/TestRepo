public class Methods{
    public static double avgLength(String str1, String str2, String str3){
        int lenS1 = str1.length();
        int lenS2 = str2.length();
        int lenS3 = str3.length();

        double avgLen = (lenS1 + lenS2 + lenS3) / 3.0;

        return avgLen;


    }

    public static String swapLast(String str1, String str2){
        int s1Len = str1.length() - 1;
        int s2Len = str2.length() -1 ;

        String lastLetterS1 = str1.substring(s1Len);
        String lastLetterS2 = str2.substring(s2Len);

        String str1WordWithOutLast = str1.substring(0, s1Len);
        String str2WordWithOutLast = str2.substring(0, s2Len);

        String formatStr1 = str1WordWithOutLast += lastLetterS2;
        String formatStr2 = str2WordWithOutLast += lastLetterS1;

        return "Swap1: " + formatStr1 + "\nSwap2: " + formatStr2;
    }

    public static String formatName(String name){
        int splitOfFirstAndLast = name.indexOf(" ");
        int lengthOfName = name.length();

        String getFirstName = name.substring(0, splitOfFirstAndLast);
        String getLastName  = name.substring(splitOfFirstAndLast + 1,lengthOfName);

        return getLastName + ", " + getFirstName;
    }

   public static String middleLetters(String str1, String str2) {
    if (str1.length() <= 1 || str2.length() <= 1) {
       System.out.print("Sorry you cant do it this way");
    }
    int mid1 = str1.length() / 2;
    int mid2 = str2.length() / 2;
    if (str1.length() % 2 == 0) {
        mid1--;
    }
    if (str2.length() % 2 == 0) {
        mid2--;
    }
    return str1.charAt(mid1) + "" + str2.charAt(mid2);
}

   
}
