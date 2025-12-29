package Med;

import java.util.ArrayList;
import java.util.List;

public class P6 {
    public String convert(String s, int numRows) {

        if(numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < numRows; i ++){
            rows.add(new StringBuilder());
        }

        int currentRow = 0; //Hàng hiện tại
        boolean goingDown = false; //Status đang đi xuống?

        for(char c : s.toCharArray()){
            if(currentRow == 0 || currentRow == numRows - 1){
                goingDown = !goingDown;
            }

            rows.get(currentRow).append(c);
            if(goingDown){
                currentRow ++;
            }else{
                currentRow --;
            }
        }

        StringBuilder rs = new StringBuilder();
        for(StringBuilder row : rows){
            rs.append(row);    
        }
        
        return rs.toString();
    }   

    public static void main(String[] args) {
        P6 p = new P6();
        System.out.println(p.convert("PAYPALISHIRING", 3));
        System.out.println(p.convert("PAYPALISHIRING", 4));

        return;
    }
}
