public class Toy {
   private int id;
    private String name;
    private int frequency;

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }

    public Toy(int id, String name, int frequency) {
        if (id < 0) {
            throw new RuntimeException("Wrong id!");
        } else {
            this.id = id;
        }
        if (name.isEmpty()) {
            throw new RuntimeException("Wrong name!");
        } else {
            this.name = name;
        }
        if (frequency < 0 || frequency > 10) {
            throw new RuntimeException("Wrong frequency!");
        } else {
            this.frequency = frequency;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Wrong name!");
        } else {
            this.name = name;
        }
    }

    public void setFrequency(int frequency) {
        if (frequency < 0 || frequency > 10) {
            throw new RuntimeException("Wrong frequency!");
        } else {
            this.frequency = frequency;
        }
    }


}
