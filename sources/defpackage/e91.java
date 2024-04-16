package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ClientDeliveryLocation.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001d"}, d2 = {"Le91;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "id", "Ljx2;", "deliveryLocation", "requiresAddressDetails", "a", "toString", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljx2;", c.a, "()Ljx2;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", e.a, "isEmpty", "<init>", "(Ljava/lang/String;Ljx2;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e91  reason: default package */
/* loaded from: classes4.dex */
public final class e91 implements Serializable {
    public static final a d = new a(null);
    public static final e91 e = new e91("", jx2.f, true);
    private final String a;
    private final jx2 b;
    private final boolean c;

    /* compiled from: ClientDeliveryLocation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Le91$a;", "", "Le91;", "a", "EMPTY", "Le91;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e91$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e91 a() {
            return new e91(ht4.a.a(), jx2.f, false);
        }
    }

    public e91(String str, jx2 jx2Var, boolean z) {
        z65.h(str, "id");
        z65.h(jx2Var, "deliveryLocation");
        this.a = str;
        this.b = jx2Var;
        this.c = z;
    }

    public static /* synthetic */ e91 b(e91 e91Var, String str, jx2 jx2Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = e91Var.a;
        }
        if ((i & 2) != 0) {
            jx2Var = e91Var.b;
        }
        if ((i & 4) != 0) {
            z = e91Var.c;
        }
        return e91Var.a(str, jx2Var, z);
    }

    public final e91 a(String str, jx2 jx2Var, boolean z) {
        z65.h(str, "id");
        z65.h(jx2Var, "deliveryLocation");
        return new e91(str, jx2Var, z);
    }

    public final jx2 c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return z65.c(this, e);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(e91.class, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.domain.deliverylocation.ClientDeliveryLocation");
        if (z65.c(this.a, ((e91) obj).a)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = this.a;
        jx2 jx2Var = this.b;
        boolean z = this.c;
        return "ClientDeliveryLocation(id=" + str + ", deliveryLocation=" + jx2Var + ", requiresAddressDetails=" + z + ")";
    }
}
