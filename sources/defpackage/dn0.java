package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CanceledOrderStatus.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ldn0;", "", "", "a", "I", "i", "()I", "message", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dn0  reason: default package */
/* loaded from: classes.dex */
public final class dn0 {
    public static final dn0 b = new dn0("OK", 0, d19.p);
    public static final dn0 c = new dn0("IMPOSSIBLE", 1, d19.impossible_cancel_order);
    public static final dn0 d = new dn0("ERROR", 2, d19.cancel_order_error);
    private static final /* synthetic */ dn0[] e;
    private static final /* synthetic */ kj3 f;
    private final int a;

    static {
        dn0[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private dn0(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ dn0[] a() {
        return new dn0[]{b, c, d};
    }

    public static dn0 valueOf(String str) {
        return (dn0) Enum.valueOf(dn0.class, str);
    }

    public static dn0[] values() {
        return (dn0[]) e.clone();
    }

    public final int i() {
        return this.a;
    }
}
