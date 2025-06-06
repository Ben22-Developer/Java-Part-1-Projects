import java.time.LocalDate;
import java.time.Period;

public class TargetHeartRate {

    private String name;
    private int day_of_birth, month_of_birth, year_of_birth;

    private LocalDate current_date = LocalDate.now();

    public String get_date_of_birth () {
        String date_of_birth = this.day_of_birth+"/ "+this.month_of_birth+"/ "+this.year_of_birth;
        return date_of_birth;
    }

    public String get_name () {
        return this.name;
    }

    public double target_heart_rate_range () {
        return this.maximum_heart_beat() * 0.7;
    }

    public int maximum_heart_beat () {
        int HRmax = 220 - this.get_user_age();
        return  HRmax;
    }

    public int get_user_age () {

        LocalDate user_date_format = LocalDate.of(this.year_of_birth,this.month_of_birth,this.day_of_birth);
        int years_of_user = Period.between(user_date_format,this.current_date).getYears();

        return  years_of_user;
    }

    public void set_year_of_birth (int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public void set_month_of_birth (int month_of_birth) {
        if (month_of_birth > 0 && month_of_birth <= 12)
            this.month_of_birth = month_of_birth;
    }

    public void set_day_of_birth (int day_of_birth) {
        if (day_of_birth > 0 && day_of_birth <= 31)
            this.day_of_birth = day_of_birth;
    }

    public void set_date (int day_of_birth,int month_of_birth, int year_of_birth) {

        if ((day_of_birth >= 1 && day_of_birth <= 31) &&
           (month_of_birth >= 1 && month_of_birth <= 12))
        {
            this.set_day_of_birth (day_of_birth);
            this.set_month_of_birth (month_of_birth);
            this.set_year_of_birth (year_of_birth);
        }
    }

    public void set_name (String name) {
        this.name = name;
    }

    public TargetHeartRate (String name,int day_of_birth,int month_of_birth, int year_of_birth) {
        this.set_name (name);
        this.set_date (day_of_birth,month_of_birth,year_of_birth);
    }
}
