package com.facebook.flipper.plugins.uidebugger.stetho;

import android.app.Dialog;
import kotlin.Metadata;
/* compiled from: DialogFragmentAccessor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/DialogFragmentAccessor;", "DIALOG_FRAGMENT", "FRAGMENT", "FRAGMENT_MANAGER", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "getDialog", "Landroid/app/Dialog;", "dialogFragment", "(Ljava/lang/Object;)Landroid/app/Dialog;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> extends FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> {
    Dialog getDialog(DIALOG_FRAGMENT dialog_fragment);
}
