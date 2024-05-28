import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        Stack<Integer> stack=new Stack<Integer>();
        while(!q.isEmpty())
        {
            stack.push(q.poll());
        }
        System.out.println("Stack:"+stack);
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        System.out.println(q);
        
    }
}