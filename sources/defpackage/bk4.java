package defpackage;

import kotlin.Metadata;
/* compiled from: HalvesAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lbk4;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Z", "isRandom", "<init>", "(Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bk4  reason: default package */
/* loaded from: classes4.dex */
public final class bk4 implements dc {
    private final boolean a;

    public bk4(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(new bc("halves_card_open"), "isRandom", Boolean.valueOf(this.a), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bk4) && this.a == ((bk4) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a91.a(this.a);
    }

    public String toString() {
        boolean z = this.a;
        return "HalvesCardOpen(isRandom=" + z + ")";
    }
}
