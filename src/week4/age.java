package week4;

public class age {
    public static void main(String[] args) {
        int age=5;
        if(age>=0&&age<=2){
                System.out.println("at home" );
        } else if (age>=3&&age<=6) {
            System.out.println("kindergarten");

        } else if (age>=7&& age<=12) {
            System.out.println("primary school");
        }else {
            System.out.println("Please enter a proper number");
        }
    }
    // 3. check kids age, decide which school they should go to
    /*
    0-2
    3-6
    7-12
    */






}
