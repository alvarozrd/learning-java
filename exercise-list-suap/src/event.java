public class event {
    
    private int day;
    private int month;
    private int year;

    //buil method
    event(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    //geters and setters
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if(day <= 30 && day > 0){
            this.day = day;            
        }else{
            System.out.println(day + " Não é um dia válido.");
        }
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month > 0 && month <= 12){
        this.month = month;
        }else{
            System.out.println(month + " Não é um mês válido.");
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year > 1900){
            this.year = year;
        }else{
            System.out.println(year + " Não é um ano válido.");
        }

    }
}
