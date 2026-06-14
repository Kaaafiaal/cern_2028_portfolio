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
                                


Sum of two matrices-------------------------------------
Alogirthm add(A,B,n)
{
   for(i=0;i<n;i++) 
      {
         for()

