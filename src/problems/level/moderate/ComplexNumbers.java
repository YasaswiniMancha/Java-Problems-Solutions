package problems.level.moderate;


class ComplexNumbers {

    // Write your code here

    int a,b;

    ComplexNumbers(int a,int b){

        this.a=a;

        this.b=b;

    }

        public void plus(ComplexNumbers other){

        this.a+=other.a;

        this.b+=other.b;

    }

    public void multiply(ComplexNumbers other){

        int newReal = (this.a * other.a) - (this.b * other.b);

        int newImaginary = (this.a * other.b) + (this.b * other.a);

        this.a = newReal;

        this.b = newImaginary;

    }

    public void print(){

        System.out.println(this.a+" + i"+this.b);

    }

}



/* Problem statement
A ComplexNumber class contains two data members: one is the real part (R) and the other is imaginary (I) (both integers).

Implement the Complex numbers class that contains the following functions -

1. constructor
You need to create the appropriate constructor.

2. plus -
This function adds two given complex numbers and updates the first complex number.

e.g.

if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1
3. multiply -
This function multiplies two given complex numbers and updates the first complex number.

e.g.

if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2
4. print -
This function prints the given complex number in the following format :

a + ib
Note: There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
4 5
6 7
1
Sample Output 1 :
10 + i12
Sample Input 2 :
4 5
6 7
2
Sample Output 2 :
-11 + i58
Java (SE 1.8)
27282624252321222019181716151413121110978564321
import java.util.* ;

import java.io.*; 

import java.util.Scanner;

class ComplexNumbers {

    // Write your code here

*/

