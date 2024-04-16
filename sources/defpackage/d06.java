package defpackage;

import com.dodopizza.loyalty.menu.LoyaltyPresenter;
import com.dodopizza.loyalty.menu.di.LoyaltyDependencies;
import kotlin.Metadata;
/* compiled from: LoyaltyComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Ld06;", "", "Lcom/dodopizza/loyalty/menu/LoyaltyPresenter;", "a", "b", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d06  reason: default package */
/* loaded from: classes2.dex */
public interface d06 {
    public static final a a = a.a;

    /* compiled from: LoyaltyComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Ld06$a;", "", "Ld06$b;", "a", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d06$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = kf2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: LoyaltyComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Ld06$b;", "", "Lcom/dodopizza/loyalty/menu/di/LoyaltyDependencies;", "dependencies", "Le06;", "loyaltyData", "Ld06;", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d06$b */
    /* loaded from: classes2.dex */
    public interface b {
        d06 a(LoyaltyDependencies loyaltyDependencies, e06 e06Var);
    }

    LoyaltyPresenter a();
}
