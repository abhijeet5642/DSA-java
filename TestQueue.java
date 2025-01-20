import java.util.*;
class TestQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
      
       
        do{
            System.out.println("*****Queue Menu***");
             System.out.println("1.insert");
             System.out.println("2.delete");
             System.out.println("3.display ");
             System.out.println("enter ur choice");
             choice = sc.nextInt();
             UserQueue u =new UserQueue();
             switch(choice){
                case 1:
                u.insert();break;
                case 2: 
                u.delete();break;
                case 3:
                u.display();break;
                default:
                System.out.println("invalid choice ");
             }

        }while(choice!=3);
    }
}
// methods
class UserQueue{
    private int rear =-1;
    private int front = 0;
    private int  MAXSIZE =10;
    private int[] myqueue=new int[MAXSIZE];
    Scanner sc = new Scanner(System.in);
    void insert(){
        int n;
        if(rear ==MAXSIZE-1)
        System.out.println("queue is overflow");
        else
        System.out.println("enter element to be insert");
        n =sc.nextInt();
        rear++;
        myqueue[rear]=n;
        System.out.println("inserted element is :" +n);

    }

    void delete(){
        
        if(front>rear)
        System.out.println("queue is empty");
        else{
            int n;
            n=myqueue[front];
            front++; 
            System.out.println("deleted element is :"+n);

        }

    }
    void display(){
        if(front>rear)
        System.out.println("queue is empty ");
        else{
            System.out.println("queue elements are:");
            for( int i=rear;i>=front;i--){
                System.out.println(myqueue[i] + " ");

        }
        }
    }
}