package ru.dodopizza.app.presentation.addresslist;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectedAddressHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i;", "", "Lou2;", "newDeliverablePlace", "Lru/dodopizza/app/presentation/addresslist/i$a;", "a", "Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface i {

    /* compiled from: SelectedAddressHandler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lru/dodopizza/app/presentation/addresslist/i$a$a;", "Lru/dodopizza/app/presentation/addresslist/i$a$b;", "Lru/dodopizza/app/presentation/addresslist/i$a$c;", "Lru/dodopizza/app/presentation/addresslist/i$a$d;", "Lru/dodopizza/app/presentation/addresslist/i$a$e;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: SelectedAddressHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a$a;", "Lru/dodopizza/app/presentation/addresslist/i$a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.addresslist.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0514a extends a {
            public static final C0514a a = new C0514a();

            private C0514a() {
                super(null);
            }
        }

        /* compiled from: SelectedAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a$b;", "Lru/dodopizza/app/presentation/addresslist/i$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends a {
            private final ou2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ou2 ou2Var) {
                super(null);
                z65.h(ou2Var, "deliverablePlace");
                this.a = ou2Var;
            }

            public final ou2 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                ou2 ou2Var = this.a;
                return "DeliverablePlaceWithoutLocality(deliverablePlace=" + ou2Var + ")";
            }
        }

        /* compiled from: SelectedAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a$c;", "Lru/dodopizza/app/presentation/addresslist/i$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lru/dodopizza/app/presentation/addresslist/i$b;", "a", "Lru/dodopizza/app/presentation/addresslist/i$b;", "()Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "<init>", "(Lru/dodopizza/app/presentation/addresslist/i$b;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends a {
            private final b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar) {
                super(null);
                z65.h(bVar, "request");
                this.a = bVar;
            }

            public final b a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                b bVar = this.a;
                return "OkWithNewLocality(request=" + bVar + ")";
            }
        }

        /* compiled from: SelectedAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a$d;", "Lru/dodopizza/app/presentation/addresslist/i$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lru/dodopizza/app/presentation/addresslist/i$b;", "a", "Lru/dodopizza/app/presentation/addresslist/i$b;", "()Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "<init>", "(Lru/dodopizza/app/presentation/addresslist/i$b;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class d extends a {
            private final b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b bVar) {
                super(null);
                z65.h(bVar, "request");
                this.a = bVar;
            }

            public final b a() {
                return this.a;
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
                b bVar = this.a;
                return "OkWithNewLocalityNeedClearCart(request=" + bVar + ")";
            }
        }

        /* compiled from: SelectedAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$a$e;", "Lru/dodopizza/app/presentation/addresslist/i$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class e extends a {
            private final ou2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(ou2 ou2Var) {
                super(null);
                z65.h(ou2Var, "deliverablePlace");
                this.a = ou2Var;
            }

            public final ou2 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof e) && z65.c(this.a, ((e) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                ou2 ou2Var = this.a;
                return "OkWithTheSameLocality(deliverablePlace=" + ou2Var + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SelectedAddressHandler.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/i$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "Ldt5;", "b", "Ldt5;", "()Ldt5;", "locality", "<init>", "(Le91;Ldt5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b {
        private final e91 a;
        private final dt5 b;

        public b(e91 e91Var, dt5 dt5Var) {
            z65.h(e91Var, "clientDeliveryLocation");
            z65.h(dt5Var, "locality");
            this.a = e91Var;
            this.b = dt5Var;
        }

        public final e91 a() {
            return this.a;
        }

        public final dt5 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            e91 e91Var = this.a;
            dt5 dt5Var = this.b;
            return "SetLocationWithNewLocalityRequest(clientDeliveryLocation=" + e91Var + ", locality=" + dt5Var + ")";
        }
    }

    a a(ou2 ou2Var);

    void b(b bVar);
}
