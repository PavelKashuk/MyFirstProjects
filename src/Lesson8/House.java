package Lesson8;

public class House {
    private Table table;
    private Chair chair;
    private Sofa sofa;
    private Cupboard cupboard;

    public House() {
    }
    public House (Table table, Chair chair, Sofa sofa, Cupboard cupboard) {
        this.table = table;
        this.chair = chair;
        this.sofa = sofa;
        this.cupboard = cupboard;
    }

    public Table getTable() {
        return table;
    }
    public void setTable(Table table) {
        this.table = table;
    }
    public Chair getChair() {
        return chair;
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public Sofa getSofa() {
        return sofa;
    }
    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }
    public Cupboard getCupboard() {
        return cupboard;
    }
    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }
}
class Table {
    private String model;
    private int price;
    private double dimensions;
}

class Chair {
    private String model;
    private int price;
    private double dimensions;
}

class Sofa {
    private String model;
    private int price;
    private double dimensions;
}

class Cupboard {
    private String model;
    private int price;
    private double dimensions;
}