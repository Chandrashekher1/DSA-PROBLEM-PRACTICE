package com.CP03.Backtracking;

public class PathRestriction {
    public static void Restriction(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze.length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        if (r < maze.length-1){
            Restriction(p+'D',maze,r+1,c);

        }
        if (c < maze[0].length-1){
            Restriction(p+'R',maze,r,c+1);
        }
    }

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        Restriction(" ", board, 0,0);
    }
}
