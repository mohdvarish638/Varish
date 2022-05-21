package Conditionalstatements;

public class Day1ifelse {
    public static void main(String[] args) {
        int age=21;
        String city="Agra";
        if(age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
        if(age>18&& city=="agra"){
            System.out.println("eligible for voting in agra");
        }
    }
}
