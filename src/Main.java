import re.exception.MyUncheckedException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.SimpleFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //
//        ép kiểu từ string v date
        // dd/MM/yyyy
        String dateStr = "10/10/2000";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = sdf.parse(dateStr); // phương thức này có thể ném ra ngoại lệ Checked

//        System.out.println(4/0); // Unchecked Exception
//        Demo.test1();

        try{
            // khối code có thể sinh ngoại lệ
            System.out.println(Demo.calPerimieter(2,2,3));
        }catch (Exception e) {
            // logic xử lí nếu lỗi
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            // dù lỗi hya ko lỗi thì để thực hiện logic này
            System.out.println("Vao finnally");
        }

        // xử lý ngoại lệ : try, catch, finally
        System.out.println("Kết thúc chương trinh ");
        System.out.println();
        LocalDate localDate = null;
        if(localDate != null){
            localDate.toString();
        }

        /*
               Ứng dụng:
                + Nhập dữ liệu
                + Xử lý kết nối : IOException, SQLException
         */
    }
}