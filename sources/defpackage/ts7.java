package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentAuthorizationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lts7;", "", "<init>", "()V", "a", "b", "Lts7$a;", "Lts7$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ts7  reason: default package */
/* loaded from: classes4.dex */
public abstract class ts7 {

    /* compiled from: PaymentAuthorizationResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lts7$a;", "Lts7;", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ts7$a */
    /* loaded from: classes4.dex */
    public static final class a extends ts7 {
        private final b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b61 b61Var) {
            super(null);
            z65.h(b61Var, "checkoutState");
            this.a = b61Var;
        }

        public final b61 a() {
            return this.a;
        }
    }

    /* compiled from: PaymentAuthorizationResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lts7$b;", "Lts7;", "Lqs7;", "a", "Lqs7;", "()Lqs7;", "paymentAuthorization", "Lb61;", "b", "Lb61;", "getCheckoutState", "()Lb61;", "checkoutState", "<init>", "(Lqs7;Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ts7$b */
    /* loaded from: classes4.dex */
    public static final class b extends ts7 {
        private final qs7 a;
        private final b61 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qs7 qs7Var, b61 b61Var) {
            super(null);
            z65.h(qs7Var, "paymentAuthorization");
            z65.h(b61Var, "checkoutState");
            this.a = qs7Var;
            this.b = b61Var;
        }

        public final qs7 a() {
            return this.a;
        }
    }

    private ts7() {
    }

    public /* synthetic */ ts7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
