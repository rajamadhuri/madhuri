#include<stdio.h>
#include<conio.h>
void main()
{
int ar[100],n,i,sum=0;
float avg;
printf("enter the size of the array:");
scanf("%d",&n);
printf("enter the array elements:");
for(i=0;i<n;i++)
{
scanf("%d",&ar[i]);
sum=sum+ar[i];
}
avg=(float)sum/n;
printf("average=%f",avg);
getch();
}
