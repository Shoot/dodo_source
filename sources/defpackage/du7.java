package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentMethodType.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\bj\u0002\b\u0012j\u0002\b\u0003j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0004¨\u0006\u0016"}, d2 = {"Ldu7;", "", "", "k", "o", "", "a", "I", "i", "()I", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;II)V", "b", e.a, "f", "g", Image.TYPE_HIGH, "j", "l", Image.TYPE_MEDIUM, "n", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: du7  reason: default package */
/* loaded from: classes2.dex */
public final class du7 {
    public static final a b;
    private static final List<du7> c;
    private static final List<du7> d;
    public static final du7 e;
    public static final du7 f;
    public static final du7 g;
    public static final du7 h;
    public static final du7 i;
    public static final du7 j;
    public static final du7 k;
    public static final du7 l;
    public static final du7 m;
    public static final du7 n;
    public static final du7 o;
    private static final /* synthetic */ du7[] p;
    private static final /* synthetic */ kj3 q;
    private final int a;

    /* compiled from: PaymentMethodType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Ldu7$a;", "", "", MessageAttributes.TYPE, "Ldu7;", "a", "(Ljava/lang/Integer;)Ldu7;", "", "offlinePaymentMethods", "Ljava/util/List;", "onlinePaymentMethods", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: du7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final du7 a(Integer num) {
            du7 du7Var;
            du7[] values = du7.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    du7Var = values[i];
                    int i2 = du7Var.i();
                    if (num != null && i2 == num.intValue()) {
                        break;
                    }
                    i++;
                } else {
                    du7Var = null;
                    break;
                }
            }
            if (du7Var == null) {
                return du7.e;
            }
            return du7Var;
        }
    }

    static {
        List<du7> o2;
        List U;
        List o0;
        List<du7> p0;
        du7 du7Var = new du7("UNDEFINED", 0, 0);
        e = du7Var;
        du7 du7Var2 = new du7("CASH", 1, 1);
        f = du7Var2;
        du7 du7Var3 = new du7("TERMINAL", 2, 2);
        g = du7Var3;
        h = new du7("GOOGLE_PAY", 3, 3);
        i = new du7("APPLE_PAY", 4, 4);
        j = new du7("NEW_CARD", 5, 5);
        k = new du7("SAVED_CARD", 6, 6);
        l = new du7("PAYPAL", 7, 7);
        m = new du7("SBER_PAY", 8, 8);
        n = new du7("APP2APP", 9, 10);
        o = new du7("SBP", 10, 11);
        du7[] a2 = a();
        p = a2;
        q = lj3.a(a2);
        b = new a(null);
        o2 = kc1.o(du7Var2, du7Var3);
        c = o2;
        U = yr.U(values());
        o0 = sc1.o0(U, o2);
        p0 = sc1.p0(o0, du7Var);
        d = p0;
    }

    private du7(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ du7[] a() {
        return new du7[]{e, f, g, h, i, j, k, l, m, n, o};
    }

    public static du7 valueOf(String str) {
        return (du7) Enum.valueOf(du7.class, str);
    }

    public static du7[] values() {
        return (du7[]) p.clone();
    }

    public final int i() {
        return this.a;
    }

    public final boolean k() {
        return c.contains(this);
    }

    public final boolean o() {
        return d.contains(this);
    }
}
