package im.threads.ui.fragments;

import im.threads.business.utils.Balloon;
/* loaded from: classes3.dex */
public abstract class BaseDialogFragment extends androidx.fragment.app.c {
    private wn1 compositeDisposable;

    private void unsubscribeAll() {
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var != null) {
            wn1Var.a();
            this.compositeDisposable = null;
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        unsubscribeAll();
    }

    public void showToast(String str) {
        Balloon.show(requireContext(), str);
    }

    protected boolean subscribe(z33 z33Var) {
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var == null || wn1Var.i()) {
            this.compositeDisposable = new wn1();
        }
        return this.compositeDisposable.b(z33Var);
    }
}
