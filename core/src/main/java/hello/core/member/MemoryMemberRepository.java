package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    // 메모리 내에서만 쓰기 때문에 테스트용으로 써야함.
    // conquerent hashmap을 실무에서는 써야 함. (동시성 이슈 발생 문제)

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
