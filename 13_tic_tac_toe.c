#include <stdio.h>
char board[3][3] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
void displayBoard() {
    printf("\n");
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) printf(" %c ", board[i][j]);
        printf("\n");
    }
}
int main() {
    int choice, row, col, turn=0;
    char mark;
    for(int moves=0; moves<9; moves++) {
        displayBoard();
        mark = (turn%2==0)?'X':'O';
        printf("Player %d, enter position: ", (turn%2)+1);
        scanf("%d",&choice);
        row = (choice-1)/3;
        col = (choice-1)%3;
        if(board[row][col]!='X' && board[row][col]!='O') {
            board[row][col]=mark;
            turn++;
        } else printf("Invalid move!\n");
    }
    displayBoard();
    printf("Game Over!");
    return 0;
}