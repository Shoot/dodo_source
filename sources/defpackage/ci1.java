package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: ComboRecyclerAnimationController.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lci1;", "Landroid/view/animation/LayoutAnimationController;", "Landroid/view/animation/LayoutAnimationController$AnimationParameters;", "params", "", "getTransformedIndex", "", "a", "Z", "isFirstPosition", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ci1  reason: default package */
/* loaded from: classes4.dex */
public final class ci1 extends LayoutAnimationController {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci1(Context context, boolean z) {
        super(AnimationUtils.loadAnimation(context, R.anim.alpha));
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = z;
        setDelay(1.0f);
    }

    @Override // android.view.animation.LayoutAnimationController
    protected int getTransformedIndex(LayoutAnimationController.AnimationParameters animationParameters) {
        z65.h(animationParameters, "params");
        int i = animationParameters.index;
        int i2 = i - 1;
        if (!this.a) {
            if (i2 < 0) {
                return animationParameters.count - 1;
            }
            return i2;
        }
        return i;
    }
}
