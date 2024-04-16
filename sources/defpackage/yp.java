package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplyAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lyp;", "", "<init>", "(Ljava/lang/String;I)V", "a", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: yp  reason: default package */
/* loaded from: classes.dex */
public final class yp {
    public static final a a;
    private static final yp[] b;
    public static final yp c = new yp("NONE", 0);
    public static final yp d = new yp("PROMO_CODE", 1);
    public static final yp e = new yp("CATEGORY", 2);
    public static final yp f = new yp("PRODUCT", 3);
    public static final yp g = new yp("LINK", 4);
    private static final /* synthetic */ yp[] h;
    private static final /* synthetic */ kj3 i;

    /* compiled from: ApplyAction.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lyp$a;", "", "", "ordinalValue", "Lyp;", "a", "", "values", "[Lyp;", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yp$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yp a(int i) {
            int F;
            yp[] ypVarArr = yp.b;
            if (i >= 0) {
                F = yr.F(ypVarArr);
                if (i <= F) {
                    return ypVarArr[i];
                }
            }
            return yp.c;
        }
    }

    static {
        yp[] a2 = a();
        h = a2;
        i = lj3.a(a2);
        a = new a(null);
        b = values();
    }

    private yp(String str, int i2) {
    }

    private static final /* synthetic */ yp[] a() {
        return new yp[]{c, d, e, f, g};
    }

    public static yp valueOf(String str) {
        return (yp) Enum.valueOf(yp.class, str);
    }

    public static yp[] values() {
        return (yp[]) h.clone();
    }
}
