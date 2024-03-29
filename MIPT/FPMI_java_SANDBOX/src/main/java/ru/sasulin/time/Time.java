package ru.sasulin.time;


public class Time {
    private int seconds;

    public void setSeconds(int seconds) {
        this.seconds = seconds % 86400;
    }

    public Time(int second){
        this.seconds = second % 86400;
    }

    public Time(int hour, int minute, int second){
        this(hour*3600+minute*60+second);
    }

    public void whatTime(String period){
        int res = 0 ;
        String[] converted;
        converted = this.convert(this.seconds);

        if (period == "час") {
            res = Integer.parseInt(converted[0]);
        }
        if (period == "минута") {
            res = Integer.parseInt(converted[1]);
        }
        if (period == "секунда") {
            res = Integer.parseInt(converted[2]);
        }
        System.out.println(res);

    }
    private String format(int digit){
        if (digit < 10 ){
            return "0" + digit;
        }else {
            return "" + digit;
        }
    }

    private String[] convert(int seconds){
        int minute = 60;
        int hour = 3600;
        int day = 86400;
        int resHours,resMinutes,resSecond;
        String[] res=new String[]{"00","00","00"};
        if (seconds < minute )  {
            res[2] = format(seconds);
            return res;
        }
        if (seconds > day )  {
            seconds = seconds % day;
        }
        resHours = seconds / hour;
        resMinutes = (seconds % hour) / minute;
        resSecond = seconds - (resHours * hour) - (resMinutes * minute);
        res[0] = format(resHours);
        res[1] = format(resMinutes);
        res[2] = format(resSecond);
        return res ;
    }

    public String toString(){
        String s1;
        String[] converted;
        converted = convert(seconds);
        s1 = converted[0] + ":" + converted[1] + ":" + converted[2];
        return s1;
    }
}
