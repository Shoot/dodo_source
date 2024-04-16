package com.hcaptcha.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.hcaptcha.sdk.c;
import lombok.NonNull;
/* loaded from: classes.dex */
public final class c extends androidx.fragment.app.c implements m {
    private static final String e = "HCaptchaDialogFragment";
    private l b;
    private LinearLayout c;
    private float d = 0.6f;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.this.c.setVisibility(8);
        }
    }

    private void ih() {
        if (this.b.c().getLoading().booleanValue()) {
            this.c.animate().alpha(0.0f).setDuration(200L).setListener(new a());
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().addFlags(2);
            dialog.getWindow().setDimAmount(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean jh(View view, int i, KeyEvent keyEvent) {
        l lVar;
        if (keyEvent.getAction() != 0 || i != 4 || (lVar = this.b) == null || !lVar.i(new HCaptchaException(gj4.CHALLENGE_CLOSED))) {
            return false;
        }
        return true;
    }

    public static c kh(@NonNull HCaptchaConfig hCaptchaConfig, @NonNull f fVar, @NonNull HCaptchaStateListener hCaptchaStateListener) {
        if (hCaptchaConfig != null) {
            if (fVar != null) {
                if (hCaptchaStateListener != null) {
                    hj4.a("DialogFragment.newInstance");
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("hCaptchaConfig", hCaptchaConfig);
                    bundle.putSerializable("hCaptchaInternalConfig", fVar);
                    bundle.putParcelable("hCaptchaDialogListener", hCaptchaStateListener);
                    c cVar = new c();
                    cVar.setArguments(bundle);
                    return cVar;
                }
                throw new NullPointerException("listener is marked non-null but is null");
            }
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        throw new NullPointerException("config is marked non-null but is null");
    }

    @Override // defpackage.q87
    public void g9() {
        if (this.b.c().getSize() == jj4.INVISIBLE) {
            ih();
        }
        this.b.d().b();
    }

    @Override // com.hcaptcha.sdk.m
    public void jc(@androidx.annotation.NonNull androidx.fragment.app.d dVar) {
        FragmentManager supportFragmentManager = dVar.getSupportFragmentManager();
        String str = e;
        Fragment l0 = supportFragmentManager.l0(str);
        if (l0 != null && l0.isAdded()) {
            hj4.c("DialogFragment was already added.");
            return;
        }
        try {
            show(supportFragmentManager, str);
        } catch (IllegalStateException e2) {
            hj4.c("DialogFragment.startVerification " + e2.getMessage());
            l lVar = this.b;
            if (lVar != null) {
                lVar.d().a(new HCaptchaException(gj4.ERROR));
            }
        }
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.NonNull DialogInterface dialogInterface) {
        hj4.a("DialogFragment.onCancel");
        super.onCancel(dialogInterface);
        rc(new HCaptchaException(gj4.CHALLENGE_CLOSED));
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, k19.HCaptchaDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@androidx.annotation.NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Bundle arguments;
        HCaptchaStateListener hCaptchaStateListener;
        hj4.a("DialogFragment.onCreateView");
        HCaptchaStateListener hCaptchaStateListener2 = null;
        View view2 = null;
        try {
            arguments = getArguments();
            hCaptchaStateListener = (HCaptchaStateListener) com.hcaptcha.sdk.a.a(arguments, "hCaptchaDialogListener", HCaptchaStateListener.class);
        } catch (InflateException | ClassCastException unused) {
            view = null;
        }
        try {
            HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) com.hcaptcha.sdk.a.b(arguments, "hCaptchaConfig", HCaptchaConfig.class);
            f fVar = (f) com.hcaptcha.sdk.a.b(arguments, "hCaptchaInternalConfig", f.class);
            int i = 0;
            view2 = layoutInflater.inflate(nz8.hcaptcha_fragment, viewGroup, false);
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            view2.setOnKeyListener(new View.OnKeyListener() { // from class: fj4
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view3, int i2, KeyEvent keyEvent) {
                    boolean jh;
                    jh = c.this.jh(view3, i2, keyEvent);
                    return jh;
                }
            });
            hj4.a("DialogFragment.onCreateView inflated");
            WebView webView = (WebView) view2.findViewById(ny8.b);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(ny8.loadingContainer);
            this.c = linearLayout;
            if (!hCaptchaConfig.getLoading().booleanValue()) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            this.b = new l(new Handler(Looper.getMainLooper()), requireContext(), hCaptchaConfig, fVar, this, hCaptchaStateListener, webView);
            return view2;
        } catch (InflateException | ClassCastException unused2) {
            view = view2;
            hCaptchaStateListener2 = hCaptchaStateListener;
            hj4.c("Cannot create view. Dismissing dialog...");
            dismiss();
            if (hCaptchaStateListener2 != null) {
                hCaptchaStateListener2.a(new HCaptchaException(gj4.ERROR));
            }
            return view;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        hj4.a("DialogFragment.onDestroy");
        super.onDestroy();
        l lVar = this.b;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // defpackage.m87
    public void onLoaded() {
        if (this.b.c().getSize() != jj4.INVISIBLE) {
            ih();
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        hj4.a("DialogFragment.onStart");
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && this.b != null) {
            Window window = dialog.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            this.d = window.getAttributes().dimAmount;
            if (!this.b.c().getLoading().booleanValue()) {
                window.clearFlags(2);
                window.setDimAmount(0.0f);
            }
        }
    }

    @Override // defpackage.b87
    public void rc(@androidx.annotation.NonNull HCaptchaException hCaptchaException) {
        boolean z;
        l lVar = this.b;
        if (lVar != null && lVar.i(hCaptchaException)) {
            z = true;
        } else {
            z = false;
        }
        if (isAdded() && !z) {
            dismissAllowingStateLoss();
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            if (z) {
                lVar2.g();
            } else {
                lVar2.d().a(hCaptchaException);
            }
        }
    }

    @Override // defpackage.b97
    public void onSuccess(String str) {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        this.b.d().c(str);
    }
}
