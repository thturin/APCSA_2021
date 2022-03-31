public class MemberInfo {
    private String name;
    private int graduation;
    private boolean goodStanding;

    public MemberInfo(String n, int y, boolean s){
        name=n;
        graduation=y;
        goodStanding=s;
    }

    public String getName(){return name;}
    public int getGradYear(){return graduation;}
    public boolean inGoodStanding(){return goodStanding;}
}

