import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*        Member mem = new Member();

        System.out.print("당신의 이름을 입력하세요 : ");
        mem.setName(sc.nextLine());
        System.out.print("연락처를 입력하세요 : ");
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
        System.out.println(menu+"번을 선택했습니다");*/

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market";

        String name = "";
        String phoneNumber = "";

        System.out.print("당신의 이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        phoneNumber = sc.nextLine();

        boolean quit = false;
        while (!quit) {
            System.out.println("******************************************************");
            System.out.println("\t\t\t\t\t\t" + greeting);
            System.out.println("\t\t\t\t\t\t" + tagline);
            System.out.println("******************************************************");

            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int number = sc.nextInt();
            System.out.println(number + "번을 선택했습니다");

            if (number < 1 || number > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해주세요");
            } else {
                switch (number) {
                    case 1:
                        System.out.println("현재 고객의 정보\n이 름 : " + name + " | 연락처 :" + phoneNumber);
//                        menuGuestInfo(name,phoneNumber);
                        break;
                    case 2:
                        System.out.println("장바구니 상품 목록 보기");
//                        menuCartItemList();
                        break;
                    case 3:
                        System.out.println("장바구니 비우기");
//                        menuCartClear();
                        break;
                    case 4:
                        System.out.println("바구니에 항목 추가하기");
//                        menuCartAddItem();
                        break;
                    case 5:
                        System.out.println("장바구니의 항목 수량 추가하기");
//                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        System.out.println("장바구니의 항목 삭제하기");
//                        menuCartRemoveItem();
                        break;
                    case 7:
                        System.out.println("영수증 표시하기");
//                        menuCartBill();
                        break;
                    case 8:
                        System.out.println("프로그램 종료");
                        quit = true;
                        System.out.println("온라인 도서몰을 찾아주셔서 감사합니다. 다음에 다시 뵙겠습니다.");
//                        menuExit();
                        break;
                }
            }
        }
    }

    public static void menuIntroduction() {
        System.out.println("1. 고객 정보 확인하기     \t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 추가하기");
        System.out.println("3. 장바구니 비우기     \t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기     \t8. 종료");
    }
}
