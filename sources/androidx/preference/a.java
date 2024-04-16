package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class a extends c {
    private EditText j;
    private CharSequence k;

    private EditTextPreference nh() {
        return (EditTextPreference) gh();
    }

    public static a oh(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString(Action.KEY_ATTRIBUTE, str);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.preference.c
    protected boolean hh() {
        return true;
    }

    @Override // androidx.preference.c
    protected void ih(View view) {
        super.ih(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.j = editText;
        if (editText != null) {
            editText.requestFocus();
            this.j.setText(this.k);
            EditText editText2 = this.j;
            editText2.setSelection(editText2.getText().length());
            if (nh().W0() != null) {
                nh().W0().a(this.j);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.c
    public void kh(boolean z) {
        if (z) {
            String obj = this.j.getText().toString();
            EditTextPreference nh = nh();
            if (nh.g(obj)) {
                nh.Z0(obj);
            }
        }
    }

    @Override // androidx.preference.c, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.k = nh().X0();
        } else {
            this.k = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.c, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.k);
    }
}
