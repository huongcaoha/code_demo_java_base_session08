package exercise04;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CategoryManagement categoryManagement = new CategoryManagement();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1: Thêm danh mục");
            System.out.println("2: Hiển thị danh mục");
            System.out.println("3: Cập nhật danh mục");
            System.out.println("4: Xóa danh mục");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống

            switch (choice) {
                case 1:
                    // Thêm danh mục
                    System.out.print("Nhập ID danh mục: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống
                    System.out.print("Nhập tên danh mục: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập mô tả danh mục: ");
                    String description = scanner.nextLine();
                    categoryManagement.addCategory(new Category(id, name, description));
                    System.out.println("Danh mục đã được thêm.");
                    break;

                case 2:
                    // Hiển thị danh mục

                    List<Category> categories = categoryManagement.findAll();
                    if (categories.isEmpty()) {
                        System.out.println("Danh sách danh mục trống !");
                        break;
                    }
                    System.out.println("Danh sách danh mục:");
                    for (Category category : categories) {
                        System.out.println(category);
                    }
                    break;

                case 3:
                    // Cập nhật danh mục
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập mô tả mới: ");
                    String newDescription = scanner.nextLine();
                    categoryManagement.updateCategory(new Category(updateId, newName, newDescription));
                    System.out.println("Danh mục đã được cập nhật.");
                    break;

                case 4:
                    // Xóa danh mục
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    int deleteId = scanner.nextInt();
                    categoryManagement.deleteById(deleteId);

                    break;

                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
