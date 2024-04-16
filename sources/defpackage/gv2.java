package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryAddressItemVO.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0003\tB\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lgv2;", "", "Lou2;", "b", "", "a", "()Ljava/lang/Boolean;", "<init>", "()V", com.huawei.hms.opendevice.c.a, "Lgv2$a;", "Lgv2$b;", "Lgv2$c;", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gv2  reason: default package */
/* loaded from: classes2.dex */
public abstract class gv2 {

    /* compiled from: DeliveryAddressItemVO.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lgv2$a;", "Lgv2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "formattedAddress", "b", com.huawei.hms.opendevice.c.a, "addressName", DateTokenConverter.CONVERTER_KEY, "comment", "Lou2;", "Lou2;", e.a, "()Lou2;", "deliverablePlace", "Z", "g", "()Z", "isFromState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lou2;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gv2$a */
    /* loaded from: classes2.dex */
    public static final class a extends gv2 {
        private final String a;
        private final String b;
        private final String c;
        private final ou2 d;
        private final boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, ou2 ou2Var, boolean z) {
            super(null);
            z65.h(str, "formattedAddress");
            z65.h(str2, "addressName");
            z65.h(str3, "comment");
            z65.h(ou2Var, "deliverablePlace");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = ou2Var;
            this.e = z;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final ou2 e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && z65.c(this.d, aVar.d) && this.e == aVar.e) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.a;
        }

        public final boolean g() {
            return this.e;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            ou2 ou2Var = this.d;
            boolean z = this.e;
            return "DeliveryAddressVO(formattedAddress=" + str + ", addressName=" + str2 + ", comment=" + str3 + ", deliverablePlace=" + ou2Var + ", isFromState=" + z + ")";
        }
    }

    /* compiled from: DeliveryAddressItemVO.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\"\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010)\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u0004\b(\u0010 ¨\u0006,"}, d2 = {"Lgv2$b;", "Lgv2;", "", "l", "Lou2;", "loadedDeliverablePlace", "j", "k", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "formattedAddress", "b", com.huawei.hms.opendevice.c.a, "comment", "Lou2;", DateTokenConverter.CONVERTER_KEY, "()Lou2;", "deliverablePlace", "Z", "i", "()Z", "setSelected", "(Z)V", "isSelected", Image.TYPE_HIGH, "isFromState", "f", "g", "setEnabled", "isEnabled", "setShowError", "showError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lou2;ZZZZ)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gv2$b */
    /* loaded from: classes2.dex */
    public static final class b extends gv2 {
        private final String a;
        private final String b;
        private final ou2 c;
        private boolean d;
        private final boolean e;
        private boolean f;
        private boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ou2 ou2Var, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            z65.h(str, "formattedAddress");
            z65.h(str2, "comment");
            z65.h(ou2Var, "deliverablePlace");
            this.a = str;
            this.b = str2;
            this.c = ou2Var;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }

        public final String c() {
            return this.b;
        }

        public final ou2 d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.g;
        }

        public final boolean g() {
            return this.f;
        }

        public final boolean h() {
            return this.e;
        }

        public int hashCode() {
            return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f)) * 31) + a91.a(this.g);
        }

        public final boolean i() {
            return this.d;
        }

        public final void j(ou2 ou2Var) {
            z65.h(ou2Var, "loadedDeliverablePlace");
            this.d = z65.c(this.c, ou2Var);
        }

        public final void k() {
            this.d = this.e;
        }

        public final void l() {
            this.f = false;
            this.g = true;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            ou2 ou2Var = this.c;
            boolean z = this.d;
            boolean z2 = this.e;
            boolean z3 = this.f;
            boolean z4 = this.g;
            return "DeliveryAddressWithSelectionVO(formattedAddress=" + str + ", comment=" + str2 + ", deliverablePlace=" + ou2Var + ", isSelected=" + z + ", isFromState=" + z2 + ", isEnabled=" + z3 + ", showError=" + z4 + ")";
        }
    }

    /* compiled from: DeliveryAddressItemVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgv2$c;", "Lgv2;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gv2$c */
    /* loaded from: classes2.dex */
    public static final class c extends gv2 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private gv2() {
    }

    public /* synthetic */ gv2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Boolean a() {
        if (this instanceof a) {
            return Boolean.valueOf(((a) this).g());
        }
        if (this instanceof b) {
            return Boolean.valueOf(((b) this).h());
        }
        return null;
    }

    public final ou2 b() {
        if (this instanceof a) {
            return ((a) this).e();
        }
        if (this instanceof b) {
            return ((b) this).d();
        }
        if (this instanceof c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
