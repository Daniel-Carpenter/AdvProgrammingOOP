import java.util.Stack;

public class myStack<E> {
Stack<E> stk = new Stack<E>();

public void push(E obj) {
	stk.push(obj);
}

public E pop() {
	E obj = stk.pop();
	return obj;
}


public static void main (String[] args)
{
	myStack<String> gs = new myStack<String>();
	gs.push("Hello");
	System.out.println(gs.pop());
}
}