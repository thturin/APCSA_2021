import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public void addMembers(String[] names, int gradYear) {
        if (names.length != 0) {
            for (int i = 0; i < names.length; i++) {
                MemberInfo mem = new MemberInfo(names[i], gradYear, true);
                memberList.add(mem);
                System.out.println("New member has been added: " + mem.getName());
            }
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedList = new ArrayList<MemberInfo>;
        for (int i = 0; i < memberList.size(); i++) {//index through memberList
            if (memberList.get(i).getGradYear() <= year) {//if graduated
                if(memberList.get(i).inGoodStanding()){//if in good standing
                    graduatedList.add(memberList.get(i));//add to graduatedlist
                }
                memberList.remove(i);//remove bad and good standing from the memberList
            }
        }
        return graduatedList;
    }

    public static void main(String[] args) {
        MemberInfo m1 = new MemberInfo("Smith, Jane",2019,false);
        MemberInfo m2 = new MemberInfo("Fox, Steve", 2018,true);
        MemberInfo m3 = new MemberInfo("Xin, Michael",2017,false);
        MemberInfo m4 = new MemberInfo("Garcia, Maria",2020,true);


    }


}
