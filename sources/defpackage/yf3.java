package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
/* compiled from: EmojiTransformationMethod.java */
/* renamed from: yf3  reason: default package */
/* loaded from: classes.dex */
class yf3 implements TransformationMethod {
    private final TransformationMethod a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yf3(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && e.b().d() == 1) {
            return e.b().o(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
