package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RoutingStrategy.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lep9;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lep9$a;", "Lep9$b;", "Lep9$c;", "Lep9$d;", "Lep9$e;", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ep9  reason: default package */
/* loaded from: classes2.dex */
public abstract class ep9 {

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lep9$a;", "Lep9;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "a", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "result", "<init>", "(Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ep9$a */
    /* loaded from: classes2.dex */
    public static final class a extends ep9 {
        private final a.AbstractC0149a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.AbstractC0149a abstractC0149a) {
            super(null);
            z65.h(abstractC0149a, "result");
            this.a = abstractC0149a;
        }

        public final a.AbstractC0149a a() {
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
            return this.a.hashCode();
        }

        public String toString() {
            a.AbstractC0149a abstractC0149a = this.a;
            return "AppRouterExit(result=" + abstractC0149a + ")";
        }
    }

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lep9$b;", "Lep9;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ep9$b */
    /* loaded from: classes2.dex */
    public static final class b extends ep9 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lep9$c;", "Lep9;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ep9$c */
    /* loaded from: classes2.dex */
    public static final class c extends ep9 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lep9$d;", "Lep9;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "a", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "()Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "result", "<init>", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ep9$d */
    /* loaded from: classes2.dex */
    public static final class d extends ep9 {
        private final c.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c.a aVar) {
            super(null);
            z65.h(aVar, "result");
            this.a = aVar;
        }

        public final c.a a() {
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
            c.a aVar = this.a;
            return "GeoRouterExit(result=" + aVar + ")";
        }
    }

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lep9$e;", "Lep9;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "a", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "()Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "result", "<init>", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ep9$e */
    /* loaded from: classes2.dex */
    public static final class e extends ep9 {
        private final c.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c.a aVar) {
            super(null);
            z65.h(aVar, "result");
            this.a = aVar;
        }

        public final c.a a() {
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
            c.a aVar = this.a;
            return "OnboardingExit(result=" + aVar + ")";
        }
    }

    private ep9() {
    }

    public /* synthetic */ ep9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
