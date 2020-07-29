package local;

public class NotificationSent extends AbstractEvent {

    private Long id;

    public NotificationSent(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
