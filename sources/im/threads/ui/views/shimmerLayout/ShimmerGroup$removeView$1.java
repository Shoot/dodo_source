package im.threads.ui.views.shimmerLayout;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShimmerGroup.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Lim/threads/ui/views/shimmerLayout/ShimmerLayout;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerGroup$removeView$1 extends ej5 implements Function1<WeakReference<ShimmerLayout>, Boolean> {
    final /* synthetic */ ShimmerLayout $shimmerLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerGroup$removeView$1(ShimmerLayout shimmerLayout) {
        super(1);
        this.$shimmerLayout = shimmerLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<ShimmerLayout> weakReference) {
        return Boolean.valueOf(z65.c(weakReference.get(), this.$shimmerLayout) || weakReference.get() == null);
    }
}
