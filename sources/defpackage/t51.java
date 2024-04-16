package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.ov0;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lt51;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lt51$a;", "Lt51$b;", "Lt51$d;", "Lt51$e;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t51  reason: default package */
/* loaded from: classes4.dex */
public abstract class t51 {
    public static final c a = new c(null);

    /* compiled from: CheckoutResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lt51$a;", "Lt51;", "Lov0$a;", "b", "Lov0$a;", "a", "()Lov0$a;", "error", "<init>", "(Lov0$a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t51$a */
    /* loaded from: classes4.dex */
    public static final class a extends t51 {
        private final ov0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ov0.a aVar) {
            super(null);
            z65.h(aVar, "error");
            this.b = aVar;
        }

        public final ov0.a a() {
            return this.b;
        }
    }

    /* compiled from: CheckoutResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt51$b;", "Lt51;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t51$b */
    /* loaded from: classes4.dex */
    public static final class b extends t51 {
        public static final b b = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: CheckoutResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lt51$c;", "", "", "orderId", "", "Lnq0;", "cartItems", "Lt51;", com.huawei.hms.opendevice.c.a, "Los7;", "payment", "a", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t51$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t51 a(os7 os7Var) {
            z65.h(os7Var, "payment");
            return new d(os7Var);
        }

        public final t51 b() {
            return b.b;
        }

        public final t51 c(String str, Collection<nq0> collection) {
            z65.h(str, "orderId");
            z65.h(collection, "cartItems");
            return new e(str, collection);
        }
    }

    /* compiled from: CheckoutResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lt51$d;", "Lt51;", "Los7;", "b", "Los7;", "a", "()Los7;", "payment", "<init>", "(Los7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t51$d */
    /* loaded from: classes4.dex */
    public static final class d extends t51 {
        private final os7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(os7 os7Var) {
            super(null);
            z65.h(os7Var, "payment");
            this.b = os7Var;
        }

        public final os7 a() {
            return this.b;
        }
    }

    /* compiled from: CheckoutResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lt51$e;", "Lt51;", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "orderId", "", "Lnq0;", com.huawei.hms.opendevice.c.a, "Ljava/util/Collection;", "getCartItems", "()Ljava/util/Collection;", "cartItems", "<init>", "(Ljava/lang/String;Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t51$e */
    /* loaded from: classes4.dex */
    public static final class e extends t51 {
        private final String b;
        private final Collection<nq0> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Collection<nq0> collection) {
            super(null);
            z65.h(str, "orderId");
            z65.h(collection, "cartItems");
            this.b = str;
            this.c = collection;
        }

        public final String a() {
            return this.b;
        }
    }

    private t51() {
    }

    public /* synthetic */ t51(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
