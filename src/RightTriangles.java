/* Bir 2D tablo içindeki 1'leri kullanarak sağ açı üçgenleri saydık.
İlk olarak, her satır ve sütundaki 1lerin sayısını hesaplar. Daha sonra
her 1 için bu 1'in köşe olduğu sağ açı üçgenlerinin sayısını bulur ve toplar
*/
public class RightTriangles {
    class Solution {
        public long numberOfRightTriangles(int[][] grid) {
            int numRows = grid.length;
            int numCols = grid[0].length;
            int[] rowCounts = new int[numRows];
            int[] colCounts = new int[numCols];

            // Satır ve sütunlardaki '1'lerin sayısını hesapla
            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (grid[row][col] == 1) {
                        rowCounts[row]++;
                        colCounts[col]++;
                    }
                }
            }

            long rightTriangles = 0;

            // Sağ açı üçgenlerini say
            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (grid[row][col] == 1) {
                        rightTriangles += (long) (rowCounts[row] - 1) * (colCounts[col] - 1);
                    }
                }
            }

            return rightTriangles;
        }
    }

}
