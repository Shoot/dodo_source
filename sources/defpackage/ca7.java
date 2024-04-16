package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OngoingPaymentStatus.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lca7;", "", "", "a", "I", "i", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ca7  reason: default package */
/* loaded from: classes2.dex */
public final class ca7 {
    public static final a b;
    public static final ca7 c = new ca7("STARTED", 0, 2);
    public static final ca7 d = new ca7("SUCCEEDED", 1, 3);
    public static final ca7 e = new ca7("FAILED", 2, 4);
    public static final ca7 f = new ca7("THREE_DS_REQUIRED", 3, 5);
    public static final ca7 g = new ca7("SBP_REQUIRED", 4, 6);
    private static final /* synthetic */ ca7[] h;
    private static final /* synthetic */ kj3 i;
    private final int a;

    /* compiled from: OngoingPaymentStatus.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lca7$a;", "", "", RemoteMessageConst.Notification.URL, "", "value", "Lca7;", "a", "NSPK_URL_PART", "Ljava/lang/String;", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ca7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ca7 a(String str, int i) {
            ca7[] values;
            z65.h(str, RemoteMessageConst.Notification.URL);
            if (c0b.O(str, "nspk", false, 2, null)) {
                return ca7.g;
            }
            for (ca7 ca7Var : ca7.values()) {
                if (ca7Var.i() == i) {
                    return ca7Var;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        ca7[] a2 = a();
        h = a2;
        i = lj3.a(a2);
        b = new a(null);
    }

    private ca7(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ ca7[] a() {
        return new ca7[]{c, d, e, f, g};
    }

    public static ca7 valueOf(String str) {
        return (ca7) Enum.valueOf(ca7.class, str);
    }

    public static ca7[] values() {
        return (ca7[]) h.clone();
    }

    public final int i() {
        return this.a;
    }
}
