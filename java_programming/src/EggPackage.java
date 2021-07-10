public class EggPackage {
    public static void main(String[] args) {
        int totalEggs = 277;    //  총 달걀 개수.
        int eggCartonSize = 30;     //  한 판에 포장되는 달걀 개수

        //  totalEggs를 eggCartonSize로 나눈 나머지 값 계산
        int remainEggs = totalEggs % eggCartonSize;

        System.out.println("총 " + remainEggs + "개의 계란이 남습니다.");

    }
}
