package core.Logging;

public class Course {

    private String name;
    private String detail;
    private double unitPrice;

    public Course(){
        super();
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Course(String name, String detail, int unitPrice) {
        super();
        this.name = name;
        this.detail = detail;
        this.unitPrice = unitPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

}
