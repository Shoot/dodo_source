package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import defpackage.yr5;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends d {
    private static boolean f = false;
    private boolean a = false;
    private SignInConfiguration b;
    private boolean c;
    private int d;
    private Intent e;

    private final void L7(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f = false;
    }

    private final void W8() {
        getSupportLoaderManager().c(0, null, new a());
        f = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.a) {
            return;
        }
        setResult(0);
        if (i == 40962) {
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && signInAccount.f() != null) {
                    GoogleSignInAccount f2 = signInAccount.f();
                    z8d.c(this).b(this.b.h(), (GoogleSignInAccount) bqc.a(f2));
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", f2);
                    this.c = true;
                    this.d = i2;
                    this.e = intent;
                    W8();
                    return;
                } else if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    L7(intExtra);
                    return;
                }
            }
            L7(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str2 = (String) bqc.a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str2)) {
            L7(12500);
        } else if (!str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str2.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown action: ".concat(valueOf);
            } else {
                str = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", str);
            finish();
        } else {
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) bqc.a(intent.getBundleExtra("config"))).getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.b = signInConfiguration;
            if (bundle == null) {
                if (f) {
                    setResult(0);
                    L7(12502);
                    return;
                }
                f = true;
                Intent intent2 = new Intent(str2);
                if (str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.b);
                try {
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.a = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    L7(17);
                    return;
                }
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.c = z;
            if (z) {
                this.d = bundle.getInt("signInResultCode");
                this.e = (Intent) bqc.a((Intent) bundle.getParcelable("signInResultData"));
                W8();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.c);
        if (this.c) {
            bundle.putInt("signInResultCode", this.d);
            bundle.putParcelable("signInResultData", this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* loaded from: classes2.dex */
    public class a implements yr5.a<Void> {
        private a() {
        }

        @Override // defpackage.yr5.a
        public final /* synthetic */ void b(wr5<Void> wr5Var, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.d, SignInHubActivity.this.e);
            SignInHubActivity.this.finish();
        }

        @Override // defpackage.yr5.a
        public final wr5<Void> c(int i, Bundle bundle) {
            return new wuc(SignInHubActivity.this, c.b());
        }

        @Override // defpackage.yr5.a
        public final void a(wr5<Void> wr5Var) {
        }
    }
}
