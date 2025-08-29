import java.util.Scanner;
class Rectangle{
    int length;
    int width;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter width:");
        width = sc.nextInt();
    }
    void showdata(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    void calcArea(){
        int area = length * width;
        System.out.println("Area: " + area);
    }
}
public class new3{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.getdata();
        rect.showdata();
        rect.calcArea();
    }
    
}