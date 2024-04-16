package cloud.mindbox.mobile_sdk.inapp.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InAppConstraintLayout.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcloud/mindbox/mobile_sdk/inapp/presentation/view/InAppConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/view/View$OnClickListener;", "listener", "", "setDismissListener", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "dispatchKeyEvent", "Lv50;", "a", "Lv50;", "backButtonHandler", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppConstraintLayout extends ConstraintLayout {
    private v50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attrs");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean bool;
        v50 v50Var = this.a;
        if (v50Var != null) {
            bool = v50Var.a(keyEvent);
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        z65.h(onClickListener, "listener");
        this.a = new v50(this, onClickListener);
    }
}
