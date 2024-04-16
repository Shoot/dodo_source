package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ljk7;", "", "", "a", "I", "i", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "b", DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jk7  reason: default package */
/* loaded from: classes4.dex */
public final class jk7 {
    public static final a b;
    private static final List<jk7> c;
    public static final jk7 d = new jk7("UNDEFINED", 0, 0);
    public static final jk7 e;
    public static final jk7 f;
    public static final jk7 g;
    private static final /* synthetic */ jk7[] h;
    private static final /* synthetic */ kj3 i;
    private final int a;

    /* compiled from: OrderType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Ljk7$a;", "", "", MessageAttributes.TYPE, "Ljk7;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jk7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jk7 a(int i) {
            jk7 jk7Var;
            jk7[] values = jk7.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    jk7Var = values[i2];
                    if (jk7Var.i() == i) {
                        break;
                    }
                    i2++;
                } else {
                    jk7Var = null;
                    break;
                }
            }
            return (jk7) mh5.c(jk7Var, jk7.d);
        }
    }

    static {
        List<jk7> o;
        jk7 jk7Var = new jk7("DELIVERY", 1, 1);
        e = jk7Var;
        jk7 jk7Var2 = new jk7("CARRYOUT", 2, 2);
        f = jk7Var2;
        jk7 jk7Var3 = new jk7("RESTAURANT", 3, 3);
        g = jk7Var3;
        jk7[] a2 = a();
        h = a2;
        i = lj3.a(a2);
        b = new a(null);
        o = kc1.o(jk7Var, jk7Var2, jk7Var3);
        c = o;
    }

    private jk7(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ jk7[] a() {
        return new jk7[]{d, e, f, g};
    }

    public static jk7 valueOf(String str) {
        return (jk7) Enum.valueOf(jk7.class, str);
    }

    public static jk7[] values() {
        return (jk7[]) h.clone();
    }

    public final int i() {
        return this.a;
    }
}
