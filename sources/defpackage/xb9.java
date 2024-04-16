package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.s64;
import kotlin.Metadata;
/* compiled from: ReferralSystemShareQrFragment.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lxb9;", "Ls64;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "inviteCode", "b", "inviteLink", c.a, "inviteMessage", DateTokenConverter.CONVERTER_KEY, "Z", "showStaticCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xb9  reason: default package */
/* loaded from: classes2.dex */
public final class xb9 implements s64 {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public xb9(String str, String str2, String str3, boolean z) {
        z65.h(str, "inviteCode");
        z65.h(str2, "inviteLink");
        z65.h(str3, "inviteMessage");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // defpackage.s64
    public Fragment a() {
        return wb9.i.a(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.yw9
    public String b() {
        return s64.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb9)) {
            return false;
        }
        xb9 xb9Var = (xb9) obj;
        if (z65.c(this.a, xb9Var.a) && z65.c(this.b, xb9Var.b) && z65.c(this.c, xb9Var.c) && this.d == xb9Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        return "ReferralSystemShareQrScreen(inviteCode=" + str + ", inviteLink=" + str2 + ", inviteMessage=" + str3 + ", showStaticCode=" + z + ")";
    }
}
