package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalOfferVO.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020\b\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u000202\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\u0004\b>\u0010?J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b\u001b\u0010\fR\"\u0010'\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b\u000e\u0010*\"\u0004\b+\u0010,R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b.\u0010$R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b0\u0010\fR\"\u00107\u001a\u0002028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b \u00105\"\u0004\b3\u00106R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000209088\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lk08;", "Lp67;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", DateTokenConverter.CONVERTER_KEY, "offerImageUrl", c.a, e.a, "offerName", "offerConditions", "Lj08;", "Lj08;", "n", "()Lj08;", "offerType", "Lbwb;", "f", "Lbwb;", Image.TYPE_HIGH, "()Lbwb;", "validityPeriod", "g", "promoCode", "Z", "i", "()Z", "j", "(Z)V", "isApplied", "Lbs5;", "Lbs5;", "()Lbs5;", "k", "(Lbs5;)V", "loadingState", "p", "isCollaboration", Image.TYPE_MEDIUM, "collaborationForwardLink", "Lu2a;", "l", "Lu2a;", "()Lu2a;", "(Lu2a;)V", "secretType", "", "Ljk7;", "Ljava/util/List;", "o", "()Ljava/util/List;", "orderTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj08;Lbwb;Ljava/lang/String;ZLbs5;ZLjava/lang/String;Lu2a;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k08  reason: default package */
/* loaded from: classes2.dex */
public final class k08 extends p67 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final j08 e;
    private final bwb f;
    private final String g;
    private boolean h;
    private bs5 i;
    private final boolean j;
    private final String k;
    private u2a l;
    private final List<jk7> m;

    public /* synthetic */ k08(String str, String str2, String str3, String str4, j08 j08Var, bwb bwbVar, String str5, boolean z, bs5 bs5Var, boolean z2, String str6, u2a u2aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j08Var, bwbVar, str5, z, (i & 256) != 0 ? bs5.a : bs5Var, z2, str6, u2aVar, list);
    }

    @Override // defpackage.p67
    public String a() {
        return this.a;
    }

    @Override // defpackage.p67
    public bs5 b() {
        return this.i;
    }

    @Override // defpackage.p67
    public String c() {
        return this.d;
    }

    @Override // defpackage.p67
    public String d() {
        return this.b;
    }

    @Override // defpackage.p67
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k08)) {
            return false;
        }
        k08 k08Var = (k08) obj;
        if (z65.c(this.a, k08Var.a) && z65.c(this.b, k08Var.b) && z65.c(this.c, k08Var.c) && z65.c(this.d, k08Var.d) && this.e == k08Var.e && z65.c(this.f, k08Var.f) && z65.c(this.g, k08Var.g) && this.h == k08Var.h && this.i == k08Var.i && this.j == k08Var.j && z65.c(this.k, k08Var.k) && z65.c(this.l, k08Var.l) && z65.c(this.m, k08Var.m)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p67
    public String f() {
        return this.g;
    }

    @Override // defpackage.p67
    public u2a g() {
        return this.l;
    }

    @Override // defpackage.p67
    public bwb h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a91.a(this.h)) * 31) + this.i.hashCode()) * 31) + a91.a(this.j)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    @Override // defpackage.p67
    public boolean i() {
        return this.h;
    }

    @Override // defpackage.p67
    public void j(boolean z) {
        this.h = z;
    }

    @Override // defpackage.p67
    public void k(bs5 bs5Var) {
        z65.h(bs5Var, "<set-?>");
        this.i = bs5Var;
    }

    @Override // defpackage.p67
    public void l(u2a u2aVar) {
        z65.h(u2aVar, "<set-?>");
        this.l = u2aVar;
    }

    public final String m() {
        return this.k;
    }

    public final j08 n() {
        return this.e;
    }

    public final List<jk7> o() {
        return this.m;
    }

    public final boolean p() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        j08 j08Var = this.e;
        bwb bwbVar = this.f;
        String str5 = this.g;
        boolean z = this.h;
        bs5 bs5Var = this.i;
        boolean z2 = this.j;
        String str6 = this.k;
        u2a u2aVar = this.l;
        List<jk7> list = this.m;
        return "PersonalOfferVO(id=" + str + ", offerImageUrl=" + str2 + ", offerName=" + str3 + ", offerConditions=" + str4 + ", offerType=" + j08Var + ", validityPeriod=" + bwbVar + ", promoCode=" + str5 + ", isApplied=" + z + ", loadingState=" + bs5Var + ", isCollaboration=" + z2 + ", collaborationForwardLink=" + str6 + ", secretType=" + u2aVar + ", orderTypes=" + list + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k08(String str, String str2, String str3, String str4, j08 j08Var, bwb bwbVar, String str5, boolean z, bs5 bs5Var, boolean z2, String str6, u2a u2aVar, List<? extends jk7> list) {
        super(null);
        z65.h(str, "id");
        z65.h(str2, "offerImageUrl");
        z65.h(str3, "offerName");
        z65.h(str4, "offerConditions");
        z65.h(j08Var, "offerType");
        z65.h(bwbVar, "validityPeriod");
        z65.h(str5, "promoCode");
        z65.h(bs5Var, "loadingState");
        z65.h(str6, "collaborationForwardLink");
        z65.h(u2aVar, "secretType");
        z65.h(list, "orderTypes");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j08Var;
        this.f = bwbVar;
        this.g = str5;
        this.h = z;
        this.i = bs5Var;
        this.j = z2;
        this.k = str6;
        this.l = u2aVar;
        this.m = list;
    }
}
