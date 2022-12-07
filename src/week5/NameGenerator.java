package week5;

public class NameGenerator {
    public static void main(String[] args) {
        String name="Robert Down Junior";
        String firstName="";
        String secondName="";
        String lastName="";

        firstName= name.substring(0,1);
        secondName=name.substring(7,8);
        lastName=name.substring(12);
        name=firstName+"."+secondName+"."+lastName;
        System.out.println(name);


    }
}
/*
input:
output:R.D.Junior
 */