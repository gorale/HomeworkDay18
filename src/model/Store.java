package model;

public class Store {
    private int countOfWorkers;
    private String phone;
    private String name;
    private String[] product;

    public Store() {
    }


    public Store(int countOfWorkers, String phone, String name, String[] product) {
        this.countOfWorkers = countOfWorkers;
        this.phone = phone;
        this.name = name;
        this.product = product;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProduct() {
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }


}
