package com.dodopizza.order.feature.selectionmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionMapInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\f\u0011J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H&J\u0012\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u000f0\u0002j\u0002`\u0010H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g;", "", "Lwx;", "Ljaa;", DateTokenConverter.CONVERTER_KEY, "data", "", "Lb68;", "f", "Lqw1;", MessageAttributes.COORDINATES, "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "a", "Lc66;", com.huawei.hms.opendevice.c.a, "", "Lcom/dodopizza/async/AsyncJob;", "b", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$b;", com.huawei.hms.push.e.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a$c;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$a$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0206a extends a {
            public static final C0206a a = new C0206a();

            private C0206a() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0206a)) {
                    return false;
                }
                C0206a c0206a = (C0206a) obj;
                return true;
            }

            public int hashCode() {
                return -1368816157;
            }

            public String toString() {
                return "Error";
            }
        }

        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$a$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljx2;", "a", "Ljx2;", "()Ljx2;", "deliveryLocation", "<init>", "(Ljx2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private final jx2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jx2 jx2Var) {
                super(null);
                z65.h(jx2Var, "deliveryLocation");
                this.a = jx2Var;
            }

            public final jx2 a() {
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
                jx2 jx2Var = this.a;
                return "ErrorUndeliverable(deliveryLocation=" + jx2Var + ")";
            }
        }

        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$a$c;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljx2;", "a", "Ljx2;", "()Ljx2;", "deliveryLocation", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "localityId", "<init>", "(Ljx2;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends a {
            private final jx2 a;
            private final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(jx2 jx2Var, String str) {
                super(null);
                z65.h(jx2Var, "deliveryLocation");
                z65.h(str, "localityId");
                this.a = jx2Var;
                this.b = str;
            }

            public final jx2 a() {
                return this.a;
            }

            public final String b() {
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
                jx2 jx2Var = this.a;
                String str = this.b;
                return "Success(deliveryLocation=" + jx2Var + ", localityId=" + str + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$b;", "", "<init>", "()V", "a", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$b$a;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: SelectionMapInteractor.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/g$b$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "localityId", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends b {
            private final String a;

            public a(String str) {
                super(null);
                this.a = str;
            }

            public final String a() {
                return this.a;
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
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.a;
                return "InitialData(localityId=" + str + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    wx<a> a(qw1 qw1Var);

    wx<Unit> b();

    wx<c66> c();

    wx<jaa> d();

    wx<b> e(qw1 qw1Var);

    List<b68> f(jaa jaaVar);
}
