# MyStack.java
## Description 
This project provides an implementation of the StackInterface using a linked stack data structure. The main purpose of this code is to manipulate a stack using various methods, such as push, pop, peek, isEmpty, and clear. Additionally, the code includes a static method isBalanced that uses a stack to detect whether an HTML file is tag balanced or not.
## Requirements 
This project requires the use of 'bridges.base.SLelement' and 'java.util' packages.
## Usage 
To use this code, simply create an instance of 'MyStack' and call its methods as needed. For example:
```
MyStack<Integer> stack = new MyStack<>();
stack.push(42);
int top = stack.pop();
System.out.println(top); // outputs 42
```
To check if an HTML file is tag balanced, use the isBalanced static method:
```
File file = new File("index.html");
boolean isBalanced = MyStack.isBalanced(file);
System.out.println(isBalanced); // outputs true if file is tag balanced, false otherwise
```
## Credits 
This project was created by Mohammad Garada
