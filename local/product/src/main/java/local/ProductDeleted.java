package local;

public class ProductDeleted extends AbstractEvent {

    private Long id;

    public ProductDeleted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
