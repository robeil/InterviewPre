package InterviewPre;

public class Palindrome {

    public static boolean isPalindrome(int x){

        String num = String.format("%d",x);
        String reverse = null;
        boolean isPali = false;

        for(int i = num.length()-1; i >= 0; i--){
            reverse = num.substring(i);
        }

       if(reverse.equals(num)){
            isPali = true;
        }
            return isPali;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
