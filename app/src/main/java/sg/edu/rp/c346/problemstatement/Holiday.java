package sg.edu.rp.c346.problemstatement;

public class Holiday {
    private String name;
    private int day;
    private String month;
    private int year;

    public Holiday(String name, int day, String month, int year){
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }
}
