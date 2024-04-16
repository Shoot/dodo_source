package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.profile.feature.profilesettings.presentation.a;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContactInfoVO.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006!"}, d2 = {"Las1;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "a", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "b", "()Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "showContactsSections", "", "Lbqa;", c.a, "Ljava/util/List;", "()Ljava/util/List;", "availableSocialNetworks", "nativeChatEnabled", e.a, "showPizzeriasMapButton", "f", "getShowLegalDocumentsButton", "showLegalDocumentsButton", "<init>", "(Lcom/dodopizza/profile/feature/profilesettings/presentation/a;ZLjava/util/List;ZZZ)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: as1  reason: default package */
/* loaded from: classes2.dex */
public final class as1 {
    private final a a;
    private final boolean b;
    private final List<bqa> c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public as1(a aVar, boolean z, List<? extends bqa> list, boolean z2, boolean z3, boolean z4) {
        z65.h(aVar, "contactInfoData");
        z65.h(list, "availableSocialNetworks");
        this.a = aVar;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final List<bqa> a() {
        return this.c;
    }

    public final a b() {
        return this.a;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as1)) {
            return false;
        }
        as1 as1Var = (as1) obj;
        if (z65.c(this.a, as1Var.a) && this.b == as1Var.b && z65.c(this.c, as1Var.c) && this.d == as1Var.d && this.e == as1Var.e && this.f == as1Var.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        a aVar = this.a;
        boolean z = this.b;
        List<bqa> list = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        return "ContactInfoVO(contactInfoData=" + aVar + ", showContactsSections=" + z + ", availableSocialNetworks=" + list + ", nativeChatEnabled=" + z2 + ", showPizzeriasMapButton=" + z3 + ", showLegalDocumentsButton=" + z4 + ")";
    }
}
