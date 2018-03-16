import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class NamMoi {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=============== Chúc Mừng Năm Mới ===============");
        String name = inputName();
        while (true) {
            genMenu(name);
        }

    }

    public static void genMenu(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("Chúc ")
                .append(name)
                .append(" ");

        System.out.println("Hãy lựa chọn lời chúc khác hoặc in thiếp:");
        System.out.println("1. Sức khỏe.");
        System.out.println("2. Hạnh phúc.");
        System.out.println("3. Tài lộc.");
        System.out.println("6. In thiếp.");
        System.out.println("7. Thoát.");
        System.out.println("8. Đẹp trai.");

        System.out.println("Mời bạn lựa chọn:");
        int option = sc.nextInt();sc.nextLine();sc.reset();

        switch (option) {
            case 1:
                sb.append("Sức Khỏe Dồi Dào!");
                break;
            case 2:
                sb.append("Luôn Luôn Hạnh Phúc!");
                break;
            case 3:
                sb.append("Tấn Tài Tấn Lộc!");
                break;
            case 6:
                exportText(sb, name);
                break;
            case 7:
                System.exit(1);
                break;
            case 8:
                sb.append("Đẹp Trai Vô Đối!");
                break;
            default:
                System.err.println("Mời bạn lựa chọn chính xác! Năm mới đừng chọn sai!");
                break;
        }
        System.out.println(sb.toString());
        System.out.println("Enter để tiếp tục!");
        sc.nextLine();sc.reset();

    }



    public static String inputName() {
        System.out.println("Hãy nhập tên của bạn:");
        return sc.nextLine();
    }

    public static void exportText(StringBuilder sb,String name) {
        sb.append("\n\tSức Khỏe Dồi Dào!").
                append("\n\tLuôn Luôn Hạnh Phúc!")
                .append("\n\tTấn Tài Tấn Lộc!")
                .append("\n\tĐẹp Trai Vô Đối!");

        Path path = Paths.get(name+".txt");

        BufferedWriter bw;

        try {
            bw = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.CREATE_NEW);
            bw.write(sb.toString());
            bw.close();
            System.out.println("Bạn đã in thiếp thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void DohappyNewYear(){
        System.out.println("Vui long chọn ngôn ngữ: en/vi");
        Scanner sc = new Scanner(System.in);
        String language = sc.nextLine();
       
    }
   public static void ChucMungNamMoi(){
       Scanner sc = new Scanner(System.in);
       System.out.println("vui lòng nhập tên bạn");
       String name = sc.nextLine();
    
}
}

