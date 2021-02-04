public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        x = Math.abs(x);
        if(x / 10 == 0) return x;
        return (x % 10) + addDigits(x / 10);
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if(str.length() <= 1) return true;
        
        return (str.charAt(0) == str.charAt(str.length() - 1)) && isPalindrome(str.substring(1, str.length() - 1));
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if(str.length() <= 1)   return str;
        return (str.substring(str.length() - 1) + reverse(str.substring(1, str.length() - 1)) + str.substring(0,1));
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
