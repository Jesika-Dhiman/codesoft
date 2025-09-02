#include <stdio.h>
int main() {
    int score=0, ans;
    printf("Q1. Capital of India?\n1.Delhi 2.Mumbai 3.Kolkata\n");
    scanf("%d",&ans);
    if(ans==1) score++;
    printf("Q2. 2+2=?\n1.3 2.4 3.5\n");
    scanf("%d",&ans);
    if(ans==2) score++;
    printf("Q3. Largest planet?\n1.Earth 2.Mars 3.Jupiter\n");
    scanf("%d",&ans);
    if(ans==3) score++;
    printf("Your Score: %d/3", score);
    return 0;
}