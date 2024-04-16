package defpackage;

import androidx.fragment.app.Fragment;
import defpackage.s64;
import kotlin.Metadata;
/* compiled from: CatchAddressFragment.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lrt0;", "Ls64;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "addressId", "b", "Z", "withCarryout", "<init>", "(Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rt0  reason: default package */
/* loaded from: classes4.dex */
public final class rt0 implements s64 {
    private final String a;
    private final boolean b;

    public rt0(String str, boolean z) {
        z65.h(str, "addressId");
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.s64
    public Fragment a() {
        return kt0.k.a(this.a, this.b);
    }

    @Override // defpackage.yw9
    public String b() {
        return s64.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt0)) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        if (z65.c(this.a, rt0Var.a) && this.b == rt0Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        return "CatchAddressScreen(addressId=" + str + ", withCarryout=" + z + ")";
    }
}
