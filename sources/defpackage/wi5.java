package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: wi5  reason: default package */
/* loaded from: classes3.dex */
public class wi5 {
    public static final wi5 e;
    public static final wi5 f;
    public static final wi5 g;
    public static final wi5 h;
    public static final wi5 i;
    private static Map<Object, wi5> j;
    private final int a;
    private final int b;
    private final int c;
    private final k d;

    /* renamed from: wi5$a */
    /* loaded from: classes3.dex */
    static class a extends HashMap<Object, wi5> {
        a() {
            wi5 wi5Var = wi5.e;
            put(Integer.valueOf(wi5Var.a), wi5Var);
            wi5 wi5Var2 = wi5.f;
            put(Integer.valueOf(wi5Var2.a), wi5Var2);
            wi5 wi5Var3 = wi5.g;
            put(Integer.valueOf(wi5Var3.a), wi5Var3);
            wi5 wi5Var4 = wi5.h;
            put(Integer.valueOf(wi5Var4.a), wi5Var4);
            wi5 wi5Var5 = wi5.i;
            put(Integer.valueOf(wi5Var5.a), wi5Var5);
        }
    }

    static {
        k kVar = ms6.c;
        e = new wi5(5, 32, 5, kVar);
        f = new wi5(6, 32, 10, kVar);
        g = new wi5(7, 32, 15, kVar);
        h = new wi5(8, 32, 20, kVar);
        i = new wi5(9, 32, 25, kVar);
        j = new a();
    }

    protected wi5(int i2, int i3, int i4, k kVar) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wi5 e(int i2) {
        return j.get(Integer.valueOf(i2));
    }

    public k b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    public int f() {
        return this.a;
    }
}
