public class board {
    // 0 = O's
    //1 = X's
    //2 = empty
    private Integer[][] game;

    public void fill(){
        for(int i=0; i<3;i++) {
            for(int j=0;i<3;j++){
                game[i][j] = 2;
            }
        }
    }

    public void set(int row, int col, int val){
        game[row][col] = val;
    }

    public int get(int row, int col){
        return game[row][col];
    }


}
