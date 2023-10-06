#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j,k;
        void Fun()
        {
            cout<<"Inside Base fun\n";
        }
};

class Derived : public Base
{
    public:
        int a,b;
        void Gun()
        {
            cout<<"Inside Derived gun\n";
        }
};

int main()
{
    Base *bp1 = new Base;    // No casting
    Base *dp2 = new Derived; // No casting
    Base *bp2 = new Derived; // Up casting
    // Derived *dp2 = new Base; // Down casting

    return 0;
}
