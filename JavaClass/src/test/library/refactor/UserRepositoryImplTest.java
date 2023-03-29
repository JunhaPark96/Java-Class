//package test.library.refactor;
//
//import static org.junit.Assert.assertEquals;
//import java.util.*;
//import org.junit.*;
//import library.refactor.data.*;
//import library.refactor.domain.model.*;
//
//public class UserRepositoryImplTest {
//    UserRepositoryImpl repository;
//    
//    User user1 = new User(1, "홍길동", 0, 10, "수원시", "010-1212-1231", new Date(), new Date());
//    User user2 = new User(2, "홍윤기", 0, 20, "안양시", "010-1212-1231", new Date(), new Date());
//    User user3 = new User(3, "박태현", 0, 30, "안산시", "010-1212-9999", new Date(), new Date());
//    User user4 = new User(4, "이정민", 1, 18, "용인시", "010-1321-5611", new Date(), new Date());
//    
//    
//    @Test
//    public void 유저추가확인() {
//        repository.addUser(user1);
//        assertEquals(1, repository.findAll().size());
//        
//        repository.addUser(user2);
//        assertEquals(2, repository.findAll().size());
//    }
//
//}
