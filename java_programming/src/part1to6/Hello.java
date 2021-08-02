package part1to6;

public class Hello {
    public static void main (String[] args) {
    //산술 연산자 우선 순위
        //  1   ()
        //  2   *,/,%
        //  3   +,-
        System.out.println((1 + 2) * 3);
        System.out.println((2 - 4) / 2);
        System.out.println("HELLO");

        //  int age와 int aGe는 다른 변수, 영문은 대소문자를 구분!
        //  변수명은 의미를 명확히 하는 선에서 가능한 짧은 단어를 사용한다.
        //  자바에서는 변수명으로 카멜 케이스 표기법(시작은 소문자로, 그 뒤부터는 단어 단위로 첫 글자만 대문자를 사용)을 권장
        //  => int camelCase / int searchResult
        //  자바에서 다른 용도로 사용하고 있는 키워드들은 변수명으로 사용할 수 없다.
        //  이런 단어들은 보통 예약어(reserved words)라고 부름.
        //  예약어 목록
        //
        //  abstract        assert          boolean         break           byte            case
        //  catch           char            class           const           continue        default
        //  double          do              else            enum            extends         false
        //  final           finally         float           for             goto            if
        //  implements      import          instanceof      int             interface       long
        //  native          new             null            package         private         protected
        //  public          return          short           static          strictfp        super
        //  switch          synchronized    this            throw           throws          transient
        //  true            try             void            volatile        while

        //  카멜카이스: friedChickenSandwich
        //  파스칼케이스: FriedChickenSandwich
        //  스네이크케이스: fried_chicken_sandwich

    }
}
