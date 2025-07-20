public class Palindrome {
    public String testPalindrome(String str){
        String result = "";
        int lastChar = str.length() - 1; 
        for (int i = 0; i < lastChar ; i++){
            if (str.charAt(i) == str.charAt(lastChar -i)){
                result = str + " is a Palindrome";
            } else {
                result = str + " is not Palindrome";
            }            
        }
        return result;
    }
    public void main(String[] args){
        System.out.println(testPalindrome("race"));
    
    }
}
