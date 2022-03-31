public class SingleTable {
    private int seats;
    private double view;
    private int height;

    public SingleTable(int s, double v, int h){
        seats=s;
        view=v;
        height=h;
    }
    //Returns the number of seats at this table. The value is always greater than or equal to 4
    public int getNumSeats(){return seats;}
    public int getHeight(){return height;}
    public double getViewQuality(){return view;}
    public void setViewQuality(double Value){view=Value;}
}

