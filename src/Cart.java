public class Cart {
    Boolean flag;
    String name;

    public Cart(Boolean flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Cart{" +
                "flag=" + flag +
                ", name='" + name + '\'' +
                '}';
    }
}
