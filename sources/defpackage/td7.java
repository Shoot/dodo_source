package defpackage;

import kotlin.Metadata;
/* compiled from: OrderGameAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Ltd7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "orderUUID", "b", "gameSessionUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: td7  reason: default package */
/* loaded from: classes4.dex */
public final class td7 implements dc {
    private final String a;
    private final String b;

    public td7(String str, String str2) {
        z65.h(str, "orderUUID");
        z65.h(str2, "gameSessionUuid");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(vc.t(new bc("screen_active_order_game_onboarding"), this.a), "gameSessionUUId", this.b, false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td7)) {
            return false;
        }
        td7 td7Var = (td7) obj;
        if (z65.c(this.a, td7Var.a) && z65.c(this.b, td7Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "OrderGameInfoScreen(orderUUID=" + str + ", gameSessionUuid=" + str2 + ")";
    }
}
