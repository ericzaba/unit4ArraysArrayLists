// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char[][] grid;
  
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    for (int i =0; i<rows; i++){
        
        for (int j = 0; j<cols; j++){
            this.grid[i][j] = ' ';
            
        }
    }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
}
  public CharMatrix(int rows, int cols, char fill)
  {
      for (int i = 0; i<rows; i++){
        for (int j = 0; j<cols; j++){
            this.grid[i][j] = fill;
            
          
        
        }
      
  }
}

  // Returns the number of rows in grid
  public int numRows()
  {
      for (int i = 0; i<this.grid[1][]){
      return i;    
  }
      
  }

  // Returns the number of columns in grid
  public int numCols()
  {
      for (int i = 0; i<this.grid[2]){
      return i;    
  }
   
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
      return grid[row][col];
      
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
      this.grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
   if (this.grid[row][col] == ''){
    return false;
    
    }
   else{
    return false;
    
    }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    
  }
}
