#include<stdio.h>

int main()
{
    char ch = 'A';
    int i = 21;
    float f = 12.31f;
    double d = 89.90;

    printf("Size of character is : %d\n",sizeof(ch));
    printf("Size of character is : %d\n",sizeof(i));
    printf("Size of character is : %d\n",sizeof(f));
    printf("Size of character is : %d\n",sizeof(d));

    printf("Base address of character is : %d\n",&ch);
    printf("Base address of integer is : %d\n",&i);
    printf("Base address of float is : %d\n",&f);
    printf("Base address of double is : %d\n",&d);
    
    return 0;
}