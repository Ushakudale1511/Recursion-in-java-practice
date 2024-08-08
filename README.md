In Java, Recursion is a process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called a recursive function. Using a recursive algorithm, certain problems can be solved quite easily. A few Java recursion examples are Towers of Hanoi (TOH), Inorder/Preorder/Postorder Tree Traversals, DFS of Graph, etc.

Base Condition in Recursion
In the recursive program, the solution to the base case is provided and the solution to the bigger problem is expressed in terms of smaller problems.

int fact(int n)
{
    if (n < = 1) // base case
        return 1;
    else    
        return n*fact(n-1);    
}
In the above example, the base case for n < = 1 is defined and the larger value of a number can be solved by converting it to a smaller one till the base case is reached. 

Working of Recursion
The idea is to represent a problem in terms of one or more smaller sub-problems and add base conditions that stop the recursion. For example, we compute factorial n if we know the factorial of (n-1). The base case for factorial would be n = 0. We return 1 when n = 0.

