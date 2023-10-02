package org.ex;

public class Slide {
    char Grade(int score) {
        int res;
        if (score < 0 || score > 10)
            return 'I';
        if (score >= 9)
            res = 'A';
        else if (score >= 8)
            res = 'B';
        else if (score >= 6.5)
            res = 'C';
        else if (score >= 5)
            res = 'D';
        else
            res = 'F';
        return (char) res;
    }

    int Sum(int a[], int n) {
        int i, total = 0;
        for (i = 0; i < n; i++) {
            total = total + a[i];
        }
        return total;
    }

    String foo(int x) {
        String res;
        switch (x) {
            case 65:
                res = "A";
                break;
            case 66:
                res = "B";
                break;
            case 67:
                res = "C";
                break;
            default:
                res = "haven't check";
        }
        return res;
    }

}
