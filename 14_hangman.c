#include <stdio.h>
#include <string.h>
int main() {
    char word[] = "apple", guess[20], ch;
    int len = strlen(word), correct=0, wrong=0;
    for(int i=0;i<len;i++) guess[i]='_';
    guess[len]='\0';
    while(wrong < 5 && correct < len) {
        printf("\nWord: %s", guess);
        printf("\nEnter letter: ");
        scanf(" %c",&ch);
        int found=0;
        for(int i=0;i<len;i++) {
            if(word[i]==ch && guess[i]=='_') {
                guess[i]=ch;
                correct++;
                found=1;
            }
        }
        if(!found) wrong++;
    }
    if(correct==len) printf("\nYou win! Word: %s", word);
    else printf("\nYou lose! Word was: %s", word);
    return 0;
}