package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000¨\u0006\u000f"}, d2 = {"", "seed", "Lb49;", "a", "value", DateTokenConverter.CONVERTER_KEY, "bitCount", e.a, RemoteMessageConst.FROM, "until", "", c.a, "", "", "b", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: e49  reason: default package */
/* loaded from: classes3.dex */
public final class e49 {
    public static final b49 a(int i) {
        return new bcc(i, i >> 31);
    }

    public static final String b(Object obj, Object obj2) {
        z65.h(obj, RemoteMessageConst.FROM);
        z65.h(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void c(int i, int i2) {
        if (i2 > i) {
            return;
        }
        throw new IllegalArgumentException(b(Integer.valueOf(i), Integer.valueOf(i2)).toString());
    }

    public static final int d(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
