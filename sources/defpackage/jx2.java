package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryLocation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\tB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, d2 = {"Ljx2;", "Ljava/io/Serializable;", "", "formattedAddress", "Lqw1;", MessageAttributes.COORDINATES, "", "addressDetails", "encodedComponents", "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lqw1;", DateTokenConverter.CONVERTER_KEY, "()Lqw1;", c.a, "Ljava/util/Map;", "()Ljava/util/Map;", e.a, "<init>", "(Ljava/lang/String;Lqw1;Ljava/util/Map;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jx2  reason: default package */
/* loaded from: classes4.dex */
public final class jx2 implements Serializable {
    public static final a e = new a(null);
    public static final jx2 f = new jx2("", qw1.c.a(), d86.h(), "");
    private final String a;
    private final qw1 b;
    private final Map<String, String> c;
    private final String d;

    /* compiled from: DeliveryLocation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljx2$a;", "", "Ljx2;", "EMPTY", "Ljx2;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jx2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public jx2(String str, qw1 qw1Var, Map<String, String> map, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        z65.h(map, "addressDetails");
        z65.h(str2, "encodedComponents");
        this.a = str;
        this.b = qw1Var;
        this.c = map;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jx2 b(jx2 jx2Var, String str, qw1 qw1Var, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jx2Var.a;
        }
        if ((i & 2) != 0) {
            qw1Var = jx2Var.b;
        }
        if ((i & 4) != 0) {
            map = jx2Var.c;
        }
        if ((i & 8) != 0) {
            str2 = jx2Var.d;
        }
        return jx2Var.a(str, qw1Var, map, str2);
    }

    public final jx2 a(String str, qw1 qw1Var, Map<String, String> map, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        z65.h(map, "addressDetails");
        z65.h(str2, "encodedComponents");
        return new jx2(str, qw1Var, map, str2);
    }

    public final Map<String, String> c() {
        return this.c;
    }

    public final qw1 d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx2)) {
            return false;
        }
        jx2 jx2Var = (jx2) obj;
        if (z65.c(this.a, jx2Var.a) && z65.c(this.b, jx2Var.b) && z65.c(this.c, jx2Var.c) && z65.c(this.d, jx2Var.d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        qw1 qw1Var = this.b;
        Map<String, String> map = this.c;
        String str2 = this.d;
        return "DeliveryLocation(formattedAddress=" + str + ", coordinates=" + qw1Var + ", addressDetails=" + map + ", encodedComponents=" + str2 + ")";
    }
}
