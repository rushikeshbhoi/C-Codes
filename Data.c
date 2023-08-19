#include<stdio.h>
int Data = 21; // Global Variable

int main()
{
    char cValue = 'A';  // Local Variable

    int iValue = 11;    // Local Variable

    float fValue = 90.78f;    // Local Variable

    double dValue = 78.1234;    // Local Variable

    printf("%c\n",cValue);
    printf("%d\n",iValue);
    printf("%f\n",fValue);
    printf("%f\n",dValue);
    printf("%d\n",Data);

    return 0;
}
