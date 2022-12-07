package week6;

public class WhilePractices {
    public static void main(String[] args) {
        //one();
        //three();
        // four();
        five();
    }

    public static void one() {
        int count = 100;
        while (count < 100) {
            count = count + 1;
            System.out.println(count);
        }

        System.out.println(count);

    }

    public static void three() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.print("+i");
            i++;
        } while (i < 11);

    }


    public static void four() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void five(){

        String word="school";
        String result="";

        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='ı'||ch=='o'||ch=='ö'){
                result+=ch;
            }
        }

        System.out.println(result);
    }
}
