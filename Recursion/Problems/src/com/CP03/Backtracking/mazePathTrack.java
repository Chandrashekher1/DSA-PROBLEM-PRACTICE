package com.CP03.Backtracking;

public class mazePathTrack {
    public static void Path(String p,int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return ;
        }

        if (r > 1){ // for row
            Path(p+'H',r-1,c);
        }
        if (c > 1){ // for column
            Path(p+'V',r,c-1);
        }
        if (r > 1&& c > 1){  // For diagonal
            Path(p+'D',r-1,c-1);
        }
    }

    public static void main(String[] args) {
        Path("",3,3);
    }
}
