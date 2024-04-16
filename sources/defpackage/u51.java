package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutResultState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lu51;", "", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "<init>", "(Lb61;)V", "b", com.huawei.hms.opendevice.c.a, "Lu51$a;", "Lu51$b;", "Lu51$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u51  reason: default package */
/* loaded from: classes4.dex */
public abstract class u51 {
    private final b61 a;

    /* compiled from: CheckoutResultState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lu51$a;", "Lu51;", "Lt51;", "b", "Lt51;", "()Lt51;", "checkoutResult", "Lb61;", "checkoutState", "<init>", "(Lt51;Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u51$a */
    /* loaded from: classes4.dex */
    public static final class a extends u51 {
        private final t51 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t51 t51Var, b61 b61Var) {
            super(b61Var, null);
            z65.h(t51Var, "checkoutResult");
            z65.h(b61Var, "checkoutState");
            this.b = t51Var;
        }

        public final t51 b() {
            return this.b;
        }
    }

    /* compiled from: CheckoutResultState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu51$b;", "Lu51;", "Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u51$b */
    /* loaded from: classes4.dex */
    public static final class b extends u51 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b61 b61Var) {
            super(b61Var, null);
            z65.h(b61Var, "checkoutState");
        }
    }

    /* compiled from: CheckoutResultState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu51$c;", "Lu51;", "Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u51$c */
    /* loaded from: classes4.dex */
    public static final class c extends u51 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b61 b61Var) {
            super(b61Var, null);
            z65.h(b61Var, "checkoutState");
        }
    }

    public /* synthetic */ u51(b61 b61Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(b61Var);
    }

    public final b61 a() {
        return this.a;
    }

    private u51(b61 b61Var) {
        this.a = b61Var;
    }
}
