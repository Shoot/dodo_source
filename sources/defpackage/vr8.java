package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Protocol.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lvr8;", "", "", "toString", "a", "Ljava/lang/String;", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: vr8  reason: default package */
/* loaded from: classes3.dex */
public final class vr8 {
    public static final a b;
    public static final vr8 c = new vr8("HTTP_1_0", 0, "http/1.0");
    public static final vr8 d = new vr8("HTTP_1_1", 1, "http/1.1");
    public static final vr8 e = new vr8("SPDY_3", 2, "spdy/3.1");
    public static final vr8 f = new vr8("HTTP_2", 3, "h2");
    public static final vr8 g = new vr8("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final vr8 h = new vr8("QUIC", 5, "quic");
    public static final vr8 i = new vr8("HTTP_3", 6, "h3");
    private static final /* synthetic */ vr8[] j;
    private static final /* synthetic */ kj3 k;
    private final String a;

    /* compiled from: Protocol.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lvr8$a;", "", "", "protocol", "Lvr8;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vr8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vr8 a(String str) throws IOException {
            boolean J;
            z65.h(str, "protocol");
            vr8 vr8Var = vr8.c;
            if (!z65.c(str, vr8Var.a)) {
                vr8Var = vr8.d;
                if (!z65.c(str, vr8Var.a)) {
                    vr8Var = vr8.g;
                    if (!z65.c(str, vr8Var.a)) {
                        vr8Var = vr8.f;
                        if (!z65.c(str, vr8Var.a)) {
                            vr8Var = vr8.e;
                            if (!z65.c(str, vr8Var.a)) {
                                vr8Var = vr8.h;
                                if (!z65.c(str, vr8Var.a)) {
                                    vr8Var = vr8.i;
                                    J = l0b.J(str, vr8Var.a, false, 2, null);
                                    if (!J) {
                                        throw new IOException("Unexpected protocol: " + str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return vr8Var;
        }
    }

    static {
        vr8[] a2 = a();
        j = a2;
        k = lj3.a(a2);
        b = new a(null);
    }

    private vr8(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ vr8[] a() {
        return new vr8[]{c, d, e, f, g, h, i};
    }

    public static vr8 valueOf(String str) {
        return (vr8) Enum.valueOf(vr8.class, str);
    }

    public static vr8[] values() {
        return (vr8[]) j.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
