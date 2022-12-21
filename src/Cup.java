public class Cup {
    private String liquideType;
    private double percentage;

    public Cup(String liquideType, double percentage) {
        this.liquideType = liquideType;
        this.percentage = percentage;
    }

    public String getLiquideType() {
        return liquideType;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setLiquideType(String liquideType) {
        this.liquideType = liquideType;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
