import re.exception.MyCheckedException;
import re.exception.MyUncheckedException;

import java.util.Scanner;
import java.util.SortedMap;

public class Demo {
    public static void test1() throws MyCheckedException{
        // logic ném ra ngoại checked
        throw new MyCheckedException(404, "ko tìm thấy tài nguyên"); // bị kiểm ttra trong quá trình biên dich
//        throw new MyUncheckedException();
    }

    // ví dụ : kiểm tra tính hợp lệ của 1 tam giác , nếu hợp lệ thì tính chu vi
    public static double calPerimieter(double a, double b, double c){
        if (a<=0 || b<=0 || c<=0){
            throw new IllegalArgumentException("Các cạnh tam giác ko thể <=0 !!");
        }
        if (a+b<=c ||b+c<=a||c+a<=b){
            throw new MyUncheckedException("Tổng 2 cạnh ko thể <= cạnh còn lại !!!");
        }

        return a+b+c;
    }

    public static void inputInt(){
        Scanner sc = new Scanner(System.in);
       while(true) {
           try {
               System.out.println("Nhập 1 số nguyên");
               int a = Integer.parseInt(sc.nextLine());
               break;
           } catch (NumberFormatException e) {
               System.err.println("Vui lòng nhập 1 so nguyên");
           }
       }
    }

    public static void main(String[] args) {
        inputInt();
        System.out.println("kết thúc hàm main");
    }
}
