package defpackage;

import com.dodopizza.loyalty.referralsystem.ReferralSystemPresenter;
import com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies;
import kotlin.Metadata;
/* compiled from: ReferralSystemComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lkb9;", "", "Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;", "a", "b", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kb9  reason: default package */
/* loaded from: classes2.dex */
public interface kb9 {
    public static final a a = a.a;

    /* compiled from: ReferralSystemComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lkb9$a;", "", "Lkb9$b;", "a", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kb9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = ii2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: ReferralSystemComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lkb9$b;", "", "Lcom/dodopizza/loyalty/referralsystem/di/ReferralSystemFeatureDependencies;", "dependencies", "Lkb9;", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kb9$b */
    /* loaded from: classes2.dex */
    public interface b {
        kb9 a(ReferralSystemFeatureDependencies referralSystemFeatureDependencies);
    }

    ReferralSystemPresenter a();
}
