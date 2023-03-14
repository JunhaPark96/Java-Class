public class Firstday {

	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		int c = a * b;
//		System.out.println("가로 " + a + ", 세로 " + b + "의 직사각형의 면적은 " + c);
//	    ----------------------------------------------------------------------
//	    boolean isStudent = true;
//	    char sex = '남';
//	    double numFavoirte = 3.14;
//	    Long numComplicate = 314159265853939L;
//	    String damageResult = "항구를 공격! 적에게 15포인트의 데미지를 주었다"
//	    ----------------------------------------------------------------------
//	    int x = 5;
//	    int y = 10;
//	    String answer = "x+y는 " + (int)(x + y);
//	    System.out.println(answer);
//	    ----------------------------------------------------------------------
	    //int x = 3 + 5.0;
//	    double d = 2.0F;
//	    int i = “5”;
//	    String s = 2 + “ 명째";
//	    byte b = 1;
//	    double d = true;
//	    short s = (byte)2;
//	    System.out.println(s);
//	    ----------------------------------------------------------------------
	    System.out.println("\"점을 보세요\"");
	    System.out.println("\"이름을 입력해 주세요\"");
	    String name = new java.util.Scanner(System.in).nextLine();
	    System.out.println("\"나이를 입력 해 주세요\"");
	    String ageString = new java.util.Scanner(System.in).nextLine();
	    int age = Integer.parseInt(ageString);
	    int fortune = new java.util.Random().nextInt(4);
	    fortune++;
	    System.out.println("\"점꾀가 나왔습니다!\"");
	    System.out.println("\"" + age + "살의 " + name + "씨, 당신의 운세번호는 " + fortune + " 입니다\"");
	    System.out.println("\"1:대박 2:중박 3:보통 4:망\"");
	    

	}

}
