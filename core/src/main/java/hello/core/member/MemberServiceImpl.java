package hello.core.member;

// 구현체가 하나일땐 관례적으로 Impl을 붙임
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    // nullpointerError 뜨지 않도록 구현

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
