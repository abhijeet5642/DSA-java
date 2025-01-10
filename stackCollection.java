import java.util.*;
public class stackCollection {
    
    public static void main(String[] args) {
        System.out.println("------------stack menu------------*");
        System.out.println("1.push ");
        System.out.println("1.push");
        System.out.println("1.push");
        System.out.println("1.push");
        System.out.println("1.push");
        System.out.println("1.push");
        Stack<Integer> mystack=new Stack<>(); 
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        System.out.println(mystack.size());
        System.out.println("elements are" +mystack.toString());
        for(Integer I:mystack){
            System.out.println(I); 
            
        }
        System.out.println("last element is" +mystack.peek());
        System.out.println("elements in serial order");
       ListIterator I = mystack.listIterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }
        // System.out.println("element in reverse order");
        // int n;
        // n=mystack.size();
        // ListIterator lt =mystack.listIterator(n);
        // while(lt.hasPrevious()){
        //     System.out.println(lt.previous());
        //     // System.out.println(" ");  
        // }
        System.out.println("searched element is " +mystack.search(40));
     }
    
}
