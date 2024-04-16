package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.preference.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import moxy.MvpDelegate;
/* compiled from: MvpPreferenceFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lnr6;", "Landroidx/preference/d;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "outState", "onSaveInstanceState", "onStop", "onDestroyView", "onDestroy", "", "k", "Z", "mIsStateSaved", "Lmoxy/MvpDelegate;", "l", "Lrn5;", "getMvpDelegate", "()Lmoxy/MvpDelegate;", "mvpDelegate", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nr6  reason: default package */
/* loaded from: classes4.dex */
public abstract class nr6 extends d {
    private boolean k;
    private final rn5 l;

    /* compiled from: MvpPreferenceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmoxy/MvpDelegate;", "Lnr6;", "kotlin.jvm.PlatformType", "a", "()Lmoxy/MvpDelegate;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nr6$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<MvpDelegate<nr6>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MvpDelegate<nr6> invoke() {
            return new MvpDelegate<>(nr6.this);
        }
    }

    public nr6() {
        rn5 b;
        b = yn5.b(new a());
        this.l = b;
    }

    private final MvpDelegate<? extends nr6> getMvpDelegate() {
        return (MvpDelegate) this.l.getValue();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        androidx.fragment.app.d activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            boolean z = false;
            if (this.k) {
                this.k = false;
                return;
            }
            for (Fragment parentFragment = getParentFragment(); !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                z = parentFragment.isRemoving();
            }
            if (isRemoving() || z) {
                getMvpDelegate().onDestroy();
                return;
            }
            return;
        }
        getMvpDelegate().onDestroy();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getMvpDelegate().onDetach();
        getMvpDelegate().onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.k = false;
        getMvpDelegate().onAttach();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        this.k = true;
        getMvpDelegate().onSaveInstanceState(bundle);
        getMvpDelegate().onDetach();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.k = false;
        getMvpDelegate().onAttach();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }
}
