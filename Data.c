#include<stdio.h>
int Data = 21; // Global Variable

int main()
{
    char cValue = 'A';  // Local

    int iValue = 11;    // L

    float fValue = 90.78f;

    double dValue = 78.1234;

    printf("%c\n",cValue);
    printf("%d\n",iValue);
    printf("%f\n",fValue);
    printf("%f\n",dValue);
    printf("%d\n",Data);

    return 0;
}