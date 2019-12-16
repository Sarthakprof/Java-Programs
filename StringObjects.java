public class StringObjects {
    public static void main(String[] args) {        
        String s = new String("Hello World  ");
        System.out.println(s.trim() + " //trimmed removed extra spaces" + "\n" + s.substring(4,9) +" //Sub string"
        + "\n" + s.toUpperCase() + " //to uppercase conversion" + "\n" + s.charAt(3) + " //chatAt");
    }
}
/*
Output:

Hello World //trimmed removed extra spaces
o Wor //Sub string
HELLO WORLD   //to uppercase conversion
l //chatAt

*/