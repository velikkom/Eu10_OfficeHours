package week6;

public class ReverseString {
    public static void main(String[] args) {
        String str="laptop";
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ""+ch;

        }
        System.out.println(reverse);

    }

}
