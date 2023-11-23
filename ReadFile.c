#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    int fd = 0;
    char Arr[20];
    int Ret = 0;

    fd = open("Rushi.txt",O_RDWR);

    Ret = read(fd,Arr,10); // (Kashat wachaycha, Kay wachaycha, Kiti wachaycha)

    printf("%d bytes gets written in the files\n",Ret);
    printf("Data is : %s\n",Arr);

    close(fd);

    return 0;
}
