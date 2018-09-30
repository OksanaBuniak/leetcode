public class NumberOfIslands200 {

    public static int numIslands(char[][] grid) {
        int number = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    number++;
                    paint(i, j, grid);
                }
            }
        }
        return number;
    }

    public static void paint(int x, int y, char[][] grid) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        paint(x, y - 1, grid);
        paint(x - 1, y, grid);
        paint(x, y + 1, grid);
        paint(x + 1, y, grid);
    }

    public static void main(String[] args) {
        char[][] input = {{'1', '1', '0', '0' , '0'}, {'1', '1', '0', '0', '0'}, {'0', '0' , '1', '0' ,'0'}, {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(input));
    }
}
