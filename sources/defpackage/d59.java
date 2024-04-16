package defpackage;

import com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies;
import com.dodopizza.controlling.feature.ratingapplied.presentation.RatingAppliedPresenter;
import kotlin.Metadata;
/* compiled from: RatingAppliedComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Ld59;", "", "Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d59  reason: default package */
/* loaded from: classes.dex */
public interface d59 {
    public static final a a = a.a;

    /* compiled from: RatingAppliedComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ld59$a;", "", "Ld59$b;", "a", "()Ld59$b;", "factory", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d59$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = di2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: RatingAppliedComponent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Ld59$b;", "", "", "orderId", "", "contactMeChecked", "Lcom/dodopizza/controlling/feature/ratingapplied/RatingAppliedFeatureDependencies;", "dependencies", "Ld59;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d59$b */
    /* loaded from: classes.dex */
    public interface b {
        d59 a(String str, boolean z, RatingAppliedFeatureDependencies ratingAppliedFeatureDependencies);
    }

    RatingAppliedPresenter a();
}
