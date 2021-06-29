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
    public void display()
    {
        System.out.print(this.hr + ":" +this.min + ":"+this.sec); 
    }
    public void addtime(time t1,time t2)
    {
        int m,s,h;
        h = t1.hr+t2.hr;
        m = t1.min+t2.min;
        s = t1.sec+t2.sec;
        this.sec=s%60;
        this.min=(m+s/60)%60;
        this.hr=(h+m/60)%24;
        System.out.print(h + ":" +m + ":"+s);
    }
}class Main{
public static void main(String args[]){
time t = new time(4,2,0);
time t1 = new time(5,4,0);
t.display();
System.out.println("");
t1.display();
System.out.println("");
t.addtime(t, t1);
}
}