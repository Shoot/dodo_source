package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lfx2;", "Ljava/io/Serializable;", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lfx2$a;", "Lfx2$b;", "Lfx2$c;", "Lfx2$d;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fx2  reason: default package */
/* loaded from: classes4.dex */
public interface fx2 extends Serializable {

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0004BA\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0004\u0010\rR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lfx2$a;", "Lfx2;", "", "Llq3;", "a", "Ljava/util/List;", "getLevels", "()Ljava/util/List;", "levels", "Lkotlin/Pair;", "Lhn6;", "b", "Lkotlin/Pair;", "()Lkotlin/Pair;", "range", "", "", com.huawei.hms.opendevice.c.a, "Ljava/util/Map;", "getExperimentInfoData", "()Ljava/util/Map;", "experimentInfoData", "<init>", "(Ljava/util/List;Lkotlin/Pair;Ljava/util/Map;)V", DateTokenConverter.CONVERTER_KEY, "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fx2$a */
    /* loaded from: classes4.dex */
    public static final class a implements fx2 {
        public static final C0316a d = new C0316a(null);
        public static final int e = 8;
        private final List<lq3> a;
        private final Pair<hn6, hn6> b;
        private final Map<String, String> c;

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lfx2$a$a;", "", "", "Llq3;", "levels", "Lkotlin/Pair;", "Lhn6;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: fx2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0316a {
            private C0316a() {
            }

            public /* synthetic */ C0316a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Pair<hn6, hn6> a(List<lq3> list) {
                Object Z;
                z65.h(list, "levels");
                Z = sc1.Z(list);
                String c = ((lq3) Z).a().c();
                double d = Double.MAX_VALUE;
                double d2 = Double.MIN_VALUE;
                for (lq3 lq3Var : list) {
                    if (lq3Var.a().a() > d2) {
                        d2 = lq3Var.a().a();
                    }
                    if (lq3Var.a().a() < d) {
                        d = lq3Var.a().a();
                    }
                }
                return new Pair<>(new hn6(d, c), new hn6(d2, c));
            }
        }

        public a(List<lq3> list, Pair<hn6, hn6> pair, Map<String, String> map) {
            z65.h(list, "levels");
            z65.h(pair, "range");
            z65.h(map, "experimentInfoData");
            this.a = list;
            this.b = pair;
            this.c = map;
        }

        public final Pair<hn6, hn6> a() {
            return this.b;
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfx2$b;", "Lfx2;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fx2$b */
    /* loaded from: classes4.dex */
    public static final class b implements fx2 {
        public static final b a = new b();

        private b() {
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfx2$c;", "Lfx2;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fx2$c */
    /* loaded from: classes4.dex */
    public static final class c implements fx2 {
        public static final c a = new c();

        private c() {
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lfx2$d;", "Lfx2;", "Lhn6;", "a", "Lhn6;", "()Lhn6;", "deliveryFee", "<init>", "(Lhn6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fx2$d */
    /* loaded from: classes4.dex */
    public static final class d implements fx2 {
        private final hn6 a;

        public d(hn6 hn6Var) {
            z65.h(hn6Var, "deliveryFee");
            this.a = hn6Var;
        }

        public final hn6 a() {
            return this.a;
        }
    }
}
