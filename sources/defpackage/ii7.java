package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lii7;", "", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "<init>", "(Lb61;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lii7$a;", "Lii7$b;", "Lii7$c;", "Lii7$d;", "Lii7$e;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ii7  reason: default package */
/* loaded from: classes4.dex */
public abstract class ii7 {
    private final b61 a;

    /* compiled from: OrderResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lii7$a;", "Lii7;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "orderId", "Lb61;", "checkoutState", "<init>", "(Ljava/lang/String;Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ii7$a */
    /* loaded from: classes4.dex */
    public static final class a extends ii7 {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, b61 b61Var) {
            super(b61Var, null);
            z65.h(str, "orderId");
            z65.h(b61Var, "checkoutState");
            this.b = str;
        }

        public final String b() {
            return this.b;
        }
    }

    /* compiled from: OrderResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii7$b;", "Lii7;", "Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ii7$b */
    /* loaded from: classes4.dex */
    public static final class b extends ii7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b61 b61Var) {
            super(b61Var, null);
            z65.h(b61Var, "checkoutState");
        }
    }

    /* compiled from: OrderResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Lii7$c;", "Lii7;", "", "Lik3;", "b", "Ljava/util/Collection;", "()Ljava/util/Collection;", "errors", "Lb61;", "checkoutState", "<init>", "(Ljava/util/Collection;Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ii7$c */
    /* loaded from: classes4.dex */
    public static final class c extends ii7 {
        private final Collection<ik3> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Collection<ik3> collection, b61 b61Var) {
            super(b61Var, null);
            z65.h(collection, "errors");
            z65.h(b61Var, "checkoutState");
            this.b = collection;
        }

        public final Collection<ik3> b() {
            return this.b;
        }
    }

    /* compiled from: OrderResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii7$d;", "Lii7;", "Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ii7$d */
    /* loaded from: classes4.dex */
    public static final class d extends ii7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b61 b61Var) {
            super(b61Var, null);
            z65.h(b61Var, "checkoutState");
        }
    }

    /* compiled from: OrderResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii7$e;", "Lii7;", "Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ii7$e */
    /* loaded from: classes4.dex */
    public static final class e extends ii7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b61 b61Var) {
            super(b61Var, null);
            z65.h(b61Var, "checkoutState");
        }
    }

    public /* synthetic */ ii7(b61 b61Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(b61Var);
    }

    public final b61 a() {
        return this.a;
    }

    private ii7(b61 b61Var) {
        this.a = b61Var;
    }
}
