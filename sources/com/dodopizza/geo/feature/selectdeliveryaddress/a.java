package com.dodopizza.geo.feature.selectdeliveryaddress;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectDeliveryAddressAppRouter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a;", "", "", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "result", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: SelectDeliveryAddressAppRouter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$c;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$d;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$e;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$f;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0149a implements Serializable {

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Le91;Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0150a extends AbstractC0149a {
            private final e91 a;
            private final b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0150a(e91 e91Var, b bVar) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                z65.h(bVar, "stateError");
                this.a = e91Var;
                this.b = bVar;
            }

            public final e91 a() {
                return this.a;
            }

            public final b b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0150a)) {
                    return false;
                }
                C0150a c0150a = (C0150a) obj;
                if (z65.c(this.a, c0150a.a) && z65.c(this.b, c0150a.b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                e91 e91Var = this.a;
                b bVar = this.b;
                return "Created(clientDeliveryLocation=" + e91Var + ", stateError=" + bVar + ")";
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "getClientDeliveryLocation", "()Le91;", "clientDeliveryLocation", "b", "Z", "isFromState", "()Z", "<init>", "(Le91;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0149a {
            private final e91 a;
            private final boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e91 e91Var, boolean z) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                this.a = e91Var;
                this.b = z;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (z65.c(this.a, bVar.a) && this.b == bVar.b) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + a91.a(this.b);
            }

            public String toString() {
                e91 e91Var = this.a;
                boolean z = this.b;
                return "Deleted(clientDeliveryLocation=" + e91Var + ", isFromState=" + z + ")";
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$c;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Le91;Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC0149a {
            private final e91 a;
            private final b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e91 e91Var, b bVar) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                z65.h(bVar, "stateError");
                this.a = e91Var;
                this.b = bVar;
            }

            public final e91 a() {
                return this.a;
            }

            public final b b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                e91 e91Var = this.a;
                b bVar = this.b;
                return "Edited(clientDeliveryLocation=" + e91Var + ", stateError=" + bVar + ")";
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$d;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a$d */
        /* loaded from: classes2.dex */
        public static final class d extends AbstractC0149a {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$e;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a$e */
        /* loaded from: classes2.dex */
        public static final class e extends AbstractC0149a {
            public static final e a = new e();

            private e() {
                super(null);
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a$f;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Le91;Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$a$f */
        /* loaded from: classes2.dex */
        public static final class f extends AbstractC0149a {
            private final e91 a;
            private final b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(e91 e91Var, b bVar) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                z65.h(bVar, "stateError");
                this.a = e91Var;
                this.b = bVar;
            }

            public final e91 a() {
                return this.a;
            }

            public final b b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                if (z65.c(this.a, fVar.a) && z65.c(this.b, fVar.b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                e91 e91Var = this.a;
                b bVar = this.b;
                return "Selected(clientDeliveryLocation=" + e91Var + ", stateError=" + bVar + ")";
            }
        }

        private AbstractC0149a() {
        }

        public /* synthetic */ AbstractC0149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SelectDeliveryAddressAppRouter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$c;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$d;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$e;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class b implements Serializable {

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Ljava/io/Serializable;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0151a extends b implements Serializable {
            public static final C0151a a = new C0151a();

            private C0151a() {
                super(null);
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Ljava/io/Serializable;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0152b extends b implements Serializable {
            public static final C0152b a = new C0152b();

            private C0152b() {
                super(null);
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$c;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Ljava/io/Serializable;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends b implements Serializable {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$d;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Ljava/io/Serializable;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class d extends b implements Serializable {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        /* compiled from: SelectDeliveryAddressAppRouter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b$e;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Ljava/io/Serializable;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class e extends b implements Serializable {
            public static final e a = new e();

            private e() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(AbstractC0149a abstractC0149a);

    void b();
}
