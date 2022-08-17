package WeLost;

public class CardLost extends Lost{
    private String AcademyName;

    public CardLost() {
    }

    public CardLost(String name, int ID_card, String time, String academyName,String place) {
        super(name, ID_card, time,place);
        AcademyName = academyName;
    }

    public String getAcademyName() {
        return AcademyName;
    }

    public void setAcademyName(String academyName) {
        AcademyName = academyName;
    }

    @Override
    public String toString() {
        return  super.getTime()+" "+super.getName()+" "
        +AcademyName + ' ' +super.getID_card()+" "+super.getPlace();
    }
}
