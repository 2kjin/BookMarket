import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Member mem = new Member();

        System.out.println("당신의 이름을 입력하세요 : ");
        mem.setName(sc.nextLine());
        System.out.println("연락처를 입력하세요 : ");
        mem.setPhoneNumber(sc.nextLine());

        System.out.println("******************************************************");
        System.out.println("               Welcome to Shopping Mall");
        System.out.println("               Welcome to Book Market");
        System.out.println("******************************************************");
        System.out.println("1. 고객 정보 확인하기         4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기     5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기            6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기            8. 종료");

        System.out.print("메뉴 번호를 선택해주세요 ");
        int menu = sc.nextInt();
        System.out.println(menu+"번을 선택했습니다");
    }
}
