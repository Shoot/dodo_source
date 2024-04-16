package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectedDeliveryAddressHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lk9a;", "", "Lou2;", "newDeliverablePlace", "Lk9a$a;", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k9a  reason: default package */
/* loaded from: classes.dex */
public interface k9a {

    /* compiled from: SelectedDeliveryAddressHandler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lk9a$a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lk9a$a$a;", "Lk9a$a$b;", "Lk9a$a$c;", "Lk9a$a$d;", "Lk9a$a$e;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k9a$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: SelectedDeliveryAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lk9a$a$a;", "Lk9a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "selectedClientDeliveryLocation", "<init>", "(Le91;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: k9a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0407a extends a {
            private final e91 a;

            public C0407a(e91 e91Var) {
                super(null);
                this.a = e91Var;
            }

            public final e91 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0407a) && z65.c(this.a, ((C0407a) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                e91 e91Var = this.a;
                if (e91Var == null) {
                    return 0;
                }
                return e91Var.hashCode();
            }

            public String toString() {
                e91 e91Var = this.a;
                return "DeliverablePlaceIsTheSame(selectedClientDeliveryLocation=" + e91Var + ")";
            }
        }

        /* compiled from: SelectedDeliveryAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lk9a$a$b;", "Lk9a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(Lou2;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: k9a$a$b */
        /* loaded from: classes.dex */
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
                return "ErrorDeliverablePlaceWithoutLocality(deliverablePlace=" + ou2Var + ")";
            }
        }

        /* compiled from: SelectedDeliveryAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lk9a$a$c;", "Lk9a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lk9a$b;", "a", "Lk9a$b;", "()Lk9a$b;", "request", "<init>", "(Lk9a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: k9a$a$c */
        /* loaded from: classes.dex */
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

        /* compiled from: SelectedDeliveryAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lk9a$a$d;", "Lk9a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lk9a$b;", "a", "Lk9a$b;", "()Lk9a$b;", "request", "<init>", "(Lk9a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: k9a$a$d */
        /* loaded from: classes.dex */
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

        /* compiled from: SelectedDeliveryAddressHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lk9a$a$e;", "Lk9a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lk9a$b;", "a", "Lk9a$b;", "()Lk9a$b;", "request", "<init>", "(Lk9a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: k9a$a$e */
        /* loaded from: classes.dex */
        public static final class e extends a {
            private final b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b bVar) {
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
                if ((obj instanceof e) && z65.c(this.a, ((e) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                b bVar = this.a;
                return "OkWithTheSameLocality(request=" + bVar + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SelectedDeliveryAddressHandler.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lk9a$b;", "", "Le91;", "a", "Ldt5;", "b", "", "toString", "", "hashCode", "other", "", "equals", "Le91;", c.a, "()Le91;", "clientDeliveryLocation", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "()Ldt5;", "locality", "Lk9a$b$a;", "Lk9a$b$a;", e.a, "()Lk9a$b$a;", MessageAttributes.TYPE, "<init>", "(Le91;Ldt5;Lk9a$b$a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k9a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final e91 a;
        private final dt5 b;
        private final a c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SelectedDeliveryAddressHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lk9a$b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: k9a$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            public static final a a = new a("THE_SAME_LOCALITY", 0);
            public static final a b = new a("NEW_LOCALITY", 1);
            private static final /* synthetic */ a[] c;
            private static final /* synthetic */ kj3 d;

            static {
                a[] a2 = a();
                c = a2;
                d = lj3.a(a2);
            }

            private a(String str, int i) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) c.clone();
            }
        }

        public b(e91 e91Var, dt5 dt5Var, a aVar) {
            z65.h(e91Var, "clientDeliveryLocation");
            z65.h(dt5Var, "locality");
            z65.h(aVar, MessageAttributes.TYPE);
            this.a = e91Var;
            this.b = dt5Var;
            this.c = aVar;
        }

        public final e91 a() {
            return this.a;
        }

        public final dt5 b() {
            return this.b;
        }

        public final e91 c() {
            return this.a;
        }

        public final dt5 d() {
            return this.b;
        }

        public final a e() {
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
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            e91 e91Var = this.a;
            dt5 dt5Var = this.b;
            a aVar = this.c;
            return "SetDeliveryLocationToStateRequest(clientDeliveryLocation=" + e91Var + ", locality=" + dt5Var + ", type=" + aVar + ")";
        }
    }

    a a(ou2 ou2Var);
}
