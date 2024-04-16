package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* renamed from: k8c  reason: default package */
/* loaded from: classes.dex */
public final class k8c extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c;
    PorterDuff.Mode d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k8c(k8c k8cVar) {
        this.c = null;
        this.d = i8c.g;
        if (k8cVar != null) {
            this.a = k8cVar.a;
            this.b = k8cVar.b;
            this.c = k8cVar.c;
            this.d = k8cVar.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i;
        int i2 = this.a;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(Resources resources) {
        return new j8c(this, resources);
    }
}
