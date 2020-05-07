public class Cat implements Pet {
    private String name;
    private String type;

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFluffinessLevel() {
        return null;
    }

    public String getTimesPetted() {
        return null;
    }
}
