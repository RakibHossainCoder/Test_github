#include<stdio.h>
int main()
{
    int ara[5],i,pos;
    printf("Enter the 5 elements :\n");
    for (i = 0; i<5; i++)
    {
        scanf("%d", &ara[i]);
    }
    printf("Enter the position where you wish to delete the element : \n");
    scanf("%d", &pos);

    if (pos>5)
    {
        printf("Can not be delete! \n");

    }
    else
    {
        for(i = pos-1;i<5-1;i++)
        {
            ara[i]=ara[i+1];

        }
        printf("resultant array is  : \n");

        {
            for(i=0; i<5-1; i++)
            {
                printf("%d\n", ara[i]);

            }
        }
    }

    return 0;
}
