package ru.dodopizza.app.presentation.checkout.paymentwaylist;

import defpackage.et7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentMethodListPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$b;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b {

    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$a;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lvt7;", "a", "Lvt7;", "b", "()Lvt7;", "paymentMethodListVO", "", "Let7$c$b;", "Ljava/util/List;", "()Ljava/util/List;", "checkedPaymentMethods", "<init>", "(Lvt7;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends b {
        private final vt7 a;
        private final List<et7.c.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vt7 vt7Var, List<? extends et7.c.b> list) {
            super(null);
            z65.h(vt7Var, "paymentMethodListVO");
            z65.h(list, "checkedPaymentMethods");
            this.a = vt7Var;
            this.b = list;
        }

        public final List<et7.c.b> a() {
            return this.b;
        }

        public final vt7 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            vt7 vt7Var = this.a;
            List<et7.c.b> list = this.b;
            return "CheckedPaymentMethods(paymentMethodListVO=" + vt7Var + ", checkedPaymentMethods=" + list + ")";
        }
    }

    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$b;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.paymentwaylist.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0549b extends b {
        public static final C0549b a = new C0549b();

        private C0549b() {
            super(null);
        }
    }

    /* compiled from: PaymentMethodListPresenter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/b$c;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/b;", "Lvt7;", "paymentMethodListVO", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lvt7;", "b", "()Lvt7;", "<init>", "(Lvt7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends b {
        private final vt7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vt7 vt7Var) {
            super(null);
            z65.h(vt7Var, "paymentMethodListVO");
            this.a = vt7Var;
        }

        public final c a(vt7 vt7Var) {
            z65.h(vt7Var, "paymentMethodListVO");
            return new c(vt7Var);
        }

        public final vt7 b() {
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
            vt7 vt7Var = this.a;
            return "PaymentMethodListVOData(paymentMethodListVO=" + vt7Var + ")";
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
