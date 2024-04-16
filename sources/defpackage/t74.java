package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import kotlin.Metadata;
import moxy.MvpAppCompatDialogFragment;
/* compiled from: FullScreenDialogFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lt74;", "Lmoxy/MvpAppCompatDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "Landroid/app/Dialog;", "onCreateDialog", "gh", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t74  reason: default package */
/* loaded from: classes.dex */
public abstract class t74 extends MvpAppCompatDialogFragment {

    /* compiled from: FullScreenDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"t74$a", "Landroid/app/Dialog;", "", "onBackPressed", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t74$a */
    /* loaded from: classes.dex */
    public static final class a extends Dialog {
        a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            t74.this.gh();
            super.onBackPressed();
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, p19.DialogFullscreen);
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        return new a(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public void gh() {
    }
}
