package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: Http2.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J&\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001c"}, d2 = {"Laq4;", "", "", "inbound", "", "streamId", "length", MessageAttributes.TYPE, "flags", "", c.a, "", "windowSizeIncrement", DateTokenConverter.CONVERTER_KEY, "b", "(I)Ljava/lang/String;", "a", "Llk0;", "Llk0;", "CONNECTION_PREFACE", "", "[Ljava/lang/String;", "FRAME_NAMES", "FLAGS", e.a, "BINARY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: aq4  reason: default package */
/* loaded from: classes3.dex */
public final class aq4 {
    public static final aq4 a = new aq4();
    public static final lk0 b = lk0.d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] d = new String[64];
    private static final String[] e;

    static {
        int i;
        String E;
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            z65.g(binaryString, "toBinaryString(...)");
            E = l0b.E(cec.j("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i2] = E;
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[iArr[0] | 8] = strArr2[i] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = d;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = d.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = d;
            if (strArr4[i7] == null) {
                strArr4[i7] = e[i7];
            }
        }
    }

    private aq4() {
    }

    public final String a(int i, int i2) {
        String str;
        String F;
        String F2;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i != 4 && i != 6) {
                if (i != 7 && i != 8) {
                    String[] strArr = d;
                    if (i2 < strArr.length) {
                        str = strArr[i2];
                        z65.e(str);
                    } else {
                        str = e[i2];
                    }
                    String str2 = str;
                    if (i == 5 && (i2 & 4) != 0) {
                        F2 = l0b.F(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
                        return F2;
                    } else if (i == 0 && (i2 & 32) != 0) {
                        F = l0b.F(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                        return F;
                    } else {
                        return str2;
                    }
                }
            } else if (i2 == 1) {
                return "ACK";
            } else {
                return e[i2];
            }
        }
        return e[i2];
    }

    public final String b(int i) {
        String[] strArr = c;
        if (i < strArr.length) {
            return strArr[i];
        }
        return cec.j("0x%02x", Integer.valueOf(i));
    }

    public final String c(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String b2 = b(i3);
        String a2 = a(i3, i4);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return cec.j("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i), Integer.valueOf(i2), b2, a2);
    }

    public final String d(boolean z, int i, int i2, long j) {
        String str;
        String b2 = b(8);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return cec.j("%s 0x%08x %5d %-13s %d", str, Integer.valueOf(i), Integer.valueOf(i2), b2, Long.valueOf(j));
    }
}
