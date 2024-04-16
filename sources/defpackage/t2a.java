package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SecretOrderVO.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\b\u0012\b\b\u0002\u00101\u001a\u00020,\u0012\u0006\u00103\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u000207\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<¢\u0006\u0004\bB\u0010CJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u001a\u0010\fR\"\u0010+\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010-\u001a\u0004\b\u000e\u0010.\"\u0004\b/\u00100R\u0017\u00103\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b2\u0010(R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\fR\"\u0010;\u001a\u0002078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00108\u001a\u0004\b \u00109\"\u0004\b4\u0010:R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lt2a;", "Lp67;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", DateTokenConverter.CONVERTER_KEY, "offerImageUrl", c.a, "I", "n", "()I", "offerLocalImageResId", e.a, "offerName", "offerConditions", "Lj08;", "f", "Lj08;", "getOfferType", "()Lj08;", "offerType", "Lbwb;", "g", "Lbwb;", Image.TYPE_HIGH, "()Lbwb;", "validityPeriod", "promoCode", "i", "Z", "()Z", "j", "(Z)V", "isApplied", "Lbs5;", "Lbs5;", "()Lbs5;", "k", "(Lbs5;)V", "loadingState", "p", "isCollaboration", "l", Image.TYPE_MEDIUM, "collaborationForwardLink", "Lu2a;", "Lu2a;", "()Lu2a;", "(Lu2a;)V", "secretType", "", "Ljk7;", "Ljava/util/List;", "o", "()Ljava/util/List;", "orderTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj08;Lbwb;Ljava/lang/String;ZLbs5;ZLjava/lang/String;Lu2a;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t2a  reason: default package */
/* loaded from: classes2.dex */
public final class t2a extends p67 {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final j08 f;
    private final bwb g;
    private final String h;
    private boolean i;
    private bs5 j;
    private final boolean k;
    private final String l;
    private u2a m;
    private final List<jk7> n;

    public /* synthetic */ t2a(String str, String str2, int i, String str3, String str4, j08 j08Var, bwb bwbVar, String str5, boolean z, bs5 bs5Var, boolean z2, String str6, u2a u2aVar, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, j08Var, bwbVar, str5, z, (i2 & 512) != 0 ? bs5.a : bs5Var, z2, str6, u2aVar, list);
    }

    @Override // defpackage.p67
    public String a() {
        return this.a;
    }

    @Override // defpackage.p67
    public bs5 b() {
        return this.j;
    }

    @Override // defpackage.p67
    public String c() {
        return this.e;
    }

    @Override // defpackage.p67
    public String d() {
        return this.b;
    }

    @Override // defpackage.p67
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2a)) {
            return false;
        }
        t2a t2aVar = (t2a) obj;
        if (z65.c(this.a, t2aVar.a) && z65.c(this.b, t2aVar.b) && this.c == t2aVar.c && z65.c(this.d, t2aVar.d) && z65.c(this.e, t2aVar.e) && this.f == t2aVar.f && z65.c(this.g, t2aVar.g) && z65.c(this.h, t2aVar.h) && this.i == t2aVar.i && this.j == t2aVar.j && this.k == t2aVar.k && z65.c(this.l, t2aVar.l) && z65.c(this.m, t2aVar.m) && z65.c(this.n, t2aVar.n)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p67
    public String f() {
        return this.h;
    }

    @Override // defpackage.p67
    public u2a g() {
        return this.m;
    }

    @Override // defpackage.p67
    public bwb h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31) + this.j.hashCode()) * 31) + a91.a(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    @Override // defpackage.p67
    public boolean i() {
        return this.i;
    }

    @Override // defpackage.p67
    public void j(boolean z) {
        this.i = z;
    }

    @Override // defpackage.p67
    public void k(bs5 bs5Var) {
        z65.h(bs5Var, "<set-?>");
        this.j = bs5Var;
    }

    @Override // defpackage.p67
    public void l(u2a u2aVar) {
        z65.h(u2aVar, "<set-?>");
        this.m = u2aVar;
    }

    public final String m() {
        return this.l;
    }

    public final int n() {
        return this.c;
    }

    public final List<jk7> o() {
        return this.n;
    }

    public final boolean p() {
        return this.k;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = this.d;
        String str4 = this.e;
        j08 j08Var = this.f;
        bwb bwbVar = this.g;
        String str5 = this.h;
        boolean z = this.i;
        bs5 bs5Var = this.j;
        boolean z2 = this.k;
        String str6 = this.l;
        u2a u2aVar = this.m;
        List<jk7> list = this.n;
        return "SecretOrderVO(id=" + str + ", offerImageUrl=" + str2 + ", offerLocalImageResId=" + i + ", offerName=" + str3 + ", offerConditions=" + str4 + ", offerType=" + j08Var + ", validityPeriod=" + bwbVar + ", promoCode=" + str5 + ", isApplied=" + z + ", loadingState=" + bs5Var + ", isCollaboration=" + z2 + ", collaborationForwardLink=" + str6 + ", secretType=" + u2aVar + ", orderTypes=" + list + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t2a(String str, String str2, int i, String str3, String str4, j08 j08Var, bwb bwbVar, String str5, boolean z, bs5 bs5Var, boolean z2, String str6, u2a u2aVar, List<? extends jk7> list) {
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
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = j08Var;
        this.g = bwbVar;
        this.h = str5;
        this.i = z;
        this.j = bs5Var;
        this.k = z2;
        this.l = str6;
        this.m = u2aVar;
        this.n = list;
    }
}
