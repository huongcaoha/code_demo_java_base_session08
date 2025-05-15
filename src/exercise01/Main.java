package exercise01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();

        // Tạo đối tượng Dog và Cat
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat1 = new Cat("Whiskers", 2, "Ghi");

        // Thêm vào danh sách
        animalsList.add(dog1);
        animalsList.add(cat1);

        // Hiển thị thông tin và âm thanh của từng đối tượng
        for (Animals animal : animalsList) {
            animal.displayInfo();
            System.out.println("Âm thanh: " + animal.makeSound());
            System.out.println();
        }
    }
}
