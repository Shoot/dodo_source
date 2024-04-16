package moxy;

import android.os.Bundle;
import androidx.appcompat.app.c;
/* loaded from: classes3.dex */
public class MvpAppCompatActivity extends c implements MvpDelegateHolder {
    private MvpDelegate<? extends MvpAppCompatActivity> mvpDelegate;

    public MvpAppCompatActivity() {
    }

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new MvpDelegate<>(this);
        }
        return this.mvpDelegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDestroyView();
        if (isFinishing()) {
            getMvpDelegate().onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        getMvpDelegate().onAttach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getMvpDelegate().onSaveInstanceState(bundle);
        getMvpDelegate().onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        getMvpDelegate().onAttach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }

    public MvpAppCompatActivity(int i) {
        super(i);
    }
}
