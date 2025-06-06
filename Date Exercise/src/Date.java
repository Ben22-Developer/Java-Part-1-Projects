public class Date {

    private int day,month,year;

    public String displayDate () {

        String date = this.day + "/" + this.month + "/" + this.year;
        return date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public void setDay (int day) {
        this.day = day;
    }

    public void setDate (int day,int month,int year) {
        if ((day >= 0 && day <= 31) &&
            (month >= 1 && month <= 12))
        {
            this.setDay(day);
            this.setMonth(month);
            this.setYear(year);
        }
    }

    public Date (int day, int month, int year) {
        this.setDate(day,month,year);
    }
}
