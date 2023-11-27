#include<iostream>

namespace Rushi
{
    void Display()
    {
        std::cout<<"Inside Display of Rushi\n";
    }
}

namespace Rushikesh
{
    void Display()
    {
        std::cout<<"Inside Display of Rushikesh\n";
    }
}

int main()
{
    Rushi::Display();
    Rushikesh::Display();

    return 0;
}