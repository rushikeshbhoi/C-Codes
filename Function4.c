#include<stdio.h>

int Addition(int No1, int No2)
{
    int Sum = 0;
    Sum = No1 + No2;
    return Sum;
}

int Substraction(int N1, int N2)
{
    int Value = 0;
    Value = N1 - N2;
    return Value;
}

int main()
{
    int Value1 = 10;
    int Value2 = 11;
    int Ans = 0;

    Ans = Addition(Value1,Value2);
    printf("The Addition is : %d\n",Ans);

    Ans = Substraction(Value1,Value2);
    printf("The Substraction is : %d\n",Ans);
    
    return 0;
}