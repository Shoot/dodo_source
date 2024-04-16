package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class b extends jn implements DialogInterface {
    final AlertController a;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {
        private final AlertController.f a;
        private final int b;

        public a(@NonNull Context context) {
            this(context, b.d(context, 0));
        }

        @NonNull
        public b a() {
            b bVar = new b(this.a.a, this.b);
            this.a.a(bVar.a);
            bVar.setCancelable(this.a.r);
            if (this.a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.a.s);
            bVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        @NonNull
        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        public a e(View view) {
            this.a.g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a g(int i) {
            AlertController.f fVar = this.a;
            fVar.h = fVar.a.getText(i);
            return this;
        }

        public a h(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public a i(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a j(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = fVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a l(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public a m(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a n(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = fVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public a o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a p(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a r(int i) {
            AlertController.f fVar = this.a;
            fVar.f = fVar.a.getText(i);
            return this;
        }

        public a s(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a t(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public b u() {
            b a = a();
            a.show();
            return a;
        }

        public a(@NonNull Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, b.d(context, i)));
            this.b = i;
        }
    }

    protected b(@NonNull Context context, int i) {
        super(context, d(context, i));
        this.a = new AlertController(getContext(), this, getWindow());
    }

    static int d(@NonNull Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(aw8.p, typedValue, true);
        return typedValue.resourceId;
    }

    public Button b(int i) {
        return this.a.c(i);
    }

    public ListView c() {
        return this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.a.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.a.i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.jn, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.r(charSequence);
    }
}
