package core_programming.strings.Level3;

class CalendarProgram {

    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m - 1];
    }

    static int getStartDay(int d, int m, int y) {
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;

        int h = (d + (13*(m+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7;
    }

    public static void main(String[] args) {
        int month = 7, year = 2005;

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        System.out.println(months[month-1] + " " + year);

        int start = getStartDay(1, month, year);
        int days = getDays(month, year);

        for (int i = 0; i < start; i++) System.out.print("   ");

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }
}