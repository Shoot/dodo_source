package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReferralPromoType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ljb9;", "", "", "a", "I", "i", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jb9  reason: default package */
/* loaded from: classes4.dex */
public final class jb9 {
    public static final a b;
    public static final jb9 c = new jb9("NONE", 0, 0);
    public static final jb9 d = new jb9("REFERRAL_PROGRAM", 1, 1);
    public static final jb9 e = new jb9("MOBILE_APP_FIRST_INSTALL_BONUS", 2, 2);
    private static final /* synthetic */ jb9[] f;
    private static final /* synthetic */ kj3 g;
    private final int a;

    /* compiled from: ReferralPromoType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Ljb9$a;", "", "", MessageAttributes.TYPE, "Ljb9;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jb9$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jb9 a(int i) {
            jb9 jb9Var;
            jb9[] values = jb9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    jb9Var = values[i2];
                    if (jb9Var.i() == i) {
                        break;
                    }
                    i2++;
                } else {
                    jb9Var = null;
                    break;
                }
            }
            return (jb9) mh5.c(jb9Var, jb9.c);
        }
    }

    static {
        jb9[] a2 = a();
        f = a2;
        g = lj3.a(a2);
        b = new a(null);
    }

    private jb9(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ jb9[] a() {
        return new jb9[]{c, d, e};
    }

    public static jb9 valueOf(String str) {
        return (jb9) Enum.valueOf(jb9.class, str);
    }

    public static jb9[] values() {
        return (jb9[]) f.clone();
    }

    public final int i() {
        return this.a;
    }
}
