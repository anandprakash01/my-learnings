package J01_Basic;

import java.util.Scanner;

public class B1_TypeConversion {
    public static void main(String args[]){
        //compiler automatically change to compatible(the largest size) type
        //byte--> short--> char--> int--> float--> long--> double
        // -----> this conversion is called type conversion or widening/implicit conversion
        byte a=10;
        short b=20;
        char c='h';
        System.out.println("ASCII value of char h is: " +(c-0));
        //but if we want real value of any digit like 1,2,3,4,5,6,7,8,9,0 we have to minus it by char '0' not only 0
        System.out.println("ASCII Value of char 9 is : " + ('9'-0) );
        System.out.println("Real value of char 9 is : "+ ('9'-'0') );
        float d=10.98f;
        System.out.println("a+b+c: "+(a+b+c));//int
        System.out.println("a+b+c+d: "+(a+b+c+d));//float
        int k=20;
        float m=k;
        long l=k;
        //float t=74.0f;
        float t=l;
        Scanner sc= new Scanner(System.in);
        //int value=sc.nextFloat();//incompatible types: possible lossy conversion from float to int

        System.out.println("Enter a integer: ");
        float value=sc.nextInt();
        System.out.println("You Entered : "+value);
//         long r=t;        // error
//         long h=m;       // error
//         int n=l;         // error

        /*
        int sum=a+b+c+d;
        this will give you error because
         -----> possible lossy conversion from float to int.
        */
        int sum3=(int)(a+b+c+d);
        System.out.println(sum3);
        int n=(int)(10.98f);
        System.out.println(n);
        /*
        when you forcefully convert-
        -----> this is called type Casting or narrowing/explicit conversion
        */

        //type promotion in expression

        /*  (1)---> java automatically promotes byte,short,char to int
         */
        char x='a';
        char y='b';
        System.out.println((int)x);
        System.out.println((int)y);
        System.out.println(y-x);
        byte bt=10;
        short sh=20;
        // short sum4=x+bt+sh;              //error
        short sum4=(short)(x+bt+sh);
        int sum5=x+bt+sh;
        System.out.println(sum5);
        //  (2)---> if operend is long,float or double the whole expression is promoted to long,float or double respectively
        int in=10;
        float f=20.99f;
        long lo=20;
        double db=30;
        double sum6= in+f+lo+db+x;
        System.out.println(sum6);
    }
}