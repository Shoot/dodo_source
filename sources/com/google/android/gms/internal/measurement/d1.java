package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class d1 implements Serializable, Iterable<Byte> {
    public static final d1 b = new l1(d2.d);
    private static final j1 c = new n1();
    private static final Comparator<d1> d = new e1();
    private int a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k1 T(int i) {
        return new k1(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int f(byte b2) {
        return b2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
                }
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        return i4;
    }

    public static d1 w(String str) {
        return new l1(str.getBytes(d2.b));
    }

    public static d1 x(byte[] bArr, int i, int i2) {
        k(i, i + i2, bArr.length);
        return new l1(c.a(bArr, i, i2));
    }

    protected abstract String E(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void G(o0d o0dVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte H(int i);

    public abstract int P();

    protected abstract int Q(int i, int i2, int i3);

    public final String W() {
        Charset charset = d2.b;
        if (P() == 0) {
            return "";
        }
        return E(charset);
    }

    public abstract boolean Z();

    public abstract byte a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d() {
        return this.a;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int P = P();
            i = Q(P, 0, P);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new f1(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(P());
        if (P() <= 50) {
            str = y3.a(this);
        } else {
            str = y3.a(u(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract d1 u(int i, int i2);
}
