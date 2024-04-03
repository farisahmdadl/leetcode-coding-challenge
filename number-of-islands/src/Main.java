public class Main {
    public int numIslands(char[][] grid) {

        int count = 0;

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >=grid[i].length || grid[i][j] == '0') return;

        grid[i][j] = '0';
        callBFS(grid, i+1, j);
        callBFS(grid, i-1, j);
        callBFS(grid, i, j-1);
        callBFS(grid, i, j+1);
    }

    public static void main(String[] args) {
        char[][] arrayIsland = {
                {'0','1','0','0'},
                {'0','1','0','0'},
                {'0','1','1','0'},
                {'0','0','1','0'}
        };

        Main main = new Main();
        int numIslands = main.numIslands(arrayIsland);
        System.out.println("Number of islands: " + numIslands);
    }
}