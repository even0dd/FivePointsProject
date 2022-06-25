package models;

public enum ModelDell {
    DELL(30000);
    ModelDell(int price) {
        System.out.println("Price: "+price+" soms");
        System.out.println("Price with discount: "+((price)-((price)*20)/100)+" soms");

    }

}
