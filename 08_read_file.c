#include <stdio.h>
int main() {
    FILE *f = fopen("input.txt", "r");
    char ch;
    if(f == NULL) {
        printf("File not found!");
        return 0;
    }
    while((ch = fgetc(f)) != EOF) {
        putchar(ch);
    }
    fclose(f);
    return 0;
}