package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: RippleDrawableCompat.java */
/* renamed from: qm9  reason: default package */
/* loaded from: classes2.dex */
public class qm9 extends Drawable implements oha, ghb {
    private b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* renamed from: qm9$b */
    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {
        @NonNull
        fa6 a;
        boolean b;

        public b(fa6 fa6Var) {
            this.a = fa6Var;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* renamed from: a */
        public qm9 newDrawable() {
            return new qm9(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.a = (fa6) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* renamed from: a */
    public qm9 mutate() {
        this.a = new b(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.a;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = rm9.e(iArr);
        b bVar = this.a;
        if (bVar.b != e) {
            bVar.b = e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.oha
    public void setShapeAppearanceModel(@NonNull uga ugaVar) {
        this.a.a.setShapeAppearanceModel(ugaVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.a.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }

    public qm9(uga ugaVar) {
        this(new b(new fa6(ugaVar)));
    }

    private qm9(b bVar) {
        this.a = bVar;
    }
}
