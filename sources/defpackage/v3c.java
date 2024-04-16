package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import defpackage.yg0;
import kotlin.Metadata;
/* compiled from: WebSocketProtocol.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lv3c;", "", "Lyg0$a;", "cursor", "", Action.KEY_ATTRIBUTE, "", "b", "", "code", "", "a", c.a, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: v3c  reason: default package */
/* loaded from: classes3.dex */
public final class v3c {
    public static final v3c a = new v3c();

    private v3c() {
    }

    public final String a(int i) {
        if (i >= 1000 && i < 5000) {
            if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                return "Code " + i + " is reserved and may not be used.";
            }
            return null;
        }
        return "Code must be in range [1000,5000): " + i;
    }

    public final void b(yg0.a aVar, byte[] bArr) {
        z65.h(aVar, "cursor");
        z65.h(bArr, Action.KEY_ATTRIBUTE);
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.e;
            int i2 = aVar.f;
            int i3 = aVar.g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (aVar.b() != -1);
    }

    public final void c(int i) {
        String a2 = a(i);
        if (a2 == null) {
            return;
        }
        z65.e(a2);
        throw new IllegalArgumentException(a2.toString());
    }
}
