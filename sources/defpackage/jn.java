package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import androidx.appcompat.app.d;
import defpackage.cf5;
import defpackage.x4;
/* compiled from: AppCompatDialog.java */
/* renamed from: jn  reason: default package */
/* loaded from: classes.dex */
public class jn extends om1 implements cn {
    private d mDelegate;
    private final cf5.a mKeyDispatcher;

    public jn(@NonNull Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(aw8.B, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // defpackage.om1, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return cf5.e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().k(i);
    }

    @NonNull
    public d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = d.j(this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().p();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.om1, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().q();
        super.onCreate(bundle);
        getDelegate().t(bundle);
    }

    @Override // defpackage.om1, android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().z();
    }

    @Override // defpackage.cn
    public x4 onWindowStartingSupportActionMode(x4.a aVar) {
        return null;
    }

    @Override // defpackage.om1, android.app.Dialog
    public void setContentView(int i) {
        getDelegate().E(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().K(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().C(i);
    }

    public jn(@NonNull Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new cf5.a() { // from class: in
            @Override // defpackage.cf5.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return jn.this.superDispatchKeyEvent(keyEvent);
            }
        };
        d delegate = getDelegate();
        delegate.J(getThemeResId(context, i));
        delegate.t(null);
    }

    @Override // defpackage.om1, android.app.Dialog
    public void setContentView(@NonNull View view) {
        getDelegate().F(view);
    }

    @Override // defpackage.om1, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().G(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().K(getContext().getString(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public jn(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new cf5.a() { // from class: in
            @Override // defpackage.cf5.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return jn.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // defpackage.cn
    public void onSupportActionModeFinished(x4 x4Var) {
    }

    @Override // defpackage.cn
    public void onSupportActionModeStarted(x4 x4Var) {
    }
}
