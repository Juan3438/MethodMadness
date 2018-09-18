package Josorio;

public class JosorioLib {

    public static void println(String str) {
        System.out.println(str);
    }

    public static String reverse(String var) {
        String reversed = "";
        for(int i = var.length()-1;i >= 0;i--)
        {
            String letter = var.substring(i,i+1);
            reversed += letter;
        }
        return reversed;
    }

    public static boolean isFibonnaci(int num) {
        int FibIdx = 1;
        while(FibIdx < num)
            FibIdx += FibIdx;
        if(FibIdx == num)
            return true;
        else
            return false;
    }
    public static int sumUpTo(int num){
        int sum = 0;
        for(int i = 0;i<num;i++){
            sum += i;
        }
        return sum;
    }
    public static boolean isPalindrome(String str ){
        String test = reverse(str);
        return (test.equals(str));
    }
    public static String cutOut(String mainStr, String subStr){
        String idx = mainStr.indexOf(subStr);
        String result = mainStr.
    }
}
