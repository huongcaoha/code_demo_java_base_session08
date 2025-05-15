package exercise04;

import java.util.ArrayList;
import java.util.List;

class CategoryManagement implements ICRUD {
    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void addCategory(Category category) {
        categories.add(category);
    }

    @Override
    public void updateCategory(Category category) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == category.getId()) {
                categories.set(i, category);
                return;
            }
        }
    }

    @Override
    public void deleteById(int id) {
       boolean rs = categories.removeIf(category -> category.getId() == id);
       if(rs){
           System.out.println("Xóa thành công danh mục ");
       }else {
           System.out.println("Danh mục không tồn tại !");
       }
    }
}
