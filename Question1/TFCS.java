package tfcs;
import java.util.Scanner;
public class TFCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of States:");
        int Q = sc.nextInt();
        State[] StArr = new State[Q];
        for(int i=0;i<Q;i++){
            StArr[i] = new State();
        }
        int inpa,inpb;
        for(int j=0;j<Q;j++){
            System.out.println("State "+j+" On input a");
            inpa = sc.nextInt();
            System.out.println("State "+j+" On input b");
            inpb = sc.nextInt();
            StArr[j].SetValues(StArr[inpa], StArr[inpb]);
            
        }
    }
    
}
