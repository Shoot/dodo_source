package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TlsVersion.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lmhb;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "javaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: mhb  reason: default package */
/* loaded from: classes3.dex */
public final class mhb {
    public static final a b;
    public static final mhb c = new mhb("TLS_1_3", 0, "TLSv1.3");
    public static final mhb d = new mhb("TLS_1_2", 1, "TLSv1.2");
    public static final mhb e = new mhb("TLS_1_1", 2, "TLSv1.1");
    public static final mhb f = new mhb("TLS_1_0", 3, "TLSv1");
    public static final mhb g = new mhb("SSL_3_0", 4, "SSLv3");
    private static final /* synthetic */ mhb[] h;
    private static final /* synthetic */ kj3 i;
    private final String a;

    /* compiled from: TlsVersion.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lmhb$a;", "", "", "javaName", "Lmhb;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mhb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mhb a(String str) {
            z65.h(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return mhb.e;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return mhb.d;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return mhb.c;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return mhb.f;
                }
            } else if (str.equals("SSLv3")) {
                return mhb.g;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    static {
        mhb[] a2 = a();
        h = a2;
        i = lj3.a(a2);
        b = new a(null);
    }

    private mhb(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ mhb[] a() {
        return new mhb[]{c, d, e, f, g};
    }

    public static mhb valueOf(String str) {
        return (mhb) Enum.valueOf(mhb.class, str);
    }

    public static mhb[] values() {
        return (mhb[]) h.clone();
    }

    public final String i() {
        return this.a;
    }
}
