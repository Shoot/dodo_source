package im.threads.ui.fragments;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0004R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lim/threads/ui/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "", "unsubscribeAll", "onDestroyView", "Lz33;", "event", "", "subscribe", "Lwn1;", "compositeDisposable", "Lwn1;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class BaseFragment extends Fragment {
    private wn1 compositeDisposable;

    private final void unsubscribeAll() {
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var != null) {
            if (wn1Var != null) {
                wn1Var.a();
            }
            this.compositeDisposable = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        unsubscribeAll();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean subscribe(z33 z33Var) {
        wn1 wn1Var;
        wn1 wn1Var2 = this.compositeDisposable;
        if (wn1Var2 == null || (wn1Var2 != null && wn1Var2.i())) {
            this.compositeDisposable = new wn1();
        }
        if (z33Var == null || (wn1Var = this.compositeDisposable) == null) {
            return false;
        }
        return wn1Var.b(z33Var);
    }
}
