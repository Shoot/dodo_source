package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* compiled from: PickerFragment.java */
/* loaded from: classes2.dex */
abstract class i<S> extends Fragment {
    protected final LinkedHashSet<z87<S>> b = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean gh(z87<S> z87Var) {
        return this.b.add(z87Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hh() {
        this.b.clear();
    }
}
