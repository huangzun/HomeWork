package WeLost;

import java.text.DecimalFormat;

public class Lost {
    private String name;
    private int ID_card;
    private String time;
    private String place;
    public Lost() {
    }
    public Lost(String name, int ID_card, String time,String place) {
        this.name = name;
        this.ID_card = ID_card;
        this.time = time;
        this.place=place;
    }

    public String getTime() {
        String a = time.substring(0,5);
        DecimalFormat format = new DecimalFormat("00");
        if (time.substring(6,7).equals(".")&&time.length()==8){
           int d=Integer.parseInt(time.substring(5,6));
           int e=Integer.parseInt(time.substring(7,8));
           String D=format.format(d);
           String E=format.format(e);
           time=a+D+"."+E;
        }else if (time.substring(6,7).equals(".")&&time.length()==9){
            int f=Integer.parseInt(time.substring(5,6));
            String F=format.format(f);
            time=a+F+time.substring(7,9);
        }else if (time.length()==9){
            int g=Integer.parseInt(time.substring(8,9));
            String G=format.format(g);
            time=a+time.substring(5,8)+G;
        }
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID_card() {
        return ID_card;
    }

    public void setID_card(int ID_card) {
        this.ID_card = ID_card;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
