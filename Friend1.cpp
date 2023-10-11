#include<iostream>
using namespace std;

class Demo
{
    public:
        int i;
    private:
        int j;
    protected:
        int k;
    public:
        Demo()
        {
            i = 10;
            j = 20;
            k = 30;
        }
};

void Display()
{
    Demo obj;
    cout<<"Value of i : "<<obj.i<<"\n";
    // cout<<"Value of j : "<<obj.j<<"\n";     //  It will generate error 
    // cout<<"Value of k : "<<obj.k<<"\n";     //  It will generate error
}
int main()
{
    Display();

    return 0;
}