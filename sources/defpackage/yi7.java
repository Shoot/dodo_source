package defpackage;

import defpackage.ym;
import kotlin.Metadata;
/* compiled from: OrderSummaryAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lyi7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lym$d;", "Lym$d;", "screen", "<init>", "(Lym$d;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yi7  reason: default package */
/* loaded from: classes4.dex */
public final class yi7 implements dc {
    private final ym.d a;

    public yi7(ym.d dVar) {
        z65.h(dVar, "screen");
        this.a = dVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.A(new bc("click_on_contact_us"), this.a.i()).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yi7) && this.a == ((yi7) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        ym.d dVar = this.a;
        return "ClickOnContactSupport(screen=" + dVar + ")";
    }
}
