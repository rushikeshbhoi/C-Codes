#include<stdio.h>

int main()
{   
    int Count = 0;
    int i = 0;

    printf("Enter number of times you want to display JAY GANESH on screen\n");
    scanf("%d",&Count);

    for(i = 1; i <= Count; i++)
    {
        printf("Jay Ganesh...\n");
    }

    return 0;
}