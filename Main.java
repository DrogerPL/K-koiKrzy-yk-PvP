package tictactoe;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void Druk(char[][] tab1)
    {
        System.out.println("---------");
        for (int i = 0; i < 3; i++)
        {
            System.out.print('|');
            System.out.print(' ');
            for (int j = 0; j < 3; j++)
            {
              if(tab1[i][j] == '_')
              {
                  System.out.print("  ");
              }
              else
              {
                  System.out.print(tab1[i][j] + " ");
              }
            }
            System.out.print('|');
            System.out.println();
        }
        System.out.println("---------");
    }
    public static boolean Winner(char[][] tab1)
    {
        StringBuilder str = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                str.append(tab1[i][j]);

            }
            if (str.toString().equals("XXX"))
            {
                System.out.println("X wins");
                flag = false;
                return true;

            }
            if (str.toString().equals("OOO"))
            {
                System.out.println("O wins");
                flag = false;
                return true;

            }
            str.setLength(0);
        }
        str.setLength(0);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                str.append(tab1[j][i]);

            }

            if (str.toString().equals("XXX"))
            {
                System.out.println("X wins");
                flag = false;
                return true;

            }

            if (str.toString().equals("OOO"))
            {
                System.out.println("O wins");
                flag = false;
                return true;

            }
            str.setLength(0);
        }


        str.setLength(0);

        if(flag)
        {
            for (int i = 0; i < 3; i++)
            {
                str.append(tab1[i][i]);
            }
            if(str.toString().equals("XXX"))
            {
                System.out.println("X wins");
                return true;
            }
            else if(str.toString().equals("OOO"))
            {
                System.out.println("O wins");
                return true;
            }
            str.setLength(0);
            for (int i = 0, e =2; i < 3; i++)
            {
                 str.append(tab1[i][e--]);
            }
            if(str.toString().equals("XXX"))
            {
                 System.out.println("X wins");
                return true;
            }
            else if(str.toString().equals("OOO"))
            {
                 System.out.println("O wins");
                return true;
            }
        }
        return drawOrGamenotfin(tab1);
    }




    public static boolean drawOrGamenotfin(char[][]tab1)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
              if(tab1[i][j] == ' ')
              {
                  return false;
              }
            }
        }
        System.out.println("Draw");
        return true;
    }

    public static char[][] placeX(char[][]tab1, int x)
    {
        Scanner scan = new Scanner(System.in);
        boolean bol = true;
        boolean flag;
        int a;
        int b;
        String str;
        while (bol)
        {

            str = scan.nextLine();
            flag = containsLetters(str);


            if(!flag)
            {
                 a = Character.getNumericValue(str.charAt(0));
                 b = Character.getNumericValue(str.charAt(2));
                if (a > 3 || a < 1 || b > 3 || b < 1)
                {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
                else
                {
                    if (tab1[a-1][b-1] == ' ')
                    {
                        if(x % 2 != 0)
                        {
                            tab1[a-1][b-1] = 'X';
                            bol = false;
                        }
                        else
                        {
                            tab1[a-1][b-1] = 'O';
                            bol = false;
                        }
                    }
                    else
                    {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                }
            }
        }
        return tab1;
    }


    public static boolean containsLetters(String string)
    {
        if (string == null || string.isEmpty())
        {
            return false;
        }
        for (int i = 0; i < string.length(); ++i)
        {
            if (Character.isLetter(string.charAt(i)))
            {
                System.out.println("You should enter numbers!");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] tab1 = new char[3][3] ;
        int x = 1;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                tab1[i][j] = ' ';
            }
        }
        Druk(tab1);
        while (!Winner(tab1))
        {
            tab1 = placeX(tab1, x++);
            Druk(tab1);
        }
    }
}
