package test.library.refactor;

import static org.junit.Assert.assertEquals;
import java.time.*;
import java.util.*;
import org.junit.*;
import library.refactor.data.*;
import library.refactor.domain.model.*;

public class UserRepositoryImplTest {
    UserRepositoryImpl repository = new UserRepositoryImpl();
    LocalDate localDate = LocalDate.of(1996, 10, 15);
    LocalDate now = LocalDate.now();

    User user1 = new User("홍길동", 10, "수원시", "010-1212-1231", localDate, now);
    User user2 = new User("홍윤기", 20, "안양시", "010-1212-1231", localDate, now);
    User user3 = new User("박태현", 30, "안산시", "010-1212-9999", localDate, now);
    User user4 = new User("이정민", 18, "용인시", "010-1321-5611", localDate, now);


    @Test
    public void 유저추가확인() {
        repository.addUser(user1);
        System.out.println(repository.findAll());
        assertEquals(1, repository.findAll().size());

        repository.addUser(user2);
        assertEquals(2, repository.findAll().size());
    }
    
    @Test
    public void 유저업데이트() {
        repository.addUser(user1);
        user1.setName("길동");
        repository.updateUser(user1);
        assertEquals("길동", user1.getName());
    }
    
    @Test
    public void id나_이름으로찾기() {
        repository.addUser(user1);
        repository.addUser(user2);
        
        assertEquals(1, repository.findById(1).getId());
        assertEquals("홍길동", repository.findById(1).getName());
        assertEquals("홍윤기", repository.findByName("홍윤기").getName());
        assertEquals(2, repository.findByName("홍윤기").getId());
    }
    
    @Test
    public void id를통한_유저삭제와_삭제취소() {
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);
        
        repository.deleteUser(user1);
        assertEquals(2, repository.findAll().size());
        
        repository.deleteUser(user2);
        assertEquals(1, repository.findAll().size());
        
        repository.deleteUser(user3);
        assertEquals(0, repository.findAll().size());
    }

}
