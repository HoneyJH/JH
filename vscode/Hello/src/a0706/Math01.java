public class Math01 {
    public static void main(String[] args) {
        // ceil 올림
        System.out.println(Math.ceil(10.0)); // 10.0
        System.out.println(Math.ceil(10.1)); // 11.0
        System.out.println(Math.ceil(10.000001)); // 11.0

        // floor 내림
        System.out.println(Math.floor(10.0)); // 10.0
        System.out.println(Math.floor(10.9)); // 10.0

        // round 반올림
        System.out.println(Math.round(10.0)); // 10
        System.out.println(Math.round(10.4)); // 10
        System.out.println(Math.round(10.5)); // 11
    }
}
