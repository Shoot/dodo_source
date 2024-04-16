package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bP\u0010QJ\u0097\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cHÆ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\u0013\u0010%\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b8\u0010BR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u0010C\u001a\u0004\b-\u0010DR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b:\u0010E\u001a\u0004\b1\u0010FR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b+\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\bJ\u0010O¨\u0006R"}, d2 = {"Lb61;", "Ljava/io/Serializable;", "Lcu7;", "paymentMethod", "Lwk7;", "orderType", "Lzo7;", "packagingState", "", "Lok9;", "restaurantServiceTypes", "Lpt2;", "deferredTime", "Lsx6;", "newDeferredTime", "Lin6;", "moneyDetails", "Ly41;", "extraInfo", "Lu31;", "action", "Lv51;", "checkoutScreenResult", "", "Ld41;", "unhandledErrors", "", "isEmptyCart", "Lwo7;", "packageSelector", "a", "", "toString", "", "hashCode", "", "other", "equals", "Lcu7;", "n", "()Lcu7;", "b", "Lwk7;", "k", "()Lwk7;", c.a, "Lzo7;", Image.TYPE_MEDIUM, "()Lzo7;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "o", "()Ljava/util/List;", e.a, "Lpt2;", "()Lpt2;", "f", "Lsx6;", "j", "()Lsx6;", "g", "Lin6;", "i", "()Lin6;", Image.TYPE_HIGH, "Ly41;", "()Ly41;", "Lu31;", "()Lu31;", "Lv51;", "()Lv51;", "Ljava/util/Collection;", "q", "()Ljava/util/Collection;", "l", "Z", "r", "()Z", "Lwo7;", "()Lwo7;", "<init>", "(Lcu7;Lwk7;Lzo7;Ljava/util/List;Lpt2;Lsx6;Lin6;Ly41;Lu31;Lv51;Ljava/util/Collection;ZLwo7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b61  reason: default package */
/* loaded from: classes4.dex */
public final class b61 implements Serializable {
    private final cu7 a;
    private final wk7 b;
    private final zo7 c;
    private final List<ok9> d;
    private final pt2 e;
    private final sx6 f;
    private final in6 g;
    private final y41 h;
    private final u31 i;
    private final v51 j;
    private final Collection<d41> k;
    private final boolean l;
    private final wo7 m;

    /* JADX WARN: Multi-variable type inference failed */
    public b61(cu7 cu7Var, wk7 wk7Var, zo7 zo7Var, List<? extends ok9> list, pt2 pt2Var, sx6 sx6Var, in6 in6Var, y41 y41Var, u31 u31Var, v51 v51Var, Collection<? extends d41> collection, boolean z, wo7 wo7Var) {
        z65.h(cu7Var, "paymentMethod");
        z65.h(wk7Var, "orderType");
        z65.h(zo7Var, "packagingState");
        z65.h(list, "restaurantServiceTypes");
        z65.h(pt2Var, "deferredTime");
        z65.h(sx6Var, "newDeferredTime");
        z65.h(in6Var, "moneyDetails");
        z65.h(y41Var, "extraInfo");
        z65.h(u31Var, "action");
        z65.h(v51Var, "checkoutScreenResult");
        z65.h(collection, "unhandledErrors");
        z65.h(wo7Var, "packageSelector");
        this.a = cu7Var;
        this.b = wk7Var;
        this.c = zo7Var;
        this.d = list;
        this.e = pt2Var;
        this.f = sx6Var;
        this.g = in6Var;
        this.h = y41Var;
        this.i = u31Var;
        this.j = v51Var;
        this.k = collection;
        this.l = z;
        this.m = wo7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b61 b(b61 b61Var, cu7 cu7Var, wk7 wk7Var, zo7 zo7Var, List list, pt2 pt2Var, sx6 sx6Var, in6 in6Var, y41 y41Var, u31 u31Var, v51 v51Var, Collection collection, boolean z, wo7 wo7Var, int i, Object obj) {
        cu7 cu7Var2;
        wk7 wk7Var2;
        zo7 zo7Var2;
        List<ok9> list2;
        pt2 pt2Var2;
        sx6 sx6Var2;
        in6 in6Var2;
        y41 y41Var2;
        u31 u31Var2;
        v51 v51Var2;
        Collection<d41> collection2;
        boolean z2;
        wo7 wo7Var2;
        if ((i & 1) != 0) {
            cu7Var2 = b61Var.a;
        } else {
            cu7Var2 = cu7Var;
        }
        if ((i & 2) != 0) {
            wk7Var2 = b61Var.b;
        } else {
            wk7Var2 = wk7Var;
        }
        if ((i & 4) != 0) {
            zo7Var2 = b61Var.c;
        } else {
            zo7Var2 = zo7Var;
        }
        if ((i & 8) != 0) {
            list2 = b61Var.d;
        } else {
            list2 = list;
        }
        if ((i & 16) != 0) {
            pt2Var2 = b61Var.e;
        } else {
            pt2Var2 = pt2Var;
        }
        if ((i & 32) != 0) {
            sx6Var2 = b61Var.f;
        } else {
            sx6Var2 = sx6Var;
        }
        if ((i & 64) != 0) {
            in6Var2 = b61Var.g;
        } else {
            in6Var2 = in6Var;
        }
        if ((i & 128) != 0) {
            y41Var2 = b61Var.h;
        } else {
            y41Var2 = y41Var;
        }
        if ((i & 256) != 0) {
            u31Var2 = b61Var.i;
        } else {
            u31Var2 = u31Var;
        }
        if ((i & 512) != 0) {
            v51Var2 = b61Var.j;
        } else {
            v51Var2 = v51Var;
        }
        if ((i & 1024) != 0) {
            collection2 = b61Var.k;
        } else {
            collection2 = collection;
        }
        if ((i & 2048) != 0) {
            z2 = b61Var.l;
        } else {
            z2 = z;
        }
        if ((i & 4096) != 0) {
            wo7Var2 = b61Var.m;
        } else {
            wo7Var2 = wo7Var;
        }
        return b61Var.a(cu7Var2, wk7Var2, zo7Var2, list2, pt2Var2, sx6Var2, in6Var2, y41Var2, u31Var2, v51Var2, collection2, z2, wo7Var2);
    }

    public final b61 a(cu7 cu7Var, wk7 wk7Var, zo7 zo7Var, List<? extends ok9> list, pt2 pt2Var, sx6 sx6Var, in6 in6Var, y41 y41Var, u31 u31Var, v51 v51Var, Collection<? extends d41> collection, boolean z, wo7 wo7Var) {
        z65.h(cu7Var, "paymentMethod");
        z65.h(wk7Var, "orderType");
        z65.h(zo7Var, "packagingState");
        z65.h(list, "restaurantServiceTypes");
        z65.h(pt2Var, "deferredTime");
        z65.h(sx6Var, "newDeferredTime");
        z65.h(in6Var, "moneyDetails");
        z65.h(y41Var, "extraInfo");
        z65.h(u31Var, "action");
        z65.h(v51Var, "checkoutScreenResult");
        z65.h(collection, "unhandledErrors");
        z65.h(wo7Var, "packageSelector");
        return new b61(cu7Var, wk7Var, zo7Var, list, pt2Var, sx6Var, in6Var, y41Var, u31Var, v51Var, collection, z, wo7Var);
    }

    public final u31 c() {
        return this.i;
    }

    public final v51 d() {
        return this.j;
    }

    public final pt2 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b61)) {
            return false;
        }
        b61 b61Var = (b61) obj;
        if (z65.c(this.a, b61Var.a) && z65.c(this.b, b61Var.b) && z65.c(this.c, b61Var.c) && z65.c(this.d, b61Var.d) && z65.c(this.e, b61Var.e) && z65.c(this.f, b61Var.f) && z65.c(this.g, b61Var.g) && z65.c(this.h, b61Var.h) && z65.c(this.i, b61Var.i) && z65.c(this.j, b61Var.j) && z65.c(this.k, b61Var.k) && this.l == b61Var.l && z65.c(this.m, b61Var.m)) {
            return true;
        }
        return false;
    }

    public final y41 f() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a91.a(this.l)) * 31) + this.m.hashCode();
    }

    public final in6 i() {
        return this.g;
    }

    public final sx6 j() {
        return this.f;
    }

    public final wk7 k() {
        return this.b;
    }

    public final wo7 l() {
        return this.m;
    }

    public final zo7 m() {
        return this.c;
    }

    public final cu7 n() {
        return this.a;
    }

    public final List<ok9> o() {
        return this.d;
    }

    public final Collection<d41> q() {
        return this.k;
    }

    public final boolean r() {
        return this.l;
    }

    public String toString() {
        cu7 cu7Var = this.a;
        wk7 wk7Var = this.b;
        zo7 zo7Var = this.c;
        List<ok9> list = this.d;
        pt2 pt2Var = this.e;
        sx6 sx6Var = this.f;
        in6 in6Var = this.g;
        y41 y41Var = this.h;
        u31 u31Var = this.i;
        v51 v51Var = this.j;
        Collection<d41> collection = this.k;
        boolean z = this.l;
        wo7 wo7Var = this.m;
        return "CheckoutState(paymentMethod=" + cu7Var + ", orderType=" + wk7Var + ", packagingState=" + zo7Var + ", restaurantServiceTypes=" + list + ", deferredTime=" + pt2Var + ", newDeferredTime=" + sx6Var + ", moneyDetails=" + in6Var + ", extraInfo=" + y41Var + ", action=" + u31Var + ", checkoutScreenResult=" + v51Var + ", unhandledErrors=" + collection + ", isEmptyCart=" + z + ", packageSelector=" + wo7Var + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ b61(defpackage.cu7 r17, defpackage.wk7 r18, defpackage.zo7 r19, java.util.List r20, defpackage.pt2 r21, defpackage.sx6 r22, defpackage.in6 r23, defpackage.y41 r24, defpackage.u31 r25, defpackage.v51 r26, java.util.Collection r27, boolean r28, defpackage.wo7 r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            u31$h r1 = defpackage.u31.h.a
            r11 = r1
            goto Lc
        La:
            r11 = r25
        Lc:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L14
            v51$b r1 = defpackage.v51.b.a
            r12 = r1
            goto L16
        L14:
            r12 = r26
        L16:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L22
            java.util.List r0 = defpackage.ic1.l()
            java.util.Collection r0 = (java.util.Collection) r0
            r13 = r0
            goto L24
        L22:
            r13 = r27
        L24:
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r14 = r28
            r15 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b61.<init>(cu7, wk7, zo7, java.util.List, pt2, sx6, in6, y41, u31, v51, java.util.Collection, boolean, wo7, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
