public class Palindrome {
    public  boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        String reverse = new StringBuilder().append(str).reverse().toString();
        return str.equals(reverse);
    }
    public boolean isPalindrome2(int num) {
        if(num<0|| ((num%10==0)&&(num!=0))){
            return false;
        }
        int rev = 0;
        int digit = 0;
        while(num > rev){
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return num == rev || num == rev / 10;
    }
}
