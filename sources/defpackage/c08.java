package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: PersonalOfferAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lc08;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Z", "isRightScrollDirection", "()Z", "b", "Ljava/lang/String;", "getOfferScrollFromId", "()Ljava/lang/String;", "offerScrollFromId", c.a, "getOfferScrollToId", "offerScrollToId", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c08  reason: default package */
/* loaded from: classes4.dex */
public final class c08 implements dc {
    private final boolean a;
    private final String b;
    private final String c;
    private final qd d;

    public c08(boolean z, String str, String str2, qd qdVar) {
        z65.h(str, "offerScrollFromId");
        z65.h(str2, "offerScrollToId");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        String str;
        bc bcVar = new bc("scrolling_personal_offers");
        if (this.a) {
            str = ElementGenerator.TEXT_ALIGN_RIGHT;
        } else {
            str = ElementGenerator.TEXT_ALIGN_LEFT;
        }
        return vc.z(bc.e(bc.e(bc.e(bcVar, "scrollDirection", str, false, 4, null), "offerFromId", this.b, false, 4, null), "offerToId", this.c, false, 4, null), this.d).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c08)) {
            return false;
        }
        c08 c08Var = (c08) obj;
        if (this.a == c08Var.a && z65.c(this.b, c08Var.b) && z65.c(this.c, c08Var.c) && z65.c(this.d, c08Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = ((((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        qd qdVar = this.d;
        if (qdVar == null) {
            hashCode = 0;
        } else {
            hashCode = qdVar.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        qd qdVar = this.d;
        return "ScrollingPersonalOffersEvent(isRightScrollDirection=" + z + ", offerScrollFromId=" + str + ", offerScrollToId=" + str2 + ", sender=" + qdVar + ")";
    }
}
