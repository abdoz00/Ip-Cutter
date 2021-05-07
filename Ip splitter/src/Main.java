public class Main {
    public static void main(String[] args) {
        int[] res=IpCutter.getIps("172.128.5.6");
        for (int i:
             res) {
            System.out.println(i);
        }
    }
}
