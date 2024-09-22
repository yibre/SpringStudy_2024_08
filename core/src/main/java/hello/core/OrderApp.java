package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

// 이런 방법으로 테스트하는 건 좋지 않음. 자동화된 테스트 방법을 만들어야.

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // 출력 결과: order = Order{memberId=1, itemName='itemA', itemPrice=10000, discountPrice=1000}
        System.out.println("order = "+ order);
    }
}
