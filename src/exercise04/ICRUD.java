package exercise04;

import java.util.List;

interface ICRUD {
    List<Category> findAll();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteById(int id);
}
