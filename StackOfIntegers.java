public class StackOfIntegers 
{
    private int[] elements;
    private int size;
  
    // Construct a stack with the default capacity 16 
    public StackOfIntegers() 
    {
      this(16);
    }
  
    // Construct a stack with the specified maximum capacity 
    public StackOfIntegers(int capacity) 
    {
      elements = new int[capacity];
    }

    public boolean empty() 
    {
      return size == 0;
    }

    // Return the top element from the stack 
    public int peek() 
    {
      return elements[size - 1];
    }
  
    // Push a new integer into the top of the stack 
    public void push(int value) 
    {
      elements[size] = value;
      size ++;
    }
  
    // Return and remove the top element from the stack 
    public int pop() 
    {
      return elements[--size];
    }
  
    // Return the number of elements in the stack 
    public int getSize() 
    {
      return size;
    }
  }