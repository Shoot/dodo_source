package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: UnsignedUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0000¨\u0006\f"}, d2 = {"", "v1", "v2", "", "a", "v", "", "b", "", c.a, "base", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: krb  reason: default package */
/* loaded from: classes3.dex */
public final class krb {
    public static final int a(long j, long j2) {
        return z65.k(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final double b(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final String c(long j) {
        return d(j, 10);
    }

    public static final String d(long j, int i) {
        int a;
        int a2;
        int a3;
        if (j >= 0) {
            a3 = nw0.a(i);
            String l = Long.toString(j, a3);
            z65.g(l, "toString(...)");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        a = nw0.a(i);
        String l2 = Long.toString(j3, a);
        z65.g(l2, "toString(...)");
        sb.append(l2);
        a2 = nw0.a(i);
        String l3 = Long.toString(j4, a2);
        z65.g(l3, "toString(...)");
        sb.append(l3);
        return sb.toString();
    }
}
