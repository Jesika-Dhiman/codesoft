#include <stdio.h>
int main() {
    int a[3] = {1,3,5}, b[3] = {2,4,6}, c[6], i=0, j=0, k=0;
    while(i<3 && j<3) {
        if(a[i] < b[j]) c[k++] = a[i++];
        else c[k++] = b[j++];
    }
    while(i<3) c[k++] = a[i++];
    while(j<3) c[k++] = b[j++];
    printf("Merged array: ");
    for(i=0;i<6;i++) printf("%d ", c[i]);
    return 0;
}