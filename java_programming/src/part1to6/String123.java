package part1to6;

public class String123 {
    public static void main (String[] args) {
        String suffix = " 살 안 쪄요.";
        String chicken = "치킨은" + suffix;
        String me = "나도" + suffix;
        System.out.println(chicken);
        System.out.println(me);

        String characterName = "해치지마요";
        int length = characterName.length();
        System.out.println(characterName + " => 글자수: " + length);

        System.out.println("--------------------");
        String fat = "치킨은 살 안 쪄요. 살은 내가 쪄요.";
        String replaced = fat.replaceAll("내가","네가");
        System.out.println(fat + " => " + replaced);

    }
}
