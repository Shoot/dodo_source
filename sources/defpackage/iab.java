package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: TextBuffer.java */
/* renamed from: iab  reason: default package */
/* loaded from: classes2.dex */
public final class iab {
    static final char[] l = new char[0];
    private final ah0 a;
    private char[] b;
    private int c;
    private int d;
    private ArrayList<char[]> e;
    private boolean f;
    private int g;
    private char[] h;
    private int i;
    private String j;
    private char[] k;

    public iab(ah0 ah0Var) {
        this.a = ah0Var;
    }

    private char[] d(int i) {
        ah0 ah0Var = this.a;
        if (ah0Var != null) {
            return ah0Var.d(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    private char[] e(int i) {
        return new char[i];
    }

    private void f() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    private void i(int i) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        char[] cArr = this.h;
        this.f = true;
        this.e.add(cArr);
        this.g += cArr.length;
        this.i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        this.h = e(i2);
    }

    public static iab k(char[] cArr) {
        return new iab(null, cArr);
    }

    private char[] m() {
        int i;
        String str = this.j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.c;
        if (i2 >= 0) {
            int i3 = this.d;
            if (i3 < 1) {
                return l;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.b, i3);
            }
            return Arrays.copyOfRange(this.b, i2, i3 + i2);
        }
        int o = o();
        if (o < 1) {
            return l;
        }
        char[] e = e(o);
        ArrayList<char[]> arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, e, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.h, 0, e, i, this.i);
        return e;
    }

    private void p(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.b;
        this.b = null;
        int i3 = this.c;
        this.c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = d(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public void a(char c) {
        if (this.c >= 0) {
            p(16);
        }
        this.j = null;
        this.k = null;
        char[] cArr = this.h;
        if (this.i >= cArr.length) {
            i(1);
            cArr = this.h;
        }
        int i = this.i;
        this.i = i + 1;
        cArr[i] = c;
    }

    public void b(String str, int i, int i2) {
        if (this.c >= 0) {
            p(i2);
        }
        this.j = null;
        this.k = null;
        char[] cArr = this.h;
        int length = cArr.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            i(i2);
            int min = Math.min(this.h.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this.h, 0);
            this.i += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            }
            i = i6;
        }
    }

    public void c(char[] cArr, int i, int i2) {
        if (this.c >= 0) {
            p(i2);
        }
        this.j = null;
        this.k = null;
        char[] cArr2 = this.h;
        int length = cArr2.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            i(i2);
            int min = Math.min(this.h.length, i2);
            System.arraycopy(cArr, i, this.h, 0, min);
            this.i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public char[] g() {
        char[] cArr = this.k;
        if (cArr == null) {
            char[] m = m();
            this.k = m;
            return m;
        }
        return cArr;
    }

    public String h() {
        if (this.j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else {
                int i = this.c;
                String str = "";
                if (i >= 0) {
                    int i2 = this.d;
                    if (i2 < 1) {
                        this.j = "";
                        return "";
                    }
                    this.j = new String(this.b, i, i2);
                } else {
                    int i3 = this.g;
                    int i4 = this.i;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.h, 0, i4);
                        }
                        this.j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.h, 0, this.i);
                        this.j = sb.toString();
                    }
                }
            }
        }
        return this.j;
    }

    public char[] j() {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.f = true;
        this.e.add(this.h);
        int length = this.h.length;
        this.g += length;
        this.i = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] e = e(i);
        this.h = e;
        return e;
    }

    public void l() {
        char[] cArr;
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.k = null;
        if (this.f) {
            f();
        }
        ah0 ah0Var = this.a;
        if (ah0Var != null && (cArr = this.h) != null) {
            this.h = null;
            ah0Var.j(2, cArr);
        }
    }

    public void n(int i) {
        this.i = i;
    }

    public int o() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        if (str != null) {
            return str.length();
        }
        return this.g + this.i;
    }

    public String toString() {
        return h();
    }

    protected iab(ah0 ah0Var, char[] cArr) {
        this.a = ah0Var;
        this.h = cArr;
        this.i = cArr.length;
        this.c = -1;
    }
}
