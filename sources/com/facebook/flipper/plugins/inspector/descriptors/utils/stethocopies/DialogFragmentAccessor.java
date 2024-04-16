package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.app.Dialog;
/* loaded from: classes2.dex */
public interface DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> extends FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> {
    Dialog getDialog(DIALOG_FRAGMENT dialog_fragment);
}
