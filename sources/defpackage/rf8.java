package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: PopularProductVO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, d2 = {"Lrf8;", "Lmq8;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "imageUrl", "Lhn6;", c.a, "Lhn6;", e.a, "()Lhn6;", "price", "Llq8;", DateTokenConverter.CONVERTER_KEY, "Llq8;", "f", "()Llq8;", MessageAttributes.TYPE, "Z", "g", "()Z", "isNewDesign", "Lre6;", "Lre6;", "()Lre6;", "menuItemType", "menuItemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;Llq8;ZLre6;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rf8  reason: default package */
/* loaded from: classes2.dex */
public final class rf8 extends mq8 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final lq8 d;
    private final boolean e;
    private final re6 f;
    private final String g;

    public rf8(String str, String str2, hn6 hn6Var, lq8 lq8Var, boolean z, re6 re6Var, String str3) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(lq8Var, MessageAttributes.TYPE);
        z65.h(re6Var, "menuItemType");
        z65.h(str3, "menuItemId");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = lq8Var;
        this.e = z;
        this.f = re6Var;
        this.g = str3;
    }

    @Override // defpackage.mq8
    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public final String c() {
        return this.g;
    }

    public final re6 d() {
        return this.f;
    }

    public hn6 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf8)) {
            return false;
        }
        rf8 rf8Var = (rf8) obj;
        if (z65.c(this.a, rf8Var.a) && z65.c(this.b, rf8Var.b) && z65.c(this.c, rf8Var.c) && z65.c(this.d, rf8Var.d) && this.e == rf8Var.e && this.f == rf8Var.f && z65.c(this.g, rf8Var.g)) {
            return true;
        }
        return false;
    }

    public lq8 f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        lq8 lq8Var = this.d;
        boolean z = this.e;
        re6 re6Var = this.f;
        String str3 = this.g;
        return "PopularProductVO(name=" + str + ", imageUrl=" + str2 + ", price=" + hn6Var + ", type=" + lq8Var + ", isNewDesign=" + z + ", menuItemType=" + re6Var + ", menuItemId=" + str3 + ")";
    }
}
