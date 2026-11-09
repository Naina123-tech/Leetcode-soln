class Solution {
    public String convert(String s, int numRows) {

        // Step 1: Edge cases
        if(numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Step 2: Create rows
        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Step 3: Initialize variables
        int currentRow = 0;
        int direction = 1;

        // Step 4: Traverse string
        for(char ch : s.toCharArray()) {

            rows[currentRow].append(ch);

            // Step 5: Change direction
            if(currentRow == 0) {
                direction = 1;
            }
            else if(currentRow == numRows - 1) {
                direction = -1;
            }

            // Step 6: Move to next row
            currentRow += direction;
        }

        // Step 7: Combine all rows
        StringBuilder result = new StringBuilder();

        for(StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
    }
