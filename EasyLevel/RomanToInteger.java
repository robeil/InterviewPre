package InterviewPre.EasyLevel;

import java.util.Arrays;

public class RomanToInteger {

    public static String romanToInt(String s){

       final char i = 'I', v = 'V', x = 'X', l = 'L', c = 'C', d = 'D', m = 'M';
        int in = 1, vn = 5, xn = 10, ln = 50, cn = 100, dn = 500, mn = 1000;
        int[] number = new int[s.length()];

        for(int j = 0; j < s.length(); j++){
            if(s.toUpperCase().charAt(i) == i){
                number[i] = in;
            } else if(s.toUpperCase().charAt(i) == v) {
                number[i] = vn;
            }else if (s.toUpperCase().charAt(i) == x) {
                number[i] = xn;
            }else if (s.toUpperCase().charAt(i) == l) {
                number[i] = ln;
            }else if (s.toUpperCase().charAt(i) == c){
                   number[i] = cn;
            }else if (s.toUpperCase().charAt(i) == d){
                   number[i] = dn;
            }else if (s.toUpperCase().charAt(i) == m){
                   number[i] = mn;
            }else if (s.toUpperCase().charAt(i) == x){
           } else {
                System.out.println("Not the right roman number");
            }
        }
        return Arrays.toString(number);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
