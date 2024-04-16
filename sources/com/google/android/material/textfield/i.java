package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoEndIconDelegate.java */
/* loaded from: classes2.dex */
public class i extends e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconDrawable((Drawable) null);
        this.a.setEndIconContentDescription((CharSequence) null);
    }
}
