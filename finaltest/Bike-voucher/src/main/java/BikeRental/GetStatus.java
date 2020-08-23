package BikeRental;

public class GetStatus extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long voucherCnt;

    public GetStatus(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getVoucherCnt() {
        //voucherCnt 가 0보다 작은 경우 어떤 처리 필요??
        // 현재는 불필요
        //............

        return voucherCnt;
    }

    public void setVoucherCnt(Long voucherCnt) {

        this.voucherCnt = voucherCnt;
    }
}
