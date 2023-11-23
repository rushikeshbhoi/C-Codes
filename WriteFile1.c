#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    int fd = 0;
    char Arr[] = " From Muktainagar";
    int Ret = 0;

    fd = open("Rushi.txt",O_RDWR | O_APPEND);

    Ret = write(fd,Arr,strlen(Arr)); // (Kashat Lihayach, Kay Lihaycha, Kiti Lihaycha)

    printf("%d bytes gets written in the files\n",Ret);

    close(fd);

    return 0;
}
