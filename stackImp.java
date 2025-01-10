import java.util.*;
class MyStack{
    int MAX_SIZE=10;
     int top=-1;
    int stack[] =new int[MAX_SIZE];
    Scanner sc =new Scanner(System.in);
    void push(){
        int n;
        if(top==MAX_SIZE-1)
        System.out.println("stack overflow");
        else{
            System.out.println("element for push");
            n=sc.nextInt();
            top++;
            stack[top] =n;
            
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("empty");
        }
        else{
            int n; 
            n = stack[top];
            top--;
            System.out.println("popped element is" +n);
        }
    }
    void display(){
        if(top==-1){
            System.out.println("empty");

        }
        else{
            System.out.println("stack elements are" );
            for(int i =top;i>=0;i--){
                System.out.println(" elements are :"+stack[i]);
            }
        }
    }

}
class stackImp{
    public static void main(String[] args) {
        int choice;
        Scanner sc =new Scanner(System.in);
        MyStack m = new MyStack();

        do{
            System.out.println("*---------stack Menu----------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.exit");
            System.out.println("enter ur choice");
            choice =sc.nextInt();
;            switch(choice){
                case 1: m.push(); break;
                case 2: m.pop();break;
                case 3: m.display(); break;
                case 4: break;
                default:
                System.out.println("invalid choice");
            }
        }while(choice!=4);
    }
}