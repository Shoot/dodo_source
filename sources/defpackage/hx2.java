package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DeliveryInfo.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010$\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u0013\u0010#¨\u0006'"}, d2 = {"Lhx2;", "", "Ljk7;", "a", "Ljk7;", c.a, "()Ljk7;", "orderType", "Lw6;", "b", "Lw6;", "()Lw6;", "address", "", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "pizzeriaId", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "deferredTime", "", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "isTakeaway", "", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "tableNumber", "Lxo7;", "Lxo7;", "()Lxo7;", "packageType", "<init>", "(Ljk7;Lw6;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Lxo7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hx2  reason: default package */
/* loaded from: classes4.dex */
public final class hx2 {
    private final jk7 a;
    private final w6 b;
    private final String c;
    private final Long d;
    private final Boolean e;
    private final Integer f;
    private final xo7 g;

    public hx2(jk7 jk7Var, w6 w6Var, String str, Long l, Boolean bool, Integer num, xo7 xo7Var) {
        z65.h(jk7Var, "orderType");
        z65.h(xo7Var, "packageType");
        this.a = jk7Var;
        this.b = w6Var;
        this.c = str;
        this.d = l;
        this.e = bool;
        this.f = num;
        this.g = xo7Var;
    }

    public final w6 a() {
        return this.b;
    }

    public final Long b() {
        return this.d;
    }

    public final jk7 c() {
        return this.a;
    }

    public final xo7 d() {
        return this.g;
    }

    public final String e() {
        return this.c;
    }

    public final Integer f() {
        return this.f;
    }

    public final Boolean g() {
        return this.e;
    }
}
