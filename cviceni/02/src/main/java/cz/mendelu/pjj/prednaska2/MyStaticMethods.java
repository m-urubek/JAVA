package cz.mendelu.pjj.prednaska2;

public class MyStaticMethods {

    /**
     * Metoda zji��uje, zda je <code>delenec</code> beze zbytku d�liteln� <code>delitelem</code>.
     *
     * @param delenec D�lenec.
     * @param delitel D�litel.
     * @return <code>True</code>, pokud je <code>delenec</code> beze zbytku d�liteln� <code>delitelem</code>. Jinak <code>false</code>.
     * Pokud je jako d�litel zad�no ��slo 0, tak� vrac� <code>false</code>.
     */

    public static boolean jeDelitelne(long delenec, int delitel) {
        if (delitel == 0) {
            return false;
        }
        return (delenec % delitel) == 0;
    }

    public static double preponaPravouhleho​(double odvesnaA, double odvesnaB) {
        if (odvesnaA < 0 || odvesnaB < 0) {
            return -1;
        }
        return (Math.sqrt(odvesnaA * odvesnaA + odvesnaB * odvesnaB));
    }

    public static int[] minAMax​(int[] pole) {
        if (pole == null || pole.length == 0) {
            return null;
        }
        int minPos = 0;
        int maxPos = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] < pole[minPos]) {
                minPos = i;
            }
            if (pole[i] < pole[maxPos]) {
                maxPos = i;
            }
        }
        return new int[]{pole[minPos], pole[maxPos]};
    }

    public static boolean jeRcDelitelne11​(java.lang.String rc) {
        if (rc == null) {
            return false;
        }
        rc = rc.replace("\n", "").replace("\r", "").replace("\\s", "");
        if (rc.length() < 9 || rc.length() > 10) {
            return false;
        }
        int rcInt;
        try {
            rcInt = Integer.parseInt(rc);
        } catch (Exception ex) {
            return false;
        }
        return rcInt % 11 == 0;
    }

    public static java.lang.String objectToString​(java.lang.Object o) {
        String result;
        try {
            result = o.toString();
        } catch (Exception ex) {
            return null;
        }
        return result;
    }

    public static java.lang.Object stringToObject​(java.lang.String s) {
        if (s == null) {
            return null;
        }
        Object obj;
        try {
            obj = s;
        } catch (Exception ex){
            return null;
        }
        return obj;
    }

    public static char bodyNaZnamku​(int body) {
        if (body < 50) {
            return 'F';
        }
        if (body >= 90) {
            return 'A';
        }
        switch ((int) body / 10) {
            case 5:
                return 'E';
            case 6:
                return 'D';
            case 7:
                return 'C';
            case 8:
                return 'B';
        }
        return 'F';
    }
}
