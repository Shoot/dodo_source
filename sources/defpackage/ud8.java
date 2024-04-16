package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PointerIcon.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"", "pointerIconType", "Lpd8;", "a", "Lpd8;", c.a, "()Lpd8;", "pointerIconDefault", "b", "pointerIconCrosshair", e.a, "pointerIconText", DateTokenConverter.CONVERTER_KEY, "pointerIconHand", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ud8  reason: default package */
/* loaded from: classes.dex */
public final class ud8 {
    private static final pd8 a = new pi(1000);
    private static final pd8 b = new pi(1007);
    private static final pd8 c = new pi(1008);
    private static final pd8 d = new pi(CommonCode.BusInterceptor.PRIVACY_CANCEL);

    public static final pd8 a(int i) {
        return new pi(i);
    }

    public static final pd8 b() {
        return b;
    }

    public static final pd8 c() {
        return a;
    }

    public static final pd8 d() {
        return d;
    }

    public static final pd8 e() {
        return c;
    }
}
