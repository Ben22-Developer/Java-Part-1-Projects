import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String user_name;
    private char user_gender;
    private int user_birth_year,user_birth_month,user_birth_day;
    private double user_height,user_weight;

    public double getTarget_heart_rate () {
        return this.getMaximum_heart_rate() * 0.7;
    }

    public int getMaximum_heart_rate () {
        return 220 - this.getUser_age();
    }

    public double getUser_body_mass () {
        return this.user_weight/(Math.pow(this.user_height,2));
    }

    public double getUser_weight () {
        return this.user_weight;
    }

    public double getUser_height () {
        return this.user_height;
    }

    public int getUser_age () {

        LocalDate curent_date = LocalDate.now();
        LocalDate user_birth_date = LocalDate.of(this.user_birth_year,this.user_birth_month,this.user_birth_day);

        return Period.between(user_birth_date, curent_date).getYears();
    }

    public char getUser_gender () {
        return this.user_gender;
    }

    public String getUser_name () {
        return this.user_name;
    }

    public int getUser_birth_day () {
        return this.user_birth_day;
    }

    public int getUser_birth_month () {
        return this.user_birth_month;
    }

    public int getUser_birth_year () {
        return this.user_birth_year;
    }

    public String getUser_birth_date () {
        return this.user_birth_day+"/"+this.user_birth_month+"/"+this.user_birth_year;
    }

    public void setUser_weight (double user_weight) {
        this.user_weight = user_weight;
    }

    public void setUser_height (double user_height) {
        this.user_height = user_height;
    }

    public void setUser_birth_day (int day) {

        if (day >= 1 && day <= 31)
            this.user_birth_day = day;
    }

    public void setUser_birth_month (int month) {

        if (month >= 1 && month <= 12)
            this.user_birth_month = month;
    }

    public void setUser_birth_year (int year) {
        this.user_birth_year = year;
    }

    public void setUser_gender (char gender) {

        if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
            this.user_gender = gender;
    }

    public void setUser_name (String user_name) {
        this.user_name = user_name;
    }

    public HealthProfile (String user_name,char user_gender,int user_birth_year, int user_birth_month, int user_birth_day, double user_height, double user_weight) {

        this.setUser_name(user_name);
        this.setUser_gender(user_gender);
        this.setUser_birth_year(user_birth_year);
        this.setUser_birth_month(user_birth_month);
        this.setUser_birth_day(user_birth_day);
        this.setUser_height(user_height);
        this.setUser_weight(user_weight);

    }
}
