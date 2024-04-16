package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: pi5  reason: default package */
/* loaded from: classes3.dex */
public class pi5 {
    public static final pi5 h;
    public static final pi5 i;
    public static final pi5 j;
    public static final pi5 k;
    private static final Map<Object, pi5> l;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final k g;

    /* renamed from: pi5$a */
    /* loaded from: classes3.dex */
    static class a extends HashMap<Object, pi5> {
        a() {
            pi5 pi5Var = pi5.h;
            put(Integer.valueOf(pi5Var.a), pi5Var);
            pi5 pi5Var2 = pi5.i;
            put(Integer.valueOf(pi5Var2.a), pi5Var2);
            pi5 pi5Var3 = pi5.j;
            put(Integer.valueOf(pi5Var3.a), pi5Var3);
            pi5 pi5Var4 = pi5.k;
            put(Integer.valueOf(pi5Var4.a), pi5Var4);
        }
    }

    static {
        k kVar = ms6.c;
        h = new pi5(1, 32, 1, 265, 7, 8516, kVar);
        i = new pi5(2, 32, 2, 133, 6, 4292, kVar);
        j = new pi5(3, 32, 4, 67, 4, 2180, kVar);
        k = new pi5(4, 32, 8, 34, 0, 1124, kVar);
        l = new a();
    }

    protected pi5(int i2, int i3, int i4, int i5, int i6, int i7, k kVar) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = kVar;
    }

    public static pi5 e(int i2) {
        return l.get(Integer.valueOf(i2));
    }

    public k b() {
        return this.g;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.c;
    }
}
