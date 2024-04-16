package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ijb;
import defpackage.pja;
import defpackage.ym;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductAnalytics.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u001d\u001e\u001f !\"B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0003H\u0002J\u000e\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u0006H\u0002J\u0018\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u0011H\u0002J\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\f\u0010\u0019\u001a\u00020\u0018*\u00020\u0003H\u0002J\f\u0010\u001a\u001a\u00020\u0018*\u00020\u0006H\u0002¨\u0006#"}, d2 = {"Lgl8;", "", "Lbc;", "Lpja;", "item", Image.TYPE_SMALL, "Lnq0;", "cartItem", "r", "u", "t", "", "o", "n", "Lejb;", "", "q", "Lul8;", "p", Image.TYPE_MEDIUM, "l", "Lfl8;", "id", "i", "", "k", "j", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gl8  reason: default package */
/* loaded from: classes4.dex */
public final class gl8 {
    public static final gl8 a = new gl8();

    /* compiled from: ProductAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lgl8$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lnq0;", "Lnq0;", "cartItem", "<init>", "(Lnq0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl8$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final nq0 a;

        public a(nq0 nq0Var) {
            z65.h(nq0Var, "cartItem");
            this.a = nq0Var;
        }

        @Override // defpackage.dc
        public qc a() {
            String u = this.a.u();
            String t = this.a.t();
            Double valueOf = Double.valueOf(this.a.h().a());
            String c = this.a.h().c();
            String d = vc.d(this.a.m());
            gl8 gl8Var = gl8.a;
            od odVar = new od(u, t, valueOf, c, d, gl8Var.n(this.a), 1);
            return nv3.c(gl8Var.t(gl8Var.r(vc.z(bc.e(pd.a(new bc("add_to_cart"), odVar), "has_personal_price", Boolean.FALSE, false, 4, null), ck1.i), this.a), this.a), odVar).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            nq0 nq0Var = this.a;
            return "AddToCartFromCart(cartItem=" + nq0Var + ")";
        }
    }

    /* compiled from: ProductAnalytics.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lgl8$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "id", "b", Action.NAME_ATTRIBUTE, "Lhn6;", com.huawei.hms.opendevice.c.a, "Lhn6;", "price", "Lkl8;", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "productCategory", "Ll18;", com.huawei.hms.push.e.a, "Ll18;", "personalPrice", "f", "Z", "isHero", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;Lkl8;Ll18;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl8$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final String a;
        private final String b;
        private final hn6 c;
        private final kl8 d;
        private final l18 e;
        private final boolean f;

        public b(String str, String str2, hn6 hn6Var, kl8 kl8Var, l18 l18Var, boolean z) {
            z65.h(str, "id");
            z65.h(str2, Action.NAME_ATTRIBUTE);
            z65.h(hn6Var, "price");
            z65.h(kl8Var, "productCategory");
            this.a = str;
            this.b = str2;
            this.c = hn6Var;
            this.d = kl8Var;
            this.e = l18Var;
            this.f = z;
        }

        @Override // defpackage.dc
        public qc a() {
            boolean z;
            od odVar = new od(this.b, vc.b(this.a), Double.valueOf(this.c.a()), this.c.c(), vc.d(this.d), null, 1, 32, null);
            bc e = bc.e(pd.a(new bc("add_to_cart"), odVar), "rawPrice", Double.valueOf(this.c.a()), false, 4, null);
            if (this.e != null) {
                z = true;
            } else {
                z = false;
            }
            return nv3.c(bc.e(vc.z(bc.e(e, "has_personal_price", Boolean.valueOf(z), false, 4, null), ck1.e), "is_hero", Boolean.valueOf(this.f), false, 4, null), odVar).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && this.d == bVar.d && z65.c(this.e, bVar.e) && this.f == bVar.f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
            l18 l18Var = this.e;
            if (l18Var == null) {
                hashCode = 0;
            } else {
                hashCode = l18Var.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + a91.a(this.f);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            hn6 hn6Var = this.c;
            kl8 kl8Var = this.d;
            l18 l18Var = this.e;
            boolean z = this.f;
            return "AddToCartFromMenu(id=" + str + ", name=" + str2 + ", price=" + hn6Var + ", productCategory=" + kl8Var + ", personalPrice=" + l18Var + ", isHero=" + z + ")";
        }
    }

    /* compiled from: ProductAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lgl8$c;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lpja;", "Lpja;", "item", "Lym$d;", "b", "Lym$d;", "screen", com.huawei.hms.opendevice.c.a, "Z", "isHero", "<init>", "(Lpja;Lym$d;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl8$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        private final pja a;
        private final ym.d b;
        private final boolean c;

        public c(pja pjaVar, ym.d dVar, boolean z) {
            z65.h(pjaVar, "item");
            z65.h(dVar, "screen");
            this.a = pjaVar;
            this.b = dVar;
            this.c = z;
        }

        @Override // defpackage.dc
        public qc a() {
            String name = this.a.a().Y().getName();
            String id = this.a.a().Y().getId();
            Double valueOf = Double.valueOf(this.a.h().a());
            String c = this.a.h().c();
            String f = vc.f(this.a.a().Y().e());
            gl8 gl8Var = gl8.a;
            od odVar = new od(name, id, valueOf, c, f, gl8Var.o(this.a), 1);
            return nv3.c(bc.e(gl8Var.u(gl8Var.s(vc.A(bc.e(pd.a(new bc("add_to_cart"), odVar), "has_personal_price", Boolean.valueOf(gl8Var.k(this.a)), false, 4, null), lx9.a(this.b).getValue()), this.a), this.a), "is_hero", Boolean.valueOf(this.c), false, 4, null), odVar).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
        }

        public String toString() {
            pja pjaVar = this.a;
            ym.d dVar = this.b;
            boolean z = this.c;
            return "AddToCartFromProductCard(item=" + pjaVar + ", screen=" + dVar + ", isHero=" + z + ")";
        }

        public /* synthetic */ c(pja pjaVar, ym.d dVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pjaVar, dVar, (i & 4) != 0 ? false : z);
        }
    }

    /* compiled from: ProductAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lgl8$d;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lnq0;", "Lnq0;", "cartItem", "<init>", "(Lnq0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl8$d */
    /* loaded from: classes4.dex */
    public static final class d implements dc {
        private final nq0 a;

        public d(nq0 nq0Var) {
            z65.h(nq0Var, "cartItem");
            this.a = nq0Var;
        }

        @Override // defpackage.dc
        public qc a() {
            String u = this.a.u();
            String t = this.a.t();
            Double valueOf = Double.valueOf(this.a.h().a());
            String c = this.a.h().c();
            String d = vc.d(this.a.m());
            gl8 gl8Var = gl8.a;
            od odVar = new od(u, t, valueOf, c, d, gl8Var.n(this.a), 1);
            return nv3.c(gl8Var.t(gl8Var.r(vc.z(bc.e(pd.a(new bc("add_to_cart"), odVar), "has_personal_price", Boolean.valueOf(gl8Var.j(this.a)), false, 4, null), ck1.k), this.a), this.a), odVar).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && z65.c(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            nq0 nq0Var = this.a;
            return "AddToCartFromUpsale(cartItem=" + nq0Var + ")";
        }
    }

    /* compiled from: ProductAnalytics.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lgl8$e;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd6;", "Lqd6;", "getMenuItem", "()Lqd6;", "menuItem", "b", "I", "getPositionInMenu", "()I", "positionInMenu", "Ltja;", com.huawei.hms.opendevice.c.a, "Ltja;", "getShoppingItem", "()Ltja;", "shoppingItem", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "getSender", "()Lqd;", "sender", com.huawei.hms.push.e.a, "Z", "isHeroProduct", "()Z", "<init>", "(Lqd6;ILtja;Lqd;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl8$e */
    /* loaded from: classes4.dex */
    public static final class e implements dc {
        private final qd6 a;
        private final int b;
        private final tja c;
        private final qd d;
        private final boolean e;

        public e(qd6 qd6Var, int i, tja tjaVar, qd qdVar, boolean z) {
            z65.h(qd6Var, "menuItem");
            z65.h(tjaVar, "shoppingItem");
            z65.h(qdVar, "sender");
            this.a = qd6Var;
            this.b = i;
            this.c = tjaVar;
            this.d = qdVar;
            this.e = z;
        }

        @Override // defpackage.dc
        public qc a() {
            List e;
            boolean z;
            bc a = pd.a(new bc("open_product_card"), new od(this.a.i(), vc.b(this.a.f()), Double.valueOf(this.a.k().a()), null, vc.d(this.a.b()), null, null, 104, null));
            e = jc1.e(this.c);
            bc A = vc.A(bc.e(vc.y(a, e), "position", Integer.valueOf(this.b), false, 4, null), this.d.getValue());
            if (this.a.j() != null) {
                z = true;
            } else {
                z = false;
            }
            return bc.e(bc.e(A, "has_personal_price", Boolean.valueOf(z), false, 4, null), "is_hero", Boolean.valueOf(this.e), false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (z65.c(this.a, eVar.a) && this.b == eVar.b && z65.c(this.c, eVar.c) && z65.c(this.d, eVar.d) && this.e == eVar.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
        }

        public String toString() {
            qd6 qd6Var = this.a;
            int i = this.b;
            tja tjaVar = this.c;
            qd qdVar = this.d;
            boolean z = this.e;
            return "OpenProductCard(menuItem=" + qd6Var + ", positionInMenu=" + i + ", shoppingItem=" + tjaVar + ", sender=" + qdVar + ", isHeroProduct=" + z + ")";
        }
    }

    /* compiled from: ProductAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0003\u0010B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lgl8$f;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lng4;", "Lng4;", "item", "Lgl8$f$b;", "b", "Lgl8$f$b;", "reason", com.huawei.hms.opendevice.c.a, "Z", "isCompletelyRemoved", "<init>", "(Lng4;Lgl8$f$b;Z)V", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gl8$f */
    /* loaded from: classes4.dex */
    public static final class f implements dc {
        public static final a d = new a(null);
        private final ng4 a;
        private final b b;
        private final boolean c;

        /* compiled from: ProductAnalytics.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lgl8$f$a;", "", "", "PARAM_COMPLETELY_REMOVED", "Ljava/lang/String;", "getPARAM_COMPLETELY_REMOVED$annotations", "()V", "PARAM_REMOVE_REASON", "getPARAM_REMOVE_REASON$annotations", "<init>", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: gl8$f$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProductAnalytics.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lgl8$f$b;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: gl8$f$b */
        /* loaded from: classes4.dex */
        public static final class b {
            public static final b b = new b("NONE", 0, "");
            public static final b c = new b("WAS_IN_STOP", 1, "stop");
            private static final /* synthetic */ b[] d;
            private static final /* synthetic */ kj3 e;
            private final String a;

            static {
                b[] a = a();
                d = a;
                e = lj3.a(a);
            }

            private b(String str, int i, String str2) {
                this.a = str2;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{b, c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) d.clone();
            }

            public final String i() {
                return this.a;
            }
        }

        public f(ng4 ng4Var, b bVar, boolean z) {
            z65.h(ng4Var, "item");
            z65.h(bVar, "reason");
            this.a = ng4Var;
            this.b = bVar;
            this.c = z;
        }

        @Override // defpackage.dc
        public qc a() {
            od odVar = new od(this.a.a().u(), this.a.a().t(), null, null, vc.d(this.a.a().m()), gl8.a.n(this.a.a()), Integer.valueOf(this.a.b()), 12, null);
            return nv3.c(bc.e(pd.a(bc.e(new bc("remove_from_cart"), "reason", this.b.i(), false, 4, null), odVar), "completelyRemoved", Boolean.valueOf(this.c), false, 4, null), odVar).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (z65.c(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
        }

        public String toString() {
            ng4 ng4Var = this.a;
            b bVar = this.b;
            boolean z = this.c;
            return "RemoveFromCart(item=" + ng4Var + ", reason=" + bVar + ", isCompletelyRemoved=" + z + ")";
        }
    }

    private gl8() {
    }

    private final ul8 i(fl8 fl8Var, String str) {
        m78 m78Var;
        Collection<ul8> k;
        Object obj = null;
        if (fl8Var instanceof m78) {
            m78Var = (m78) fl8Var;
        } else {
            m78Var = null;
        }
        if (m78Var == null || (k = m78Var.k()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : k) {
            if (((ul8) obj2).d()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (z65.c(((ul8) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (ul8) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(nq0 nq0Var) {
        n18 n18Var;
        v23 e2 = nq0Var.e();
        if (e2 != null) {
            n18Var = e2.e();
        } else {
            n18Var = null;
        }
        if (n18Var != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(pja pjaVar) {
        if (pjaVar.a().v() != null) {
            return true;
        }
        return false;
    }

    private final Map<String, Object> l(ul8 ul8Var) {
        Map f2;
        Map<String, Object> o;
        Map<String, Object> p = p(ul8Var);
        f2 = f86.f(lnb.a("quantity", 1));
        o = g86.o(p, f2);
        return o;
    }

    private final Map<String, Object> m(ejb ejbVar) {
        Map f2;
        Map<String, Object> o;
        Map<String, Object> q = q(ejbVar);
        f2 = f86.f(lnb.a("quantity", 1));
        o = g86.o(q, f2);
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(nq0 nq0Var) {
        if (nq0Var.E() && !nq0Var.G()) {
            return uc.a.d(nq0Var.f(), nq0Var.n());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(pja pjaVar) {
        fl8 Y = pjaVar.a().Y();
        if (Y instanceof m78) {
            return uc.a.e(Y);
        }
        return null;
    }

    private final Map<String, Object> p(ul8 ul8Var) {
        Map<String, Object> k;
        k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, ul8Var.getName()), lnb.a("price", Double.valueOf(0.0d)), lnb.a("toppingId", ul8Var.getId()), lnb.a(MessageAttributes.TYPE, ijb.c.b.a()));
        return k;
    }

    private final Map<String, Object> q(ejb ejbVar) {
        Map<String, Object> k;
        k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, ejbVar.getName()), lnb.a("price", Double.valueOf(ejbVar.h().a())), lnb.a("toppingId", ejbVar.d()), lnb.a(MessageAttributes.TYPE, ijb.a.b.a()));
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc r(bc bcVar, nq0 nq0Var) {
        int w;
        double A0;
        if (nq0Var.E() && !nq0Var.G()) {
            kn6 kn6Var = kn6.c;
            Collection<xq0> a2 = nq0Var.I().a();
            w = lc1.w(a2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (xq0 xq0Var : a2) {
                arrayList.add(Double.valueOf(xq0Var.h().a()));
            }
            A0 = sc1.A0(arrayList);
            bc.e(bcVar, "rawPrice", Double.valueOf(rn6.d(nq0Var.h(), kn6Var.b(A0)).a()), false, 4, null);
        }
        return bcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc s(bc bcVar, pja pjaVar) {
        int w;
        double A0;
        if (pjaVar instanceof pja.c) {
            kn6 kn6Var = kn6.c;
            Set<ejb> b2 = ((pja.c) pjaVar).b();
            w = lc1.w(b2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (ejb ejbVar : b2) {
                arrayList.add(Double.valueOf(ejbVar.h().a()));
            }
            A0 = sc1.A0(arrayList);
            bc.e(bcVar, "rawPrice", Double.valueOf(rn6.d(pjaVar.h(), kn6Var.b(A0)).a()), false, 4, null);
        }
        return bcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc t(bc bcVar, nq0 nq0Var) {
        int w;
        int w2;
        if (nq0Var.E() && !nq0Var.G()) {
            Collection<xq0> a2 = nq0Var.I().a();
            w = lc1.w(a2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (xq0 xq0Var : a2) {
                arrayList.add(vc.g(xq0Var, ijb.a.b));
            }
            Collection<xq0> b2 = nq0Var.I().b();
            w2 = lc1.w(b2, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (xq0 xq0Var2 : b2) {
                arrayList2.add(vc.g(xq0Var2, ijb.c.b));
            }
            bc.e(bcVar, "added", arrayList, false, 4, null);
            bc.e(bcVar, "deleted", arrayList2, false, 4, null);
        }
        return bcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc u(bc bcVar, pja pjaVar) {
        int w;
        int w2;
        if (pjaVar instanceof pja.c) {
            pja.c cVar = (pja.c) pjaVar;
            Set<ejb> b2 = cVar.b();
            w = lc1.w(b2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (ejb ejbVar : b2) {
                arrayList.add(a.m(ejbVar));
            }
            ArrayList<ul8> arrayList2 = new ArrayList();
            for (xq0 xq0Var : cVar.c()) {
                ul8 i = a.i(pjaVar.a().Y(), xq0Var.getId());
                if (i != null) {
                    arrayList2.add(i);
                }
            }
            w2 = lc1.w(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(w2);
            for (ul8 ul8Var : arrayList2) {
                arrayList3.add(a.l(ul8Var));
            }
            bc.e(bcVar, "added", arrayList, false, 4, null);
            bc.e(bcVar, "deleted", arrayList3, false, 4, null);
        }
        return bcVar;
    }
}
