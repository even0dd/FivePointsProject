package models;

public enum ModelAsus {
    ASUS("ASUS",70000,25.4);

    ModelAsus(String name, int price, double diagonal) {
        System.out.println("Price: "+price+" soms");
        System.out.println("Diagonal: "+diagonal+" inches");
    }


}
