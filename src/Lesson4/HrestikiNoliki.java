package Lesson4;

import java.util.Scanner;

public class HrestikiNoliki {

//        Написать игру «Крестики нолики» используя
//        двухмерные массивы.

    public static void main(String[] args) {
        char[][] f = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                f[i][j] = '#';
            }
        }
        int player = 1;
        boolean game = true;

        while (game) {
            fild(f);
            play(f, player);
            if (CheckWin(f, player) == 0) {
                if(player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
                continue;
            }
            else if (CheckWin(f, player) == player) {
                System.out.println("Игра окончена, победил Игрок №" + player + " !");
                fild(f);
                game = false;
            } else {
                System.out.println("Игра закончилась вничью!");
                fild(f);
                game = false;
            }
        }

    }

    public static void play(char[][] f, int player) {
        int hor, ver;
        boolean pl = true;
        char c;
        if(player == 1) {
            c = 'X';
        } else {
            c = 'O';
        }
        while (pl) {
            System.out.println("Игрок №" + player + " ('" + c +"'), сделайте ход!");
            hor = GetCord(true);
            ver = GetCord(false);
            if (CheckCord(f, hor, ver)) {
                input(f, c, hor, ver);
                pl = false;
            } else {
                System.out.println("Поле с введенными координатами уже заполнено! \n" +
                        "Введите координаты для незаполненного поля!");
            }
        }
    }


    public static void fild(char[][] fld) {
        for (char[] c : fld) {
            for (char c1 : c) {
                System.out.print(c1 + " ");
            }
            System.out.println();
        }
    }

    public static void input(char[][] fld, char c, int h, int v) {
        fld[h][v] = c;
    }

    public static int GetCord(boolean cord) {
        Scanner scanner = new Scanner(System.in);
        int cor;
        if(cord) {
            System.out.println("Введите координаты по горизонтали \n" +
                    "(не занятое поле, № 1, 2 или 3): " );
            cor = scanner.nextInt();
        } else {
            System.out.println("Введите координаты по вертикали \n" +
                    "(не занятое поле, № 1, 2 или 3): " );
            cor = scanner.nextInt();
        }
        return cor-1;
    }

    public static boolean CheckCord(char[][] f, int h, int v) {
        boolean b;
        if(f[h][v] != '#') {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public static int CheckWin(char[][] f, int player) {
        int check = 0;

        for(int i = 0; i < 3; i++) {
            if((((f[i][0] ==  f[i][1]) && (f[i][1] ==  f[i][2])) && (f[i][0] != '#')) ||
                    (((f[0][i] ==  f[1][i]) && (f[1][i] ==  f[2][i])) && (f[0][i] != '#'))) {
                check = player;
            }
        }

        if((check == 0) &&
                (((f[0][0] == f[1][1]) && (f[1][1] == f[2][2])) || ((f[0][2] == f[1][1]) && (f[1][1] == f[2][0]))) &&
                (f[1][1] != '#')) {
            check = player;
        }

        if(check == 0) {
            for (char[] c : f) {
                for (char c1 : c) {
                    if (c1 == '#') {
                        check = 0;
                        break;
                    } else {
                        check = 3;
                    }
                }
            }
        }
        return check;
    }
}
