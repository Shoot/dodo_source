package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: hk3  reason: default package */
/* loaded from: classes2.dex */
public class hk3 extends DialogFragment {
    private Dialog a;
    private DialogInterface.OnCancelListener b;
    private Dialog c;

    @NonNull
    public static hk3 a(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        hk3 hk3Var = new hk3();
        Dialog dialog2 = (Dialog) gh8.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        hk3Var.a = dialog2;
        if (onCancelListener != null) {
            hk3Var.b = onCancelListener;
        }
        return hk3Var;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.c == null) {
                this.c = new AlertDialog.Builder((Context) gh8.j(getActivity())).create();
            }
            return this.c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
