package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OperationalType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lib7;", "", "", "a", "I", "i", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ib7  reason: default package */
/* loaded from: classes4.dex */
public final class ib7 {
    public static final a b;
    public static final ib7 c = new ib7("DELIVERY", 0, 1);
    public static final ib7 d = new ib7("CARRYOUT", 1, 2);
    public static final ib7 e = new ib7("RESTAURANT", 2, 3);
    private static final /* synthetic */ ib7[] f;
    private static final /* synthetic */ kj3 g;
    private final int a;

    /* compiled from: OperationalType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lib7$a;", "", "", "value", "Lib7;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ib7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ib7 a(int i) {
            ib7 ib7Var;
            ib7[] values = ib7.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    ib7Var = values[i2];
                    if (ib7Var.i() == i) {
                        break;
                    }
                    i2++;
                } else {
                    ib7Var = null;
                    break;
                }
            }
            if (ib7Var != null) {
                return ib7Var;
            }
            throw new IllegalArgumentException(("Not defined operational type with value " + i).toString());
        }
    }

    static {
        ib7[] a2 = a();
        f = a2;
        g = lj3.a(a2);
        b = new a(null);
    }

    private ib7(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ ib7[] a() {
        return new ib7[]{c, d, e};
    }

    public static ib7 valueOf(String str) {
        return (ib7) Enum.valueOf(ib7.class, str);
    }

    public static ib7[] values() {
        return (ib7[]) f.clone();
    }

    public final int i() {
        return this.a;
    }
}
