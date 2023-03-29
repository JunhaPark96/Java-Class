package library.refactor.presentation;

import java.time.*;
import java.util.*;
import library.refactor.domain.model.*;
import library.refactor.domain.repository.*;

public class UserController {
    private UserRepository userRepository;
    
    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    private User recentDeletedUser = null;
    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public void printMenu() {
        while (!isExit) {
            System.out.println("1. 유저등록, 2. 유저목록, 3. 유저수정, 4. 유저삭제, 5. 삭제취소 0. 뒤로");
            int target = scanner.nextInt();
            if (target == 1) {
                addUser();
                printUserList();
//            } else if (target == 2) {
//                printUserList();
//            } else if (target == 3) {
//                updateUser();
//            } else if (target == 4){
//                removeUser();
//            } else if (target == 5) {
//                restoreUser();
            } else {
                isExit = true;
            }
        }
    }
    
    public void addUser() {
        System.out.println("id를 입력하세요");
        int id = scanner.nextInt();
        System.out.println("이름을 입력하세요");
        String name = scanner.next();
        System.out.println("성별을 입력하세요");
        int gender = scanner.nextInt();
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();
        System.out.println("주소를 입력하세요");
        String address = scanner.next();
        System.out.println("전화번호를 입력하세요");
        String number = scanner.next();
        System.out.println("생년월일을 입력하세요 (YYYY/MM/DD)");
        String birthDay = scanner.next();
        LocalDate birthDate = LocalDate.parse(birthDay);
        LocalDate joinDate = LocalDate.now();
        
        userRepository.addUser(new User(id, name, gender, age, address, number, birthDate, joinDate));
        
    }
    
    public void printUserList() {
        System.out.println(userRepository.findAll());
    }
    
    
}
