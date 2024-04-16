package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "x", "y", "Ls55;", "a", "(II)J", "Ls67;", "offset", c.a, "(JJ)J", "b", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: t55  reason: default package */
/* loaded from: classes.dex */
public final class t55 {
    public static final long a(int i, int i2) {
        return s55.e((i2 & 4294967295L) | (i << 32));
    }

    public static final long b(long j, long j2) {
        return x67.a(s67.l(j) - s55.h(j2), s67.m(j) - s55.i(j2));
    }

    public static final long c(long j, long j2) {
        return x67.a(s67.l(j) + s55.h(j2), s67.m(j) + s55.i(j2));
    }
}
