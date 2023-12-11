package ru.progwards.java1.lessons.date;

public class CalendarPrint {

    public static void printMonth(int month, int year) {
        String month1 = null;

        if (month == 1) {
            month1 = "Январь";
        } else if (month == 2) {
            month1 = "Февраль";
        } else if (month == 3) {
            month1 = "Март";
        } else if (month == 4) {
            month1 = "Апрель";
        } else if (month == 5) {
            month1 = "Май";
        } else if (month == 6) {
            month1 = "Июнь";
        } else if (month == 7) {
            month1 = "Июль";
        } else if (month == 8) {
            month1 = "Август";
        } else if (month == 9) {
            month1 = "Сентябрь";
        } else if (month == 10) {
            month1 = "Октябрь";
        } else if (month == 11) {
            month1 = "Ноябрь";
        } else if (month == 12) {
            month1 = "Декабрь";
        }



        int m = 0;

        if (month == 1) {
            m = 13;
        } else if (month == 2) {
            m = 13;
        } else if (month == 3) {
            m = 3;
        } else if (month == 4) {
            m = 4;
        } else if (month == 5) {
            m = 5;
        } else if (month == 6) {
            m = 6;
        } else if (month == 7) {
            m = 7;
        } else if (month == 8) {
            m = 8;
        } else if (month == 9) {
            m = 9;
        } else if (month == 10) {
            m = 10;
        } else if (month == 11) {
            m = 11;
        } else if (month == 12) {
            m = 12;
        }


        int y = 0;
        if (month == 1 || month == 2) {
            y = year % 100 - 1;
        } else {
            y = year % 100;
        }


        int c = 0;
        if (month == 1 || month == 2) {
            c = year / 100 - 1;
        } else {
            c = year / 100;
        }

        int day1 = 0;
        if (month == 1 || month == 2) {
            year = year - 1;
        }

        int K = year % 100;
        int J = year / 100;
            day1 = Math.abs(((1 + (13 * (m + 1) )/ 5) + K + (K / 4) + (J/4)  + (5 * J)) % 7);



        int yearYesNo = 0;
        if (year % 400 == 0 || year % 4 == 0) {
            yearYesNo = 1;
        }

        int DaysInMonth = 0;
        if (month == 2 & yearYesNo == 1) {
            DaysInMonth = 29;
        } else if (month == 2 & yearYesNo != 1) {
            DaysInMonth = 28;
        } else if (month % 2 == 0 & month != 2 & month < 7) {
            DaysInMonth = 30;
        } else if (month % 2 == 1 & month > 7) {
            DaysInMonth = 30;
        } else {
            DaysInMonth = 31;
        }


        String[][] monthArr = new String[5][7];
        String[] str = {};
        if (DaysInMonth == 29) {
            str = new String[]{" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10",
                    "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25", "26", "27", "28", "29", " ", " ", " ", " ", " "};
        } else if (DaysInMonth == 28) {
            str = new String[]{" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10",
                    "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25", "26", "27", "28", " ", " ", " ", " ", " "};
        } else if (DaysInMonth == 30) {
            str = new String[]{" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10",
                    "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " ", " ", " ", " ", " "};
        } else {
            str = new String[]{" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10",
                    "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " ", " ", " ", " ", " "};
        }


        int days = 0;
         days = Math.abs(day1-2);
            if (day1 == 0) {
                days = 6;
            }


        int count = 0;
        String week1 = "";
        String week2 = "";
        String week3 = "";
        String week4 = "";
        String week5 = "";
        String week6 = "";
        for (int j = 0; j < 7; j++) {
            count++;
            if (count <= days) {
                week1 += "  " + " ";
            } else {
                week1 += str[j - days] + " ";
            }
        }

        for (int j = 7; j < 14; j++) {
            week2 += str[j - days] + " ";
        }

        for (int j = 14; j < 21; j++) {
            week3 += str[j - days] + " ";
        }

        for (int j = 21; j < 28; j++) {
            week4 += str[j - days] + " ";
        }

        for (int j = 28; j < 35; j++) {
            if (j > DaysInMonth + days) {
                week5 += "  " + " ";
            } else {
                week5 += str[j - days] + " ";
            }

        }
        if (DaysInMonth == 31 & day1 == 6) {
            week6 = " 31";
        }else if (DaysInMonth == 31 & days == 6) {
            week6 = "30"  + " 31";
        }





        System.out.println(year +" "+month1);
        System.out.println("пн вт ср чт пт сб вс");
        System.out.println(week1);
        System.out.println(week2);
        System.out.println(week3);
        System.out.println(week4);
        System.out.println(week5);
        System.out.println(week6);
}


    public static void main(String[] args) {
        printMonth(10, 2058);
    }
}
