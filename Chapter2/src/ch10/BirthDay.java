package ch10;

public class BirthDay {

    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public int getDat() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void showDate() {
        if(isValid) {
            System.out.printf("%d년 %d월 %d일\n", year, month, day);
        }
        else {
            System.out.println("존재하지 않는 날짜");
        }
    }
}
