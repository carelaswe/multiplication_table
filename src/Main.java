import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("  *Таблица умножения*\nВведите начало горизонтального диапазона x1 = ");
        int horizontalStart = scan.nextInt();
        System.out.print("Введите конец горизонтального диапазона x2 = ");
        int horizontalEnd = scan.nextInt();
        System.out.print("Введите начало вертикального диапазона y1 = ");
        int verticalStart = scan.nextInt();
        System.out.print("Введите конец вертикального диапазона y2 = ");
        int verticalEnd = scan.nextInt();
        System.out.print("* ");
        for (int i = 0, y = 0; i <= verticalEnd - verticalStart+1; ) {
            if (i == 0 && y <= horizontalEnd - horizontalStart) {
                System.out.print((horizontalStart + y) + " ");
                y++;
            } else if (i > 0 && y <= horizontalEnd - horizontalStart) {
                System.out.print(((horizontalStart + y) * (verticalStart + i - 1)) + " ");
                if (i == verticalEnd - verticalStart+1 && y == horizontalEnd - horizontalStart) return;
                y++;
            } else {
                System.out.print("\n" + (verticalStart + i) + " ");
                y = 0;
                i++;
            }
        }
    }
}