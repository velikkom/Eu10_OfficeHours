package week6;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9-i*2+1)+String.valueOf(i+1).repeat(i*2+1));

            
        }
    }
}
