#include<iostream>
using namespace std;

class Demo
{
    public:
        int i,j;
        Demo(int a = 10, int b = 20)
        {
            i = a;
            j = b;
        }
};

int main()
{
    Demo obj1(11,21);
    Demo obj2(5,6);
    Demo obj(0,0);

    obj = obj1 + obj2;  // It will generate error because obj1,obj2 are invalid operands to the compiler

    return 0;
}