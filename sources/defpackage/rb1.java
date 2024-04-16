package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CollaborationPromoVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006 "}, d2 = {"Lrb1;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", c.a, "imageUrl", e.a, "title", DateTokenConverter.CONVERTER_KEY, "description", "promoCode", "Lr67;", "f", "Lr67;", "()Lr67;", "validationPeriod", "g", "collaborationLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr67;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rb1  reason: default package */
/* loaded from: classes2.dex */
public final class rb1 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final r67 f;
    private final String g;

    public rb1(String str, String str2, String str3, String str4, String str5, r67 r67Var, String str6) {
        z65.h(str, "id");
        z65.h(str2, "imageUrl");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(str5, "promoCode");
        z65.h(r67Var, "validationPeriod");
        z65.h(str6, "collaborationLink");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = r67Var;
        this.g = str6;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb1)) {
            return false;
        }
        rb1 rb1Var = (rb1) obj;
        if (z65.c(this.a, rb1Var.a) && z65.c(this.b, rb1Var.b) && z65.c(this.c, rb1Var.c) && z65.c(this.d, rb1Var.d) && z65.c(this.e, rb1Var.e) && z65.c(this.f, rb1Var.f) && z65.c(this.g, rb1Var.g)) {
            return true;
        }
        return false;
    }

    public final r67 f() {
        return this.f;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        r67 r67Var = this.f;
        String str6 = this.g;
        return "CollaborationPromoVO(id=" + str + ", imageUrl=" + str2 + ", title=" + str3 + ", description=" + str4 + ", promoCode=" + str5 + ", validationPeriod=" + r67Var + ", collaborationLink=" + str6 + ")";
    }
}
