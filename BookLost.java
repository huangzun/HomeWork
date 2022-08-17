package WeLost;

public class BookLost extends Lost{
    private String bookName;

    public BookLost() {
    }

    public BookLost(String name, int ID_card, String time, String bookName,String place) {
        super(name, ID_card, time,place);
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return super.getTime()+" "+super.getName()+" "+ bookName + ' ' +super.getID_card()+" "+super.getPlace();
    }
}
