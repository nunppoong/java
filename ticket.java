public class Main //클래스 이름에 맞게 수정하세요
{
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        int children;
        int adult;
        int sum;
        int price = 0;
       
       System.out.print("아동 수:");
       children = sc.nextInt();
       
       System.out.print("성인 수:");
       adult = sc.nextInt();
       
       sum = children + adult;
       
       System.out.println("총 수량:" + sum);
       
       price = children*6000 + adult*8000;
       
       System.out.println("금액:" + price);
   }
}