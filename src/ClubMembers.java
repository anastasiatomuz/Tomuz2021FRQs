import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
        for (String name : names){
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduates = new ArrayList<>();
        for (int i = 0; i < memberList.size(); i ++){
            if (memberList.get(i).getGradYear() <= year){
                MemberInfo memberToRemove = memberList.remove(i);
                i --;
                if (memberToRemove.inGoodStanding()){
                    graduates.add(memberToRemove);
                }
            }
        }
        return graduates;
    }
}