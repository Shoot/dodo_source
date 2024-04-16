package defpackage;

import com.google.android.gms.wallet.PaymentDataRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreateGooglePayRequestResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Le22;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Le22$a;", "Le22$b;", "Le22$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e22  reason: default package */
/* loaded from: classes4.dex */
public abstract class e22 {

    /* compiled from: CreateGooglePayRequestResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Le22$a;", "Le22;", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "a", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "()Lcom/google/android/gms/wallet/PaymentDataRequest;", "paymentDataRequest", "<init>", "(Lcom/google/android/gms/wallet/PaymentDataRequest;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e22$a */
    /* loaded from: classes4.dex */
    public static final class a extends e22 {
        private final PaymentDataRequest a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaymentDataRequest paymentDataRequest) {
            super(null);
            z65.h(paymentDataRequest, "paymentDataRequest");
            this.a = paymentDataRequest;
        }

        public final PaymentDataRequest a() {
            return this.a;
        }
    }

    /* compiled from: CreateGooglePayRequestResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Le22$b;", "Le22;", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Lb61;Ljava/lang/Throwable;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e22$b */
    /* loaded from: classes4.dex */
    public static final class b extends e22 {
        private final b61 a;
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b61 b61Var, Throwable th) {
            super(null);
            z65.h(b61Var, "checkoutState");
            z65.h(th, "throwable");
            this.a = b61Var;
            this.b = th;
        }

        public final b61 a() {
            return this.a;
        }

        public final Throwable b() {
            return this.b;
        }
    }

    /* compiled from: CreateGooglePayRequestResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Le22$c;", "Le22;", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e22$c */
    /* loaded from: classes4.dex */
    public static final class c extends e22 {
        private final b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b61 b61Var) {
            super(null);
            z65.h(b61Var, "checkoutState");
            this.a = b61Var;
        }

        public final b61 a() {
            return this.a;
        }
    }

    private e22() {
    }

    public /* synthetic */ e22(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
