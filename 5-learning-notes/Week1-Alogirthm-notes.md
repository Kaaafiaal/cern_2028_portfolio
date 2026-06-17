1)What is an Algorithm?
- a predetermined path set towards a certain goal. Where the key feature is identifying a problem and building a solution towards it
An example is an insertion sort..


2)What is an Insertion Sort? 
- it is a technique, to basically sort unsorted element in however order you prefer.
  it works from left to right--> it examines each item and compares to it's left--->sorts in correct order         after comparing
- it goes one step checks to it's left and it keeps checking to it's left until it meets the set order requirement

3)Algorithm needs to be?
- correct
-efficient 
-easy to implement

4)Algorithm's properties
- solves a given problem
-correctness requires a proof of "correctness"
- efficiency (less time required)

4.1)Difference between algorithm and program: Algorithm is something you design to solve a problem , it's without syntax of programming language. It's basically a vague  overview of how you are going to solve a problem. Where as Programming is basically an in detail - with syntax method of solving a problem

5)Optimization is key because it saves time and energy-- for example if I was "greedy" actor and had to choose the max amount of films to perform in
Out of the options
1-Picking the movie that starts earliest
2-Picking the movie which is very short so you can finish quickly
3-Picking a movie that ends earliest

It'd be wise to select the one that ends earliest, that way i can maximize the number of films i perform in

6) We need tools to distinguish correct algorithms from incorrect ones, the primary one of which is called a "proof"


7)Priori Analysis                           and              Posteriori Testing [Abdul Bari]
1. Analysis done on algorithm
(Studying it into greater detail)                            1.Analysis done on Program 

2.Programming language doesn't matter                        2.Programming language matters

3.Time and Space function: it uses language                  3.Checking Real world performance limits to     
                                                              numbers of systems (Old device ,new device)
neutral expression like Big-O notation O(n), 
O(n^2)..) to tell you how the code will scale as 
DATA GROWS TO
infinity

8)Example of Writing an Algorithm and analyzing 

Algorithm Swap(a,b)

Begin 
     temp=a;
      a = b;
      b = temp;
end

##it needs to be understandable
9)The criteria of writing an algorithm---> 1)How much time 2) Space 3)Network Consumption 4)Power consumption 5)CPU registers 


THE MAIN PORTION STARTS::------------------------------------------------------

**each statement takes 1 unit of time**

Algorith Swap (a,b)
temp=a;--1
a=b;--1
b=temp;--1
end

so the total time is (1+1+1)=3;
Time function f(n)=3; which is a constant
Space used:
a ---1
b ---1
temp 1
--------
    = 3  which is basically a constant 
so S(n)=3

now order, usually constant means --> order of 1--> which is basically any constant
O(1)

----Frequency Count Method---------------------------------------------------------
[if any statement is repeating in some amount of times, then we can say it's in a frequency, and we will apply this method]


Let's say we have an array of 5 elements [8][3][9][7][2]
and we have a pseudo code
Algorithm Sum(A,n)
{
s=0;
for(i=0li<n;i++)
//here i=0 will execute for 1 time , i++ will repeat for n time depending on n       
   { 
    S=S+A[i];        // where as i<n will be checked for n+1 times, let's look below
   }
Return s;

Basically sum of all the array elements

             i=0 
             i=1
             i=2
             i=3 
             i=4
             i=5 X  , i changed 4 times , checked 5 times thats why for i<n we took n+1 times; 

The condition check on that line is evaluation n+1 times, which represents the maximum number of times the computer interacts with that row

so we have s=0 --1
for () --n+1
S=S+A[i]---n
return s --1 

so the time function is f(n)= 2n+3 
order of n so O(n) since there's a variable

Now we look at space complexity-- A = n ; because it can hold a lot of number and we dont know
                                  n = 1 variable 
                                  S = 1 variable
                                  i = 1 variable
                                



IMPORTANT----------
 VERY TEDIOUS CLARIFICATION THAT WILL HELP ME A LOT--------

for(i=0; i<n ; i++) {

 statement; 

}

so everytime for loop is executed n+1 times , statement executes n times ; total 2n+1 times 

but does bari along with universe's entire faculty or comp genius rite 2n+1? NO 
WHY?______lets have a look;
in reality the computer is actually exeecuting 2n+1 times undoubtedly 
the reason everyone uses just the n+1 shorthand is because they are setting us up for the ultimate rule of thumb in algorith mdesign; When the input approaches infinity under that limit test, i dont need to stress over the line by line code, i can use the "industry" standard shortcuts to find the runtime instantly





_________________***********So the question is HOW DO WE COUNT?*************************__________________________________________________________________________________

We must know that instead of counting how many times a line executes

We dont really care how many times a computer executes a code, we only care if it's EFFICIENT or not---> 
Order 

so 

1. The Single Linear Loop →O(n)
If a loop starts at 0 (or n) and steps forward (or backward) by a constant addition/subtraction (like i++ or i--), the dominant force is strictly linear.

for (i = 0; i < n; i++) { ... }
 explanation: Since it follows a constant addition/sub progression this will immediately be O(n)
we dont need to figure out if it's 2n+1 or n+1 or whatever but still we should check if it becomes n+1 or 2n+1 because then we'd be able to decide only that it's O(n) and not o(n^2)





2. The Standard Nested Loop →O(n^2)
When you stack one linear loop inside another linear loop, the inner loop has to run its entire cycle every single time the outer loop takes one step.
for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
        statement;
    }
}

explanation: You are multiplying a linear process by a linear process (n×n). The precise operation count might be something chaotic like 3n^2+5n+2, but when n approaches infinity, the n^2 term completely dwarfs everything else. It instantly simplifies to O(n^2) (Quadratic time).




3. The Logarithmic Loop --->  O(log n)
What if the loop counter doesn't step by $1$, but instead multiplies or divides by $2$ on every single turn?

for (i = 1; i < n; i = i * 2) { ... }

Explanation: Because the index doubles every step ($1, 2, 4, 8, 16...$), it flies through the dataset incredibly fast. It reaches $n$ in a tiny fraction of the time. This introduces a logarithm under the limit test. Any loop that repeatedly cuts the problem size in half or doubles its stride is $O(\log n)$.

WHICH ARE  THE BEST--------------------------------------------------------------------------

1. O(1) Constant time (The Gold Standard)
the execution time stays exactly the same no matter how much data i throw at it

2. O(log n) --> excellent
Algorithm cuts the problem size in half with every single step it takes

3.O(n)---> Linear time (good/fair) 
The execution time grows in direct, perfect proportion to the size of the input data

4.O(n^2)----> (horrible/bad) 
the execution time grows proportionally to the square of the input size. this usually happens when u have a loop running inside another loops (nested loops) 


