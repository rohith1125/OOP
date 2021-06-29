//Created by Sai Rohith on 2021-06-29
//Copyright © 2021 Sai Rohith. All rights reserved.
//Time
package Lab1.time;
class time{
    int hr,min,sec;
    time(){
    hr=0;min=0;sec=0;
    }
    time(int hr,int min,int sec){
    this.hr = hr;
    this.min = min;
    this.sec = sec;
    }
    public void display()//method to display the time
    {
        System.out.print(this.hr + ":" +this.min + ":"+this.sec); 
    }
    public void addtime(time t1,time t2)//method to add time
    {
        int m,s,h;
        //Adding two different times
        h = t1.hr+t2.hr;
        m = t1.min+t2.min;
        s = t1.sec+t2.sec;
        //Because there are 24 hours in a day,60 minutes in a hour and 60 seconds in a minute 
        this.sec=s%60;
        this.min=(m+s/60)%60;
        this.hr=(h+m/60)%24;
        System.out.print(h + ":" +m + ":"+s);
    }
}class Main{
public static void main(String args[]){
//Driver Code, for demonstration
time t = new time(4,2,0);
time t1 = new time(5,4,0);
t.display();
System.out.println("");
t1.display();
System.out.println("");
t.addtime(t, t1);
}
}