#include<iostream>
using namespace std;

class Demo
{
    public:
        int x,y;

        Demo()
        {
            cout<<"Inside Demo constructor\n";
            x = 10;
            y = 20;
        }
        ~Demo()
        {
            cout<<"Inside Demo destructor\n";
        }
        void fun()
        {
            cout<<"Inside fun of Demo\n";
        }
};

class Hello
{
    public:
        int a,b;
        Hello()
        {
            cout<<"Inside Hello constructor\n";
            a = 30;
            b = 40;
        }
        ~Hello()
        {
            cout<<"Inside Hello destructor\n";
        }
        void gun()
        {
            cout<<"Inside gun of Hello\n";
        }
};

//class Bye : public Demo, public Hello
class Bye : public Hello, public Demo

{
    public:
        int p;

        Bye()
        {
            cout<<"Inside constructor of Bye\n";
            p = 60;
        }
        ~Bye()
        {
            cout<<"Inside destructor of bye\n";
        }
        void sun()
        {
            cout<<"Inside sun of Bye\n";
        }
};
int main()
{
    Bye bobj;

    cout<<sizeof(bobj)<<" bytes \n";   // 20

    bobj.fun();
    bobj.gun();
    bobj.sun();

    return 0;
}