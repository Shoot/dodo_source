package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yg0;
import kotlin.Metadata;
/* compiled from: Util.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a0\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\bH\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a\u0014\u0010\u0019\u001a\u00020\b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0000\u001a\u0014\u0010\u001b\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\bH\u0000\" \u0010!\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\"\u001a\u0010%\u001a\u00020\b8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"", "size", "offset", "byteCount", "", "b", "", "j", "", Image.TYPE_HIGH, "i", "", "a", "aOffset", "bOffset", "", "", "", "k", "l", "Lyg0$a;", "unsafeCursor", "g", "Llk0;", "position", e.a, "sizeParam", "f", "Lyg0$a;", DateTokenConverter.CONVERTER_KEY, "()Lyg0$a;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", "I", c.a, "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: i  reason: default package */
/* loaded from: classes3.dex */
public final class i {
    private static final yg0.a a = new yg0.a();
    private static final int b = -1234567890;

    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        z65.h(bArr, "a");
        z65.h(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
    }

    public static final int c() {
        return b;
    }

    public static final yg0.a d() {
        return a;
    }

    public static final int e(lk0 lk0Var, int i) {
        z65.h(lk0Var, "<this>");
        if (i == b) {
            return lk0Var.n0();
        }
        return i;
    }

    public static final int f(byte[] bArr, int i) {
        z65.h(bArr, "<this>");
        if (i == b) {
            return bArr.length;
        }
        return i;
    }

    public static final yg0.a g(yg0.a aVar) {
        z65.h(aVar, "unsafeCursor");
        if (aVar == a) {
            return new yg0.a();
        }
        return aVar;
    }

    public static final int h(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long i(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short j(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static final String k(byte b2) {
        String q;
        q = l0b.q(new char[]{e.f()[(b2 >> 4) & 15], e.f()[b2 & 15]});
        return q;
    }

    public static final String l(int i) {
        String r;
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {e.f()[(i >> 28) & 15], e.f()[(i >> 24) & 15], e.f()[(i >> 20) & 15], e.f()[(i >> 16) & 15], e.f()[(i >> 12) & 15], e.f()[(i >> 8) & 15], e.f()[(i >> 4) & 15], e.f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        r = l0b.r(cArr, i2, 8);
        return r;
    }
}
