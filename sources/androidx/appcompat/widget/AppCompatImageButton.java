package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    private final e a;
    private final m b;
    private boolean c;

    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aw8.E);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.b();
        }
        m mVar = this.b;
        if (mVar != null) {
            mVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        m mVar = this.b;
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        m mVar = this.b;
        if (mVar != null) {
            return mVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.b.f() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.a;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.b;
        if (mVar != null) {
            mVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m mVar = this.b;
        if (mVar != null && drawable != null && !this.c) {
            mVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        m mVar2 = this.b;
        if (mVar2 != null) {
            mVar2.c();
            if (!this.c) {
                this.b.b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.b.i(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.b;
        if (mVar != null) {
            mVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.b;
        if (mVar != null) {
            mVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.b;
        if (mVar != null) {
            mVar.k(mode);
        }
    }

    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(b0.b(context), attributeSet, i);
        this.c = false;
        a0.a(this, getContext());
        e eVar = new e(this);
        this.a = eVar;
        eVar.e(attributeSet, i);
        m mVar = new m(this);
        this.b = mVar;
        mVar.g(attributeSet, i);
    }
}
