#include<stdio.h>

int main()

{

int array[100], n, p, value, i, j;
scanf("%d",&n);

for ( i = 0; i<n; i++)
    scanf("%d",&array[i]);

    for(i = 0; i<n; i++)
        printf("%d",array[i]);

printf("Enter the position and value :");
scanf("%d %d",&p,&value);

for (i=n-1; i>=p-1;i--)

array[p-1]=value;

    for(i=0; i<=n; i++)
    printf("%d", array[i]);


return 0;




}
