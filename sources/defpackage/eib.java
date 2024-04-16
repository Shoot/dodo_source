package defpackage;

import com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies;
import com.dodopizza.core.feature.debugtools.toggles.presentation.TogglesPresenter;
import kotlin.Metadata;
/* compiled from: TogglesComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Leib;", "", "Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;", "a", "b", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eib  reason: default package */
/* loaded from: classes.dex */
public interface eib {
    public static final a a = a.a;

    /* compiled from: TogglesComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Leib$a;", "", "Leib$b;", "a", "()Leib$b;", "factory", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eib$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = uj2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: TogglesComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Leib$b;", "", "Lcom/dodopizza/core/feature/debugtools/toggles/FeatureTogglesFeatureDependencies;", "dependencies", "Leib;", "a", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eib$b */
    /* loaded from: classes.dex */
    public interface b {
        eib a(FeatureTogglesFeatureDependencies featureTogglesFeatureDependencies);
    }

    TogglesPresenter a();
}
