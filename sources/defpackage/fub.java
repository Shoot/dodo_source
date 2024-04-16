package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: UserDataVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lfub;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", c.a, "()Z", "isLoyaltyProgramEnable", "b", "isCoinsExpirationSoon", DateTokenConverter.CONVERTER_KEY, "isMissionsEnable", "f", "isReferralSystemEnable", e.a, "g", "isShowReferralBadge", "isNeedReferralAttractAttention", "isEnterInviteCodeEnable", "<init>", "(ZZZZZZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fub  reason: default package */
/* loaded from: classes4.dex */
public final class fub {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public fub(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fub)) {
            return false;
        }
        fub fubVar = (fub) obj;
        if (this.a == fubVar.a && this.b == fubVar.b && this.c == fubVar.c && this.d == fubVar.d && this.e == fubVar.e && this.f == fubVar.f && this.g == fubVar.g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((a91.a(this.a) * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f)) * 31) + a91.a(this.g);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        return "UserBenefitsToggles(isLoyaltyProgramEnable=" + z + ", isCoinsExpirationSoon=" + z2 + ", isMissionsEnable=" + z3 + ", isReferralSystemEnable=" + z4 + ", isShowReferralBadge=" + z5 + ", isNeedReferralAttractAttention=" + z6 + ", isEnterInviteCodeEnable=" + z7 + ")";
    }
}
