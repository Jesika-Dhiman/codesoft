#include <stdio.h>
#include <string.h>
int main() {
    char str[100], word[20], replace[20];
    printf("Enter string: ");
    gets(str);
    printf("Word to replace: ");
    gets(word);
    printf("Replace with: ");
    gets(replace);
    char *pos = strstr(str, word);
    if(pos) {
        int idx = pos - str;
        char result[200];
        strncpy(result, str, idx);
        result[idx] = '\0';
        strcat(result, replace);
        strcat(result, pos + strlen(word));
        printf("Updated string: %s", result);
    } else {
        printf("Word not found!");
    }
    return 0;
}