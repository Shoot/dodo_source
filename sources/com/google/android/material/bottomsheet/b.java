package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes2.dex */
public class b extends kn {
    private boolean waitingForDismissAllowingStateLoss;

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.G() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.s(new C0225b());
        bottomSheetBehavior.f0(5);
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof com.google.android.material.bottomsheet.a) {
            com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
            BottomSheetBehavior<FrameLayout> behavior = aVar.getBehavior();
            if (behavior.K() && aVar.getDismissWithAnimation()) {
                dismissWithAnimation(behavior, z);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.c
    public void dismiss() {
        if (!tryDismissWithAnimation(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.c
    public void dismissAllowingStateLoss() {
        if (!tryDismissWithAnimation(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BottomSheetDialogFragment.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0225b extends BottomSheetBehavior.f {
        private C0225b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@NonNull View view, int i) {
            if (i == 5) {
                b.this.dismissAfterAnimation();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@NonNull View view, float f) {
        }
    }
}
