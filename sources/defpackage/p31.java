package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lp31;", "", "", "a", "I", "i", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p31  reason: default package */
/* loaded from: classes2.dex */
public final class p31 {
    public static final a b;
    public static final p31 c = new p31(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, -1);
    public static final p31 d = new p31("SELL", 1, 0);
    public static final p31 e = new p31("REFUND", 2, 1);
    private static final /* synthetic */ p31[] f;
    private static final /* synthetic */ kj3 g;
    private final int a;

    /* compiled from: CheckType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lp31$a;", "", "", "value", "Lp31;", "a", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p31$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p31 a(int i) {
            p31 p31Var;
            p31[] values = p31.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    p31Var = values[i2];
                    if (p31Var.i() == i) {
                        break;
                    }
                    i2++;
                } else {
                    p31Var = null;
                    break;
                }
            }
            return (p31) mh5.c(p31Var, p31.c);
        }
    }

    static {
        p31[] a2 = a();
        f = a2;
        g = lj3.a(a2);
        b = new a(null);
    }

    private p31(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ p31[] a() {
        return new p31[]{c, d, e};
    }

    public static p31 valueOf(String str) {
        return (p31) Enum.valueOf(p31.class, str);
    }

    public static p31[] values() {
        return (p31[]) f.clone();
    }

    public final int i() {
        return this.a;
    }
}
