class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int down = matrix.length - 1;
        int right = matrix[0].length - 1;
        int up = 0;
        int dir = 0;
        while(left <= right && up <= down){
            if(dir == 0){
                for(int col = left; col <= right; col++){
                    list.add(matrix[up][col]);
                }
                up++;
            }
            else if(dir == 1){
                for(int row = up; row <= down; row++){
                    list.add(matrix[row][right]);
                }
                right--;
            }
            else if(dir == 2){
                for(int col = right; col >= left; col--){
                    list.add(matrix[down][col]);
                }
                down--;
            }
            else{
                for(int row = down; row >= up; row--){
                    list.add(matrix[row][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
      return list;  
    }
}