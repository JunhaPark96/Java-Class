package dayThirteen;

import java.util.*;

public class ObserverMain {

    public static void main(String[] args) {
        
        Button button1 = new Button(new OnClickEvent() {
            @Override
            public void onClick() {
                System.out.println("click");
            }
        });  
        
        Button button2 = new Button(new OnClickEvent() {
            @Override
            public void onClick() {
                System.out.println("click");
            }
        });  
        
        List<Button> buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.stream().forEach(button -> button.click());
//        button1.click(); // 버튼을 클릭 시 위의 addButton의 onClick 메소드가 실행된다     
    }

}

interface OnClickEvent{
    void onClick();
}

class Button {
    private OnClickEvent listener;
    
    public Button(OnClickEvent listener) {
        this.listener = listener;
    }
    // 메소드 실행 시 콜백하여 onClick() 메소드 호출
    void click() {
        listener.onClick();
    }
}