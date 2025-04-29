public class Restaurant {
    private int id;
    private String name;
    private String dishes;
    
    // Constructor, getters and setters

    // Restaurant.java
public class Restaurant {
    private int id;
    private String name;
    private String dishes;

    // 空构造函数（用于数据库查询等场景）
    public Restaurant() {
    }

    // 带参数的构造函数
    public Restaurant(int id, String name, String dishes) {
        this.id = id;
        this.name = name;
        this.dishes = dishes;
    }

    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    // 可选：toString 方法（便于调试）
    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dishes='" + dishes + '\'' +
                '}';
    }
}
}
