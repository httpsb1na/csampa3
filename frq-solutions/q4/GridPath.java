import java.util.*;

public class gridPath {
  private int[][] grid;

  public gridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    Location c = new Location(row + 1, col);
    Location d = new Location(row, col + 1);

    if (row == grid.length - 1) {
      return d;
    }

      if (col == grid[0].length - 1) {
        return c;
      }

      if (grid[row + 1][col] < grid[row][col + 1]) {
        return d;
      } else {
        return c;
      }
    }

  // PART B
  public int sumPath(int row, int col) {
    int a = grid[row][col];
    Location b = getNextLoc(row, col);

    while (b != null) {
      a += grid[b.getRow()][b.getCol()];

      if (b.getRow() < grid.length - 1 || b.getCol() < grid[0].length - 1) {
        b = getNextLoc(b.getRow(), b.getCol());
      } else {
        b = null;
      }
    }

    return a;
  }

  // added to see the array on screen
  public String toString() {
    return Arrays.deepToString(grid);
  }

}
