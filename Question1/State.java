package tfcs;
import java.util.Scanner;
public class State {
    boolean Initial;
    boolean Final;
    State inputa;
    State inputb;
    String name;
    
    public void SetValues(State a,State b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Initial?");
        Initial = sc.nextBoolean();
        System.out.println("Is Final?");
        Final = sc.nextBoolean();
        inputa = a;
        inputb = b;
    }
}
