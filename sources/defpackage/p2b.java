package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: p2b  reason: default package */
/* loaded from: classes2.dex */
public class p2b extends c {
    private Dialog b;
    private DialogInterface.OnCancelListener c;
    private Dialog d;

    @NonNull
    public static p2b gh(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        p2b p2bVar = new p2b();
        Dialog dialog2 = (Dialog) gh8.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        p2bVar.b = dialog2;
        if (onCancelListener != null) {
            p2bVar.c = onCancelListener;
        }
        return p2bVar;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.b;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.d == null) {
                this.d = new AlertDialog.Builder((Context) gh8.j(getContext())).create();
            }
            return this.d;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.c
    public void show(@NonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
