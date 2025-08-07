import javax.swing.*;
import java.util.*;

public class PatternProject {
    void gridpattern() {
        System.out.println("----Basic grid pattern----\n");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    void rowpattern() {
        System.out.println("----Row grid pattern----\n");
        int i, j, N = 5;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void columnpattern() {
        System.out.println("----Column grid pattern----\n");
        int i, j, N = 5;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void Reversecolumnpattern() {
        System.out.println("----Reverse column grid pattern----\n");
        int i, j, N = 5;
        for (i = 1; i <= N; i++) {
            for (j = N; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void Reverserowpattern() {
        System.out.println("----Reverse row grid pattern----\n");
        int i, j, N = 5;
        for (i = N; i >= 1; i--) {
            for (j = 1; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void iequaljpattern() {
        System.out.println("----Diagonal number line pattern----\n");
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print((i == j) ? "8 " : "X ");
            }
            System.out.println();
        }
    }

    void SRAT() {
        System.out.println("----Series right angled triangle pattern----\n");
        int i, j, num = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? num + " " : "0 ");
                num++;
            }
            System.out.println();
        }
    }

    void RAT() {
        System.out.println("----Right angled triangle pattern----\n");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    void invertedRAT() {
        System.out.println("----Inverted Right angled triangle pattern----\n");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void numbertriangle() {
        System.out.println("----Numbers right angled triangle pattern----\n");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void floydspattern() {
        System.out.println("----Floyd's triangle pattern----\n");
        int i, j, num = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    void binarypattern() {
        System.out.println("----Binary pattern----\n");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j) % 2 == 0) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    void Leftalignedpattern() {
        System.out.println("----Right aligned triangle pattern----\n");
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print((j <= n - i) ? "  " : "* ");
            }
            System.out.println();
        }
    }

    void hollowsquare() {
        System.out.println("----Hollow square pattern----\n");
        int i, j, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print((i == 0 || i == n - 1 || j == 0 || j == n - 1) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    void rightalignedarrow() {
        System.out.println("----Right aligned arrow pattern----\n");
        int i, j, n = 5;
        for (i = 1; i <= n + n - 1; i++) {
            if (i <= n) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (j = n + n - 1; j >= i; j--) {
                    System.out.print("* ");

                }
            }
            System.out.println();
        }
    }

    void Rhombus() {
        System.out.println("----Rhombus pattern----\n");
        int i, j, n = 5;
        for (i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (j = 1; j <= n; j++) {
                    if (j <= n - i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
            } else {
                for (j = i; j <= 2 * n - 1; j++) {
                    if (j >= i - n) {
                        System.out.print("* ");
                    } else {
                        System.out.println(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    void pyramid() {
        System.out.println("----Pyramid pattern----\n");
        int i, j, N = 5, space, star;
        for (i = 1; i <= N; i++) {
            space = N - i;
            star = i;
            for (j = 1; j <= space + star; j++) {
                System.out.print((j <= space) ? " " : "* ");
            }
            System.out.println();
        }
    }

    void Diamond() {
        System.out.println("----Diamond pattern----\n");
        int i, j, N = 5, space, star;
        for (i = 1; i <= N + N - 1; i++) {
            space = (i > N) ? i - N : N - i;
            star = (i > N) ? i : (N + N - 1) - i + 1;
            for (j = 1; j <= N; j++) {
                System.out.print((j <= space) ? " " : "* ");
            }
            System.out.println();
        }
    }

    void box() {
        System.out.println("---- Hollow diamond in box pattern----\n");
        int N = 5, i, j;
        for (i = 1; i <= N + N - 1; i++) {
            for (j = 1; j <= N + N - 1; j++) {
                System.out.print((j <= N - i + 1 || j > (N + i - 2)
                        || (i >= N && (j <= (i - N + 1) || j >= N + N - (i - N + 1)))) ? "X " : "  ");
            }
            System.out.println();
        }
    }

    void Sandclock() {
        System.out.println("----Sandclock pattern----\n");
        int N = 5, i, j, x = N + N - 1, s = 0, w;
        for (i = 1; i <= N + N - 1; i++) {
            s = i <= N ? ++s : --s;
            System.out.print("  ".repeat(s));
            for (j = 1, w = 0; j <= x; j++) {
                System.out.print((j <= N - s + 1) ? (++w) + " " : (--w) + " ");
            }
            x = (i < N) ? (x - 2) : (x + 2);
            System.out.println();
        }
    }

    void pattern() {
        System.out.println("----Straight & reverse pattern----\n");
        int i, j, x = 5, N = 5;
        for (i = 1; i <= N; i++) {
            for (j = 1, x = 5; j <= N; j++, x--) {
                System.out.print(((i % 2) == 0) ? x : j);
            }
            System.out.println();
        }
    }

    void unique() {
        System.out.println("----Unique box pattern----\n");
        int i, j, n = 5;
        for (i = 1; i <= n + n - 1; i++) {
            for (j = 1; j <= n + n - 1; j++) {
                System.out.print(
                        (i == 1 || i == n + n - 1 || j == 1 || j == n + n - 1 || i == n || j == n || (i > n && j < n))
                                ? "X "
                                : "  ");
            }
            System.out.println();
        }
    }

    void Sandclock2() {
        System.out.println("----Sandclock pattern----\n");
        int N = 6, i, j, X = N + 1, s = 0, M = 1;
        int tot = ((N * (N + 1)) / 2) * 2, z = 9;
        for (i = 1; i <= N + N - 1; i++) {
            X = i <= N ? --X : ++X;
            s = i <= N ? ++s : --s;
            System.out.print(" ".repeat(s));
            for (j = 1; j <= X; j++, M++) {
                System.out.print((M <= 9) ? M + " " : (M > (tot - 9)) ? (--z) + " " : (M % 2 == 0) ? "0 " : "9 ");
            }
            System.out.println();
        }
    }

    void sandclock3() {
        System.out.println("----Sandclock pattern----\n");
        int N = 5, i, j, x = 9, s = 0;
        for (i = 0; i <= x; i++) {
            s = i <= N ? ++s : --s;
            System.out.print("  ".repeat(s));
            for (j = 0; j <= x; j++) {
                System.out.print("X ");
            }
            x = (i < N) ? (x - 2) : (x + 2);
            System.out.println();
        }
    }

    void butterfly(){
        System.out.println("----Butterfly Pattern----\n");
        int N = 5, i , j;
        for( i = 1; i <= N+N-1 ; i++){
            for( j = 1; j <= N+N-1 ; j++){
                System.out.print((i <= 5) ? (j <= i || j >= (N+N-i)) ? "X " : "  " : (j <= (N-(i - N)) || j >= (N+(i - N))) ? "X " : "  ");
            }
            System.out.println();
        }
    }

    static void MainModule() {
        System.out.println("\n\n\t\t\t\t-----Pattern Generator-----\n\n");
        System.out.println("\t-----Basic level patterns-----\n");
        System.out.println("\t1. Basic grid\t\t\t\t2. Rows");
        System.out.println("\t3. Columns\t\t\t\t4. Reverse columns ");
        System.out.println("\t5. Reverse rows\t\t\t\t6. Diagonal number line\n ");
        System.out.println("\t-----Medium level patterns-----\n");
        System.out.println("\t7. Series right angled triangle\t\t8. Right angled triangle");
        System.out.println("\t9. Inverted right angled \t\t10. Number right angled triangle ");
        System.out.println("\t11. floyd's triangle \t\t\t12. Binary\n ");
        System.out.println("\t-----Hard level patterns-----\n");
        System.out.println("\t13. Left aligned triangle \t\t14. Right arrow");
        System.out.println("\t15. Sand clock \t\t\t\t16. Rhombus  ");
        System.out.println("\t17. Pyramid \t\t\t\t18. Diamond  ");
        System.out.println("\t19. Hollow Square \t\t\t20. Hollow diamond into box ");
        System.out.println("\t21. Straight & reverse \t\t\t22. Unique box ");
        System.out.println("\t23. Sand clock 2 \t\t\t24. Butterfly");
        

        String c;
        System.out.println("Choose any one of them....");
        Scanner in = new Scanner(System.in);
        c = in.nextLine();
        PatternProject p = new PatternProject();
        if (c.equals("1")) {
            p.gridpattern();
        } else if (c.equals("2")) {
            p.rowpattern();
        } else if (c.equals("3")) {
            p.columnpattern();
        } else if (c.equals("4")) {
            p.Reversecolumnpattern();
        } else if (c.equals("5")) {
            p.Reverserowpattern();
        } else if (c.equals("6")) {
            p.iequaljpattern();
        } else if (c.equals("7")) {
            p.SRAT();
        } else if (c.equals("8")) {
            p.RAT();
        } else if (c.equals("9")) {
            p.invertedRAT();
        } else if (c.equals("10")) {
            p.numbertriangle();
        } else if (c.equals("11")) {
            p.floydspattern();
        } else if (c.equals("12")) {
            p.binarypattern();
        } else if (c.equals("13")) {
            p.Leftalignedpattern();
        } else if (c.equals("14")) {
            p.rightalignedarrow();
        } else if (c.equals("15")) {
            p.Sandclock();
        } else if (c.equals("16")) {
            p.Rhombus();
        } else if (c.equals("17")) {
            p.pyramid();
        } else if (c.equals("18")) {
            p.Diamond();
        } else if (c.equals("19")) {
            p.hollowsquare();
        } else if (c.equals("20")) {
            p.box();
        } else if (c.equals("21")) {
            p.pattern();
        } else if (c.equals("22")) {
            p.unique();
        } else if (c.equals("23")) {
            p.Sandclock2();
        } else if (c.equals("24")) {
            p.butterfly();
        } else{
            System.out.println(" Wrong choice ");
        }
        System.out.println("\nDo you want to continue.. Press 1 else any key");
        //c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        Scanner input = new Scanner(System.in);
        c = input.nextLine();
        if (c.equals("1")) {
            MainModule();
        }
    }

    public static void main(String args[]) {
        MainModule();
    }
}