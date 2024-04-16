package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.c;
/* compiled from: AppCompatDialogFragment.java */
/* renamed from: kn  reason: default package */
/* loaded from: classes.dex */
public class kn extends c {
    public kn() {
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new jn(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.c
    public void setupDialog(@NonNull Dialog dialog, int i) {
        if (dialog instanceof jn) {
            jn jnVar = (jn) dialog;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            jnVar.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }

    public kn(int i) {
        super(i);
    }
}
