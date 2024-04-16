package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.b;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import ch.qos.logback.core.joran.action.Action;
/* compiled from: PreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class c extends androidx.fragment.app.c implements DialogInterface.OnClickListener {
    private DialogPreference b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;
    private int g;
    private BitmapDrawable h;
    private int i;

    private void mh(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    public DialogPreference gh() {
        if (this.b == null) {
            this.b = (DialogPreference) ((DialogPreference.a) getTargetFragment()).sa(getArguments().getString(Action.KEY_ATTRIBUTE));
        }
        return this.b;
    }

    protected boolean hh() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ih(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    protected View jh(Context context) {
        int i = this.g;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    public abstract void kh(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.i = i;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) targetFragment;
            String string = getArguments().getString(Action.KEY_ATTRIBUTE);
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.sa(string);
                this.b = dialogPreference;
                this.c = dialogPreference.T0();
                this.d = this.b.V0();
                this.e = this.b.U0();
                this.f = this.b.S0();
                this.g = this.b.R0();
                Drawable Q0 = this.b.Q0();
                if (Q0 != null && !(Q0 instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(Q0.getIntrinsicWidth(), Q0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Q0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    Q0.draw(canvas);
                    this.h = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.h = (BitmapDrawable) Q0;
                return;
            }
            this.c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.fragment.app.d activity = getActivity();
        this.i = -2;
        b.a k = new b.a(activity).s(this.c).f(this.h).o(this.d, this).k(this.e, this);
        View jh = jh(activity);
        if (jh != null) {
            ih(jh);
            k.t(jh);
        } else {
            k.h(this.f);
        }
        lh(k);
        androidx.appcompat.app.b a = k.a();
        if (hh()) {
            mh(a);
        }
        return a;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.i == -1) {
            z = true;
        } else {
            z = false;
        }
        kh(z);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f);
        bundle.putInt("PreferenceDialogFragment.layout", this.g);
        BitmapDrawable bitmapDrawable = this.h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lh(b.a aVar) {
    }
}
