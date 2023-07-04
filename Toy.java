public class Toy {
    private int id;
    private String name;
    private int weight;
    private int quan;

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public String getName() {
        return name;
    }

    public Toy(int id, String name, int weight, int quan) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quan = quan;
    }

    @Override
    public String toString() {
        return String.format("Название игрушки: %s; ID игрушки: %d; вес игрушки: %d; количество: %d", name, id, weight, quan);
    }

}