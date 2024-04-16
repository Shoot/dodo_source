package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalOffer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lj08;", "", "", "a", "I", "i", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j08  reason: default package */
/* loaded from: classes4.dex */
public final class j08 {
    public static final a b;
    public static final j08 c = new j08("GIFT", 0, 1);
    public static final j08 d = new j08("DISCOUNT", 1, 2);
    public static final j08 e = new j08("CASHBACK", 2, 3);
    private static final /* synthetic */ j08[] f;
    private static final /* synthetic */ kj3 g;
    private final int a;

    /* compiled from: PersonalOffer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lj08$a;", "", "", MessageAttributes.TYPE, "Lj08;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: j08$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j08 a(int i) {
            j08 j08Var;
            j08[] values = j08.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    j08Var = values[i2];
                    if (j08Var.i() == i) {
                        break;
                    }
                    i2++;
                } else {
                    j08Var = null;
                    break;
                }
            }
            return (j08) mh5.b(j08Var, "Failed to find offer type with type=" + i);
        }
    }

    static {
        j08[] a2 = a();
        f = a2;
        g = lj3.a(a2);
        b = new a(null);
    }

    private j08(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ j08[] a() {
        return new j08[]{c, d, e};
    }

    public static j08 valueOf(String str) {
        return (j08) Enum.valueOf(j08.class, str);
    }

    public static j08[] values() {
        return (j08[]) f.clone();
    }

    public final int i() {
        return this.a;
    }
}
