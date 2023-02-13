public class Dto {
    private Long id;
    private String name;

    public Dto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Dto() {
    }

    @Override
    public String toString() {
        return "Dto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
