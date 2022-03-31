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
        ArrayList<MemberInfo> graduatedList = new ArrayList<MemberInfo>();


        for (int i = 0; i < memberList.size(); i++) {//index through memberList
            System.out.println(memberList.get(i).getGradYear()+" ---- "+memberList.get(i).getName());
            if (memberList.get(i).getGradYear() <= year) {//if graduated
               // System.out.println(memberList.get(i).getName());
                if(memberList.get(i).inGoodStanding()){//if in good standing
                    graduatedList.add(memberList.get(i));//add to graduatedlist
                }
                memberList.remove(i);//remove bad and good standing from the memberList
                i=i-1;
            }
        }
        return graduatedList;
    }

    public static void main(String[] args) {
        MemberInfo m1 = new MemberInfo("Smith, Jane",2019,false);
        MemberInfo m2 = new MemberInfo("Fox, Steve", 2018,true);
        MemberInfo m3 = new MemberInfo("Xin, Michael",2017,false);
        MemberInfo m4 = new MemberInfo("Garcia, Maria",2020,true);

       ClubMembers Club = new ClubMembers();
       ArrayList<MemberInfo> mList = new ArrayList<MemberInfo>();
       Club.memberList=mList;

       Club.memberList.add(m1);
       Club.memberList.add(m2);
       Club.memberList.add(m3);
       Club.memberList.add(m4);

       for(int i=0;i<Club.memberList.size();i++){
           System.out.println("Member: "+  Club.memberList.get(i).getName()+" Year: "+Club.memberList.get(i).getGradYear());
       }

       ArrayList<MemberInfo> graduatedList = Club.removeMembers(2018);
        for(int i=0;i<Club.memberList.size();i++){
            System.out.println("Member: "+  Club.memberList.get(i).getName()+" Year: "+Club.memberList.get(i).getGradYear());
        }
System.out.println("------------");
        for(int i=0;i< graduatedList.size();i++){
            System.out.println("Member: "+  graduatedList.get(i).getName()+" Year: "+graduatedList.get(i).getGradYear());
        }


    }


}
