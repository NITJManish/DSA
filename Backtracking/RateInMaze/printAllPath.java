package Backtracking.RateInMaze;

public class printAllPath {
    public static void printAllPath(int[][] maze) {
        int n=maze.length;
        int path[][]=new int[n][n];
        solveMaze(maze,0,0,path);
      }
      public static void solveMaze(int[][] maze, int i, int j, int[][] path) {
         //check if i,j cell is valid or not
         int n=maze.length;
         if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
          return;
         }
         //include the cell in current path
         path[i][j]=1;
         //Destination cell
         if(i==n-1 && j==n-1)
         {
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(path[r][c]);
                }
                System.out.println();
            }
            System.out.println();
            path[i][j]=0;
          return;
         }
         //explore further in all direction
         //top
         solveMaze(maze, i-1, j, path);
         //right
         solveMaze(maze, i, j+1, path);
         //Down
         solveMaze(maze, i+1, j, path);
         //left
         solveMaze(maze, i, j-1, path);
         path[i][j]=0;
      }
      public static void main(String[] args){
          int maze[][]={{1,1,0},{0,1,0},{1,1,1}};
          printAllPath(maze);
        //   System.out.println(pathPossible);
      }
}
