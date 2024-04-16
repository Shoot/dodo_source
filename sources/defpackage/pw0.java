package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CharsToNameCanonicalizer.java */
/* renamed from: pw0  reason: default package */
/* loaded from: classes2.dex */
public final class pw0 {
    protected final int c;
    protected final pw0 a = null;
    protected boolean e = true;
    protected final int d = -1;
    protected boolean g = false;
    protected int f = 0;
    protected final AtomicReference<b> b = new AtomicReference<>(b.a(64));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CharsToNameCanonicalizer.java */
    /* renamed from: pw0$a */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: CharsToNameCanonicalizer.java */
    /* renamed from: pw0$b */
    /* loaded from: classes2.dex */
    private static final class b {
        final int a;
        final int b;
        final String[] c;
        final a[] d;

        public b(int i, int i2, String[] strArr, a[] aVarArr) {
            this.a = i;
            this.b = i2;
            this.c = strArr;
            this.d = aVarArr;
        }

        public static b a(int i) {
            return new b(0, 0, new String[i], new a[i >> 1]);
        }
    }

    private pw0(int i) {
        this.c = i;
    }

    public static pw0 a() {
        long currentTimeMillis = System.currentTimeMillis();
        return b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static pw0 b(int i) {
        return new pw0(i);
    }
}
