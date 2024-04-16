package defpackage;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderVO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Lwl7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbc7;", "a", "Lbc7;", "()Lbc7;", BonusActionEntity.ORDER, "Lpi7;", "b", "Lpi7;", "()Lpi7;", "orderStateVO", "", c.a, "J", "()J", "timeRemaining", "<init>", "(Lbc7;Lpi7;J)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wl7  reason: default package */
/* loaded from: classes4.dex */
public final class wl7 {
    private final bc7 a;
    private final pi7 b;
    private final long c;

    public wl7(bc7 bc7Var, pi7 pi7Var, long j) {
        z65.h(bc7Var, BonusActionEntity.ORDER);
        z65.h(pi7Var, "orderStateVO");
        this.a = bc7Var;
        this.b = pi7Var;
        this.c = j;
    }

    public final bc7 a() {
        return this.a;
    }

    public final pi7 b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl7)) {
            return false;
        }
        wl7 wl7Var = (wl7) obj;
        if (z65.c(this.a, wl7Var.a) && z65.c(this.b, wl7Var.b) && this.c == wl7Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ax1.a(this.c);
    }

    public String toString() {
        bc7 bc7Var = this.a;
        pi7 pi7Var = this.b;
        long j = this.c;
        return "OrderVO(order=" + bc7Var + ", orderStateVO=" + pi7Var + ", timeRemaining=" + j + ")";
    }
}
