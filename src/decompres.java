public class decompres {
    public static void main(String args[])
    {
        StringBuffer decomp= new StringBuffer();
        decomp.append("3[abc]4[ab]c");
        StringBuffer output_str=parsestring(decomp,1);
        System.out.println(output_str);

    }

    public static StringBuffer parsestring(StringBuffer input,int repeat) {
        StringBuffer output = new StringBuffer();
        StringBuffer recurr_str = new StringBuffer();
        boolean inloop = false;
        int obcount = 0;
        int times = 0;
        for (int t = 0; t < repeat; t++) {
            for (int i = 0; i < input.length(); i++) {
                if (Character.isLetter(input.charAt(i)) && !inloop) {
                    output.append(input.charAt(i));
                }
                if (Character.isDigit(input.charAt(i)) && !inloop) {
                    times = (times * 10) + (Character.getNumericValue(input.charAt(i)));
                }
                if (Character.isDigit(input.charAt(i)) && inloop) {
                    recurr_str.append(input.charAt(i));
                }
                if (input.charAt(i) == '[') {
                    if (!inloop) {
                        inloop = true;
                    } else {
                        recurr_str.append(input.charAt(i));
                    }
                    obcount++;
                }
                if (input.charAt(i) == ']') {
                    obcount--;
                    if (obcount != 0) {
                        recurr_str.append(input.charAt(i));
                    }
                    if (obcount == 0) {
//                            System.out.println("call recurssive function with string: " + recurr_str);
//                            System.out.println("call recurssive function with int: " + times);
                        output.append(parsestring(recurr_str, times));
                        times = 0;
                        recurr_str.delete(0, recurr_str.length());
                        inloop = false;
                    }
                }
                if (Character.isLetter(input.charAt(i)) && inloop) {
                    recurr_str.append(input.charAt(i));
                }
            }

        }
        return output;
    }
}
