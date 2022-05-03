public class test {
    public static void main(String[] args) {
        Week today = Week.TUESDAY;
        if(today == Week.TUESDAY){
            int num = today.ordinal();
            System.out.println(num + " today is Tuesday!");
        }
    }
}
