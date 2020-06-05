public class StringCalculator {

    public static void main(String[] args) {
        String number = "\\n1;2[3,4”";
        String answer = Add(number);

        System.out.println("Answer is: "+ answer);
    }

    private static String Add(String number){
        String num = "a" + number;
        int result = 0;
        String stringNumber = num.replaceAll(" ", "");
        char[] charNumber = stringNumber.toCharArray();

        boolean caseThree = false;
        for (int i = 0 ; i < charNumber.length ; i++ ) {
            if (charNumber[i] == ';' || charNumber[i] == '[')
                caseThree = true;
        }

        if (!caseThree) {
            for (int i = 0; i < charNumber.length; i++) {
                if (Character.isDigit(charNumber[i]) && i > 0) {
                    if (charNumber[i - 1] == '-') {
                        return "negatives not allowed";
                    } else {
                        result += Integer.parseInt(String.valueOf(charNumber[i]));
                    }
                }
            }
        }else{
            for (int i = 0; i < charNumber.length; i++) {
                if (Character.isDigit(charNumber[i]) && i > 0) {
                    if (charNumber[i - 1] == '-') {
                        return "negatives not allowed";
                    } else {
                        result += Integer.parseInt(String.valueOf(charNumber[i]))*10;
                    }
                }
            }
        }


        return String.valueOf(result);
    }
}
