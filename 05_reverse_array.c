#include <stdio.h>
int main() {
    int arr[5] = {1, 2, 3, 4, 5}, i, j, temp;
    j = 4;
    for(i = 0; i < j; i++, j--) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    printf("Reversed array: ");
    for(i = 0; i < 5; i++) printf("%d ", arr[i]);
    return 0;
}