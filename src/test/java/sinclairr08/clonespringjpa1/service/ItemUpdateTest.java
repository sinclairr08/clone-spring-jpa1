package sinclairr08.clonespringjpa1.service;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sinclairr08.clonespringjpa1.domain.item.Book;

@SpringBootTest
public class ItemUpdateTest {
    @Autowired
    EntityManager em;

    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        // 트랜잭션
        book.setName("aaaaa");

        // 변경 감지 == dirty checking
        // 트랜잭션 커밋

    }
}
