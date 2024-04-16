package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
/* compiled from: ScrimInsetsFrameLayout.java */
/* renamed from: mx9  reason: default package */
/* loaded from: classes2.dex */
public class mx9 extends FrameLayout {
    Drawable a;
    Rect b;
    private Rect c;
    private boolean d;
    private boolean e;

    /* compiled from: ScrimInsetsFrameLayout.java */
    /* renamed from: mx9$a */
    /* loaded from: classes2.dex */
    class a implements h77 {
        a() {
        }

        @Override // defpackage.h77
        public c5c a(View view, @NonNull c5c c5cVar) {
            boolean z;
            mx9 mx9Var = mx9.this;
            if (mx9Var.b == null) {
                mx9Var.b = new Rect();
            }
            mx9.this.b.set(c5cVar.j(), c5cVar.l(), c5cVar.k(), c5cVar.i());
            mx9.this.a(c5cVar);
            mx9 mx9Var2 = mx9.this;
            if (c5cVar.m() && mx9.this.a != null) {
                z = false;
            } else {
                z = true;
            }
            mx9Var2.setWillNotDraw(z);
            syb.l0(mx9.this);
            return c5cVar.c();
        }
    }

    public mx9(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b != null && this.a != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.d) {
                this.c.set(0, 0, width, this.b.top);
                this.a.setBounds(this.c);
                this.a.draw(canvas);
            }
            if (this.e) {
                this.c.set(0, height - this.b.bottom, width, height);
                this.a.setBounds(this.c);
                this.a.draw(canvas);
            }
            Rect rect = this.c;
            Rect rect2 = this.b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            Rect rect3 = this.c;
            Rect rect4 = this.b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.e = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.a = drawable;
    }

    public mx9(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = true;
        this.e = true;
        TypedArray h = sdb.h(context, attributeSet, b29.x6, i, i19.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.a = h.getDrawable(b29.y6);
        h.recycle();
        setWillNotDraw(true);
        syb.I0(this, new a());
    }

    protected void a(c5c c5cVar) {
    }
}
