package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Payment.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001f"}, d2 = {"Los7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", e.a, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, c.a, "provider", "Lgw7;", DateTokenConverter.CONVERTER_KEY, "Lgw7;", "()Lgw7;", "f", "(Lgw7;)V", "status", "Lpp0;", "Lpp0;", "()Lpp0;", "scenario", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgw7;Lpp0;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: os7  reason: default package */
/* loaded from: classes2.dex */
public final class os7 {
    private final String a;
    private final String b;
    private final String c;
    private gw7 d;
    private final pp0 e;

    public os7(String str, String str2, String str3, gw7 gw7Var, pp0 pp0Var) {
        z65.h(str, "id");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str3, "provider");
        z65.h(gw7Var, "status");
        z65.h(pp0Var, "scenario");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gw7Var;
        this.e = pp0Var;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final pp0 c() {
        return this.e;
    }

    public final gw7 d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os7)) {
            return false;
        }
        os7 os7Var = (os7) obj;
        if (z65.c(this.a, os7Var.a) && z65.c(this.b, os7Var.b) && z65.c(this.c, os7Var.c) && this.d == os7Var.d && z65.c(this.e, os7Var.e)) {
            return true;
        }
        return false;
    }

    public final void f(gw7 gw7Var) {
        z65.h(gw7Var, "<set-?>");
        this.d = gw7Var;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        gw7 gw7Var = this.d;
        pp0 pp0Var = this.e;
        return "Payment(id=" + str + ", workflowId=" + str2 + ", provider=" + str3 + ", status=" + gw7Var + ", scenario=" + pp0Var + ")";
    }
}
