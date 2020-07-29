package demo;

public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long odererId;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOdererId() {
        return odererId;
    }

    public void setOdererId(Long odererId) {
        this.odererId = odererId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}