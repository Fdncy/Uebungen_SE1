package org.hbrs.se1.ws25.exercises.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        for (Member m : members) {
            if (m.getID().equals(member.getID())) {
                System.out.println("Member with ID " + m.getID() + " already exists");
                return;
            }
        }
        members.add(member);
    }

    public void deleteMember(Integer id){
        boolean found = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getID().equals(id)) {
                members.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Member with ID " + id + " not found");
        }
    }

    public void dump(){
        for (Member m : members) {
            System.out.println(m.toString());
        }
    }

    public int size(){
        return members.size();
    }
}
