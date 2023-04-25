package sinclairr08.clonespringjpa1.repository;

import lombok.Getter;
import lombok.Setter;
import sinclairr08.clonespringjpa1.domain.OrderStatus;

@Getter @Setter
public class OrderSearch {
    private String memberName;      // 회원 이름
    private OrderStatus orderStatus;
}
