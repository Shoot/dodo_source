package ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressDetailsFieldVO.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a$a;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: AddressDetailsFieldVO.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a$a;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "", "id", "label", "value", "", "isLast", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", com.huawei.hms.opendevice.c.a, "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Z", "f", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0607a extends a {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0607a(String str, String str2, String str3, boolean z) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, "label");
            z65.h(str3, "value");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public static /* synthetic */ C0607a b(C0607a c0607a, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0607a.a;
            }
            if ((i & 2) != 0) {
                str2 = c0607a.b;
            }
            if ((i & 4) != 0) {
                str3 = c0607a.c;
            }
            if ((i & 8) != 0) {
                z = c0607a.d;
            }
            return c0607a.a(str, str2, str3, z);
        }

        public final C0607a a(String str, String str2, String str3, boolean z) {
            z65.h(str, "id");
            z65.h(str2, "label");
            z65.h(str3, "value");
            return new C0607a(str, str2, str3, z);
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0607a)) {
                return false;
            }
            C0607a c0607a = (C0607a) obj;
            if (z65.c(this.a, c0607a.a) && z65.c(this.b, c0607a.b) && z65.c(this.c, c0607a.c) && this.d == c0607a.d) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            boolean z = this.d;
            return "DynamicField(id=" + str + ", label=" + str2 + ", value=" + str3 + ", isLast=" + z + ")";
        }
    }

    /* compiled from: AddressDetailsFieldVO.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a$b;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "Lnx2;", "field", "", "value", "", "isLast", "a", "toString", "", "hashCode", "", "other", "equals", "Lnx2;", com.huawei.hms.opendevice.c.a, "()Lnx2;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Z", com.huawei.hms.push.e.a, "()Z", "<init>", "(Lnx2;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends a {
        private final nx2 a;
        private final String b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nx2 nx2Var, String str, boolean z) {
            super(null);
            z65.h(nx2Var, "field");
            z65.h(str, "value");
            this.a = nx2Var;
            this.b = str;
            this.c = z;
        }

        public static /* synthetic */ b b(b bVar, nx2 nx2Var, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                nx2Var = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            if ((i & 4) != 0) {
                z = bVar.c;
            }
            return bVar.a(nx2Var, str, z);
        }

        public final b a(nx2 nx2Var, String str, boolean z) {
            z65.h(nx2Var, "field");
            z65.h(str, "value");
            return new b(nx2Var, str, z);
        }

        public final nx2 c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && z65.c(this.b, bVar.b) && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
        }

        public String toString() {
            nx2 nx2Var = this.a;
            String str = this.b;
            boolean z = this.c;
            return "StaticField(field=" + nx2Var + ", value=" + str + ", isLast=" + z + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
