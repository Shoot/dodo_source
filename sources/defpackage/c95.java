package defpackage;
/* compiled from: JavaVersion.java */
/* renamed from: c95  reason: default package */
/* loaded from: classes2.dex */
public final class c95 {
    private static final int a = a();

    private static int a() {
        return d(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return a;
    }

    static int d(String str) {
        int f = f(str);
        if (f == -1) {
            f = b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    public static boolean e() {
        if (a >= 9) {
            return true;
        }
        return false;
    }

    private static int f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
