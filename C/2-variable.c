#include <stdio.h>

int main()
{
    // int, float, char
    // there is no String, Boolean type

    int num = 10;
    short num1 = 10;
    long num2 = 10;

    int age = 20;
    age = 25; // changing value

    float pi = 3.14;          // 6 decimal places
    double pi1 = 1.99;        // 15 decimal places
    long double pi2 = 1.0000; // 19 decimal places

    int _age = 30;

    char star = '*';
    // char hr= "anand" ;

    printf("%d\n", num);
    printf("%f\n", pi);
    printf("%c\n", star);
    printf("\n");

    unsigned int integer = 2; // positive integer (we can take big value)

    unsigned short a = 10;
    unsigned long b = 100;

    printf("\nThe size taken by int is %d", sizeof(int));
    printf("\nThe size taken by int is %d", sizeof(unsigned int));
    printf("\nThe size taken by int is %d", sizeof(float));
    printf("\nThe size taken by int is %d", sizeof(double));
    printf("\nThe size taken by int is %d", sizeof(long double));

    int anandPrakash;  // This is variable declaration
    anandPrakash = 76; // This is variable initialization
    char five = '5';   // This is variable declaration and initialization

    const int i = 9;
    // i = 10;// can not change
    anandPrakash = 98;
}