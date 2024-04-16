package defpackage;

import androidx.fragment.app.Fragment;
import defpackage.s64;
import kotlin.Metadata;
/* compiled from: LoyaltyMissionDetailsFragment.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lp16;", "Ls64;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lb16;", "Lb16;", "data", "<init>", "(Lb16;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p16  reason: default package */
/* loaded from: classes2.dex */
public final class p16 implements s64 {
    private final b16 a;

    public p16(b16 b16Var) {
        z65.h(b16Var, "data");
        this.a = b16Var;
    }

    @Override // defpackage.s64
    public Fragment a() {
        return h16.x.a(this.a);
    }

    @Override // defpackage.yw9
    public String b() {
        return s64.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p16) && z65.c(this.a, ((p16) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        b16 b16Var = this.a;
        return "LoyaltyMissionDetailsScreen(data=" + b16Var + ")";
    }
}
