import java.util.*;
public class TestDqueue {
    public static void main(String args[]){
        int choice=0;
        Scanner sc =new Scanner(System.in);
        MyDqueue d = new MyDqueue();
        do {
            System.out.println("*******Dqueue menu*******");
        System.out.println("1.insert front");
        System.out.println("2.insert rear");
        System.out.println("3.delete front ");
        System.out.println("4.delete rear");
        System.out.println(" 5. display");
        System.out.println("6.exit");
      
        System.out.println("enter the choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1: d.insertFront(); break;
            case 2: d.insertRear();break;
            case 3: d.deleteFront(); break;
            case 4: d.deleteRear(); break;
            case 5: d.display();break;
            case 6: break;
            default:
            System.out.println("invalid choice");
        }
    } while(choice!=6);   
    sc.close();
  }
}



class MyDqueue{
    private int MAX_SIZE=5;
    int front =-1,rear=-1;
    int dd[]=new int[MAX_SIZE];
    Scanner sc= new Scanner(System.in);
    void insertFront(){
        if((front == 0&& rear==MAX_SIZE-1) || (front== rear+1))
        System.out.println("dqueue is overflow");
        else{
            System.out.println("enter the value of element to be inserted");
            int n =sc.nextInt();
            if(front ==-1&&rear==-1){
                front =rear=0;
                dd[front]=n;
                System.out.println("inserted element is" +dd[front]);
            }
            else if(front ==0){
                    front = MAX_SIZE-1;
                    dd[front] =n;
                }
                else{
                    front--;
                    dd[front]=n;
                }

            }
        }
        void insertRear(){
            if((front ==0 && rear ==MAX_SIZE-1)||front ==rear+1)
            System.out.println("dqueue is overflow");
            else{
                System.out.println("enter the value of element to be inserted");
                int n =sc.nextInt();
                if(front ==-1&&rear==-1){
                front =rear=0;
                dd[rear]=n;
            }
                else if(rear ==MAX_SIZE-1){
                    rear =0;
                    dd[rear]=n;
                }
                else {
                    rear++;dd[rear]=n;
                }
            }
         }
         void display(){
            if(front ==-1&& rear==-1)
            System.out.println("dqueue is  empty");
            else{
                int i;
                i=front;
                while(i!=rear){
                    System.out.println(dd[i]);
                    i =(i+1)%MAX_SIZE;
            }
            System.out.println(dd[rear]);
            }
         }


         void deleteFront(){
            if(front ==-1&&rear==-1){
                System.out.println("empty");
            }
            else{
                if(front ==rear){
                    System.out.println("deleted element is "+dd[front] );
                }
                else if(front ==MAX_SIZE-1){
                    System.out.println("dqueue" +dd[front]);
                    front=0;
                }
                else{
                    System.out.println("deleted " +dd[front]);

                }
            }

         }
         void deleteRear(){
            if(front==-1&& rear==-1)
            System.out.println("empty");
             else{
                if(front ==rear){
                    System.out.println("deleted element" +dd[rear]);
                    front = rear =-1;
                }
                else if(rear==0){
                    System.out.println("deleted element" +dd[rear]);
                    rear=MAX_SIZE-1;
                }
                else{
                    System.out.println("dqueue" +dd[rear]);
                    rear--;
                }
             }   
         }

}