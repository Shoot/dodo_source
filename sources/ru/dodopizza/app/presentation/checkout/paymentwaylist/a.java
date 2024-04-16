package ru.dodopizza.app.presentation.checkout.paymentwaylist;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentMethodListPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/a$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "email", "", "b", "Z", "()Z", "needToSubscribeToNews", "<init>", "(Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0548a extends a {
        private final String a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0548a(String str, boolean z) {
            super(null);
            z65.h(str, "email");
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/a$b;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
