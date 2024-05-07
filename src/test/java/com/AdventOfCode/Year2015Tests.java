package com.AdventOfCode;

import com.AdventOfCode.Year_2015.Day_01.Not_Quite_Lisp;
import com.AdventOfCode.Year_2015.Day_02.I_Was_Told_There_Would_Be_No_Math;
import com.AdventOfCode.Year_2015.Day_03.Perfectly_Spherical_Houses_in_a_Vacuum;
import com.AdventOfCode.Year_2015.Day_04.The_Ideal_Stocking_Stuffer;
import com.AdventOfCode.Year_2015.Day_05.Doesnt_He_Have_Intern_Elves_For_This;
import com.AdventOfCode.Year_2015.Day_06.Probably_a_Fire_Hazard;
import com.AdventOfCode.Year_2015.Day_07.Some_Assembly_Required;
import com.AdventOfCode.Year_2015.Day_08.Matchsticks;
import com.AdventOfCode.Year_2015.Day_09.All_in_a_Single_Night;
import com.AdventOfCode.Year_2015.Day_10.Elves_look_Elves_Say;
import com.AdventOfCode.Year_2015.Day_11.Corporate_Policy;
import com.AdventOfCode.Year_2015.Day_12.JSAbacusFrameworkIO;
import com.AdventOfCode.Year_2015.Day_13.Knights_of_the_Dinner_Table;
import com.AdventOfCode.Year_2015.Day_14.Reindeer_Olympics;
import com.AdventOfCode.Year_2015.Day_15.Science_for_Hungry_People;
import com.AdventOfCode.Year_2015.Day_16.Aunt_Sue;
import com.AdventOfCode.Year_2015.Day_17.No_Such_Thing_as_Too_Much;
import com.AdventOfCode.Year_2015.Day_18.Like_a_GIF_For_Your_Yard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Year2015Tests {

    @Nested
    class day01
    {
        AOCExercise ex = new Not_Quite_Lisp();

        @Test
        void part1() {
            ex.input = "(())";
            Assertions.assertThat(ex.answer1()).isEqualTo("0");

            ex.input = "()()";
            Assertions.assertThat(ex.answer1()).isEqualTo("0");

            ex.input = "(((";
            Assertions.assertThat(ex.answer1()).isEqualTo("3");

            ex.input = "(()(()(";
            Assertions.assertThat(ex.answer1()).isEqualTo("3");

            ex.input = "))(((((";
            Assertions.assertThat(ex.answer1()).isEqualTo("3");

            ex.input = "())";
            Assertions.assertThat(ex.answer1()).isEqualTo("-1");

            ex.input = "))(";
            Assertions.assertThat(ex.answer1()).isEqualTo("-1");

            ex.input = ")))";
            Assertions.assertThat(ex.answer1()).isEqualTo("-3");

            ex.input = ")())())";
            Assertions.assertThat(ex.answer1()).isEqualTo("-3");
        }

        @Test
        void part2() {
            ex.input = ")";
            Assertions.assertThat(ex.answer2()).isEqualTo("1");

            ex.input = "()())";
            Assertions.assertThat(ex.answer2()).isEqualTo("5");
        }
    }

    @Nested
    class day02
    {
        AOCExercise ex = new I_Was_Told_There_Would_Be_No_Math();
        String[] inputs = new String[] {
            "2x3x4",
            "1x1x10"
        };
        @Test
        void part1() {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("58");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("43");
        }

        @Test
        void part2() {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer2()).isEqualTo("34");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("14");
        }
    }

    @Nested
    class day03
    {
        AOCExercise ex = new Perfectly_Spherical_Houses_in_a_Vacuum();
        String[] inputs = new String[] {
            ">",
            "^>v<",
            "^v^v^v^v^v",
            "^v"
        };

        @Test
        void part1() {

            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("2");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("4");

            ex.input = inputs[2];
            Assertions.assertThat(ex.answer1()).isEqualTo("2");
        }

        @Test
        void part2() {

            ex.input = inputs[3];
            Assertions.assertThat(ex.answer2()).isEqualTo("3");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("3");

            ex.input = inputs[2];
            Assertions.assertThat(ex.answer2()).isEqualTo("11");
        }
    }

    @Nested
    class day04
    {
        AOCExercise ex = new The_Ideal_Stocking_Stuffer();

        @Test
        void part1() {
            ex.input = "abcdef";
            Assertions.assertThat(ex.answer1()).isEqualTo("609043");

            ex.input = "pqrstuv";
            Assertions.assertThat(ex.answer1()).isEqualTo("1048970");
        }

        @Test
        void part2() {
            ex.input = "ckczppom";
            Assertions.assertThat(ex.answer2()).isEqualTo("3938038");
        }
    }

    @Nested
    class day05
    {
        AOCExercise ex = new Doesnt_He_Have_Intern_Elves_For_This();

        @Test
        void part1() {
            ex.input = "ugknbfddgicrmopn";
            Assertions.assertThat(ex.answer1()).isEqualTo("1");

            ex.input = "aaa";
            Assertions.assertThat(ex.answer1()).isEqualTo("1");

            ex.input = "jchzalrnumimnmhp";
            Assertions.assertThat(ex.answer1()).isEqualTo("0");

            ex.input = "haegwjzuvuyypxyu";
            Assertions.assertThat(ex.answer1()).isEqualTo("0");

            ex.input = "dvszwmarrgswjxmb";
            Assertions.assertThat(ex.answer1()).isEqualTo("0");
        }

        @Test
        void part2() {
            ex.input = "qjhvhtzxzqqjkmpb";
            Assertions.assertThat(ex.answer2()).isEqualTo("1");

            ex.input = "xxyxx";
            Assertions.assertThat(ex.answer2()).isEqualTo("1");

            ex.input = "uurcxstgmygtbstg";
            Assertions.assertThat(ex.answer2()).isEqualTo("0");

            ex.input = "ieodomkazucvgmuy";
            Assertions.assertThat(ex.answer2()).isEqualTo("0");
        }
    }

    @Nested
    class day06
    {
        AOCExercise ex = new Probably_a_Fire_Hazard();
        String[] inputs = new String[]{
            //0
            "turn on 0,0 through 999,999",
            //1
            "turn on 0,0 through 999,0",
            //2
            "turn on 0,0 through 999,999\n" +
            "turn off 499,499 through 500,500",
            //3
            "turn on 0,0 through 0,0",
            //4
            "toggle 0,0 through 999,999"
        };
        @Test
        void part1() {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("1000000");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("1000");

            ex.input = inputs[2];
            Assertions.assertThat(ex.answer1()).isEqualTo("999996");
        }

        @Test
        void part2() {

            ex.input = inputs[3];
            Assertions.assertThat(ex.answer2()).isEqualTo("1");

            ex.input = inputs[4];
            Assertions.assertThat(ex.answer2()).isEqualTo("2000000");
        }
    }

    @Nested
    class day07
    {
        AOCExercise ex = new Some_Assembly_Required();
        String[] inputs = new String[] {
                //0
                "123 -> x\n" +
                "456 -> y\n" +
                "x AND y -> d\n" +
                "x OR y -> e\n" +
                "x LSHIFT 2 -> f\n" +
                "y RSHIFT 2 -> g\n" +
                "NOT x -> h\n" +
                "NOT y -> i",
                //1
                "NOT dq -> dr\n" +
                "kg OR kf -> kh\n" +
                "ep OR eo -> eq\n" +
                "44430 -> b\n" +
                "NOT gs -> gt\n" +
                "dd OR do -> dp\n" +
                "eg AND ei -> ej\n" +
                "y AND ae -> ag\n" +
                "jx AND jz -> ka\n" +
                "lf RSHIFT 2 -> lg\n" +
                "z AND aa -> ac\n" +
                "dy AND ej -> el\n" +
                "bj OR bi -> bk\n" +
                "kk RSHIFT 3 -> km\n" +
                "NOT cn -> co\n" +
                "gn AND gp -> gq\n" +
                "cq AND cs -> ct\n" +
                "eo LSHIFT 15 -> es\n" +
                "lg OR lm -> ln\n" +
                "dy OR ej -> ek\n" +
                "NOT di -> dj\n" +
                "1 AND fi -> fj\n" +
                "kf LSHIFT 15 -> kj\n" +
                "NOT jy -> jz\n" +
                "NOT ft -> fu\n" +
                "fs AND fu -> fv\n" +
                "NOT hr -> hs\n" +
                "ck OR cl -> cm\n" +
                "jp RSHIFT 5 -> js\n" +
                "iv OR jb -> jc\n" +
                "is OR it -> iu\n" +
                "ld OR le -> lf\n" +
                "NOT fc -> fd\n" +
                "NOT dm -> dn\n" +
                "bn OR by -> bz\n" +
                "aj AND al -> am\n" +
                "cd LSHIFT 15 -> ch\n" +
                "jp AND ka -> kc\n" +
                "ci OR ct -> cu\n" +
                "gv AND gx -> gy\n" +
                "de AND dk -> dm\n" +
                "x RSHIFT 5 -> aa\n" +
                "et RSHIFT 2 -> eu\n" +
                "x RSHIFT 1 -> aq\n" +
                "ia OR ig -> ih\n" +
                "bk LSHIFT 1 -> ce\n" +
                "y OR ae -> af\n" +
                "NOT ca -> cb\n" +
                "e AND f -> h\n" +
                "ia AND ig -> ii\n" +
                "ck AND cl -> cn\n" +
                "NOT jh -> ji\n" +
                "z OR aa -> ab\n" +
                "1 AND en -> eo\n" +
                "ib AND ic -> ie\n" +
                "NOT eh -> ei\n" +
                "iy AND ja -> jb\n" +
                "NOT bb -> bc\n" +
                "ha OR gz -> hb\n" +
                "1 AND cx -> cy\n" +
                "NOT ax -> ay\n" +
                "ev OR ew -> ex\n" +
                "bn RSHIFT 2 -> bo\n" +
                "er OR es -> et\n" +
                "eu OR fa -> fb\n" +
                "jp OR ka -> kb\n" +
                "ea AND eb -> ed\n" +
                "k AND m -> n\n" +
                "et RSHIFT 3 -> ev\n" +
                "et RSHIFT 5 -> ew\n" +
                "hz RSHIFT 1 -> is\n" +
                "ki OR kj -> kk\n" +
                "NOT h -> i\n" +
                "lv LSHIFT 15 -> lz\n" +
                "as RSHIFT 1 -> bl\n" +
                "hu LSHIFT 15 -> hy\n" +
                "iw AND ix -> iz\n" +
                "lf RSHIFT 1 -> ly\n" +
                "fp OR fv -> fw\n" +
                "1 AND am -> an\n" +
                "ap LSHIFT 1 -> bj\n" +
                "u LSHIFT 1 -> ao\n" +
                "b RSHIFT 5 -> f\n" +
                "jq AND jw -> jy\n" +
                "iu RSHIFT 3 -> iw\n" +
                "ih AND ij -> ik\n" +
                "NOT iz -> ja\n" +
                "de OR dk -> dl\n" +
                "iu OR jf -> jg\n" +
                "as AND bd -> bf\n" +
                "b RSHIFT 3 -> e\n" +
                "jq OR jw -> jx\n" +
                "iv AND jb -> jd\n" +
                "cg OR ch -> ci\n" +
                "iu AND jf -> jh\n" +
                "lx -> a\n" +
                "1 AND cc -> cd\n" +
                "ly OR lz -> ma\n" +
                "NOT el -> em\n" +
                "1 AND bh -> bi\n" +
                "fb AND fd -> fe\n" +
                "lf OR lq -> lr\n" +
                "bn RSHIFT 3 -> bp\n" +
                "bn AND by -> ca\n" +
                "af AND ah -> ai\n" +
                "cf LSHIFT 1 -> cz\n" +
                "dw OR dx -> dy\n" +
                "gj AND gu -> gw\n" +
                "jg AND ji -> jj\n" +
                "jr OR js -> jt\n" +
                "bl OR bm -> bn\n" +
                "gj RSHIFT 2 -> gk\n" +
                "cj OR cp -> cq\n" +
                "gj OR gu -> gv\n" +
                "b OR n -> o\n" +
                "o AND q -> r\n" +
                "bi LSHIFT 15 -> bm\n" +
                "dy RSHIFT 1 -> er\n" +
                "cu AND cw -> cx\n" +
                "iw OR ix -> iy\n" +
                "hc OR hd -> he\n" +
                "0 -> c\n" +
                "db OR dc -> dd\n" +
                "kk RSHIFT 2 -> kl\n" +
                "eq LSHIFT 1 -> fk\n" +
                "dz OR ef -> eg\n" +
                "NOT ed -> ee\n" +
                "lw OR lv -> lx\n" +
                "fw AND fy -> fz\n" +
                "dz AND ef -> eh\n" +
                "jp RSHIFT 3 -> jr\n" +
                "lg AND lm -> lo\n" +
                "ci RSHIFT 2 -> cj\n" +
                "be AND bg -> bh\n" +
                "lc LSHIFT 1 -> lw\n" +
                "hm AND ho -> hp\n" +
                "jr AND js -> ju\n" +
                "1 AND io -> ip\n" +
                "cm AND co -> cp\n" +
                "ib OR ic -> id\n" +
                "NOT bf -> bg\n" +
                "fo RSHIFT 5 -> fr\n" +
                "ip LSHIFT 15 -> it\n" +
                "jt AND jv -> jw\n" +
                "jc AND je -> jf\n" +
                "du OR dt -> dv\n" +
                "NOT fx -> fy\n" +
                "aw AND ay -> az\n" +
                "ge LSHIFT 15 -> gi\n" +
                "NOT ak -> al\n" +
                "fm OR fn -> fo\n" +
                "ff AND fh -> fi\n" +
                "ci RSHIFT 5 -> cl\n" +
                "cz OR cy -> da\n" +
                "NOT ey -> ez\n" +
                "NOT ju -> jv\n" +
                "NOT ls -> lt\n" +
                "kk AND kv -> kx\n" +
                "NOT ii -> ij\n" +
                "kl AND kr -> kt\n" +
                "jk LSHIFT 15 -> jo\n" +
                "e OR f -> g\n" +
                "NOT bs -> bt\n" +
                "hi AND hk -> hl\n" +
                "hz OR ik -> il\n" +
                "ek AND em -> en\n" +
                "ao OR an -> ap\n" +
                "dv LSHIFT 1 -> ep\n" +
                "an LSHIFT 15 -> ar\n" +
                "fo RSHIFT 1 -> gh\n" +
                "NOT im -> in\n" +
                "kk RSHIFT 1 -> ld\n" +
                "hw LSHIFT 1 -> iq\n" +
                "ec AND ee -> ef\n" +
                "hb LSHIFT 1 -> hv\n" +
                "kb AND kd -> ke\n" +
                "x AND ai -> ak\n" +
                "dd AND do -> dq\n" +
                "aq OR ar -> as\n" +
                "iq OR ip -> ir\n" +
                "dl AND dn -> do\n" +
                "iu RSHIFT 5 -> ix\n" +
                "as OR bd -> be\n" +
                "NOT go -> gp\n" +
                "fk OR fj -> fl\n" +
                "jm LSHIFT 1 -> kg\n" +
                "NOT cv -> cw\n" +
                "dp AND dr -> ds\n" +
                "dt LSHIFT 15 -> dx\n" +
                "et RSHIFT 1 -> fm\n" +
                "dy RSHIFT 3 -> ea\n" +
                "fp AND fv -> fx\n" +
                "NOT p -> q\n" +
                "dd RSHIFT 2 -> de\n" +
                "eu AND fa -> fc\n" +
                "ba AND bc -> bd\n" +
                "dh AND dj -> dk\n" +
                "lr AND lt -> lu\n" +
                "he RSHIFT 1 -> hx\n" +
                "ex AND ez -> fa\n" +
                "df OR dg -> dh\n" +
                "fj LSHIFT 15 -> fn\n" +
                "NOT kx -> ky\n" +
                "gk OR gq -> gr\n" +
                "dy RSHIFT 2 -> dz\n" +
                "gh OR gi -> gj\n" +
                "lj AND ll -> lm\n" +
                "x OR ai -> aj\n" +
                "bz AND cb -> cc\n" +
                "1 AND lu -> lv\n" +
                "as RSHIFT 3 -> au\n" +
                "ce OR cd -> cf\n" +
                "il AND in -> io\n" +
                "dd RSHIFT 1 -> dw\n" +
                "NOT lo -> lp\n" +
                "c LSHIFT 1 -> t\n" +
                "dd RSHIFT 3 -> df\n" +
                "dd RSHIFT 5 -> dg\n" +
                "lh AND li -> lk\n" +
                "lf RSHIFT 5 -> li\n" +
                "dy RSHIFT 5 -> eb\n" +
                "NOT kt -> ku\n" +
                "at OR az -> ba\n" +
                "x RSHIFT 3 -> z\n" +
                "NOT lk -> ll\n" +
                "lb OR la -> lc\n" +
                "1 AND r -> s\n" +
                "lh OR li -> lj\n" +
                "ln AND lp -> lq\n" +
                "kk RSHIFT 5 -> kn\n" +
                "ea OR eb -> ec\n" +
                "ci AND ct -> cv\n" +
                "b RSHIFT 2 -> d\n" +
                "jp RSHIFT 1 -> ki\n" +
                "NOT cr -> cs\n" +
                "NOT jd -> je\n" +
                "jp RSHIFT 2 -> jq\n" +
                "jn OR jo -> jp\n" +
                "lf RSHIFT 3 -> lh\n" +
                "1 AND ds -> dt\n" +
                "lf AND lq -> ls\n" +
                "la LSHIFT 15 -> le\n" +
                "NOT fg -> fh\n" +
                "at AND az -> bb\n" +
                "au AND av -> ax\n" +
                "kw AND ky -> kz\n" +
                "v OR w -> x\n" +
                "kk OR kv -> kw\n" +
                "ks AND ku -> kv\n" +
                "kh LSHIFT 1 -> lb\n" +
                "1 AND kz -> la\n" +
                "NOT kc -> kd\n" +
                "x RSHIFT 2 -> y\n" +
                "et OR fe -> ff\n" +
                "et AND fe -> fg\n" +
                "NOT ac -> ad\n" +
                "jl OR jk -> jm\n" +
                "1 AND jj -> jk\n" +
                "bn RSHIFT 1 -> cg\n" +
                "NOT kp -> kq\n" +
                "ci RSHIFT 3 -> ck\n" +
                "ev AND ew -> ey\n" +
                "1 AND ke -> kf\n" +
                "cj AND cp -> cr\n" +
                "ir LSHIFT 1 -> jl\n" +
                "NOT gw -> gx\n" +
                "as RSHIFT 2 -> at\n" +
                "iu RSHIFT 1 -> jn\n" +
                "cy LSHIFT 15 -> dc\n" +
                "hg OR hh -> hi\n" +
                "ci RSHIFT 1 -> db\n" +
                "au OR av -> aw\n" +
                "km AND kn -> kp\n" +
                "gj RSHIFT 1 -> hc\n" +
                "iu RSHIFT 2 -> iv\n" +
                "ab AND ad -> ae\n" +
                "da LSHIFT 1 -> du\n" +
                "NOT bw -> bx\n" +
                "km OR kn -> ko\n" +
                "ko AND kq -> kr\n" +
                "bv AND bx -> by\n" +
                "kl OR kr -> ks\n" +
                "1 AND ht -> hu\n" +
                "df AND dg -> di\n" +
                "NOT ag -> ah\n" +
                "d OR j -> k\n" +
                "d AND j -> l\n" +
                "b AND n -> p\n" +
                "gf OR ge -> gg\n" +
                "gg LSHIFT 1 -> ha\n" +
                "bn RSHIFT 5 -> bq\n" +
                "bo OR bu -> bv\n" +
                "1 AND gy -> gz\n" +
                "s LSHIFT 15 -> w\n" +
                "NOT ie -> if\n" +
                "as RSHIFT 5 -> av\n" +
                "bo AND bu -> bw\n" +
                "hz AND ik -> im\n" +
                "bp AND bq -> bs\n" +
                "b RSHIFT 1 -> v\n" +
                "NOT l -> m\n" +
                "bp OR bq -> br\n" +
                "g AND i -> j\n" +
                "br AND bt -> bu\n" +
                "t OR s -> u\n" +
                "hz RSHIFT 5 -> ic\n" +
                "gk AND gq -> gs\n" +
                "fl LSHIFT 1 -> gf\n" +
                "he RSHIFT 3 -> hg\n" +
                "gz LSHIFT 15 -> hd\n" +
                "hf OR hl -> hm\n" +
                "1 AND gd -> ge\n" +
                "fo OR fz -> ga\n" +
                "id AND if -> ig\n" +
                "fo AND fz -> gb\n" +
                "gr AND gt -> gu\n" +
                "he OR hp -> hq\n" +
                "fq AND fr -> ft\n" +
                "ga AND gc -> gd\n" +
                "fo RSHIFT 2 -> fp\n" +
                "gl OR gm -> gn\n" +
                "hg AND hh -> hj\n" +
                "NOT hn -> ho\n" +
                "gl AND gm -> go\n" +
                "he RSHIFT 5 -> hh\n" +
                "NOT gb -> gc\n" +
                "hq AND hs -> ht\n" +
                "hz RSHIFT 3 -> ib\n" +
                "hz RSHIFT 2 -> ia\n" +
                "fq OR fr -> fs\n" +
                "hx OR hy -> hz\n" +
                "he AND hp -> hr\n" +
                "gj RSHIFT 5 -> gm\n" +
                "hf AND hl -> hn\n" +
                "hv OR hu -> hw\n" +
                "NOT hj -> hk\n" +
                "gj RSHIFT 3 -> gl\n" +
                "fo RSHIFT 3 -> fq\n" +
                "he RSHIFT 2 -> hf"
        };

        @Test
        void part1() {
            ex.input = inputs[0];

            ex.args = new String[] {"d"};
            Assertions.assertThat(ex.answer1()).isEqualTo("72");

            ex.args[0] = "e";
            Assertions.assertThat(ex.answer1()).isEqualTo("507");

            ex.args[0] = "f";
            Assertions.assertThat(ex.answer1()).isEqualTo("492");

            ex.args[0] = "g";
            Assertions.assertThat(ex.answer1()).isEqualTo("114");

            ex.args[0] = "h";
            Assertions.assertThat(ex.answer1()).isEqualTo("65412");

            ex.args[0] = "i";
            Assertions.assertThat(ex.answer1()).isEqualTo("65079");

            ex.args[0] = "x";
            Assertions.assertThat(ex.answer1()).isEqualTo("123");

            ex.args[0] = "y";
            Assertions.assertThat(ex.answer1()).isEqualTo("456");
        }

        @Test
        void part2() {
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("14710");
        }
    }



    @Nested
    class day08
    {
        AOCExercise ex = new Matchsticks();
        String[] inputs = new String[]{
                "\"\"",
                "\"abc\"",
                "\"aaa\\\"aaa\"",
                "\"\\x27\"",

                "\"\"\n" +
                "\"abc\"\n" +
                "\"aaa\\\"aaa\"\n" +
                "\"\\x27\""
        };

        @Test
        void part1() {

            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("2");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("2");

            ex.input = inputs[2];
            Assertions.assertThat(ex.answer1()).isEqualTo("3");

            ex.input = inputs[3];
            Assertions.assertThat(ex.answer1()).isEqualTo("5");

            ex.input = inputs[4];
            Assertions.assertThat(ex.answer1()).isEqualTo("12");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer2()).isEqualTo("4");

            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("4");

            ex.input = inputs[2];
            Assertions.assertThat(ex.answer2()).isEqualTo("6");

            ex.input = inputs[3];
            Assertions.assertThat(ex.answer2()).isEqualTo("5");

            ex.input = inputs[4];
            Assertions.assertThat(ex.answer2()).isEqualTo("19");
        }
    }


    @Nested
    class day09
    {
        AOCExercise ex = new All_in_a_Single_Night();
        String[] inputs = new String[] {
                //0
                "London to Dublin = 464\n" +
                "London to Belfast = 518\n" +
                "Dublin to Belfast = 141",
                //1
                "Tristram to AlphaCentauri = 34\n" +
                "Tristram to Snowdin = 100\n" +
                "Tristram to Tambi = 63\n" +
                "Tristram to Faerun = 108\n" +
                "Tristram to Norrath = 111\n" +
                "Tristram to Straylight = 89\n" +
                "Tristram to Arbre = 132\n" +
                "AlphaCentauri to Snowdin = 4\n" +
                "AlphaCentauri to Tambi = 79\n" +
                "AlphaCentauri to Faerun = 44\n" +
                "AlphaCentauri to Norrath = 147\n" +
                "AlphaCentauri to Straylight = 133\n" +
                "AlphaCentauri to Arbre = 74\n" +
                "Snowdin to Tambi = 105\n" +
                "Snowdin to Faerun = 95\n" +
                "Snowdin to Norrath = 48\n" +
                "Snowdin to Straylight = 88\n" +
                "Snowdin to Arbre = 7\n" +
                "Tambi to Faerun = 68\n" +
                "Tambi to Norrath = 134\n" +
                "Tambi to Straylight = 107\n" +
                "Tambi to Arbre = 40\n" +
                "Faerun to Norrath = 11\n" +
                "Faerun to Straylight = 66\n" +
                "Faerun to Arbre = 144\n" +
                "Norrath to Straylight = 115\n" +
                "Norrath to Arbre = 135\n" +
                "Straylight to Arbre = 127"
        };

        @Test
        void part1()
        {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("605");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("251");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer2()).isEqualTo("982");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("898");
        }
    }

    @Nested
    class day10
    {
        AOCExercise ex = new Elves_look_Elves_Say();

        @Test
        void part1()
        {
            ex.setArgs(new String[] {"1"});
            ex.input = "1";
            Assertions.assertThat(ex.answer1()).isEqualTo("2");
            ex.input = "11";
            Assertions.assertThat(ex.answer1()).isEqualTo("2");
            ex.input = "21";
            Assertions.assertThat(ex.answer1()).isEqualTo("4");
            ex.input = "1211";
            Assertions.assertThat(ex.answer1()).isEqualTo("6");
            ex.input = "111221";
            Assertions.assertThat(ex.answer1()).isEqualTo("6");

            ex.setArgs(new String[] {"40"});
            ex.input = "1113122113";
            Assertions.assertThat(ex.answer1()).isEqualTo("360154");

            ex.setArgs(new String[] {"50"});
            ex.input = "1113122113";
            Assertions.assertThat(ex.answer1()).isEqualTo("5103798");
        }

        @Test
        void part2()
        {
            ex.setArgs(new String[] {"50"});
            ex.input = "1113122113";
            Assertions.assertThat(ex.answer2()).isEqualTo("5103798");
        }
    }

    @Nested
    class day11
    {
        AOCExercise ex = new Corporate_Policy();
        @Test
        void part1()
        {
            ex.input = "abcdefgh";
            Assertions.assertThat(ex.answer1()).isEqualTo("abcdffaa");
            ex.input = "ghijklmn";
            Assertions.assertThat(ex.answer1()).isEqualTo("ghjaabcc");
            ex.input = "vzbxkghb";
            Assertions.assertThat(ex.answer1()).isEqualTo("vzbxxyzz");
        }

        @Test
        void part2()
        {
            ex.input = "vzbxkghb";
            Assertions.assertThat(ex.answer2()).isEqualTo("vzcaabcc");
        }
    }

    @Nested
    class day12
    {
        AOCExercise ex = new JSAbacusFrameworkIO();
        String[] inputs = new String[] {
                //0
                "{\"e\":{\"a\":{\"e\":-39,\"c\":119,\"a\":{\"c\":65,\"a\":\"orange\",\"b\":\"green\",\"d\":\"orange\"},\"g\":\"violet\",\"b\":{\"e\":6,\"c\":{\"c\":\"violet\",\"a\":8,\"b\":[\"red\",{\"a\":37},\"green\",84,\"yellow\",\"green\",[24,45,\"blue\",\"blue\",56,\"yellow\"],\"orange\"]},\"a\":\"violet\",\"b\":{\"a\":85},\"d\":[109,66,[\"yellow\",\"violet\",21,-30],\"violet\",\"blue\",-43,{\"e\":\"violet\",\"c\":\"red\",\"a\":\"blue\",\"b\":-22,\"d\":[71,\"red\",30,\"violet\",\"red\",26,120],\"f\":[\"red\"]},\"red\"]},\"d\":{\"e\":\"violet\",\"a\":\"blue\",\"d\":\"blue\",\"c\":\"blue\",\"h\":\"orange\",\"b\":{\"e\":\"red\",\"a\":{\"c\":115,\"a\":137,\"b\":\"green\"},\"d\":-25,\"c\":\"blue\",\"h\":{\"a\":161,\"b\":[\"yellow\",56,129,-31,\"yellow\",\"red\",\"green\",105,\"orange\",130]},\"b\":142,\"g\":194,\"f\":122,\"i\":-16},\"g\":173,\"f\":[\"orange\",\"green\",54,-9],\"i\":-23},\"f\":{\"c\":110,\"a\":\"yellow\",\"b\":[{\"a\":155},156,\"violet\",94,\"yellow\"],\"d\":{\"e\":91,\"a\":-18,\"d\":\"red\",\"c\":[\"green\",\"orange\",\"orange\",190,\"yellow\",158,\"blue\",\"orange\",\"blue\",4],\"h\":143,\"b\":\"orange\",\"g\":145,\"f\":[\"orange\",37,\"yellow\",-22,{\"c\":30,\"a\":78,\"b\":196,\"d\":84},-7,[\"yellow\"]]}}},\"b\":[[{\"c\":0,\"a\":108,\"b\":\"green\",\"d\":{\"e\":59,\"c\":119,\"a\":104,\"b\":167,\"d\":\"blue\"}},[189,\"blue\",121,[[\"green\",\"orange\",\"orange\",-17,192,\"red\"],{\"a\":\"violet\"},\"green\",{\"c\":42,\"a\":\"blue\",\"b\":\"red\"},{\"e\":78,\"a\":\"blue\",\"d\":\"violet\",\"c\":-9,\"h\":\"violet\",\"b\":115,\"g\":\"orange\",\"f\":\"violet\",\"i\":\"red\"}],57,\"violet\"],\"green\"],[[\"blue\",[1,53,\"orange\"],{\"e\":[\"green\",-12,\"blue\",\"orange\",\"green\",136,173],\"a\":\"violet\",\"d\":-43,\"c\":{\"e\":144,\"c\":133,\"a\":\"yellow\",\"g\":154,\"b\":\"orange\",\"d\":127,\"f\":194},\"h\":{\"e\":52,\"a\":-43,\"d\":\"orange\",\"c\":-45,\"h\":\"orange\",\"b\":150,\"g\":-12,\"f\":91,\"i\":6},\"b\":{\"e\":\"yellow\",\"c\":\"blue\",\"a\":\"violet\",\"g\":112,\"b\":174,\"d\":\"violet\",\"f\":90},\"g\":177,\"f\":\"blue\"},\"red\",\"violet\",96],\"green\",\"violet\",[{\"a\":[\"red\",\"red\",46,\"red\"],\"b\":[\"green\",193,54,\"orange\"]},[\"orange\",8,1,[\"violet\",84,\"violet\"],155,\"yellow\",151,\"blue\",196],\"yellow\",\"red\",{\"a\":[\"green\",\"orange\",\"green\",61,\"blue\",39,-2,46,\"red\",54]},\"violet\",128]]]},\"a\":{\"e\":[{\"e\":[\"yellow\"],\"c\":93,\"a\":\"violet\",\"b\":{\"a\":{\"a\":\"yellow\",\"b\":\"blue\"},\"b\":-4},\"d\":\"violet\"},171,103,[13,\"orange\",[[51,\"violet\",\"yellow\",{\"c\":85,\"a\":103,\"b\":\"green\"},97,{\"e\":\"orange\",\"a\":-11,\"d\":62,\"j\":\"yellow\",\"c\":\"orange\",\"h\":47,\"b\":83,\"g\":119,\"f\":180,\"i\":136},{\"a\":177},80],{\"e\":{\"c\":\"yellow\",\"a\":\"orange\",\"b\":3,\"d\":197},\"a\":130,\"d\":\"red\",\"j\":\"red\",\"c\":-44,\"h\":-15,\"b\":64,\"g\":125,\"f\":82,\"i\":\"green\"}],{\"e\":[\"orange\",42,[\"orange\",197,\"violet\",\"yellow\",\"blue\",11,\"yellow\"],189,\"yellow\",\"blue\",\"green\",\"violet\"],\"a\":{\"a\":149,\"b\":69},\"d\":128,\"c\":[[\"green\",150,45,86,\"red\",-8,41,\"orange\",\"blue\"]],\"h\":[[-4,127,\"yellow\",\"violet\",124,112,196,\"violet\",161,40],37,0,\"orange\",-30,-43,[-24,\"orange\",142,\"violet\",\"red\"],\"blue\",66],\"b\":{\"c\":\"violet\",\"a\":[\"yellow\",91,182,20,\"orange\",159,46,55,141],\"b\":{\"c\":173,\"a\":-40,\"b\":\"green\",\"d\":\"violet\"},\"d\":[67,80,27,-15]},\"g\":\"red\",\"f\":{\"c\":\"orange\",\"a\":99,\"b\":\"green\"}},{\"e\":{\"c\":40,\"a\":\"orange\",\"b\":\"green\"},\"c\":\"green\",\"a\":-44,\"b\":{\"e\":\"blue\",\"c\":56,\"a\":\"yellow\",\"g\":62,\"b\":188,\"d\":141,\"f\":-21},\"d\":\"yellow\",\"f\":{\"e\":\"yellow\",\"c\":67,\"a\":33,\"g\":\"yellow\",\"b\":\"yellow\",\"d\":51,\"f\":195}}],[\"orange\",\"violet\",[\"red\"],[\"green\",35,[170,-30,\"orange\",140,\"green\",\"violet\",\"violet\",[\"orange\",\"yellow\",\"yellow\",35,\"blue\",\"violet\",-36,182,\"yellow\",141],146]],{\"a\":61,\"b\":\"orange\"},[31,\"blue\",\"green\",65,\"red\",\"green\"],\"violet\"],{\"c\":\"blue\",\"a\":[\"blue\"],\"b\":17},95],\"c\":[[48,\"blue\",[49],\"orange\",{\"e\":\"violet\",\"c\":\"green\",\"a\":\"red\",\"b\":\"red\",\"d\":-29,\"f\":[\"orange\",20,190,97,[\"orange\",\"blue\",-30,\"blue\",\"green\"],\"blue\",\"yellow\",-47,[123,\"yellow\",\"green\"],-41]},\"green\",{\"a\":170,\"b\":32},[{\"c\":\"green\",\"a\":\"violet\",\"b\":\"red\"},[\"yellow\",36,\"yellow\",\"violet\",149,{\"e\":\"red\",\"c\":141,\"a\":-24,\"b\":\"yellow\",\"d\":-13,\"f\":\"red\"},69,\"orange\",19,[87,\"red\",167,\"red\",77,110]],\"orange\",\"violet\"],{\"a\":-16}],[[\"red\"],\"violet\"],{\"a\":[[\"red\",83,{\"e\":\"red\",\"c\":\"blue\",\"a\":\"blue\",\"b\":\"orange\",\"d\":\"orange\"},49,\"green\",\"violet\"],{\"e\":\"yellow\",\"a\":\"violet\",\"d\":17,\"j\":\"green\",\"c\":{\"e\":\"orange\",\"c\":\"green\",\"a\":\"green\",\"b\":99,\"d\":\"yellow\",\"f\":\"orange\"},\"h\":9,\"b\":159,\"g\":\"yellow\",\"f\":167,\"i\":147},[\"blue\",\"green\",\"violet\"],\"yellow\",[\"violet\",197,\"blue\",[170,81,\"yellow\",\"orange\",196],-24,99,193],-8,[\"red\",81,-11,\"green\",\"red\",\"blue\",\"yellow\",\"blue\",[\"blue\",\"violet\",131,184,160,-1]],\"green\"]},\"orange\"],\"a\":[{\"e\":\"blue\",\"a\":\"violet\",\"d\":[{\"a\":\"blue\",\"b\":46},\"violet\",72,35,61,161],\"j\":[\"green\",78,144,[168,[\"red\",77,38,\"green\",\"red\"],\"green\",\"yellow\",-8,\"yellow\"],190,40,\"yellow\",17,171],\"c\":{\"e\":\"red\",\"c\":\"violet\",\"a\":\"violet\",\"b\":-14,\"d\":\"red\",\"f\":167},\"h\":[[[83,\"green\",69,\"red\"],\"green\",155,133],106,1,\"orange\"],\"b\":-41,\"g\":{\"a\":27},\"f\":\"red\",\"i\":{\"e\":\"green\",\"c\":\"green\",\"a\":182,\"g\":\"orange\",\"b\":\"orange\",\"d\":[\"orange\"],\"f\":\"orange\"}},\"yellow\",\"green\",-26],\"b\":{\"e\":[-32,-11,{\"e\":\"red\",\"c\":\"yellow\",\"a\":{\"e\":\"green\",\"a\":\"red\",\"d\":105,\"c\":-20,\"h\":85,\"b\":{\"e\":47,\"a\":89,\"d\":\"green\",\"c\":\"violet\",\"h\":\"orange\",\"b\":\"green\",\"g\":140,\"f\":\"green\"},\"g\":111,\"f\":\"orange\",\"i\":\"yellow\"},\"b\":143,\"d\":{\"e\":{\"e\":\"orange\",\"c\":129,\"a\":\"blue\",\"b\":142,\"d\":\"violet\"},\"c\":\"blue\",\"a\":122,\"b\":[\"violet\",\"orange\",84,\"orange\"],\"d\":\"red\",\"f\":\"blue\"}},58,[147]],\"a\":{\"e\":\"orange\",\"c\":[{\"e\":141,\"c\":114,\"a\":137,\"g\":\"orange\",\"b\":61,\"d\":105,\"f\":33}],\"a\":[\"red\",\"red\",{\"e\":\"green\",\"c\":4,\"a\":\"violet\",\"b\":\"red\",\"d\":\"blue\"},\"yellow\",[\"green\",15,\"green\",-40,149,\"orange\",{\"e\":-7,\"c\":74,\"a\":\"red\",\"b\":\"green\",\"d\":32}],\"blue\",\"yellow\",146,[191,\"blue\",[\"orange\",\"blue\",187,\"blue\",\"orange\",127,\"yellow\",38],120,161,55,-30,\"green\",-10,\"violet\"],\"orange\"],\"b\":{\"a\":-32,\"b\":\"blue\"},\"d\":{\"e\":[\"green\",27],\"c\":[94,\"violet\",\"red\",18,166,\"yellow\"],\"a\":{\"e\":\"green\",\"a\":95,\"d\":\"green\",\"j\":176,\"c\":84,\"h\":\"violet\",\"b\":\"yellow\",\"g\":-25,\"f\":51,\"i\":119},\"b\":144,\"d\":{\"c\":\"violet\",\"a\":\"yellow\",\"b\":\"red\"}}},\"d\":{\"e\":{\"e\":140,\"a\":{\"e\":\"green\",\"c\":\"green\",\"a\":0,\"b\":68,\"d\":152,\"f\":\"red\"},\"d\":[\"blue\",6],\"c\":-29,\"h\":\"green\",\"b\":[\"violet\",106,\"violet\",\"orange\",-38,175],\"g\":54,\"f\":[177,31,\"violet\",\"yellow\"],\"i\":185},\"a\":\"green\",\"d\":[111,49,\"yellow\",\"blue\",\"orange\",{\"e\":\"yellow\",\"a\":\"orange\",\"d\":\"violet\",\"j\":\"blue\",\"c\":\"red\",\"h\":88,\"b\":-1,\"g\":\"red\",\"f\":\"red\",\"i\":{\"e\":121,\"a\":112,\"d\":195,\"j\":103,\"c\":94,\"h\":\"red\",\"b\":12,\"g\":8,\"f\":22,\"i\":\"orange\"}},64,[\"violet\",[\"blue\",76,\"blue\",\"red\",\"red\"],[\"violet\",\"blue\",\"orange\",\"yellow\",144],185,{\"a\":66,\"b\":\"orange\"},199,\"green\",\"green\"],14],\"c\":{\"e\":\"green\",\"a\":\"orange\",\"d\":{\"c\":[-23,189,-11,\"green\",\"violet\",178,-4,\"blue\",68,\"violet\"],\"a\":[\"orange\",\"red\"],\"b\":\"yellow\",\"d\":\"yellow\"},\"j\":{\"c\":-33,\"a\":\"blue\",\"b\":\"violet\"},\"c\":107,\"h\":{\"e\":-16,\"a\":174,\"d\":{\"e\":\"orange\",\"c\":\"green\",\"a\":-28,\"b\":-30,\"d\":73},\"j\":\"yellow\",\"c\":\"orange\",\"h\":\"orange\",\"b\":[\"blue\",\"violet\",-4,76,\"red\",\"red\"],\"g\":59,\"f\":12,\"i\":199},\"b\":{\"a\":\"green\",\"b\":54},\"g\":\"violet\",\"f\":174,\"i\":[\"orange\",41,85,\"yellow\",\"green\",25,\"red\",-20,156,143]},\"h\":\"yellow\",\"b\":\"red\",\"g\":90,\"f\":-37,\"i\":{\"a\":146,\"b\":\"violet\"}},\"j\":\"blue\",\"c\":[1,[\"yellow\",-11,\"green\",66,\"red\",90,\"green\",\"yellow\",3,{\"e\":-34,\"a\":194,\"d\":\"green\",\"c\":[-11,\"yellow\"],\"h\":59,\"b\":\"yellow\",\"g\":\"blue\",\"f\":162,\"i\":\"violet\"}],81,158,170],\"h\":\"blue\",\"b\":\"green\",\"g\":[\"violet\",[\"blue\",\"blue\"]],\"f\":[-44,\"yellow\",[35,[122,\"red\",\"yellow\",{\"a\":\"red\",\"b\":\"violet\"},\"blue\",\"orange\",\"violet\"],\"violet\",{\"e\":-48,\"a\":6,\"d\":-6,\"c\":4,\"h\":\"yellow\",\"b\":\"blue\",\"g\":\"red\",\"f\":\"red\"}],[{\"e\":-2,\"a\":156,\"d\":\"red\",\"j\":69,\"c\":0,\"h\":\"violet\",\"b\":\"orange\",\"g\":61,\"f\":102,\"i\":[\"orange\",\"blue\",\"violet\",-1,137]},{\"a\":183,\"b\":89}],{\"a\":167,\"b\":\"orange\"},193,95,[97,[66,154,-32,\"orange\",121,{\"e\":198,\"a\":\"blue\",\"d\":102,\"c\":\"red\",\"h\":\"green\",\"b\":135,\"g\":\"orange\",\"f\":-49,\"i\":151},97,7,\"red\"],195,\"blue\",49,\"green\",10]],\"i\":[\"violet\",1,{\"e\":\"orange\",\"c\":196,\"a\":\"blue\",\"g\":\"red\",\"b\":190,\"d\":87,\"f\":128},\"blue\",128,147]},\"d\":[[{\"a\":\"green\",\"b\":43},169,-8,\"orange\",{\"a\":[\"violet\",[\"red\",\"violet\",\"orange\",\"yellow\",-49,\"violet\",-25],\"violet\",60,33,\"violet\",[\"yellow\",\"orange\",31,144,\"red\",\"yellow\",73,\"orange\",\"red\",\"green\"],[\"green\",-31,\"red\"],\"orange\",\"blue\"]},\"violet\",\"blue\"],40,154,{\"a\":{\"c\":\"violet\",\"a\":145,\"b\":166,\"d\":[\"blue\",[\"blue\",125,185,\"yellow\",\"red\",152,89,-18,\"blue\",141],26,2,35,\"orange\",190]}},170,\"violet\",-31,[[151,\"orange\",\"green\",[\"blue\",114,-5,\"yellow\"],\"blue\",\"green\",\"orange\",\"yellow\",62,{\"c\":22,\"a\":\"green\",\"b\":\"blue\"}],17,[176],\"violet\",129,67,{\"c\":{\"c\":\"red\",\"a\":140,\"b\":25},\"a\":[\"blue\",\"green\",163],\"b\":30,\"d\":[60,\"green\",\"red\",126,[48,\"green\"],-26,[\"yellow\",\"green\",150,\"red\",\"violet\",\"red\",\"violet\",59,-12],167,\"yellow\"]},\"yellow\",\"yellow\"],\"blue\"]},\"d\":{\"c\":\"green\",\"a\":52,\"b\":[136,{\"c\":{\"a\":[197,[\"orange\",\"red\",138,67,\"orange\",172,2,\"orange\"],\"red\"]},\"a\":\"violet\",\"b\":{\"a\":{\"e\":172,\"c\":171,\"a\":\"yellow\",\"b\":191,\"d\":{\"e\":171,\"a\":\"red\",\"d\":\"violet\",\"c\":\"green\",\"h\":\"yellow\",\"b\":\"yellow\",\"g\":73,\"f\":\"yellow\"}}},\"d\":[86,-11,-5,[\"orange\",\"green\",64,[\"blue\",15,\"orange\",\"yellow\",\"violet\",181,\"green\",\"blue\"],\"yellow\",\"yellow\",{\"e\":27,\"c\":156,\"a\":\"blue\",\"g\":\"violet\",\"b\":38,\"d\":51,\"f\":23},\"orange\",\"violet\"],10]},[55,{\"e\":191,\"c\":\"blue\",\"a\":\"orange\",\"b\":\"yellow\",\"d\":109},\"blue\",{\"c\":164,\"a\":[198,-9,183,{\"e\":14,\"a\":176,\"d\":117,\"c\":\"violet\",\"h\":\"violet\",\"b\":-44,\"g\":\"violet\",\"f\":\"red\",\"i\":\"orange\"},\"yellow\",0],\"b\":58,\"d\":33},\"red\",[125,23,\"blue\",149,[[\"blue\",-44,22,133,\"orange\",\"yellow\",\"yellow\",\"violet\",\"violet\",131],\"violet\",-1,\"red\",66,\"blue\"],\"green\",\"red\",\"red\",[-31,\"blue\",[\"orange\",\"orange\",\"yellow\",44,\"green\",\"yellow\",\"green\",160,\"violet\"],\"yellow\",[\"orange\",\"violet\",\"green\",\"violet\",194,\"blue\",-27],\"green\",{\"e\":\"violet\",\"a\":\"red\",\"d\":67,\"c\":68,\"h\":\"blue\",\"b\":\"orange\",\"g\":\"orange\",\"f\":\"violet\",\"i\":\"violet\"},\"yellow\"]],\"violet\",[59,158,{\"e\":\"blue\",\"c\":\"blue\",\"a\":\"orange\",\"g\":73,\"b\":97,\"d\":\"red\",\"f\":\"orange\"}],[\"red\",[31,[95,72,\"orange\",\"yellow\"],\"blue\",192,63],[197,\"green\",{\"e\":112,\"a\":\"violet\",\"d\":\"blue\",\"c\":-2,\"h\":\"blue\",\"b\":\"green\",\"g\":124,\"f\":\"blue\"},177,\"green\",\"blue\",162,107]]],43,[{\"e\":\"red\",\"c\":{\"e\":[\"green\",-33,11,154,\"yellow\",-4],\"c\":\"yellow\",\"a\":[7,\"orange\",\"orange\",\"yellow\",118,169,\"red\",\"blue\"],\"b\":\"green\",\"d\":114},\"a\":{\"e\":\"green\",\"a\":\"green\",\"d\":187,\"j\":{\"e\":106,\"c\":-41,\"a\":\"violet\",\"b\":173,\"d\":12},\"c\":\"red\",\"h\":\"violet\",\"b\":-4,\"g\":{\"c\":\"violet\",\"a\":-26,\"b\":87,\"d\":-33},\"f\":\"green\",\"i\":-46},\"b\":\"green\",\"d\":13,\"f\":\"yellow\"}],[\"blue\",\"violet\",\"orange\",\"red\",{\"e\":\"green\",\"a\":[\"violet\",140,[76,\"green\",94,33,\"green\",31,\"orange\",53],\"violet\",\"yellow\",\"violet\",\"blue\",[\"blue\",196,\"orange\",\"yellow\",\"orange\",-42,\"orange\",171,-47,\"violet\"],\"green\",110],\"d\":31,\"c\":\"orange\",\"h\":{\"e\":-45,\"a\":\"green\",\"d\":[\"violet\"],\"c\":\"red\",\"h\":105,\"b\":130,\"g\":-36,\"f\":\"orange\",\"i\":{\"e\":\"red\",\"c\":137,\"a\":54,\"g\":\"blue\",\"b\":\"violet\",\"d\":102,\"f\":178}},\"b\":-41,\"g\":{\"e\":6,\"a\":-25,\"d\":66,\"j\":\"violet\",\"c\":39,\"h\":30,\"b\":63,\"g\":46,\"f\":56,\"i\":\"blue\"},\"f\":6,\"i\":\"violet\"},[84,175,\"orange\",{\"a\":\"green\"},\"green\",66,{\"e\":\"red\",\"a\":{\"a\":178,\"b\":\"yellow\"},\"d\":\"yellow\",\"c\":[\"red\",\"red\",38,\"orange\",\"blue\",136,\"red\",137,\"red\"],\"h\":163,\"b\":[\"orange\",84,\"red\",178],\"g\":65,\"f\":\"blue\"}],[98,\"yellow\",[46,\"orange\",\"yellow\",\"yellow\"],\"blue\",151,189,[\"yellow\",{\"e\":\"orange\",\"a\":27,\"d\":45,\"c\":48,\"h\":\"green\",\"b\":90,\"g\":180,\"f\":-43},\"yellow\"],\"blue\"],{\"a\":\"green\"},\"blue\",{\"c\":37,\"a\":{\"e\":59,\"c\":[\"blue\"],\"a\":\"yellow\",\"g\":38,\"b\":\"blue\",\"d\":\"violet\",\"f\":\"orange\"},\"b\":\"orange\",\"d\":\"violet\"}],{\"c\":75,\"a\":{\"e\":{\"a\":130},\"a\":5,\"d\":1,\"c\":72,\"h\":{\"e\":\"red\",\"a\":11,\"d\":157,\"c\":97,\"h\":-24,\"b\":\"red\",\"g\":111,\"f\":21},\"b\":{\"e\":145,\"a\":\"red\",\"d\":\"violet\",\"j\":[-11,191,-43,\"blue\",\"orange\",105,158],\"c\":\"red\",\"h\":143,\"b\":{\"e\":\"orange\",\"c\":\"yellow\",\"a\":-31,\"g\":177,\"b\":\"violet\",\"d\":\"blue\",\"f\":\"green\"},\"g\":\"green\",\"f\":48,\"i\":{\"e\":18,\"a\":142,\"d\":\"yellow\",\"c\":116,\"h\":\"violet\",\"b\":135,\"g\":37,\"f\":36}},\"g\":-26,\"f\":[186,192,\"orange\",117,-9,\"violet\",-19,55,\"green\",167],\"i\":\"green\"},\"b\":\"yellow\",\"d\":{\"a\":138}}]},\"c\":\"blue\",\"h\":[[19],\"orange\",[{\"e\":[\"yellow\",68,28,29,{\"e\":\"red\",\"a\":\"violet\",\"d\":\"green\",\"c\":143,\"h\":\"red\",\"b\":\"orange\",\"g\":44,\"f\":123,\"i\":\"orange\"},38,28,65,{\"e\":-26,\"c\":[\"red\",132,\"red\",124,\"yellow\",115],\"a\":170,\"g\":\"yellow\",\"b\":\"green\",\"d\":-18,\"f\":{\"c\":1,\"a\":\"red\",\"b\":-1}}],\"a\":\"orange\",\"d\":129,\"c\":33,\"h\":\"violet\",\"b\":\"orange\",\"g\":\"green\",\"f\":-24},[\"violet\",-22],[64,-20,{\"e\":46,\"a\":76,\"d\":97,\"c\":-21,\"h\":98,\"b\":\"violet\",\"g\":{\"e\":-7,\"c\":\"violet\",\"a\":190,\"b\":\"violet\",\"d\":138,\"f\":\"violet\"},\"f\":[178,\"blue\",\"blue\"],\"i\":\"red\"},{\"e\":\"orange\",\"c\":\"red\",\"a\":{\"e\":\"orange\",\"a\":[\"green\"],\"d\":[19,\"red\"],\"c\":-32,\"h\":-15,\"b\":\"yellow\",\"g\":116,\"f\":\"blue\",\"i\":\"orange\"},\"b\":96,\"d\":\"green\",\"f\":176},[[104,99,\"yellow\",-13,\"red\",{\"c\":\"blue\",\"a\":\"red\",\"b\":46,\"d\":60},-13,9],-22,-26,133,[\"green\",[\"red\",188,\"green\",\"green\"],166,\"yellow\",{\"e\":\"yellow\",\"c\":197,\"a\":65,\"b\":83,\"d\":-19,\"f\":\"yellow\"},[157,\"violet\",\"blue\",\"yellow\",-30,\"violet\",-3],21,{\"a\":-15}],43,[\"orange\",\"blue\",88,\"yellow\",103,31],\"orange\",-24]],{\"c\":\"violet\",\"a\":{\"a\":26,\"b\":\"yellow\"},\"b\":[\"violet\",\"violet\",{\"e\":102,\"a\":\"red\",\"d\":178,\"j\":187,\"c\":\"orange\",\"h\":\"violet\",\"b\":72,\"g\":-37,\"f\":\"violet\",\"i\":\"orange\"},44,114,\"yellow\",85]}],{\"e\":150,\"c\":\"green\",\"a\":{\"e\":{\"e\":{\"e\":{\"e\":\"orange\",\"a\":48,\"d\":41,\"j\":\"orange\",\"c\":\"orange\",\"h\":30,\"b\":\"yellow\",\"g\":41,\"f\":-40,\"i\":8},\"c\":199,\"a\":32,\"b\":\"yellow\",\"d\":-28},\"a\":46,\"d\":[50,\"red\",\"violet\",63,\"red\",56,-18,\"orange\",\"violet\",\"red\"],\"c\":\"blue\",\"h\":{\"e\":\"green\",\"c\":172,\"a\":\"green\",\"b\":-30,\"d\":22,\"f\":\"yellow\"},\"b\":\"orange\",\"g\":65,\"f\":\"yellow\",\"i\":174},\"a\":\"green\",\"d\":[196,{\"e\":{\"e\":176,\"a\":\"violet\",\"d\":\"orange\",\"j\":-37,\"c\":19,\"h\":31,\"b\":155,\"g\":\"red\",\"f\":106,\"i\":\"green\"},\"c\":\"red\",\"a\":64,\"b\":\"orange\",\"d\":179,\"f\":8},\"yellow\",103,\"violet\",{\"e\":142,\"a\":111,\"d\":\"yellow\",\"c\":\"violet\",\"h\":\"red\",\"b\":148,\"g\":29,\"f\":179,\"i\":\"green\"},-26],\"c\":-19,\"h\":[\"red\",134,\"green\",\"green\",105],\"b\":\"orange\",\"g\":126,\"f\":76,\"i\":158},\"b\":55,\"d\":\"green\"},[[[61],[[\"orange\",\"red\"],[151,\"yellow\",127,\"yellow\",185,\"yellow\",{\"e\":105,\"c\":\"yellow\",\"a\":198,\"b\":\"orange\",\"d\":\"blue\",\"f\":89},140,{\"e\":\"violet\",\"a\":-15,\"d\":169,\"j\":3,\"c\":\"yellow\",\"h\":74,\"b\":-41,\"g\":29,\"f\":112,\"i\":18}]],101,{\"e\":[45,\"green\",\"yellow\",\"blue\",\"violet\",[\"violet\",\"yellow\",159,0,\"orange\",\"yellow\",100,\"green\",\"blue\",49],[5,-37],\"blue\",\"orange\"],\"c\":88,\"a\":\"blue\",\"b\":-32,\"d\":23},77,{\"e\":[\"yellow\",119,197,[\"orange\",-28,\"yellow\",179,130,74,-10,115,\"violet\",79],\"orange\",63,-15,17,\"blue\",\"violet\"],\"c\":{\"e\":164,\"a\":83,\"d\":\"yellow\",\"c\":119,\"h\":\"yellow\",\"b\":148,\"g\":-22,\"f\":[-17,17,\"violet\",\"green\",\"red\"],\"i\":67},\"a\":{\"e\":54,\"a\":147,\"d\":\"yellow\",\"c\":86,\"h\":113,\"b\":\"yellow\",\"g\":77,\"f\":101,\"i\":\"blue\"},\"g\":\"orange\",\"b\":[193,\"orange\",\"orange\",\"red\",39,44,43,-29],\"d\":\"violet\",\"f\":191}],\"orange\",[\"red\",\"violet\",\"yellow\",[\"red\",54,{\"e\":{\"a\":41,\"b\":\"violet\"},\"c\":\"red\",\"a\":{\"e\":\"red\",\"a\":\"yellow\",\"d\":\"green\",\"j\":-33,\"c\":96,\"h\":137,\"b\":\"yellow\",\"g\":30,\"f\":\"green\",\"i\":\"blue\"},\"b\":181,\"d\":\"violet\",\"f\":\"green\"},49,\"yellow\"],\"orange\",\"yellow\",{\"e\":\"orange\",\"c\":[46,\"orange\",[\"blue\",\"green\",\"blue\",\"yellow\",\"yellow\",\"violet\",\"orange\",\"orange\",1],\"yellow\",155,194,\"yellow\",149],\"a\":\"green\",\"b\":-3,\"d\":153,\"f\":[-21,-26,-25,\"blue\",\"red\",108,169,[\"green\",100,43],51,-9]}],71,[[[{\"a\":\"violet\",\"b\":27},148,109,[\"blue\",60,47,\"violet\",\"yellow\",-47,\"violet\"],\"red\",{\"e\":97,\"c\":-21,\"a\":\"yellow\",\"b\":\"green\",\"d\":126},\"yellow\",85,89],{\"a\":[\"red\",\"orange\",\"violet\",\"blue\",\"blue\",\"blue\",128,\"blue\"]},{\"e\":-48,\"c\":{\"c\":90,\"a\":\"orange\",\"b\":\"yellow\"},\"a\":\"yellow\",\"b\":\"red\",\"d\":172},\"yellow\",{\"a\":\"orange\"},[{\"e\":\"yellow\",\"a\":40,\"d\":-9,\"j\":\"violet\",\"c\":153,\"h\":79,\"b\":\"violet\",\"g\":178,\"f\":2,\"i\":\"yellow\"},\"green\",-29],\"red\",-9,[9,{\"a\":39,\"b\":\"green\"},5,\"violet\",26,{\"e\":167,\"c\":\"blue\",\"a\":\"yellow\",\"b\":90,\"d\":33},\"green\",88,12,\"blue\"]],\"red\",{\"c\":{\"e\":\"yellow\",\"a\":-44,\"d\":62,\"j\":-19,\"c\":96,\"h\":\"green\",\"b\":-12,\"g\":\"green\",\"f\":\"red\",\"i\":134},\"a\":22,\"b\":24,\"d\":33},\"red\",\"violet\",{\"e\":181,\"c\":64,\"a\":\"violet\",\"g\":\"green\",\"b\":\"yellow\",\"d\":\"violet\",\"f\":101},\"green\",[132,93,[-6,[-3,28,\"red\"],-21,\"red\",\"violet\",{\"a\":180},\"red\",\"blue\",-15],{\"e\":171,\"a\":{\"e\":\"green\",\"c\":49,\"a\":\"orange\",\"g\":22,\"b\":\"violet\",\"d\":\"orange\",\"f\":\"orange\"},\"d\":\"red\",\"c\":113,\"h\":\"green\",\"b\":[30,\"blue\"],\"g\":{\"a\":139,\"b\":47},\"f\":\"red\",\"i\":\"red\"},\"violet\",158,\"green\",5,-1],19],\"red\"],{\"e\":{\"c\":[\"orange\",93,162,\"green\",\"violet\",[\"green\",178],{\"a\":\"green\",\"b\":{\"e\":-12,\"a\":-16,\"d\":144,\"c\":\"red\",\"h\":\"violet\",\"b\":43,\"g\":\"green\",\"f\":-42}}],\"a\":\"blue\",\"b\":\"blue\",\"d\":{\"e\":[\"orange\",\"red\",{\"c\":-19,\"a\":\"green\",\"b\":93},\"yellow\",\"green\",\"orange\",\"orange\",\"red\",\"green\"],\"a\":\"green\",\"d\":{\"e\":\"yellow\",\"a\":2,\"d\":\"violet\",\"j\":\"green\",\"c\":\"blue\",\"h\":19,\"b\":\"violet\",\"g\":\"blue\",\"f\":[157,\"green\",109,59,\"red\",74,\"red\",\"blue\",\"green\"],\"i\":\"orange\"},\"j\":\"yellow\",\"c\":166,\"h\":\"yellow\",\"b\":\"yellow\",\"g\":[\"violet\",138,[\"violet\",141,\"green\"]],\"f\":28,\"i\":{\"e\":52,\"c\":\"yellow\",\"a\":\"green\",\"b\":5,\"d\":{\"e\":153,\"a\":\"yellow\",\"d\":191,\"j\":\"green\",\"c\":\"green\",\"h\":124,\"b\":\"green\",\"g\":181,\"f\":134,\"i\":\"yellow\"},\"f\":193}}},\"c\":\"violet\",\"a\":{\"a\":{\"a\":\"green\"},\"b\":[132]},\"b\":[{\"e\":11,\"a\":\"green\",\"d\":{\"e\":{\"e\":119,\"a\":\"violet\",\"d\":\"red\",\"c\":\"red\",\"h\":\"violet\",\"b\":-6,\"g\":\"blue\",\"f\":\"orange\",\"i\":\"orange\"},\"a\":183,\"d\":[-36,\"yellow\"],\"c\":\"red\",\"h\":71,\"b\":\"yellow\",\"g\":2,\"f\":\"orange\"},\"c\":\"green\",\"h\":\"yellow\",\"b\":29,\"g\":\"green\",\"f\":\"blue\",\"i\":{\"e\":\"yellow\",\"a\":-24,\"d\":[55,125,193,70,60,190,199],\"c\":\"green\",\"h\":[49,\"yellow\",\"yellow\",74,\"red\",163],\"b\":198,\"g\":50,\"f\":\"blue\",\"i\":70}},\"orange\"],\"d\":\"blue\"},{\"c\":{\"e\":-20,\"a\":8,\"d\":[\"orange\",157,152,\"green\",46,\"green\",7,89,\"violet\",[-22,-49,81,127]],\"c\":35,\"h\":[\"blue\",\"yellow\",\"orange\",94,\"orange\",\"yellow\"],\"b\":\"red\",\"g\":{\"a\":\"green\",\"b\":[\"yellow\",\"orange\",198]},\"f\":\"violet\",\"i\":17},\"a\":-48,\"b\":\"blue\"}],\"b\":[[149,[{\"e\":\"blue\",\"c\":-30,\"a\":\"violet\",\"g\":\"violet\",\"b\":\"yellow\",\"d\":178,\"f\":-4}],\"orange\",131,\"yellow\",{\"a\":\"red\",\"b\":\"violet\"},\"blue\"],[11],{\"e\":[35,118,{\"e\":39,\"a\":\"yellow\",\"d\":[119,\"orange\",120,-43],\"j\":\"violet\",\"c\":\"orange\",\"h\":\"blue\",\"b\":-32,\"g\":[{\"e\":\"green\",\"c\":106,\"a\":144,\"b\":147,\"d\":\"green\"},\"violet\",\"orange\"],\"f\":116,\"i\":\"orange\"},112,\"yellow\"],\"a\":{\"e\":19,\"a\":\"orange\",\"d\":61,\"c\":\"red\",\"h\":\"blue\",\"b\":164,\"g\":{\"c\":\"red\",\"a\":-10,\"b\":{\"e\":{\"e\":\"green\",\"c\":82,\"a\":103,\"g\":67,\"b\":153,\"d\":\"violet\",\"f\":22},\"c\":-22,\"a\":101,\"b\":71,\"d\":{\"a\":152,\"b\":\"green\"},\"f\":\"orange\"}},\"f\":157,\"i\":{\"e\":\"green\",\"a\":\"orange\",\"d\":-8,\"j\":[159,73,182,\"red\",\"green\"],\"c\":13,\"h\":\"blue\",\"b\":\"yellow\",\"g\":186,\"f\":\"orange\",\"i\":81}},\"d\":13,\"c\":[186,[\"yellow\",[\"violet\",\"violet\"],\"green\",-28],54,[\"blue\",[119,\"red\",119,91,181],117],-15,190,{\"c\":\"red\",\"a\":13,\"b\":[{\"c\":\"green\",\"a\":70,\"b\":8,\"d\":175},\"orange\",\"green\",\"yellow\",\"green\"]},\"blue\",-43],\"h\":{\"e\":[{\"a\":\"green\"},88,\"red\",\"violet\",10],\"a\":{\"a\":\"orange\",\"b\":[62,\"yellow\",\"green\"]},\"d\":151,\"c\":\"red\",\"h\":\"orange\",\"b\":126,\"g\":{\"a\":\"orange\"},\"f\":\"orange\",\"i\":46},\"b\":[[-2,\"violet\",\"violet\",\"red\",{\"a\":192},\"green\",122],[\"orange\",\"red\",{\"c\":62,\"a\":52,\"b\":-45},{\"e\":{\"a\":\"violet\",\"b\":-45},\"a\":\"red\",\"d\":\"orange\",\"c\":\"yellow\",\"h\":{\"e\":67,\"c\":-27,\"a\":116,\"b\":\"violet\",\"d\":\"green\",\"f\":-18},\"b\":\"yellow\",\"g\":\"blue\",\"f\":\"blue\"},27,{\"c\":37,\"a\":-39,\"b\":\"blue\"}],107,\"yellow\",[\"blue\",\"red\",143],\"blue\",{\"e\":\"orange\",\"a\":[\"yellow\",[\"blue\",8,149,141,\"red\",-28,\"red\"],18],\"d\":29,\"c\":\"violet\",\"h\":-21,\"b\":[{\"e\":66,\"c\":\"green\",\"a\":\"blue\",\"b\":-29,\"d\":\"orange\",\"f\":\"violet\"},\"blue\",-21],\"g\":\"green\",\"f\":112},73],\"g\":[\"red\",{\"a\":{\"e\":93,\"a\":13,\"d\":\"violet\",\"c\":175,\"h\":158,\"b\":9,\"g\":194,\"f\":-10},\"b\":\"blue\"}],\"f\":130}],\"g\":[[\"red\",\"orange\",\"orange\",172,154,{\"e\":{\"a\":\"blue\",\"b\":{\"a\":\"yellow\",\"b\":53}},\"c\":-11,\"a\":\"orange\",\"g\":\"yellow\",\"b\":{\"e\":{\"e\":94,\"a\":123,\"d\":184,\"j\":-4,\"c\":193,\"h\":152,\"b\":\"blue\",\"g\":\"red\",\"f\":101,\"i\":178},\"c\":\"blue\",\"a\":178,\"b\":154,\"d\":[103,109,190,\"yellow\",29,\"red\",\"orange\",\"yellow\",79,\"green\"],\"f\":\"orange\"},\"d\":{\"e\":25,\"a\":{\"a\":\"blue\"},\"d\":\"green\",\"c\":\"orange\",\"h\":{\"e\":144,\"c\":[\"red\",\"blue\",\"violet\",15,\"green\",109,72],\"a\":\"yellow\",\"b\":\"orange\",\"d\":\"yellow\"},\"b\":151,\"g\":[141,\"orange\",134,\"blue\",\"blue\",4,21,\"blue\",\"green\"],\"f\":96},\"f\":\"blue\"},\"blue\"],80,186,[[194,\"violet\",70,\"green\"],{\"a\":\"orange\",\"b\":\"green\"},[{\"e\":\"orange\",\"a\":179,\"d\":{\"e\":164,\"c\":-14,\"a\":\"blue\",\"g\":\"yellow\",\"b\":\"violet\",\"d\":76,\"f\":-33},\"c\":\"green\",\"h\":\"violet\",\"b\":\"orange\",\"g\":\"blue\",\"f\":\"orange\",\"i\":\"green\"},\"blue\"]],\"orange\",\"yellow\",66],\"f\":{\"a\":[\"violet\"],\"b\":87},\"i\":{\"e\":{\"c\":[{\"e\":\"red\",\"a\":19,\"d\":100,\"j\":\"red\",\"c\":\"red\",\"h\":\"red\",\"b\":\"yellow\",\"g\":-41,\"f\":10,\"i\":\"blue\"},42,92,\"violet\",\"red\",[149,\"green\",91,\"blue\"],-33,[\"green\",73,129],110,{\"e\":168,\"c\":153,\"a\":-30,\"b\":\"yellow\",\"d\":[192,{\"c\":\"blue\",\"a\":\"blue\",\"b\":-16,\"d\":-18},{\"e\":\"red\",\"c\":\"yellow\",\"a\":\"violet\",\"b\":31,\"d\":\"green\"},\"blue\"],\"f\":{\"c\":9,\"a\":\"yellow\",\"b\":-16,\"d\":128}}],\"a\":[[[\"green\",\"violet\",136,59,\"orange\",173,116,113,\"yellow\"],\"green\",{\"e\":\"blue\",\"c\":\"green\",\"a\":\"blue\",\"g\":\"red\",\"b\":98,\"d\":-25,\"f\":21},\"orange\",184],4,\"yellow\",\"red\",-24,{\"c\":\"orange\",\"a\":15,\"b\":{\"e\":109,\"c\":179,\"a\":61,\"b\":\"orange\",\"d\":190,\"f\":9}}],\"b\":[[92,148,{\"e\":\"blue\",\"a\":0,\"d\":108,\"c\":197,\"h\":\"red\",\"b\":\"orange\",\"g\":-22,\"f\":105,\"i\":\"blue\"},\"blue\"],-7,149]},\"a\":{\"e\":{\"a\":{\"e\":\"green\",\"a\":[\"violet\",172],\"d\":-10,\"c\":42,\"h\":\"blue\",\"b\":80,\"g\":{\"e\":\"red\",\"c\":\"orange\",\"a\":\"yellow\",\"g\":87,\"b\":{\"e\":31,\"c\":129,\"a\":\"orange\",\"b\":43,\"d\":\"blue\"},\"d\":\"blue\",\"f\":81},\"f\":\"violet\"},\"b\":\"orange\"},\"a\":182,\"d\":{\"c\":{\"a\":154},\"a\":\"blue\",\"b\":{\"e\":31,\"a\":[\"yellow\",\"blue\",\"red\",{\"a\":\"orange\"},\"red\",62,39,\"red\",[\"green\",\"orange\",\"yellow\",47,\"orange\",55,\"blue\"]],\"d\":[72,187,\"red\",\"orange\",59,\"yellow\",\"violet\",\"green\"],\"j\":\"orange\",\"c\":\"yellow\",\"h\":185,\"b\":{\"e\":\"blue\",\"c\":\"violet\",\"a\":[\"orange\",7,180,150,46,\"yellow\",176,\"orange\"],\"b\":148,\"d\":\"blue\"},\"g\":\"blue\",\"f\":\"yellow\",\"i\":102}},\"c\":\"red\",\"h\":-9,\"b\":14,\"g\":{\"a\":\"green\",\"b\":{\"c\":-18,\"a\":81,\"b\":104}},\"f\":[[{\"e\":-33,\"c\":\"green\",\"a\":\"orange\",\"b\":\"blue\",\"d\":\"blue\"},\"yellow\",141,[42,197],[-12,61,{\"e\":\"violet\",\"a\":\"violet\",\"d\":\"green\",\"c\":-21,\"h\":-5,\"b\":\"orange\",\"g\":39,\"f\":\"green\"},\"blue\"],31,[[101,\"blue\",-14,\"red\",88],58,[\"red\",\"blue\",\"violet\",34],-14,\"yellow\",98,106,91,131],\"yellow\",[151,\"red\",\"green\",{\"e\":\"violet\",\"c\":\"green\",\"a\":49,\"g\":155,\"b\":96,\"d\":\"blue\",\"f\":\"orange\"},-18,184,{\"c\":\"blue\",\"a\":1,\"b\":162},{\"e\":115,\"a\":94,\"d\":97,\"j\":-34,\"c\":\"blue\",\"h\":115,\"b\":\"red\",\"g\":\"orange\",\"f\":149,\"i\":105}],38],{\"c\":{\"e\":\"blue\",\"c\":90,\"a\":\"yellow\",\"b\":142,\"d\":\"violet\"},\"a\":-38,\"b\":\"violet\"}],\"i\":189},\"d\":\"orange\",\"c\":[[103,8,\"green\",13,23,\"violet\",55],[{\"e\":79,\"c\":74,\"a\":{\"e\":\"violet\",\"a\":{\"c\":\"red\",\"a\":\"violet\",\"b\":168},\"d\":142,\"j\":\"blue\",\"c\":173,\"h\":\"yellow\",\"b\":\"green\",\"g\":\"blue\",\"f\":\"blue\",\"i\":\"blue\"},\"g\":[{\"c\":\"violet\",\"a\":82,\"b\":90},-24,{\"a\":\"orange\"},\"yellow\",[126,53,153,6],52,137,\"violet\",181],\"b\":105,\"d\":166,\"f\":{\"e\":\"blue\",\"c\":-35,\"a\":\"blue\",\"b\":188,\"d\":-14,\"f\":63}},{\"e\":95,\"a\":\"green\",\"d\":\"yellow\",\"j\":\"red\",\"c\":81,\"h\":107,\"b\":-46,\"g\":162,\"f\":\"green\",\"i\":\"red\"},[{\"e\":\"violet\",\"a\":150,\"d\":126,\"c\":10,\"h\":{\"e\":\"green\",\"a\":\"orange\",\"d\":19,\"c\":\"green\",\"h\":\"green\",\"b\":79,\"g\":\"red\",\"f\":\"yellow\",\"i\":\"blue\"},\"b\":{\"a\":25,\"b\":147},\"g\":180,\"f\":126},{\"e\":-48,\"a\":192,\"d\":-45,\"c\":25,\"h\":\"green\",\"b\":{\"c\":165,\"a\":\"orange\",\"b\":\"red\",\"d\":\"blue\"},\"g\":\"green\",\"f\":-24},95,{\"e\":\"blue\",\"a\":\"violet\",\"d\":\"yellow\",\"j\":\"blue\",\"c\":44,\"h\":[\"blue\",\"green\",\"red\",142,\"red\"],\"b\":[-43,\"violet\",\"green\",53],\"g\":33,\"f\":\"orange\",\"i\":196},\"orange\",\"green\",43,[113,\"violet\",\"orange\",129,{\"c\":6,\"a\":\"violet\",\"b\":\"green\",\"d\":\"green\"},20]],\"green\"]],\"h\":{\"a\":-11},\"b\":{\"e\":\"violet\",\"c\":174,\"a\":\"violet\",\"g\":[{\"e\":105,\"a\":{\"c\":-5,\"a\":177,\"b\":63},\"d\":-41,\"c\":80,\"h\":[110,109,113,\"blue\"],\"b\":-28,\"g\":\"red\",\"f\":129},[\"green\",[108],{\"a\":4},[182,96,29,[181,14,\"yellow\",\"violet\"],13,{\"e\":132,\"a\":115,\"d\":\"red\",\"c\":\"violet\",\"h\":\"violet\",\"b\":\"violet\",\"g\":\"green\",\"f\":\"green\"},{\"e\":\"orange\",\"a\":\"yellow\",\"d\":\"blue\",\"j\":\"red\",\"c\":137,\"h\":\"violet\",\"b\":\"green\",\"g\":-22,\"f\":\"yellow\",\"i\":-12},\"green\",\"yellow\",57],-44,{\"a\":88,\"b\":-3},22,{\"c\":\"red\",\"a\":\"violet\",\"b\":-21}],[[14,\"orange\"]],-36,128,\"yellow\",[-47,[-7,36,177],\"blue\",\"blue\",[\"yellow\",\"violet\",-23,\"violet\",-40,\"orange\",{\"e\":129,\"a\":21,\"d\":51,\"j\":\"violet\",\"c\":\"red\",\"h\":15,\"b\":174,\"g\":191,\"f\":101,\"i\":105}],23,[-47,[133,66,\"violet\"],177,\"violet\",\"yellow\",\"green\",159,\"yellow\"]],{\"e\":[{\"a\":\"orange\"},\"green\",69,\"orange\",43,\"violet\",\"violet\",192,140,\"green\"],\"a\":62,\"d\":\"violet\",\"j\":{\"c\":\"violet\",\"a\":-25,\"b\":\"violet\"},\"c\":120,\"h\":\"red\",\"b\":{\"a\":13},\"g\":\"green\",\"f\":124,\"i\":33},[[19,176,174,\"orange\",\"violet\",\"violet\",105,128,\"red\"],{\"a\":10,\"b\":\"red\"},[\"orange\",37,187,\"green\",176],\"blue\",\"red\",[153,\"yellow\",\"violet\",137,\"orange\",\"blue\",[70,\"red\",174,\"blue\",\"green\",\"yellow\",99,\"red\"],\"violet\",\"violet\",\"red\"]]],\"b\":[{\"c\":133,\"a\":\"orange\",\"b\":98,\"d\":{\"c\":\"red\",\"a\":-9,\"b\":103}},\"blue\",[155,\"yellow\"],[[\"yellow\",-8,{\"e\":\"blue\",\"c\":59,\"a\":71,\"g\":\"orange\",\"b\":88,\"d\":\"orange\",\"f\":17},\"blue\",-37],{\"e\":82,\"c\":\"violet\",\"a\":99,\"b\":81,\"d\":\"yellow\",\"f\":161},\"blue\",{\"c\":-7,\"a\":154,\"b\":\"violet\"},-9,-13,53,{\"e\":\"violet\",\"a\":\"yellow\",\"d\":-26,\"c\":179,\"h\":\"green\",\"b\":\"red\",\"g\":-24,\"f\":133,\"i\":-36}]],\"d\":{\"e\":[9,[49],28,\"red\",{\"c\":23,\"a\":157,\"b\":{\"c\":\"violet\",\"a\":\"green\",\"b\":-11,\"d\":\"green\"},\"d\":139},\"orange\",\"green\",93,44,[-19]],\"a\":-6,\"d\":7,\"c\":{\"e\":{\"c\":\"violet\",\"a\":-21,\"b\":12},\"c\":[\"green\",[-23,-40,157],\"red\",[\"orange\",\"blue\"],\"violet\",\"red\",85,\"violet\",\"yellow\",150],\"a\":162,\"g\":\"yellow\",\"b\":\"green\",\"d\":[\"green\",\"yellow\",181,\"green\",-2,{\"e\":\"red\",\"a\":\"yellow\",\"d\":129,\"c\":-34,\"h\":129,\"b\":152,\"g\":\"yellow\",\"f\":80,\"i\":\"red\"},\"green\",\"red\",-9,\"red\"],\"f\":6},\"h\":{\"e\":136,\"a\":\"violet\",\"d\":[\"violet\",-15,129,\"green\",5,\"green\",[-28,156,141,\"blue\",22,\"green\",34],\"green\"],\"c\":149,\"h\":[\"violet\"],\"b\":149,\"g\":\"green\",\"f\":149},\"b\":{\"e\":123,\"a\":\"red\",\"d\":{\"e\":0,\"c\":\"green\",\"a\":\"violet\",\"b\":\"yellow\",\"d\":\"red\",\"f\":\"green\"},\"c\":{\"e\":{\"e\":\"yellow\",\"c\":\"red\",\"a\":\"red\",\"b\":\"violet\",\"d\":\"yellow\"},\"a\":\"yellow\",\"d\":{\"e\":-39,\"a\":-11,\"d\":63,\"c\":179,\"h\":4,\"b\":44,\"g\":\"orange\",\"f\":\"violet\",\"i\":\"yellow\"},\"c\":-43,\"h\":\"green\",\"b\":\"violet\",\"g\":\"blue\",\"f\":\"yellow\",\"i\":124},\"h\":48,\"b\":129,\"g\":[\"orange\",147,174,\"blue\",\"green\",115],\"f\":172,\"i\":-36},\"g\":\"red\",\"f\":30,\"i\":\"violet\"},\"f\":\"red\"},\"g\":{\"e\":{\"e\":[[126,\"orange\",196,\"orange\",\"red\",{\"e\":23,\"a\":\"yellow\",\"d\":128,\"c\":12,\"h\":-49,\"b\":\"green\",\"g\":\"yellow\",\"f\":41,\"i\":45},\"red\",\"violet\"]],\"c\":[[\"red\",103,{\"e\":69,\"a\":\"violet\",\"d\":\"yellow\",\"c\":\"green\",\"h\":\"red\",\"b\":133,\"g\":25,\"f\":\"violet\"}],88,\"green\",\"red\",-29,\"red\"],\"a\":37,\"b\":\"green\",\"d\":{\"e\":\"orange\",\"c\":{\"e\":{\"e\":109,\"c\":144,\"a\":\"yellow\",\"b\":70,\"d\":83},\"c\":-3,\"a\":\"green\",\"b\":\"yellow\",\"d\":146},\"a\":86,\"b\":-1,\"d\":{\"a\":68}}},\"c\":{\"c\":[155,18,\"blue\",-16,\"orange\",-36,49,\"red\",[\"yellow\",136,140,-10,11,\"violet\",\"red\",134,156,\"violet\"]],\"a\":64,\"b\":{\"e\":\"violet\",\"c\":193,\"a\":101,\"b\":[\"green\"],\"d\":182,\"f\":86},\"d\":[198]},\"a\":\"yellow\",\"g\":\"violet\",\"b\":1,\"d\":-27,\"f\":\"orange\"},\"f\":{\"e\":20,\"c\":{\"e\":155,\"c\":{\"c\":[181,{\"e\":-32,\"a\":\"orange\",\"d\":\"orange\",\"j\":\"yellow\",\"c\":66,\"h\":-39,\"b\":\"violet\",\"g\":\"violet\",\"f\":\"red\",\"i\":23},4,\"blue\",70,\"violet\",\"blue\",141,{\"a\":\"yellow\",\"b\":184},\"violet\"],\"a\":160,\"b\":158,\"d\":197},\"a\":138,\"g\":[48],\"b\":26,\"d\":11,\"f\":{\"c\":\"yellow\",\"a\":179,\"b\":\"red\",\"d\":90}},\"a\":148,\"g\":\"yellow\",\"b\":[[{\"a\":[\"yellow\"]},\"yellow\",19,\"green\",39],{\"c\":{\"a\":\"blue\"},\"a\":{\"e\":41,\"c\":191,\"a\":173,\"b\":\"green\",\"d\":-14,\"f\":19},\"b\":{\"a\":[\"orange\",4,48],\"b\":193},\"d\":\"green\"},[\"yellow\",{\"e\":\"orange\",\"a\":\"orange\",\"d\":\"blue\",\"c\":-39,\"h\":28,\"b\":\"yellow\",\"g\":\"red\",\"f\":\"orange\",\"i\":[116,\"red\",173,76,24,-1,\"green\",101,-10]},70,{\"c\":\"violet\",\"a\":44,\"b\":\"violet\",\"d\":36},128,{\"c\":\"yellow\",\"a\":\"red\",\"b\":[\"yellow\",-10]},-10,6]],\"d\":\"violet\",\"f\":{\"e\":\"violet\",\"c\":5,\"a\":\"violet\",\"g\":173,\"b\":100,\"d\":[\"violet\",194,{\"e\":[\"blue\",181,\"violet\",\"yellow\",\"blue\",-7,137,43,112],\"c\":-19,\"a\":120,\"b\":\"green\",\"d\":165},-1,195,\"green\",104],\"f\":128}}}}",
                //1
                "[1,2,3]",
                //2
                "{\"a\":2,\"b\":4}",
                //3
                "[[[3]]]",
                //4
                "{\"a\":{\"b\":4},\"c\":-1}",
                //5
                "{\"a\":[-1,1]}",
                //6
                "[-1,{\"a\":1}]",
                //7
                "[]",
                //8
                "{}",
                //9
                "[1,{\"c\":\"red\",\"b\":2},3]",
                //10
                "{\"d\":\"red\",\"e\":[1,2,3,4],\"f\":5}",
                //11
                "[1,\"red\",5]"
        };

        @Test
        void part1()
        {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("119433");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("6");
            ex.input = inputs[2];
            Assertions.assertThat(ex.answer1()).isEqualTo("6");
            ex.input = inputs[3];
            Assertions.assertThat(ex.answer1()).isEqualTo("3");
            ex.input = inputs[4];
            Assertions.assertThat(ex.answer1()).isEqualTo("3");
            ex.input = inputs[5];
            Assertions.assertThat(ex.answer1()).isEqualTo("0");
            ex.input = inputs[6];
            Assertions.assertThat(ex.answer1()).isEqualTo("0");
            ex.input = inputs[7];
            Assertions.assertThat(ex.answer1()).isEqualTo("0");
            ex.input = inputs[8];
            Assertions.assertThat(ex.answer1()).isEqualTo("0");
            ex.input = inputs[9];
            Assertions.assertThat(ex.answer1()).isEqualTo("6");
            ex.input = inputs[10];
            Assertions.assertThat(ex.answer1()).isEqualTo("15");
            ex.input = inputs[11];
            Assertions.assertThat(ex.answer1()).isEqualTo("6");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer2()).isEqualTo("68466");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("6");
            ex.input = inputs[9];
            Assertions.assertThat(ex.answer2()).isEqualTo("4");
            ex.input = inputs[10];
            Assertions.assertThat(ex.answer2()).isEqualTo("0");
            ex.input = inputs[11];
            Assertions.assertThat(ex.answer2()).isEqualTo("6");
        }
    }

    @Nested
    class day13
    {
        AOCExercise ex = new Knights_of_the_Dinner_Table();
        String[] inputs = new String[] {
            //0
            "Alice would gain 54 happiness units by sitting next to Bob.\n" +
            "Alice would lose 79 happiness units by sitting next to Carol.\n" +
            "Alice would lose 2 happiness units by sitting next to David.\n" +
            "Bob would gain 83 happiness units by sitting next to Alice.\n" +
            "Bob would lose 7 happiness units by sitting next to Carol.\n" +
            "Bob would lose 63 happiness units by sitting next to David.\n" +
            "Carol would lose 62 happiness units by sitting next to Alice.\n" +
            "Carol would gain 60 happiness units by sitting next to Bob.\n" +
            "Carol would gain 55 happiness units by sitting next to David.\n" +
            "David would gain 46 happiness units by sitting next to Alice.\n" +
            "David would lose 7 happiness units by sitting next to Bob.\n" +
            "David would gain 41 happiness units by sitting next to Carol.",
            //1
            "Alice would lose 57 happiness units by sitting next to Bob.\n" +
            "Alice would lose 62 happiness units by sitting next to Carol.\n" +
            "Alice would lose 75 happiness units by sitting next to David.\n" +
            "Alice would gain 71 happiness units by sitting next to Eric.\n" +
            "Alice would lose 22 happiness units by sitting next to Frank.\n" +
            "Alice would lose 23 happiness units by sitting next to George.\n" +
            "Alice would lose 76 happiness units by sitting next to Mallory.\n" +
            "Bob would lose 14 happiness units by sitting next to Alice.\n" +
            "Bob would gain 48 happiness units by sitting next to Carol.\n" +
            "Bob would gain 89 happiness units by sitting next to David.\n" +
            "Bob would gain 86 happiness units by sitting next to Eric.\n" +
            "Bob would lose 2 happiness units by sitting next to Frank.\n" +
            "Bob would gain 27 happiness units by sitting next to George.\n" +
            "Bob would gain 19 happiness units by sitting next to Mallory.\n" +
            "Carol would gain 37 happiness units by sitting next to Alice.\n" +
            "Carol would gain 45 happiness units by sitting next to Bob.\n" +
            "Carol would gain 24 happiness units by sitting next to David.\n" +
            "Carol would gain 5 happiness units by sitting next to Eric.\n" +
            "Carol would lose 68 happiness units by sitting next to Frank.\n" +
            "Carol would lose 25 happiness units by sitting next to George.\n" +
            "Carol would gain 30 happiness units by sitting next to Mallory.\n" +
            "David would lose 51 happiness units by sitting next to Alice.\n" +
            "David would gain 34 happiness units by sitting next to Bob.\n" +
            "David would gain 99 happiness units by sitting next to Carol.\n" +
            "David would gain 91 happiness units by sitting next to Eric.\n" +
            "David would lose 38 happiness units by sitting next to Frank.\n" +
            "David would gain 60 happiness units by sitting next to George.\n" +
            "David would lose 63 happiness units by sitting next to Mallory.\n" +
            "Eric would gain 23 happiness units by sitting next to Alice.\n" +
            "Eric would lose 69 happiness units by sitting next to Bob.\n" +
            "Eric would lose 33 happiness units by sitting next to Carol.\n" +
            "Eric would lose 47 happiness units by sitting next to David.\n" +
            "Eric would gain 75 happiness units by sitting next to Frank.\n" +
            "Eric would gain 82 happiness units by sitting next to George.\n" +
            "Eric would gain 13 happiness units by sitting next to Mallory.\n" +
            "Frank would gain 77 happiness units by sitting next to Alice.\n" +
            "Frank would gain 27 happiness units by sitting next to Bob.\n" +
            "Frank would lose 87 happiness units by sitting next to Carol.\n" +
            "Frank would gain 74 happiness units by sitting next to David.\n" +
            "Frank would lose 41 happiness units by sitting next to Eric.\n" +
            "Frank would lose 99 happiness units by sitting next to George.\n" +
            "Frank would gain 26 happiness units by sitting next to Mallory.\n" +
            "George would lose 63 happiness units by sitting next to Alice.\n" +
            "George would lose 51 happiness units by sitting next to Bob.\n" +
            "George would lose 60 happiness units by sitting next to Carol.\n" +
            "George would gain 30 happiness units by sitting next to David.\n" +
            "George would lose 100 happiness units by sitting next to Eric.\n" +
            "George would lose 63 happiness units by sitting next to Frank.\n" +
            "George would gain 57 happiness units by sitting next to Mallory.\n" +
            "Mallory would lose 71 happiness units by sitting next to Alice.\n" +
            "Mallory would lose 28 happiness units by sitting next to Bob.\n" +
            "Mallory would lose 10 happiness units by sitting next to Carol.\n" +
            "Mallory would gain 44 happiness units by sitting next to David.\n" +
            "Mallory would gain 22 happiness units by sitting next to Eric.\n" +
            "Mallory would gain 79 happiness units by sitting next to Frank.\n" +
            "Mallory would lose 16 happiness units by sitting next to George."
        };

        @Test
        void part1()
        {
            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("330");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("618");
        }

        @Test
        void part2()
        {
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("601");
        }
    }

    @Nested
    class day14
    {
        AOCExercise ex = new Reindeer_Olympics();
        String[] inputs = new String[] {
            //0
            "Comet can fly 14 km/s for 10 seconds, but then must rest for 127 seconds.\n" +
            "Dancer can fly 16 km/s for 11 seconds, but then must rest for 162 seconds.",
            //1
            "Vixen can fly 8 km/s for 8 seconds, but then must rest for 53 seconds.\n" +
            "Blitzen can fly 13 km/s for 4 seconds, but then must rest for 49 seconds.\n" +
            "Rudolph can fly 20 km/s for 7 seconds, but then must rest for 132 seconds.\n" +
            "Cupid can fly 12 km/s for 4 seconds, but then must rest for 43 seconds.\n" +
            "Donner can fly 9 km/s for 5 seconds, but then must rest for 38 seconds.\n" +
            "Dasher can fly 10 km/s for 4 seconds, but then must rest for 37 seconds.\n" +
            "Comet can fly 3 km/s for 37 seconds, but then must rest for 76 seconds.\n" +
            "Prancer can fly 9 km/s for 12 seconds, but then must rest for 97 seconds.\n" +
            "Dancer can fly 37 km/s for 1 seconds, but then must rest for 36 seconds."
        };
        @Test
        void part1()
        {
            ex.input = inputs[0];
            String[] args = new String[1];

            args[0] = "1";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer1()).isEqualTo("16");

            args[0] = "10";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer1()).isEqualTo("160");

            args[0] = "11";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer1()).isEqualTo("176");

            args[0] = "1000";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer1()).isEqualTo("1120");

            args[0] = "2503";
            ex.input = inputs[1];
            ex.setArgs(args);
            Assertions.assertThat(ex.answer1()).isEqualTo("2655");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            String[] args = new String[1];

            args[0] = "1";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer2()).isEqualTo("1");

            args[0] = "140";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer2()).isEqualTo("139");

            args[0] = "1000";
            ex.setArgs(args);
            Assertions.assertThat(ex.answer2()).isEqualTo("689");

            args[0] = "2503";
            ex.input = inputs[1];
            ex.setArgs(args);
            Assertions.assertThat(ex.answer2()).isEqualTo("1059");
        }
    }

    @Nested
    class day15
    {
        AOCExercise ex = new Science_for_Hungry_People();
        String[] inputs = new String[] {
            //0
            "Butterscotch: capacity -1, durability -2, flavor 6, texture 3, calories 8\n" +
            "Cinnamon: capacity 2, durability 3, flavor -2, texture -1, calories 3",
            //1
            "Sugar: capacity 3, durability 0, flavor 0, texture -3, calories 2\n" +
            "Sprinkles: capacity -3, durability 3, flavor 0, texture 0, calories 9\n" +
            "Candy: capacity -1, durability 0, flavor 4, texture 0, calories 1\n" +
            "Chocolate: capacity 0, durability 0, flavor -2, texture 2, calories 8"
        };

        @Test
        void part1()
        {
            String[] args = new String[] {"100"};
            ex.setArgs(args);

            ex.input = inputs[0];
            Assertions.assertThat(ex.answer1()).isEqualTo("62842880");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer1()).isEqualTo("222870");
        }

        @Test
        void part2()
        {
            String[] args = new String[] {"100", "500"};
            ex.setArgs(args);

            ex.input = inputs[0];
            Assertions.assertThat(ex.answer2()).isEqualTo("57600000");
            ex.input = inputs[1];
            Assertions.assertThat(ex.answer2()).isEqualTo("117936");
        }
    }

    @Nested
    class day16
    {
        AOCExercise ex = new Aunt_Sue();
        String[] inputs = new String[] {
            "Sue 1: cars: 9, akitas: 3, goldfish: 0\n" +
            "Sue 2: akitas: 9, children: 3, samoyeds: 9\n" +
            "Sue 3: trees: 6, cars: 6, children: 4\n" +
            "Sue 4: trees: 4, vizslas: 4, goldfish: 9\n" +
            "Sue 5: akitas: 9, vizslas: 7, cars: 5\n" +
            "Sue 6: vizslas: 6, goldfish: 6, akitas: 3\n" +
            "Sue 7: pomeranians: 5, samoyeds: 0, perfumes: 10\n" +
            "Sue 8: cars: 10, pomeranians: 7, goldfish: 8\n" +
            "Sue 9: trees: 2, vizslas: 7, samoyeds: 6\n" +
            "Sue 10: perfumes: 5, pomeranians: 4, children: 9\n" +
            "Sue 11: vizslas: 5, perfumes: 8, cars: 10\n" +
            "Sue 12: children: 10, cars: 6, perfumes: 5\n" +
            "Sue 13: cats: 4, samoyeds: 7, pomeranians: 8\n" +
            "Sue 14: perfumes: 6, goldfish: 10, children: 7\n" +
            "Sue 15: perfumes: 4, pomeranians: 3, cars: 6\n" +
            "Sue 16: perfumes: 7, cars: 9, pomeranians: 6\n" +
            "Sue 17: goldfish: 3, cars: 6, vizslas: 7\n" +
            "Sue 18: perfumes: 6, cars: 7, goldfish: 3\n" +
            "Sue 19: trees: 0, akitas: 3, pomeranians: 8\n" +
            "Sue 20: goldfish: 6, trees: 2, akitas: 6\n" +
            "Sue 21: pomeranians: 9, akitas: 9, samoyeds: 9\n" +
            "Sue 22: vizslas: 2, cars: 9, perfumes: 5\n" +
            "Sue 23: goldfish: 10, samoyeds: 8, children: 9\n" +
            "Sue 24: akitas: 4, goldfish: 1, vizslas: 5\n" +
            "Sue 25: goldfish: 10, trees: 8, perfumes: 6\n" +
            "Sue 26: vizslas: 5, akitas: 8, trees: 1\n" +
            "Sue 27: trees: 3, cars: 6, perfumes: 2\n" +
            "Sue 28: goldfish: 8, trees: 7, akitas: 10\n" +
            "Sue 29: children: 5, trees: 1, goldfish: 10\n" +
            "Sue 30: vizslas: 3, perfumes: 8, akitas: 3\n" +
            "Sue 31: cars: 6, children: 10, perfumes: 7\n" +
            "Sue 32: cars: 10, perfumes: 3, goldfish: 10\n" +
            "Sue 33: perfumes: 9, vizslas: 3, akitas: 4\n" +
            "Sue 34: perfumes: 10, vizslas: 7, children: 8\n" +
            "Sue 35: cars: 5, perfumes: 5, vizslas: 9\n" +
            "Sue 36: trees: 9, cars: 9, akitas: 7\n" +
            "Sue 37: samoyeds: 9, perfumes: 2, cars: 10\n" +
            "Sue 38: akitas: 7, cars: 5, trees: 5\n" +
            "Sue 39: goldfish: 8, trees: 9, cars: 10\n" +
            "Sue 40: trees: 0, cats: 1, pomeranians: 1\n" +
            "Sue 41: pomeranians: 6, perfumes: 9, samoyeds: 1\n" +
            "Sue 42: vizslas: 6, akitas: 3, pomeranians: 1\n" +
            "Sue 43: vizslas: 2, perfumes: 3, pomeranians: 6\n" +
            "Sue 44: akitas: 5, pomeranians: 0, vizslas: 10\n" +
            "Sue 45: vizslas: 4, goldfish: 1, cars: 5\n" +
            "Sue 46: cars: 4, vizslas: 8, cats: 0\n" +
            "Sue 47: cats: 5, children: 8, pomeranians: 2\n" +
            "Sue 48: vizslas: 3, perfumes: 6, cats: 0\n" +
            "Sue 49: akitas: 7, perfumes: 0, trees: 7\n" +
            "Sue 50: trees: 4, akitas: 10, vizslas: 2\n" +
            "Sue 51: goldfish: 10, cars: 9, trees: 4\n" +
            "Sue 52: cars: 5, children: 9, perfumes: 0\n" +
            "Sue 53: vizslas: 5, cars: 3, cats: 8\n" +
            "Sue 54: cars: 5, akitas: 1, goldfish: 10\n" +
            "Sue 55: akitas: 10, vizslas: 2, cars: 6\n" +
            "Sue 56: cats: 6, trees: 0, cars: 4\n" +
            "Sue 57: vizslas: 1, akitas: 1, samoyeds: 7\n" +
            "Sue 58: samoyeds: 6, vizslas: 1, akitas: 7\n" +
            "Sue 59: akitas: 9, cars: 8, vizslas: 1\n" +
            "Sue 60: cars: 6, vizslas: 7, goldfish: 0\n" +
            "Sue 61: pomeranians: 5, akitas: 6, vizslas: 2\n" +
            "Sue 62: samoyeds: 2, cats: 8, goldfish: 7\n" +
            "Sue 63: vizslas: 10, goldfish: 7, samoyeds: 9\n" +
            "Sue 64: perfumes: 2, trees: 1, akitas: 6\n" +
            "Sue 65: cars: 8, perfumes: 10, vizslas: 9\n" +
            "Sue 66: akitas: 8, vizslas: 8, perfumes: 8\n" +
            "Sue 67: goldfish: 7, cars: 9, samoyeds: 9\n" +
            "Sue 68: perfumes: 2, children: 7, akitas: 1\n" +
            "Sue 69: perfumes: 7, vizslas: 9, akitas: 1\n" +
            "Sue 70: samoyeds: 3, vizslas: 1, trees: 1\n" +
            "Sue 71: vizslas: 8, goldfish: 7, trees: 9\n" +
            "Sue 72: goldfish: 8, cars: 6, trees: 9\n" +
            "Sue 73: perfumes: 5, cars: 10, samoyeds: 7\n" +
            "Sue 74: pomeranians: 4, perfumes: 3, cars: 5\n" +
            "Sue 75: samoyeds: 1, perfumes: 1, pomeranians: 1\n" +
            "Sue 76: goldfish: 4, cats: 6, akitas: 7\n" +
            "Sue 77: perfumes: 5, akitas: 4, vizslas: 8\n" +
            "Sue 78: perfumes: 4, cats: 3, children: 4\n" +
            "Sue 79: vizslas: 5, pomeranians: 9, samoyeds: 7\n" +
            "Sue 80: cars: 3, samoyeds: 5, pomeranians: 7\n" +
            "Sue 81: vizslas: 2, samoyeds: 4, perfumes: 2\n" +
            "Sue 82: trees: 1, akitas: 10, vizslas: 9\n" +
            "Sue 83: vizslas: 0, akitas: 2, samoyeds: 5\n" +
            "Sue 84: perfumes: 5, vizslas: 7, children: 8\n" +
            "Sue 85: cats: 3, children: 2, trees: 0\n" +
            "Sue 86: cars: 3, perfumes: 2, goldfish: 2\n" +
            "Sue 87: trees: 1, akitas: 7, vizslas: 0\n" +
            "Sue 88: trees: 1, akitas: 2, samoyeds: 1\n" +
            "Sue 89: cars: 4, vizslas: 8, akitas: 1\n" +
            "Sue 90: perfumes: 5, cats: 3, vizslas: 0\n" +
            "Sue 91: samoyeds: 7, cats: 6, goldfish: 8\n" +
            "Sue 92: samoyeds: 10, cats: 0, cars: 7\n" +
            "Sue 93: cars: 6, akitas: 7, samoyeds: 2\n" +
            "Sue 94: perfumes: 0, goldfish: 6, trees: 9\n" +
            "Sue 95: cars: 6, pomeranians: 2, samoyeds: 8\n" +
            "Sue 96: cars: 2, trees: 9, samoyeds: 4\n" +
            "Sue 97: goldfish: 5, trees: 1, children: 0\n" +
            "Sue 98: akitas: 9, goldfish: 7, children: 6\n" +
            "Sue 99: goldfish: 9, akitas: 0, pomeranians: 0\n" +
            "Sue 100: samoyeds: 6, children: 8, vizslas: 5\n" +
            "Sue 101: vizslas: 6, cars: 5, goldfish: 4\n" +
            "Sue 102: vizslas: 6, akitas: 2, perfumes: 6\n" +
            "Sue 103: samoyeds: 3, akitas: 7, children: 4\n" +
            "Sue 104: cars: 3, perfumes: 10, cats: 6\n" +
            "Sue 105: vizslas: 9, pomeranians: 0, cars: 1\n" +
            "Sue 106: cats: 6, samoyeds: 8, pomeranians: 5\n" +
            "Sue 107: cars: 7, trees: 4, akitas: 10\n" +
            "Sue 108: perfumes: 3, vizslas: 1, goldfish: 9\n" +
            "Sue 109: trees: 6, cars: 8, goldfish: 5\n" +
            "Sue 110: pomeranians: 2, children: 1, vizslas: 7\n" +
            "Sue 111: akitas: 0, vizslas: 8, cars: 0\n" +
            "Sue 112: goldfish: 3, vizslas: 6, akitas: 2\n" +
            "Sue 113: akitas: 10, pomeranians: 7, perfumes: 7\n" +
            "Sue 114: cars: 10, cats: 2, vizslas: 8\n" +
            "Sue 115: akitas: 8, trees: 1, vizslas: 2\n" +
            "Sue 116: vizslas: 2, akitas: 7, perfumes: 1\n" +
            "Sue 117: goldfish: 0, vizslas: 10, trees: 9\n" +
            "Sue 118: trees: 3, cars: 0, goldfish: 0\n" +
            "Sue 119: perfumes: 7, goldfish: 5, trees: 9\n" +
            "Sue 120: children: 9, vizslas: 3, trees: 5\n" +
            "Sue 121: vizslas: 1, goldfish: 7, akitas: 10\n" +
            "Sue 122: perfumes: 1, cars: 6, trees: 1\n" +
            "Sue 123: akitas: 2, vizslas: 0, goldfish: 7\n" +
            "Sue 124: vizslas: 10, pomeranians: 7, akitas: 0\n" +
            "Sue 125: perfumes: 4, cats: 5, vizslas: 2\n" +
            "Sue 126: cars: 6, samoyeds: 8, akitas: 3\n" +
            "Sue 127: trees: 9, goldfish: 7, akitas: 9\n" +
            "Sue 128: cars: 8, trees: 0, perfumes: 2\n" +
            "Sue 129: pomeranians: 7, vizslas: 2, perfumes: 6\n" +
            "Sue 130: vizslas: 9, pomeranians: 3, trees: 6\n" +
            "Sue 131: vizslas: 7, cars: 9, perfumes: 1\n" +
            "Sue 132: akitas: 2, pomeranians: 9, vizslas: 7\n" +
            "Sue 133: trees: 9, pomeranians: 10, samoyeds: 0\n" +
            "Sue 134: children: 4, akitas: 10, perfumes: 4\n" +
            "Sue 135: vizslas: 1, cats: 1, trees: 8\n" +
            "Sue 136: samoyeds: 7, cars: 8, goldfish: 5\n" +
            "Sue 137: perfumes: 0, children: 1, pomeranians: 10\n" +
            "Sue 138: vizslas: 4, perfumes: 5, cars: 5\n" +
            "Sue 139: trees: 2, perfumes: 8, goldfish: 0\n" +
            "Sue 140: cars: 10, akitas: 5, goldfish: 7\n" +
            "Sue 141: children: 4, trees: 3, goldfish: 8\n" +
            "Sue 142: cars: 8, perfumes: 6, trees: 7\n" +
            "Sue 143: akitas: 6, goldfish: 0, trees: 10\n" +
            "Sue 144: akitas: 7, pomeranians: 10, perfumes: 10\n" +
            "Sue 145: trees: 10, vizslas: 3, goldfish: 4\n" +
            "Sue 146: samoyeds: 4, akitas: 3, perfumes: 6\n" +
            "Sue 147: akitas: 8, perfumes: 2, pomeranians: 10\n" +
            "Sue 148: cars: 2, perfumes: 0, goldfish: 8\n" +
            "Sue 149: goldfish: 6, akitas: 7, perfumes: 6\n" +
            "Sue 150: cars: 2, pomeranians: 5, perfumes: 4\n" +
            "Sue 151: goldfish: 1, cars: 5, trees: 0\n" +
            "Sue 152: pomeranians: 4, cars: 7, children: 1\n" +
            "Sue 153: goldfish: 8, cars: 1, children: 10\n" +
            "Sue 154: cars: 6, perfumes: 8, trees: 1\n" +
            "Sue 155: akitas: 4, perfumes: 6, pomeranians: 2\n" +
            "Sue 156: pomeranians: 5, cars: 4, akitas: 1\n" +
            "Sue 157: cats: 5, cars: 9, goldfish: 8\n" +
            "Sue 158: vizslas: 5, samoyeds: 1, children: 7\n" +
            "Sue 159: vizslas: 1, perfumes: 3, akitas: 1\n" +
            "Sue 160: goldfish: 10, pomeranians: 9, perfumes: 5\n" +
            "Sue 161: samoyeds: 3, trees: 7, cars: 2\n" +
            "Sue 162: cars: 2, pomeranians: 1, vizslas: 6\n" +
            "Sue 163: vizslas: 3, perfumes: 5, akitas: 6\n" +
            "Sue 164: vizslas: 1, trees: 0, akitas: 5\n" +
            "Sue 165: vizslas: 5, cars: 6, pomeranians: 8\n" +
            "Sue 166: cars: 10, perfumes: 2, trees: 9\n" +
            "Sue 167: cars: 10, pomeranians: 6, perfumes: 4\n" +
            "Sue 168: akitas: 7, trees: 10, goldfish: 7\n" +
            "Sue 169: akitas: 1, perfumes: 10, cars: 10\n" +
            "Sue 170: akitas: 5, samoyeds: 8, vizslas: 6\n" +
            "Sue 171: children: 3, akitas: 2, vizslas: 3\n" +
            "Sue 172: goldfish: 5, vizslas: 5, perfumes: 9\n" +
            "Sue 173: perfumes: 5, goldfish: 10, trees: 5\n" +
            "Sue 174: akitas: 5, vizslas: 2, children: 7\n" +
            "Sue 175: perfumes: 5, cars: 7, samoyeds: 2\n" +
            "Sue 176: cars: 8, vizslas: 10, akitas: 7\n" +
            "Sue 177: perfumes: 7, children: 8, goldfish: 7\n" +
            "Sue 178: cars: 1, pomeranians: 9, samoyeds: 0\n" +
            "Sue 179: perfumes: 6, cars: 2, trees: 6\n" +
            "Sue 180: trees: 3, vizslas: 7, children: 3\n" +
            "Sue 181: vizslas: 8, samoyeds: 2, trees: 9\n" +
            "Sue 182: perfumes: 3, cats: 1, children: 5\n" +
            "Sue 183: akitas: 9, cats: 6, children: 3\n" +
            "Sue 184: pomeranians: 9, cars: 6, perfumes: 8\n" +
            "Sue 185: vizslas: 9, trees: 0, akitas: 9\n" +
            "Sue 186: perfumes: 6, cars: 5, goldfish: 5\n" +
            "Sue 187: perfumes: 4, cats: 7, vizslas: 2\n" +
            "Sue 188: akitas: 7, cars: 4, children: 10\n" +
            "Sue 189: akitas: 0, goldfish: 7, vizslas: 5\n" +
            "Sue 190: akitas: 5, cars: 5, cats: 6\n" +
            "Sue 191: cars: 6, children: 0, perfumes: 3\n" +
            "Sue 192: cats: 2, perfumes: 10, goldfish: 7\n" +
            "Sue 193: trees: 1, perfumes: 0, cars: 8\n" +
            "Sue 194: perfumes: 9, children: 4, cats: 6\n" +
            "Sue 195: akitas: 7, trees: 3, goldfish: 6\n" +
            "Sue 196: goldfish: 8, cars: 8, samoyeds: 0\n" +
            "Sue 197: cats: 0, akitas: 10, vizslas: 0\n" +
            "Sue 198: goldfish: 1, perfumes: 3, cars: 8\n" +
            "Sue 199: akitas: 10, vizslas: 5, samoyeds: 6\n" +
            "Sue 200: pomeranians: 9, goldfish: 9, samoyeds: 7\n" +
            "Sue 201: samoyeds: 0, goldfish: 7, akitas: 6\n" +
            "Sue 202: vizslas: 0, goldfish: 2, akitas: 1\n" +
            "Sue 203: goldfish: 3, children: 0, vizslas: 8\n" +
            "Sue 204: cars: 8, trees: 2, perfumes: 2\n" +
            "Sue 205: cars: 4, perfumes: 5, goldfish: 8\n" +
            "Sue 206: vizslas: 3, trees: 2, akitas: 1\n" +
            "Sue 207: cars: 7, goldfish: 5, trees: 1\n" +
            "Sue 208: goldfish: 1, cars: 6, vizslas: 8\n" +
            "Sue 209: cats: 4, trees: 1, children: 0\n" +
            "Sue 210: cats: 10, children: 0, perfumes: 0\n" +
            "Sue 211: cars: 4, pomeranians: 7, samoyeds: 5\n" +
            "Sue 212: cars: 2, pomeranians: 10, trees: 1\n" +
            "Sue 213: trees: 10, cats: 5, cars: 10\n" +
            "Sue 214: perfumes: 5, trees: 1, vizslas: 1\n" +
            "Sue 215: akitas: 10, vizslas: 8, samoyeds: 8\n" +
            "Sue 216: vizslas: 2, cats: 5, pomeranians: 3\n" +
            "Sue 217: akitas: 10, perfumes: 0, cats: 10\n" +
            "Sue 218: trees: 8, cats: 5, vizslas: 2\n" +
            "Sue 219: goldfish: 10, perfumes: 8, children: 2\n" +
            "Sue 220: samoyeds: 9, trees: 8, vizslas: 7\n" +
            "Sue 221: children: 7, trees: 6, cars: 6\n" +
            "Sue 222: cats: 4, akitas: 5, pomeranians: 0\n" +
            "Sue 223: trees: 8, goldfish: 2, perfumes: 8\n" +
            "Sue 224: pomeranians: 9, cars: 8, akitas: 5\n" +
            "Sue 225: akitas: 10, vizslas: 0, trees: 2\n" +
            "Sue 226: akitas: 8, cats: 6, cars: 7\n" +
            "Sue 227: trees: 1, akitas: 3, goldfish: 4\n" +
            "Sue 228: pomeranians: 6, cats: 3, goldfish: 3\n" +
            "Sue 229: trees: 10, perfumes: 3, vizslas: 7\n" +
            "Sue 230: perfumes: 8, cars: 7, akitas: 0\n" +
            "Sue 231: perfumes: 10, goldfish: 4, cars: 6\n" +
            "Sue 232: goldfish: 7, trees: 3, cats: 2\n" +
            "Sue 233: perfumes: 6, trees: 4, akitas: 4\n" +
            "Sue 234: goldfish: 9, cats: 4, cars: 7\n" +
            "Sue 235: pomeranians: 6, vizslas: 0, akitas: 6\n" +
            "Sue 236: samoyeds: 5, cars: 5, children: 4\n" +
            "Sue 237: vizslas: 10, cars: 4, goldfish: 4\n" +
            "Sue 238: goldfish: 3, samoyeds: 7, akitas: 2\n" +
            "Sue 239: cats: 8, children: 2, vizslas: 7\n" +
            "Sue 240: cars: 9, perfumes: 4, trees: 9\n" +
            "Sue 241: trees: 8, vizslas: 2, goldfish: 5\n" +
            "Sue 242: cars: 6, trees: 3, vizslas: 3\n" +
            "Sue 243: cats: 6, children: 7, cars: 4\n" +
            "Sue 244: cats: 10, perfumes: 2, goldfish: 7\n" +
            "Sue 245: akitas: 8, cats: 10, perfumes: 8\n" +
            "Sue 246: vizslas: 8, akitas: 5, perfumes: 10\n" +
            "Sue 247: goldfish: 2, vizslas: 5, akitas: 7\n" +
            "Sue 248: akitas: 3, perfumes: 0, trees: 10\n" +
            "Sue 249: cats: 4, vizslas: 5, pomeranians: 6\n" +
            "Sue 250: children: 3, vizslas: 7, perfumes: 2\n" +
            "Sue 251: cars: 0, pomeranians: 10, perfumes: 0\n" +
            "Sue 252: akitas: 0, goldfish: 9, cars: 6\n" +
            "Sue 253: perfumes: 7, cars: 4, samoyeds: 5\n" +
            "Sue 254: akitas: 9, trees: 10, cars: 4\n" +
            "Sue 255: samoyeds: 10, children: 6, akitas: 7\n" +
            "Sue 256: trees: 8, goldfish: 8, perfumes: 8\n" +
            "Sue 257: goldfish: 3, akitas: 2, perfumes: 6\n" +
            "Sue 258: cats: 7, trees: 0, vizslas: 1\n" +
            "Sue 259: perfumes: 7, cars: 7, akitas: 7\n" +
            "Sue 260: goldfish: 0, vizslas: 0, samoyeds: 2\n" +
            "Sue 261: vizslas: 2, children: 2, cats: 3\n" +
            "Sue 262: vizslas: 2, pomeranians: 9, samoyeds: 3\n" +
            "Sue 263: cats: 1, akitas: 3, vizslas: 1\n" +
            "Sue 264: pomeranians: 10, trees: 2, goldfish: 7\n" +
            "Sue 265: samoyeds: 5, trees: 7, perfumes: 4\n" +
            "Sue 266: perfumes: 10, cars: 1, pomeranians: 3\n" +
            "Sue 267: trees: 6, goldfish: 1, cars: 0\n" +
            "Sue 268: cars: 6, samoyeds: 4, pomeranians: 5\n" +
            "Sue 269: goldfish: 3, vizslas: 3, akitas: 3\n" +
            "Sue 270: children: 5, cats: 0, cars: 4\n" +
            "Sue 271: goldfish: 3, perfumes: 8, pomeranians: 7\n" +
            "Sue 272: samoyeds: 6, cars: 7, perfumes: 10\n" +
            "Sue 273: trees: 4, cars: 2, vizslas: 7\n" +
            "Sue 274: samoyeds: 10, perfumes: 9, goldfish: 6\n" +
            "Sue 275: cars: 4, trees: 2, perfumes: 7\n" +
            "Sue 276: akitas: 3, perfumes: 9, cars: 9\n" +
            "Sue 277: akitas: 8, vizslas: 2, cats: 6\n" +
            "Sue 278: trees: 5, goldfish: 7, akitas: 3\n" +
            "Sue 279: perfumes: 9, cars: 8, vizslas: 2\n" +
            "Sue 280: trees: 3, vizslas: 0, children: 0\n" +
            "Sue 281: cars: 7, trees: 2, cats: 5\n" +
            "Sue 282: vizslas: 4, cars: 10, cats: 3\n" +
            "Sue 283: akitas: 10, cats: 3, samoyeds: 9\n" +
            "Sue 284: trees: 7, children: 5, goldfish: 6\n" +
            "Sue 285: cars: 2, perfumes: 5, cats: 7\n" +
            "Sue 286: samoyeds: 5, trees: 10, goldfish: 6\n" +
            "Sue 287: goldfish: 10, perfumes: 4, trees: 7\n" +
            "Sue 288: vizslas: 9, trees: 9, perfumes: 0\n" +
            "Sue 289: trees: 4, goldfish: 9, vizslas: 8\n" +
            "Sue 290: vizslas: 3, cars: 3, trees: 2\n" +
            "Sue 291: goldfish: 2, akitas: 2, trees: 2\n" +
            "Sue 292: children: 1, cars: 0, vizslas: 5\n" +
            "Sue 293: trees: 5, akitas: 4, goldfish: 6\n" +
            "Sue 294: akitas: 3, vizslas: 7, pomeranians: 5\n" +
            "Sue 295: goldfish: 10, vizslas: 3, trees: 1\n" +
            "Sue 296: cars: 2, trees: 1, akitas: 0\n" +
            "Sue 297: akitas: 10, vizslas: 6, samoyeds: 2\n" +
            "Sue 298: children: 5, trees: 1, samoyeds: 9\n" +
            "Sue 299: perfumes: 9, trees: 6, vizslas: 1\n" +
            "Sue 300: akitas: 7, pomeranians: 6, vizslas: 6\n" +
            "Sue 301: cats: 7, children: 6, vizslas: 7\n" +
            "Sue 302: trees: 2, vizslas: 7, samoyeds: 4\n" +
            "Sue 303: goldfish: 0, samoyeds: 10, cars: 4\n" +
            "Sue 304: pomeranians: 9, children: 3, vizslas: 5\n" +
            "Sue 305: akitas: 8, vizslas: 4, cars: 5\n" +
            "Sue 306: akitas: 0, perfumes: 2, pomeranians: 10\n" +
            "Sue 307: akitas: 9, cars: 0, trees: 2\n" +
            "Sue 308: vizslas: 10, goldfish: 8, akitas: 6\n" +
            "Sue 309: trees: 0, cats: 6, perfumes: 2\n" +
            "Sue 310: vizslas: 10, cars: 1, trees: 4\n" +
            "Sue 311: goldfish: 8, perfumes: 6, cats: 3\n" +
            "Sue 312: goldfish: 0, children: 1, akitas: 2\n" +
            "Sue 313: pomeranians: 10, trees: 6, samoyeds: 6\n" +
            "Sue 314: vizslas: 5, akitas: 4, pomeranians: 2\n" +
            "Sue 315: goldfish: 7, trees: 0, akitas: 5\n" +
            "Sue 316: goldfish: 4, vizslas: 5, cars: 7\n" +
            "Sue 317: perfumes: 7, cats: 10, cars: 4\n" +
            "Sue 318: samoyeds: 10, cars: 9, trees: 7\n" +
            "Sue 319: pomeranians: 8, vizslas: 6, cars: 3\n" +
            "Sue 320: cars: 4, cats: 9, akitas: 4\n" +
            "Sue 321: cars: 6, trees: 2, perfumes: 6\n" +
            "Sue 322: goldfish: 1, cats: 2, perfumes: 4\n" +
            "Sue 323: akitas: 6, cats: 5, cars: 8\n" +
            "Sue 324: cats: 4, vizslas: 9, akitas: 0\n" +
            "Sue 325: children: 8, samoyeds: 9, trees: 4\n" +
            "Sue 326: vizslas: 2, samoyeds: 10, perfumes: 7\n" +
            "Sue 327: goldfish: 7, pomeranians: 4, akitas: 10\n" +
            "Sue 328: perfumes: 8, cats: 4, akitas: 10\n" +
            "Sue 329: trees: 0, cars: 9, goldfish: 3\n" +
            "Sue 330: trees: 5, samoyeds: 7, perfumes: 8\n" +
            "Sue 331: cars: 4, perfumes: 2, goldfish: 0\n" +
            "Sue 332: vizslas: 4, pomeranians: 7, akitas: 1\n" +
            "Sue 333: akitas: 4, goldfish: 3, perfumes: 0\n" +
            "Sue 334: samoyeds: 3, akitas: 10, vizslas: 0\n" +
            "Sue 335: goldfish: 1, akitas: 7, vizslas: 6\n" +
            "Sue 336: perfumes: 1, goldfish: 1, pomeranians: 8\n" +
            "Sue 337: children: 5, cars: 4, cats: 4\n" +
            "Sue 338: vizslas: 5, cars: 10, cats: 3\n" +
            "Sue 339: trees: 2, goldfish: 3, cars: 1\n" +
            "Sue 340: trees: 10, goldfish: 6, perfumes: 2\n" +
            "Sue 341: akitas: 5, trees: 6, cats: 3\n" +
            "Sue 342: cars: 10, children: 8, goldfish: 0\n" +
            "Sue 343: cats: 2, akitas: 0, pomeranians: 4\n" +
            "Sue 344: perfumes: 1, vizslas: 3, cars: 3\n" +
            "Sue 345: samoyeds: 8, cats: 5, perfumes: 8\n" +
            "Sue 346: cars: 5, akitas: 10, trees: 2\n" +
            "Sue 347: vizslas: 9, akitas: 9, cars: 3\n" +
            "Sue 348: cars: 3, perfumes: 1, pomeranians: 9\n" +
            "Sue 349: akitas: 1, cars: 4, perfumes: 0\n" +
            "Sue 350: perfumes: 8, vizslas: 2, trees: 6\n" +
            "Sue 351: pomeranians: 5, akitas: 9, cats: 8\n" +
            "Sue 352: pomeranians: 8, vizslas: 3, goldfish: 10\n" +
            "Sue 353: trees: 2, pomeranians: 0, goldfish: 6\n" +
            "Sue 354: cats: 5, akitas: 7, goldfish: 6\n" +
            "Sue 355: goldfish: 6, children: 4, trees: 10\n" +
            "Sue 356: children: 1, trees: 3, akitas: 7\n" +
            "Sue 357: trees: 2, samoyeds: 10, goldfish: 3\n" +
            "Sue 358: samoyeds: 10, cats: 0, goldfish: 0\n" +
            "Sue 359: perfumes: 3, children: 6, pomeranians: 1\n" +
            "Sue 360: cars: 10, pomeranians: 1, samoyeds: 5\n" +
            "Sue 361: samoyeds: 9, pomeranians: 7, perfumes: 6\n" +
            "Sue 362: goldfish: 6, trees: 8, perfumes: 9\n" +
            "Sue 363: samoyeds: 10, pomeranians: 9, children: 10\n" +
            "Sue 364: perfumes: 3, goldfish: 7, cars: 9\n" +
            "Sue 365: cats: 3, children: 4, samoyeds: 8\n" +
            "Sue 366: trees: 0, cars: 10, vizslas: 10\n" +
            "Sue 367: pomeranians: 10, children: 8, perfumes: 2\n" +
            "Sue 368: cars: 5, vizslas: 0, samoyeds: 3\n" +
            "Sue 369: trees: 1, goldfish: 8, cars: 8\n" +
            "Sue 370: vizslas: 0, cars: 2, perfumes: 5\n" +
            "Sue 371: trees: 2, cars: 3, vizslas: 8\n" +
            "Sue 372: trees: 10, children: 9, cats: 1\n" +
            "Sue 373: pomeranians: 3, perfumes: 1, vizslas: 0\n" +
            "Sue 374: vizslas: 0, perfumes: 6, trees: 0\n" +
            "Sue 375: vizslas: 7, pomeranians: 1, akitas: 10\n" +
            "Sue 376: vizslas: 8, trees: 2, cars: 10\n" +
            "Sue 377: perfumes: 9, cats: 5, goldfish: 5\n" +
            "Sue 378: cats: 0, akitas: 10, perfumes: 9\n" +
            "Sue 379: cars: 4, akitas: 1, trees: 1\n" +
            "Sue 380: cars: 4, perfumes: 5, trees: 3\n" +
            "Sue 381: goldfish: 3, akitas: 5, samoyeds: 9\n" +
            "Sue 382: goldfish: 7, perfumes: 5, trees: 5\n" +
            "Sue 383: akitas: 4, cats: 6, cars: 8\n" +
            "Sue 384: children: 6, goldfish: 10, akitas: 7\n" +
            "Sue 385: akitas: 7, vizslas: 5, perfumes: 10\n" +
            "Sue 386: children: 7, vizslas: 10, akitas: 10\n" +
            "Sue 387: goldfish: 6, akitas: 7, trees: 2\n" +
            "Sue 388: vizslas: 6, trees: 1, akitas: 2\n" +
            "Sue 389: cars: 5, vizslas: 3, akitas: 7\n" +
            "Sue 390: vizslas: 4, cats: 8, perfumes: 7\n" +
            "Sue 391: akitas: 3, trees: 0, children: 2\n" +
            "Sue 392: cats: 7, cars: 3, children: 9\n" +
            "Sue 393: trees: 10, vizslas: 3, goldfish: 7\n" +
            "Sue 394: perfumes: 0, goldfish: 7, akitas: 4\n" +
            "Sue 395: cats: 6, cars: 7, vizslas: 0\n" +
            "Sue 396: vizslas: 4, perfumes: 6, goldfish: 5\n" +
            "Sue 397: pomeranians: 8, trees: 1, akitas: 9\n" +
            "Sue 398: goldfish: 7, pomeranians: 6, samoyeds: 9\n" +
            "Sue 399: perfumes: 10, cars: 1, trees: 8\n" +
            "Sue 400: trees: 0, goldfish: 9, children: 6\n" +
            "Sue 401: trees: 1, cars: 6, pomeranians: 8\n" +
            "Sue 402: perfumes: 9, cars: 0, vizslas: 10\n" +
            "Sue 403: samoyeds: 4, akitas: 1, vizslas: 9\n" +
            "Sue 404: perfumes: 0, trees: 2, cars: 4\n" +
            "Sue 405: akitas: 0, perfumes: 5, samoyeds: 4\n" +
            "Sue 406: akitas: 8, vizslas: 6, children: 2\n" +
            "Sue 407: children: 1, trees: 8, goldfish: 10\n" +
            "Sue 408: pomeranians: 4, trees: 10, cars: 9\n" +
            "Sue 409: perfumes: 5, vizslas: 5, akitas: 4\n" +
            "Sue 410: trees: 1, akitas: 10, vizslas: 6\n" +
            "Sue 411: samoyeds: 0, goldfish: 9, perfumes: 7\n" +
            "Sue 412: goldfish: 7, samoyeds: 10, trees: 1\n" +
            "Sue 413: samoyeds: 0, pomeranians: 10, vizslas: 6\n" +
            "Sue 414: children: 2, cars: 10, samoyeds: 2\n" +
            "Sue 415: trees: 2, goldfish: 8, cars: 0\n" +
            "Sue 416: samoyeds: 4, goldfish: 9, trees: 2\n" +
            "Sue 417: trees: 8, akitas: 10, perfumes: 3\n" +
            "Sue 418: samoyeds: 9, goldfish: 2, cars: 1\n" +
            "Sue 419: akitas: 2, perfumes: 8, trees: 2\n" +
            "Sue 420: children: 3, goldfish: 6, perfumes: 5\n" +
            "Sue 421: akitas: 8, perfumes: 2, samoyeds: 6\n" +
            "Sue 422: vizslas: 10, akitas: 4, pomeranians: 3\n" +
            "Sue 423: cats: 8, perfumes: 3, trees: 4\n" +
            "Sue 424: cars: 2, children: 4, pomeranians: 8\n" +
            "Sue 425: pomeranians: 4, samoyeds: 2, goldfish: 4\n" +
            "Sue 426: perfumes: 6, cars: 4, goldfish: 4\n" +
            "Sue 427: akitas: 0, goldfish: 7, perfumes: 5\n" +
            "Sue 428: perfumes: 4, cars: 3, akitas: 5\n" +
            "Sue 429: trees: 0, vizslas: 0, goldfish: 1\n" +
            "Sue 430: perfumes: 4, vizslas: 2, cars: 7\n" +
            "Sue 431: goldfish: 7, pomeranians: 8, trees: 0\n" +
            "Sue 432: goldfish: 7, children: 9, trees: 3\n" +
            "Sue 433: akitas: 1, vizslas: 10, trees: 2\n" +
            "Sue 434: perfumes: 2, cars: 4, goldfish: 10\n" +
            "Sue 435: pomeranians: 6, vizslas: 9, trees: 1\n" +
            "Sue 436: cars: 9, trees: 0, goldfish: 0\n" +
            "Sue 437: trees: 1, goldfish: 1, vizslas: 8\n" +
            "Sue 438: goldfish: 7, samoyeds: 8, children: 2\n" +
            "Sue 439: children: 1, cats: 7, vizslas: 8\n" +
            "Sue 440: cats: 2, pomeranians: 6, goldfish: 4\n" +
            "Sue 441: perfumes: 7, cats: 3, vizslas: 6\n" +
            "Sue 442: akitas: 4, samoyeds: 5, cars: 2\n" +
            "Sue 443: akitas: 3, perfumes: 3, cats: 9\n" +
            "Sue 444: perfumes: 10, akitas: 6, trees: 0\n" +
            "Sue 445: cars: 5, children: 9, perfumes: 8\n" +
            "Sue 446: vizslas: 10, cars: 3, perfumes: 5\n" +
            "Sue 447: children: 9, perfumes: 1, cars: 10\n" +
            "Sue 448: akitas: 0, goldfish: 8, trees: 3\n" +
            "Sue 449: cars: 7, akitas: 8, children: 3\n" +
            "Sue 450: cars: 4, akitas: 9, cats: 0\n" +
            "Sue 451: perfumes: 4, samoyeds: 5, goldfish: 6\n" +
            "Sue 452: perfumes: 10, akitas: 1, cars: 7\n" +
            "Sue 453: trees: 1, goldfish: 3, vizslas: 6\n" +
            "Sue 454: goldfish: 8, pomeranians: 6, trees: 10\n" +
            "Sue 455: akitas: 5, vizslas: 8, goldfish: 10\n" +
            "Sue 456: cats: 5, trees: 4, samoyeds: 0\n" +
            "Sue 457: perfumes: 8, cars: 0, cats: 3\n" +
            "Sue 458: akitas: 1, trees: 10, vizslas: 2\n" +
            "Sue 459: vizslas: 6, akitas: 3, children: 10\n" +
            "Sue 460: perfumes: 7, trees: 9, goldfish: 8\n" +
            "Sue 461: children: 6, vizslas: 4, perfumes: 5\n" +
            "Sue 462: vizslas: 6, akitas: 8, perfumes: 9\n" +
            "Sue 463: goldfish: 8, cars: 4, trees: 10\n" +
            "Sue 464: pomeranians: 8, cars: 5, vizslas: 0\n" +
            "Sue 465: cats: 10, goldfish: 7, akitas: 1\n" +
            "Sue 466: cats: 2, children: 1, cars: 6\n" +
            "Sue 467: perfumes: 3, samoyeds: 6, cars: 0\n" +
            "Sue 468: samoyeds: 10, pomeranians: 6, trees: 2\n" +
            "Sue 469: children: 2, perfumes: 2, pomeranians: 4\n" +
            "Sue 470: cats: 1, perfumes: 5, vizslas: 9\n" +
            "Sue 471: vizslas: 5, perfumes: 2, akitas: 7\n" +
            "Sue 472: samoyeds: 8, goldfish: 6, cats: 1\n" +
            "Sue 473: goldfish: 10, perfumes: 9, cars: 4\n" +
            "Sue 474: samoyeds: 0, cars: 4, vizslas: 4\n" +
            "Sue 475: trees: 2, cars: 7, akitas: 8\n" +
            "Sue 476: vizslas: 3, perfumes: 5, goldfish: 1\n" +
            "Sue 477: cats: 7, cars: 4, trees: 1\n" +
            "Sue 478: vizslas: 8, akitas: 3, goldfish: 0\n" +
            "Sue 479: cars: 6, cats: 3, perfumes: 2\n" +
            "Sue 480: goldfish: 1, children: 9, vizslas: 3\n" +
            "Sue 481: pomeranians: 5, vizslas: 1, cars: 10\n" +
            "Sue 482: children: 5, perfumes: 5, cats: 1\n" +
            "Sue 483: perfumes: 2, goldfish: 7, trees: 6\n" +
            "Sue 484: akitas: 2, goldfish: 4, perfumes: 10\n" +
            "Sue 485: samoyeds: 3, goldfish: 0, akitas: 1\n" +
            "Sue 486: trees: 8, vizslas: 9, goldfish: 0\n" +
            "Sue 487: goldfish: 8, samoyeds: 0, trees: 0\n" +
            "Sue 488: perfumes: 7, cars: 5, trees: 0\n" +
            "Sue 489: vizslas: 3, pomeranians: 2, perfumes: 5\n" +
            "Sue 490: cars: 5, perfumes: 5, akitas: 5\n" +
            "Sue 491: children: 8, trees: 1, pomeranians: 4\n" +
            "Sue 492: pomeranians: 0, akitas: 1, vizslas: 8\n" +
            "Sue 493: akitas: 10, perfumes: 10, samoyeds: 8\n" +
            "Sue 494: perfumes: 6, vizslas: 4, cats: 6\n" +
            "Sue 495: children: 6, pomeranians: 5, samoyeds: 4\n" +
            "Sue 496: vizslas: 1, trees: 5, akitas: 1\n" +
            "Sue 497: vizslas: 10, perfumes: 10, pomeranians: 3\n" +
            "Sue 498: samoyeds: 3, trees: 2, cars: 5\n" +
            "Sue 499: cats: 6, children: 3, perfumes: 0\n" +
            "Sue 500: pomeranians: 10, cats: 3, vizslas: 5"
        };
        String[] args = new String[] {
            "children: 3\n" +
            "cats: 7\n" +
            "samoyeds: 2\n" +
            "pomeranians: 3\n" +
            "akitas: 0\n" +
            "vizslas: 0\n" +
            "goldfish: 5\n" +
            "trees: 3\n" +
            "cars: 2\n" +
            "perfumes: 1"
        };

        @Test
        void part1()
        {
            ex.input = inputs[0];
            ex.setArgs(args);
            Assertions.assertThat(ex.answer1()).isEqualTo("373");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            ex.setArgs(args);
            Assertions.assertThat(ex.answer2()).isEqualTo("260");
        }
    }

    @Nested
    class day17
    {
        AOCExercise ex = new No_Such_Thing_as_Too_Much();
        String[] inputs = new String[] {
            //0
            "20\n" +
            "15\n" +
            "10\n" +
            "5\n" +
            "5",
            //1
            "50\n" +
            "44\n" +
            "11\n" +
            "49\n" +
            "42\n" +
            "46\n" +
            "18\n" +
            "32\n" +
            "26\n" +
            "40\n" +
            "21\n" +
            "7\n" +
            "18\n" +
            "43\n" +
            "10\n" +
            "47\n" +
            "36\n" +
            "24\n" +
            "22\n" +
            "40"
        };

        @Test
        void part1()
        {
            ex.input = inputs[0];
            ex.setArg("25", 0);
            Assertions.assertThat(ex.answer1()).isEqualTo("4");

            ex.input = inputs[1];
            ex.setArg("150", 0);
            Assertions.assertThat(ex.answer1()).isEqualTo("654");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            ex.setArg("25", 0);
            Assertions.assertThat(ex.answer2()).isEqualTo("3");

            ex.input = inputs[1];
            ex.setArg("150", 0);
            Assertions.assertThat(ex.answer2()).isEqualTo("57");
        }
    }

    @Nested
    class day18
    {
        AOCExercise ex = new Like_a_GIF_For_Your_Yard();
        String[] inputs = new String[] {
            //0
            ".#.#.#\n" +
            "...##.\n" +
            "#....#\n" +
            "..#...\n" +
            "#.#..#\n" +
            "####..",
            //1
            "#..####.##..#...#..#...#...###.#.#.#..#....#.##..#...##...#..#.....##..#####....#.##..##....##.#....\n" +
            ".#..#..#..#.###...##..#.##.....#...#..##....#####.##............####.#..######..#.#.##.#...#..#...##\n" +
            "#.....##.##.##.#..##.#..###...#.#.#..##..###.####.####.#.####.#...##.#..###.........#.###...#....###\n" +
            "#.###..#######..##..#.....##.#.#.###.#.##..#.##..##.##.#.##...###.#...#.#####.#.##..#.#####..#.#####\n" +
            "#.##.##.###.##..###.#.##.##...##.#.#..##..###.########.#.####..####...#####...#..#...##....##.##.##.\n" +
            "..#.#.#.#..#.#.###....###...#...#.##..####.###.....#.####.###.###.#......#.#.###..#..#.#....#.#####.\n" +
            "...#.###.#....#.###...#.#.#...#...#.#####....#....#...#####..#..#.#..######..#.##.#.##.#..###.#...##\n" +
            ".###...#...#.#..#.#.####.#...#.....##...###.#....#..##.###....#.##....###..#.#####...###.#.##.####..\n" +
            "#.#....##.#.....#####.#.##..#######.#.####..###.##.#####.##.#...###...#.#...###..#...#.#.###.###.###\n" +
            "...##.##.....##..#.##...#.#...#...#.#####.#...#.#.#.#####.##.#...#.#..##.##..#...#....####..###.###.\n" +
            "#..#....######...#...###.#....#####....#.#.#....#....#.#######.#####..#....#....#.##..#.##.###..#...\n" +
            "#####.#.######.#.#####.#..##..##..####..#....#...#######....##..##.#..###..###.###..###...#...######\n" +
            "#...##..##...###....##..##.##..#.#.#.#....##.#.......###..###..###...###..##.##.##.#.#.#..#.#..#..#.\n" +
            "..###....##.###..#.#..########...###...##..#######....##..###..#####.##.#....###..##.##.##.#...##.#.\n" +
            "###..#.#..#.#.##.##...##.....#..###.#..##.##.#....##.#.######..##..#.#.##.###...#..####...#.#..#.###\n" +
            ".######....#..##..#.####.##..#.#..#.#..#....#..##.#..#.#...####..#....#.####.#.###.#...####.#...#.#.\n" +
            "#.######.##..###.###..#..###.#...#..#...#...###.##....#.#......#...#.##.#.###..#.#####.#.#..###..#.#\n" +
            "...#..#...####..###.########.....###.###.#..##.##....######..#..#.....#.##.##.#..##..#..##...#..#..#\n" +
            "#..#..##..#.#.########.##.#.####..#.#####.#.###.##....###..##..#.#.###..#.##..##.##.####...######.##\n" +
            ".######.###....#...##...#..#....##..#.#...###.######.##...#....##.##.#.#.##..#...###.###.#....#..##.\n" +
            "####.#.##..##.##.###...#.###.##..##....###..####.##..#.#.##..###.#..##...####...#..####.#.#..##...#.\n" +
            ".#.#..#.....##...#..#...#.#...#.#.##..#....#..#......#####.#######....#.#..#..###..##.#.########..##\n" +
            ".##.#..#..##..#..####.#...####...#...#..##.#..###.#..######..#.#...###.##...#..#####..##.#..##.#.##.\n" +
            ".###..##.##.##....###.###..#.#...##.#.#...#.#######.####..#..###.#######.#...#.#...#.##...#..####..#\n" +
            "##.########..#..#....#.###..##.##.#.##.#..#......####..##.##.#..####..#####..#.....#####.###..#.#.#.\n" +
            ".#..####..##.#.#..#####.##..#..#.#....#.#####.#####...######........##.##..##.#.#.###..#.#.#.#..##.#\n" +
            ".##..##..#.######..###....#.#.###.#........#..###..#.########.....#.##...#.....#..#...##...#..#.###.\n" +
            "##.##.#..####....####.#######.....#.#.#...#.######.#.....####.####...###..####.##.##....###..#..#...\n" +
            "#.#..####...#......#...###...##....##.#######..#.###.#...###.##.##...####..#.####..#......##..#####.\n" +
            ".#.#...##...#....#.####.##.....#....#.#.#######..###.#.....#.....####...##...#.#.##.####..##.###.#.#\n" +
            "####.#.#.####...#...####.#.....#.#######.#.......####......###..###.#...######..#.##.#.##..#..##..##\n" +
            "..##.###..#..####..####.......######.##..#.....##.##...##.##......#.###..###...#.##.#####.#.######.#\n" +
            ".###..####.###..#..#.......#.##...##...##.######.....#..####.#......#.#...#...#...###...#.#.##..####\n" +
            ".####....##.##.#.....##.###.####.#.......#.......#.#..#.#.#.....###.#.#####.#..#.#.#####.#####.###.#\n" +
            ".##.#.###.#####..#..#....###.#.#.#..#..###..##..####..##.###....#..####.####.#..###.#..######.######\n" +
            "####.#.....##..###....#.....#.##.#.##..##..########.#####..###.####....##.....######.#.#.##.......#.\n" +
            "#.#.##.....#.....##.###.#..#.##.##....#..##....##.#.###.##.#..#..##.##.###.#..##.###...##..###.#####\n" +
            "#.###.#.#.#.#.#.#.#...#..#.###..####.##...#..####.###....#..#..##.#....####..##.##....#.#.##.##....#\n" +
            "...######....#..####...#.#..#.#.#..#.##.#.#.......#..#......##..#...#..#..##...##.#...#.#.#...##.##.\n" +
            ".#####..#...####....#..###..##....#####..###.#.#...###..###.###..##...#......#...#...#.#.#...#.##..#\n" +
            "......#####.#...#.#.#.##..#.###..##..#.#...###..###....##..#####..#######.#..#.###....###...##.#..#.\n" +
            "..##.########.##..#....##.#...##.##.#.#..#.##..#.#.#.##....#.#.#.#.##....##....#....#####.##..#.##.#\n" +
            "####...#....##.#.###......##.##.#..##...#..#####..#.#....##..#####...#.#.##...#.####.####..##.######\n" +
            ".##.###.##.#...#.#....###.#######...##...##..#..##.###.#.####..#..###......#.#.##.#.#....#..##...#..\n" +
            ".#.###.#.###.###.#.##.#..#......####.##...#..##.#..####.....#...#.###.##.##.#..#.##..#.###......#..#\n" +
            "...##.####......#.#.#..###..#....###....#.##.#####..#..#..#...#.#.###...#.#.#.##....###.####..###.#.\n" +
            "##..#.#.#.#....####...#.##.###..####....#..#####.######..#.##.##..#####.#.....#.#...##.#.##.##.#.#..\n" +
            "#..##.#.#.#.###.#.#.###...#.#...##..#..#.#.#.##..###...#..##.#..#.#.#..#.....#.######.#.###..###.#..\n" +
            "....#.#.##.###.##...#.##.#....#..##.#..##...#...#.##.####...##..####.#.........#..##..#...#...##.#..\n" +
            ".##.......##...###.##.#.##.###.##.#..#..#..####...#...#....#####...###..##..#..#..##...#....#..#####\n" +
            "..####..#...#...#..###....##.#.#####..#..#.....#......#...#.......##....####...##....##.##.#.#####.#\n" +
            "##.#.#.#..##..##..#.####.##.##.###.#...###.#....#.....#.###...#######..###.####.###.####.##...##.#..\n" +
            "..#.#...##.#....#..#..##.####.....#.#.#...#..#..###.#..###.#####.#.#####.#.#.#.#.###.##.###..#....##\n" +
            ".###.#...#....###..#...####....####..#.##..#..##.###..#.#.#.#..#...###.#.#...#......#...#.##.##.#...\n" +
            "..####.####.##.#.##....#...##....#..#....#..###..#...#..###.#####.....#####..##.#.#.#.#.#.##.####...\n" +
            "...##.#.##.####..##.###..#.#.#.#.#.#.#..###...#.##..#.####.##...#.#.##......###..#...###....#.#.###.\n" +
            "##...##..#.#.##..#.#.#....#.####.......#.#.#######.#..#....#.###.#...###.##....###.#.#..#.#.##.####.\n" +
            "...##.......######.....##....#...#..#.##.###.#..#.##.###.#.###.#.#.#...#.#...##.##.##..#.##########.\n" +
            "###..#....#.#.....#....###.#...##.......##.#.#..#.#...########......###..##.#..#..####.##..####...#.\n" +
            "......##.###.#.###.....#..#...#.#......##....#....#........#..#...##.##.....#...##.##.........##....\n" +
            ".##.##.#.#...#....######..##....##..##.#.#.##.#.##..##...#..###......##......#.#....#.#.#.......###.\n" +
            ".......#.##..##.#...#.##..#..#####.#..#.######.........###.#####.####.#...##...........##...##..####\n" +
            "#......#.#..#...#...##..#.#.###.##.##.#.#..#.###.##.#..###..#.###..#...###.##..###..#...#..###...#..\n" +
            "####.##..#####..####.#...#..#..###..##.#.#...#...#...#.##.####.##.###....###...#.#.#..####.######.##\n" +
            ".....#..####...#.#.#.####..####..##.###......#.....########.#...#.#..#..#...#.###..##.#####..###.###\n" +
            ".#######.#.##..###.#...###.#####............##.###...#.##.#.##..##.#.#..#.######..######..#..#..####\n" +
            "...##..#.####...#..#.#.##.#....#.####..#..###.###..#.#...#....##.##.#......##..##..#.#.#.###..#..#..\n" +
            "........#...#.##.#.#..#....####....#.##...###..####...###.#.#..######..###..##.#####.###.###.#.#...#\n" +
            "##......##.#..###.####.##.#.###.#.......#.##..####..#.###.##..##..##...##...#.###...#.#..#..#.#####.\n" +
            "##..#.#.....##.####.#..##.#.##.#.#...#...#.#...####.#.#.##...##....##.###..###.####.#...#.###..#####\n" +
            ".#####.####.####.####.#.##.##......###....###.####...###...#...#..#.##.#.#####.###..##.#..###...##..\n" +
            ".#...#..##...##...#....#.#.#..##..#.##..#.###.#.###..###.#.#.###.#....#######.####.##..#..#...####..\n" +
            "..##.##..#.##..#.#.###..#.##.########...####.#.###.##..#..###.###...##..##.#..#.######.##.#....###.#\n" +
            "##.#####.###.##.#.##.##.##.###..##..##..#.#.#.#.####..#......#.#.#.#.#.#.##...#####.####...#.#...#.#\n" +
            ".#..###..##.#####.#.##.#..##...##..##...#####.#.####..#...##.....######.#.#...##.#..#######.###.###.\n" +
            "#.#..##.#.#####.#.#.....###.###.#..##.#####....#.###.##.##.#.#..##..#.#....#######.###.#.#.....#.###\n" +
            "....###...#.###.####....###.....##....#####.##.###.###.##.##.##.#..###..######...####.#.#..####..#..\n" +
            "###.....#..####..#.####..#..#...##.##..##.######.####.....#...##....#..#.##.#####..###.##.#.####...#\n" +
            ".##.##.#...#..####...##.##.###...#...#..#.#.#####.....####...#.#.#..#.####...####.#...###.#......###\n" +
            "###.##....#.#.#...#.###....####..##...##.##.##.#..#...####..#..#..##...#####.####.####...##.#..###.#\n" +
            "..####.....##..###.#.#.###.########..#...#.##..#.#.#.......#.##.#..#...####.##.#..#.######..#.#...#.\n" +
            "#.#.##.#.#.##.#....##......##......#######.#..#.##...##..#.#.###...#.#..#..###...#..###.....##.....#\n" +
            "..#.##.#.##.#.##..##.....#.#..#.#..#...##..#..#.#....###.#####....####.####..#####.##.###...#..###.#\n" +
            "#....#.###..#..########.###..#.#.#.##...##.#..##.###..#..#..#.#.##..###...###.#.##..#.##.#..#.#.####\n" +
            "#.......#######......#...#...##.##...###.#....##.#..#....####.#.##.###...#.#####...##.###........##.\n" +
            ".##.####.....###.##......####.###.########..#.####..#.##.#.####.....#...#.##....#######.##..#......#\n" +
            "#.#.##.##....##..##.#.###..#.##.#..#..#.#..##.....###..###.##.##.####.##.#.#.##...####..#.#..##.#.#.\n" +
            "...##.#.#.#...###.#.......#.#.....#.#...##....##.##.##.####...#.#..#..#..#.#.##.#..#.#.#....###..#.#\n" +
            "....#.#.###.#####.##..###..##..#...#.##.#......##.####.#..####.#.##..####.#.#...##..#####..##.#.#...\n" +
            "..###.#.##..#....#..#.#.....##.#####..##....#.#...#.##..##.#.#..#...##.##..##..##....#...#..#..#..##\n" +
            "##.#.##.#...#.###.##.##.##.##..##.##...#..##.#..#######.#..#...#.#.##..#....##.#..####.###........#.\n" +
            ".##.#..#.....#####..##.#.#.#.#..###.#######.###.###....##....#.#.#.###....###.#..#.#....#.#..###...#\n" +
            "...###.#.#.###..#...#..###.######..##.#.#..#...####.#####.##..#..###...#..#..#..###..##.#.#...#.###.\n" +
            "#......#.#..#..##.##.#.##.#.###.#.##.#.#..#....#.##..#..##..##.#.#.#....##.###.###.####.#.#####...##\n" +
            "...#.##..#.######.......#.#.###.....#####....##.#.#.###........#.#.###.#.#########.##.##.#..##..#...\n" +
            "##..###..###....####.##.##..##.###....####..##...####.####..####..###.####..##.#...###.#####.##.##.#\n" +
            "###...##.#.#.#####..#..#####...##.#...#.#.###.#..##..###.##.#.#.....####.##.#..##.###.#...##.##...##\n" +
            "...#.#.##.##..##....#..#.#####.##.###..#.#.#........####.###.##....##....####..#.#....#.#.#.###..#.#\n" +
            "..#.#.#.#.###...#....##..######.##....#.#.##..###..#.#.###..#.##..#.#.###......#..#..#.####..#...##.\n" +
            ".....####.#.....###.#.##.#..##.#..###.#####.#..##...###.#..###..#..##....###.#..##.#..#.##.#..#...##"
        };

        @Test
        void part1()
        {
            ex.input = inputs[0];
            ex.setArg("4", 0);
            Assertions.assertThat(ex.answer1()).isEqualTo("4");

            ex.input = inputs[1];
            ex.setArg("100", 0);
            Assertions.assertThat(ex.answer1()).isEqualTo("1061");
        }

        @Test
        void part2()
        {
            ex.input = inputs[0];
            ex.setArg("5", 0);
            Assertions.assertThat(ex.answer2()).isEqualTo("17");

            ex.input = inputs[1];
            ex.setArg("100", 0);
            Assertions.assertThat(ex.answer2()).isEqualTo("1006");
        }
    }
}
