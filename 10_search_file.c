#include <stdio.h>
#include <string.h>
int main() {
    FILE *f = fopen("input.txt", "r");
    char word[20], str[100];
    int found = 0;
    if(f == NULL) {
        printf("File not found!");
        return 0;
    }
    printf("Enter word to search: ");
    scanf("%s", word);
    while(fgets(str, 100, f)) {
        if(strstr(str, word)) {
            found = 1;
            break;
        }
    }
    fclose(f);
    if(found) printf("Word found!");
    else printf("Word not found!");
    return 0;
}