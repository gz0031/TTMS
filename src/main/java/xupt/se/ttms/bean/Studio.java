package xupt.se.ttms.bean;

public class Studio {
    private Integer studioId;

    private String studioName;

    private Integer rowcount;

    private Integer colcount;

    private String studioIntroduction;

    public Integer getStudioId() {
        return studioId;
    }

    public void setStudioId(Integer studioId) {
        this.studioId = studioId;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName == null ? null : studioName.trim();
    }

    public Integer getRowcount() {
        return rowcount;
    }

    public void setRowcount(Integer rowcount) {
        this.rowcount = rowcount;
    }

    public Integer getColcount() {
        return colcount;
    }

    public void setColcount(Integer colcount) {
        this.colcount = colcount;
    }

    public String getStudioIntroduction() {
        return studioIntroduction;
    }

    public void setStudioIntroduction(String studioIntroduction) {
        this.studioIntroduction = studioIntroduction == null ? null : studioIntroduction.trim();
    }
}