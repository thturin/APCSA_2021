public class CombinedTable  {
    private SingleTable x;
    private SingleTable y;

    public CombinedTable(SingleTable s1, SingleTable s2){
        x=s1;
        y=s2;
    }
    public boolean canSeat(int seats){
        int maxSeats = (x.getNumSeats()+y.getNumSeats())-2;
        boolean ans=false;
        if (seats<=maxSeats){
            ans=true;
        }
        return ans;
    }
    public double getDesirability(){
        double ans = (x.getViewQuality()+y.getViewQuality())/2.0;
        //System.out.println("ans="+ans);
        if(x.getHeight()==y.getHeight()){
            //System.out.println("This is the desirability = "+ans);
        }else{
            ans=ans-10;
        }
        return ans;
    }
    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4,60.0,74);
        SingleTable t2 = new SingleTable(8,70.0,74);
        SingleTable t3 = new SingleTable(12,75.0,76);

        CombinedTable c1 = new CombinedTable(t1, t2);
        //System.out.println(c1.canSeat(11));
        //System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(t2,t3);
        //System.out.println(c2.canSeat(18));
        //System.out.println(c2.getDesirability());
        t2.setViewQuality(80);
        //System.out.println(t2.getViewQuality());
        System.out.println(c2.getDesirability());
    }


}

