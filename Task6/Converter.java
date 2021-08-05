package Task6;

public class Converter {
    public void converd(int number) {
        StringBuilder sb = new StringBuilder();
        String str = Integer.toString(number);
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case '0' -> sb.append(" 0000\n" +
                        "00  00\n" +
                        "00  00\n" +
                        "00  00\n" +
                        " 0000\n\n");
                case '1' -> sb.append("1111\n" +
                        "  11\n" +
                        "  11\n" +
                        "  11\n" +
                        "111111\n\n");
                case '2' -> sb.append(" 2222\n" +
                        "22  22\n" +
                        "   22\n" +
                        "  22\n" +
                        "222222\n\n");
                case '3' -> sb.append(" 3333\n" +
                        "33  33\n" +
                        "   333\n" +
                        "33  33\n" +
                        " 3333\n\n");
                case '4' -> sb.append("44  44\n" +
                        "44  44\n" +
                        "444444\n" +
                        "    44\n" +
                        "    44\n\n");
                case '5' -> sb.append("555555\n" +
                        "55\n" +
                        "55555\n" +
                        "    55\n" +
                        "55555\n\n");
                case '6' -> sb.append(" 6666\n" +
                        "66\n" +
                        "66666\n" +
                        "66  66\n" +
                        " 6666\n\n");
                case '7' -> sb.append("777777\n" +
                        "   77\n" +
                        "  77\n" +
                        " 77\n" +
                        "77\n\n");
                case '8' -> sb.append("  8888\n" +
                        "88  88\n" +
                        " 8888\n" +
                        "88  88\n" +
                        " 8888\n\n");
                case '9' -> sb.append(" 9999\n" +
                        "99  99\n" +
                        " 99999\n" +
                        "    99\n" +
                        " 9999\n\n");

            }
        }
        System.out.println(sb);
    }
}
