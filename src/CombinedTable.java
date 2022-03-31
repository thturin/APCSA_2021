public class CombinedTable extends SingleTable {
    private SingleTable x;
    private SingleTable y;

    public int canSeat(){
        int num = (x.getNumSeats()+y.getNumSeats())-2;
        return num;
    }
}
