public class Find_element_inMatrix {
        public static void main(String[] args) {
            // find a element in a matrix
            int[][] matrix = {
                    { 2, 3, 9 },
                    { 6, 5, 7 },
                    { 1, 0, 4 }
            };
    
            int target = 5;
            int rowIndex = -1;
            int columnIndex = -1;
    
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        rowIndex = i;
                        columnIndex = j;
                        break;
                    }
                }
                if (rowIndex != -1) {
                    break;
                }
            }
    
            if (rowIndex != -1 && columnIndex != -1) {
                System.out.println("Value " + target + " found at index (" + rowIndex + ", " + columnIndex + ")");
            } else {
                System.out.println("Value " + target + " not found in the matrix.");
            }
        }
    }
    

