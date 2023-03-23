package system.library;

import java.awt.desktop.*;
import java.text.*;
import java.util.*;

public class UserImpl implements UserManagement {
    private ArrayList<User> userList;
    Scanner scanner = new Scanner(System.in);
    private String fileName = "userInfo.txt";
    private String tempFile = "tempUserInfo.txt";
    User lastDeletedUser = null;
    
    public void enroll() {
        User user = new User();
        
        System.out.println("이름을 입력하세요");
        String name = scanner.next();
        user.setName(name);
        
        System.out.println("주소를 입력하세요");
        String address = scanner.next();
        user.setAddress(address);
        
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();
        user.setAge(age);
        
        System.out.println("전화번호를 입력하세요");
        String phoneNum = scanner.next();
        user.setPhoneNum(phoneNum);
        
        String signUpDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar time = Calendar.getInstance();
        signUpDate = format.format(time.getTime());
        user.setSignUpDate(signUpDate);

        if (userList == null) {
            userList = new ArrayList<>();
        }
        user.setId(userList.size() + 1);
        userList.add(user);

        UserFileHandler.csvWriter(userList, fileName);
    }
    
    
    @Override
    public void userSearchAll() {
        List<User> userList = UserFileHandler.csvReader(fileName);
        if (userList != null) {
            for (User user : userList) {
                System.out.println(user.toString());
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("수정할 유저의 아이디와 이름을 입력해주세요");
        int userId = scanner.nextInt();
        String userName = scanner.next();
        
        List<User> userList = UserFileHandler.csvReader(fileName);
        
        // 해당 아이디와 이름을 가진 유저 찾기
        User editUser = null;
        for (User user : userList) {
            if (user.getId() == userId && user.getName().equals(userName)) {
                editUser = user;
                break;
            }
        }
        
        // 해당 유저가 없을 경우
        if (editUser == null) {
            System.out.println("해당 유저가 없습니다.");
            return;
        }
        
        // 수정할 정보 선택하기
        System.out.println("어떤 정보를 수정하시겠습니까?");
        System.out.println("1. 이름 2. 나이 3. 주소 4. 전화번호");
        int option = scanner.nextInt();
        
        // 선택된 정보 수정하기
        switch (option) {
            case 1:
                System.out.println("새로운 이름을 입력해주세요.");
                String newName = scanner.next();
                editUser.setName(newName);
                break;
            case 2:
                System.out.println("새로운 나이를 입력해주세요.");
                int newAge = scanner.nextInt();
                editUser.setAge(newAge);
                break;
            case 3:
                System.out.println("새로운 주소를 입력해주세요.");
                String newAddress = scanner.next();
                editUser.setAddress(newAddress);
                break;
            case 4:
                System.out.println("새로운 전화번호를 입력해주세요.");
                String newPhoneNum = scanner.next();
                editUser.setPhoneNum(newPhoneNum);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        // 수정된 유저 정보 저장하기
        UserFileHandler.csvWriter(userList, fileName);
    }

    @Override
    public void delete() {
        System.out.println("삭제할 유저의 아이디와 이름을 입력해주세요");
        int userId = scanner.nextInt();
        String userName = scanner.next();
        
        List<User> userList = UserFileHandler.csvReader(fileName);
        
        // 해당 아이디와 이름을 가진 유저 찾기
        User deleteUser = null;
        for (User user : userList) {
            if (user.getId() == userId && user.getName().equals(userName)) {
                deleteUser = user;
                break;
            }
        }
        
        // 해당 유저가 없을 경우
        if (deleteUser == null) {
            System.out.println("해당 유저가 없습니다.");
            return;
        }
        
        // 수정할 정보 선택하기
        System.out.println("정말로 삭제하시겠습니까? 삭제하시겠다면 \"Yes\"를 입력해주세요");
        String configuration = scanner.next();
        if (configuration.equals("Yes")) {
            userList.remove(deleteUser);
            UserFileHandler.csvWriter(userList, fileName);
            System.out.println("유저 정보를 삭제하였습니다.");
            
            UserFileHandler.csvDeletedWriter(userList, tempFile);
            lastDeletedUser = deleteUser;
        }
    }

    @Override
    public void undoDelete() {
        if (lastDeletedUser == null) {
            System.out.println("이전 삭제 정보가 없습니다.");
        } else {
            userList.add(lastDeletedUser);
            lastDeletedUser = null;
            System.out.println("삭제된 유저 정보가 복원되었습니다.");
        }
    }

    public UserImpl(String fileName) {
        
    }
    
    
    public UserImpl() {
        super();
    }
    
    
}

