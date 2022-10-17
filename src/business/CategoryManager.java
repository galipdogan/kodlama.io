package business;

import core.Logging.Logger;
import dataAccess.category.CategoryDao;
import dataAccess.category.HibernateCategoryDao;
import entities.Category;
import entities.Instructor;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.loggers = loggers;
        this.categoryDao=categoryDao;
    }

    public void add(Category category) throws Exception{

        Category[] categories={new Category("Java"),
                new Category("C#"),
                new Category("JavaScript")};

        for (Category category1:categories)
       {
            if(category.getName()==category1.getName()){
                throw new Exception("Kategori ismi daha once kayitli!");
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {// once database sonra mail yollandin
            logger.log(category.getName());
        }
    }
}
