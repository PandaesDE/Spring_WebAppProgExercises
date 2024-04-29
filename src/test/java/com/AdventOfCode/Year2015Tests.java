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
}
