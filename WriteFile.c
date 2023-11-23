#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    int fd = 0;
    char Arr[] = "Rushikesh Bhoi";
    int Ret = 0;

    fd = open("Rushi.txt",O_RDWR);

    Ret = write(fd,Arr,strlen(Arr)); // (Kashat Lihayach, Kay Lihaycha, Kiti Lihaycha)

    printf("%d bytes gets written in the files\n",Ret);

    close(fd);

    return 0;
}
// O_RDONLY : Read
// O_WRONLY : Write
// O_RDWR : Read + Write