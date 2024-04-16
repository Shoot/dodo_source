package com.dodopizza.android.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: KeyboardAlwaysVisibleEditText.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyPreIme", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "a", "Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "getListener", "()Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "setListener", "(Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;)V", "listener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KeyboardAlwaysVisibleEditText extends AppCompatEditText {
    private a a;

    /* compiled from: KeyboardAlwaysVisibleEditText.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/android/view/custom/KeyboardAlwaysVisibleEditText$a;", "", "", "a", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardAlwaysVisibleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public final a getListener() {
        return this.a;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setListener(a aVar) {
        this.a = aVar;
    }
}
