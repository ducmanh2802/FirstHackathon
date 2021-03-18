import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Số nguyên tố là số chỉ chia hết cho chính nó và 1. Các đơn giản (chậm) nhất
         * để kiểm tra một số N có phải là số nguyên tố hay không là tạo một vòng lặp từ
         * có biến i chạy từ 2 đến N-1. Lấy N chia cho i. Nếu chia hết thì thoát vòng
         * lặp kết luận đây không phải số nguyên tố.
         ** 
         * Yêu cầu: **
         * 
         * Hãy tạo một vòng lặp để nhập các số từ bàn phím. Nếu nhập ký tự 'X' hay 'Q'
         * thì thoát khỏi ứng dụng. Nếu nhập các chuỗi ký tự không phải là số thì in ra
         * màn hình 'XYZ' không phải là số Nếu nhập số nguyên tố thì in ra màn hình 17
         * là số nguyên tố Ngược lại in ra màn hình 18 không phải là số nguyên tố
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị đầu vào:");
        File songuyento = new File("songuyento.txt");
        FileWriter fileWriter = new FileWriter(songuyento.getAbsoluteFile(), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals("X") || input.equals("Q") || input.equals("x") || input.equals("q")) {
                System.exit(0);
            } else {
                if (!songuyento.exists()) {
                    songuyento.createNewFile();
                }

                try {
                    int n = Integer.parseInt(input);
                    boolean isPrime = true;

                    if (n <= 1) {
                        System.out.println(n + " không là số nguyên tố");
                        bufferedWriter.write(n + " không là số nguyên tố");
                        bufferedWriter.newLine();
                        bufferedWriter.flush();

                    } else {
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                isPrime = false;
                            }
                        }
                        if (isPrime == true) {
                            System.out.println(n + " là số nguyên tố");
                            bufferedWriter.write(n + " là số nguyên tố");
                            bufferedWriter.newLine();
                            bufferedWriter.flush();
                        } else {
                            System.out.println(n + " không là số nguyên tố");
                            bufferedWriter.write(n + " không là số nguyên tố");
                            bufferedWriter.newLine();
                            bufferedWriter.flush();
                        }
                    }
                } catch (NumberFormatException numberFormatException) {
                    System.out.println(input + " không phải là số");
                    bufferedWriter.write(input + " không phải là số ");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
            }
            System.out.println("Nhập giá trị đầu vào:");
        }
        fileWriter.close();
        sc.close();
    }
}
