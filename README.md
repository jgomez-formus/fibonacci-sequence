**Product Name: Runtime Efficiency Fibonacci Sequence**

**Current Date: 10/20/2021**

**By:  Juan Gomez | Valencia College**

**Product Overview 👀**
The project evaluates runtime efficiency to get the Fibonacci Sequence number for a specific input (sequence position).
It loops through the first 45 integer numbers to find the corresponding Fibonacci number. It calculates the time taken to find the number in two different methods: The recursive method and the Iterative method.

**Product Objectives 🎯**
The objective is to identify which method is more efficient to find the corresponding Fibonacci number.


**Recursive Method✔️**
The recursive method returns a fixed value when the input number is equal to 0 or 1. When the input number is greater than 1 it makes two recursive calls where after subtracting 1 and 2 from the input number. Finally, add the results.

**Iterative Method ✔️**
The iterative method returns a fixed value when the input number is equal to 0. It also stores the first two Fibonacci numbers and also keeps track of the previous Fibonacci number. It helps to reduce the memory is used in the stack.

**Analysis ✔**
The iterative method is the best approach as could be seen in the graphs below. While the recursive method keeps growing as we increase the number of interactions in our loop. Using the Iterative method execute every interaction in approximately the same amount of time.


![Fibonacci_Iterative_Method](https://user-images.githubusercontent.com/90294264/138200746-20674b7d-f336-47f0-a5ba-4a62f8a07d7f.png)
![Fibonacci_Recursive_Method](https://user-images.githubusercontent.com/90294264/138200747-d617008f-7244-49a8-8f43-c82167bf9f90.png)
