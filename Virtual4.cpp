#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j,k;
        virtual void Fun()  // 1000
        {
            cout<<"Inside Base fun\n";
        }
        virtual void Gun()  // 2000
        {
            cout<<"Inside Base gun\n";
        }
        void Sun()  // 3000
        {
            cout<<"Inside Base sun\n";
        }
        void Run()  // 4000
        {
            cout<<"Inside Base run\n";
        }
};

class Derived : public Base
{
    public:
        int a,b;
        virtual void Gun()  // 5000
        {
            cout<<"Inside Derived gun\n";
        }
        void Run()  // 6000
        {
            cout<<"Inside Base run\n";
        }
        virtual void Mun()  // 7000
        {
            cout<<"Inside Base mun\n";
        }
};

int main()
{
    cout<<sizeof(Base)<<"\n";       // 12
    cout<<sizeof(Derived)<<"\n";    // 20


    Base *bp = new Derived;
    bp->Fun();  // Base Fun
    bp->Gun();  // Derived Gun
    bp->Sun();  // Base Sun
    bp->Run();  // Base Run
    // bp->Mun();  // Error
    
    return 0;
}
