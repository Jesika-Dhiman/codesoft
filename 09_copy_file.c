#include <stdio.h>
int main() {
    FILE *src = fopen("input.txt", "r");
    FILE *dest = fopen("output.txt", "w");
    char ch;
    if(src == NULL) {
        printf("Source file not found!");
        return 0;
    }
    while((ch = fgetc(src)) != EOF) {
        fputc(ch, dest);
    }
    fclose(src);
    fclose(dest);
    printf("File copied successfully.");
    return 0;
}