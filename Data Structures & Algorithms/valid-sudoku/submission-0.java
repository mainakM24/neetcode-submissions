class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[][] sq = new HashSet[3][3];
        for (int i = 0; i < board.length; ++i) sq[i / 3][i % 3] = new HashSet<>();

        for (int i = 0; i < board.length; ++i) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] != '.' && !row.add(board[i][j])) return false;
                if (board[j][i] != '.' && !col.add(board[j][i])) return false;
                if (board[i][j] != '.' && !sq[j / 3][i / 3].add(board[i][j])) return false;
            }
        }
        return true;
    }
}
