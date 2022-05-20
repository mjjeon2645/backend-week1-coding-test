import java.util.Scanner;

public class ChuVsChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시작화면
        System.out.println("피카츄: 라이츄를 만났다.." + "\n" +
                "저 자식 .... 한테 한번 당한 경험이 있으니 .." + "\n" +
                "이번 리벤지 매치는 나에게 아주 중요해.." + "\n" +
                "다신 땅을 침대로 누워있을 수 없어..!!");

        String nextPㅁge = scanner.nextLine();

        // 결투 1. 성공 시나리오
        int picachuHp = 50;
        int laichuHp = 50;
        int piccasPortion = 1;

        while (laichuHp >= 0) {
            System.out.println("피카츄의 차례, 무엇을 할까?" + "\n" +
                    "1. 공격하기" + "\n" +
                    "2. 상처약 섭취");
            int followingAction = scanner.nextInt();

            if (followingAction == 1) {
                laichuHp -= 10;
                System.out.println("지우: 피카츄 몸통박치기!" + "\n" +
                        "-- 공격 명중! 라이츄의 에너지가 10 감소했다. 라이츄는 조금 아파한다." + "\n" +
                        "라이츄: 앗, 라이츄 아프다.");
                String nextPage2 = scanner.nextLine();
            } else if (followingAction == 2 && piccasPortion == 1) {
                picachuHp = 50;
                piccasPortion = 0;

                System.out.println("피카츄: 얌얌 상처약 냠냠" + "\n" +
                        "-- 상처약을 섭취하여 피카츄의 에너지가 50이 되었다. 피카츄는 회복되어보인다." + "\n" +
                        "라이츄: 킁...");
                String nextPage3 = scanner.nextLine();
            } else if (followingAction == 2 && piccasPortion == 0) {
                System.out.println("피카츄: 아..앗!! 상처약이 없다.. 아" + "\n" +
                        "라이츄: ㅋㅋㅋㅋ");
                String nextPage4 = scanner.nextLine();
            }

            picachuHp -= 15;
            
            System.out.println("\n" + "\n" +
                    "라이츄: 라이쮸!!!!!!!!!!!" + "\n" +
                    "-- 피카츄 타격!! 에너지가 15 감소했다!! --" + "\n" +
                    "피카츄: 피카앍..피카핡..");
            String nextPage5 = scanner.nextLine();
        }
    }
}
