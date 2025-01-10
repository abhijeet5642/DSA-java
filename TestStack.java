
import java.util.Scanner;


public class TestStack {
    public static void main(String[] args) {
        int choice;
        do{
        System.out.println("----------Stack Menu--------");
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.display");
        System.out.println("4.exit");
        Scanner sc = new Scanner(System.in);
        choice=sc.nextInt();
        MyStack M =new MyStack();
        switch (choice) {
            case 1:M.push();break;    
            case 2:M.pop();break;
            case 3:M.display();break ;
        
            default:
                System.out.println("invalid choice");
        }
        }while(choice!=4); 
    }
    
}
class MyStack{
     final  int MAXSIZE=3;
     int top=-1;
     int stack[]=new int[MAXSIZE];
    void push(){
        int n;
        if(top==MAXSIZE-1){
            System.out.println("stack is overflow");
        }
        else{
            Scanner sc = new Scanner(System.in);
            n =sc.nextInt();
            top++;
            stack[top]=n;
            System.out.println("element added:" +stack[top]);
        }
    }

    void pop(){
        int n;
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            n=stack[top];
            top--;
            System.out.println("poped element");
        }
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for(int i =top;i>=0;i--){
                System.out.println("stack element are:" +stack[i]);
            }
        }
    }

}
