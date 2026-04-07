class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; // Biến nhớ

        // Chạy vòng lặp chừng nào 1 trong 2 chuỗi vẫn còn ký tự, HOẶC biến nhớ vẫn còn
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Bắt đầu tổng bằng biến nhớ từ bước trước
            
            if (i >= 0) {
                // a.charAt(i) - '0' là mẹo chuyển ký tự '0'/'1' thành số nguyên 0/1 theo mã ASCII
                sum += a.charAt(i) - '0'; 
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            sb.append(sum % 2); // Thêm bit tính toán được vào đuôi chuỗi
            carry = sum / 2;    // Tính biến nhớ cho bước lặp sau
        }

        // Vì ta đang cộng từ phải sang trái (thêm vào đuôi), nên kết quả cuối cùng phải đảo ngược lại
        return sb.reverse().toString();
    }
}