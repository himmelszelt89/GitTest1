package edu.java.git;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, Git!!");
		System.out.println("[수정1] 안녕하세요!");
        System.out.println("[modify2] Web_Git modify");
        
        
        /**
			<<<<<<< HEAD
			        System.out.println("나도 버그 수정...");
			=======
			        System.out.println("bug fix");
			>>>>>>> branch 'master' of https://github.com/himmelszelt89/GitTest1
			 서로 같은 곳을 수정할 경우 자동으로 선택이 안되게 된다.
         */

        System.out.println("나도 버그 수정...");

        System.out.println("bug fix");

		
	} // end main()

} // end class AppMain
