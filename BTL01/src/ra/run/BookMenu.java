package ra.run;
import ra.entity.Book;

import static ra.entity.Category.scanner;
import static ra.entity.Book.bookList;
public class BookMenu {
    public static void bookMenu() {
        do {
            System.out.println("===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách ");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("6. Quay lại");
            System.out.println("==========================");
            System.out.print("Chọn : \t");
            try {
                int choiceBook = Integer.parseInt(scanner.nextLine());
                System.out.println();
                switch (choiceBook){
                    case 1:
                        saveBook();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        Library.libraryMenu();
                    default:
                        System.err.println("vui lòng nhập lại từ 1 đến 6!");
                }
            } catch (NumberFormatException ex1){
                System.err.println("Lỗi đinh dạng chữ. Vui lòng nhập lại!");
            }
        } while(true);
    }
    // thêm mới sách
    public static void saveBook(){
        System.out.println("Nhập vào số lượng sách :");
        do {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhập vào sách thứ " + (i +1) +" :");
                    Book book  = new Book();
                    book.input();
                    bookList.add(book);
                }
                System.out.println("⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎⚛︎");
                break;
            } catch (NumberFormatException e){
                System.err.println("Lỗi định dạng kiểu số!");
            }
        } while (true);
    }
    // cập nhật thông tin sách
    public static void updateBook(){

    }
}
