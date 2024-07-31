package collection.map.test.member;

import java.util.*;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();
    public void save(Member member) {
        // 코드 작성
        memberMap.put(member.getId(),member);
    }
    public void remove(String id) {
        // 코드 작성
        memberMap.remove(id);
    }
    public Member findById(String id) {
        // 코드 작성
        Member member = memberMap.get(id);
        return  member;



    }
    public Member findByName(String name) {
        // 코드 작성
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        /*
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Member> entry : memberMap.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }*/
        return null;

    }

}
