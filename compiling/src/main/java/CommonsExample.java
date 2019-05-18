import org.apache.commons.lang3.StringUtils;

public class CommonsExample {

    public static void main(String[] args) {
        System.out.println(StringUtils.join(args, ","));
    }
}
