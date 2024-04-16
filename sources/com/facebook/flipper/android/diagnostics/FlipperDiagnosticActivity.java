package com.facebook.flipper.android.diagnostics;

import android.os.Bundle;
import androidx.fragment.app.d;
/* loaded from: classes2.dex */
public class FlipperDiagnosticActivity extends d {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportFragmentManager().p().b(16908290, FlipperDiagnosticFragment.newInstance()).k();
    }
}
