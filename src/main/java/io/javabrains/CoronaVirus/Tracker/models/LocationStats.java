package io.javabrains.CoronaVirus.Tracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestDate;
    private int PrevDay;
    private String county;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(int latestDate) {
        this.latestDate = latestDate;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", DailyTotalCases=" + latestDate +
                '}';
    }

    public int getPrevDay() {
        return PrevDay;
    }

    public void setPrevDay(int prevDay) {
        PrevDay = prevDay;
    }


    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
