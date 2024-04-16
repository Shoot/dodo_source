package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.ek9;
/* compiled from: TextAppearance.java */
/* renamed from: fab  reason: default package */
/* loaded from: classes2.dex */
public class fab {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    private ColorStateList m;
    private float n;
    private final int o;
    private boolean p = false;
    private Typeface q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* renamed from: fab$a */
    /* loaded from: classes2.dex */
    public class a extends ek9.e {
        final /* synthetic */ hab a;

        a(hab habVar) {
            this.a = habVar;
        }

        @Override // defpackage.ek9.e
        public void h(int i) {
            fab.this.p = true;
            this.a.a(i);
        }

        @Override // defpackage.ek9.e
        public void i(@NonNull Typeface typeface) {
            fab fabVar = fab.this;
            fabVar.q = Typeface.create(typeface, fabVar.e);
            fab.this.p = true;
            this.a.b(fab.this.q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* renamed from: fab$b */
    /* loaded from: classes2.dex */
    public class b extends hab {
        final /* synthetic */ Context a;
        final /* synthetic */ TextPaint b;
        final /* synthetic */ hab c;

        b(Context context, TextPaint textPaint, hab habVar) {
            this.a = context;
            this.b = textPaint;
            this.c = habVar;
        }

        @Override // defpackage.hab
        public void a(int i) {
            this.c.a(i);
        }

        @Override // defpackage.hab
        public void b(@NonNull Typeface typeface, boolean z) {
            fab.this.p(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public fab(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b29.n8);
        l(obtainStyledAttributes.getDimension(b29.o8, 0.0f));
        k(ea6.a(context, obtainStyledAttributes, b29.r8));
        this.a = ea6.a(context, obtainStyledAttributes, b29.s8);
        this.b = ea6.a(context, obtainStyledAttributes, b29.t8);
        this.e = obtainStyledAttributes.getInt(b29.q8, 0);
        this.f = obtainStyledAttributes.getInt(b29.p8, 1);
        int f = ea6.f(obtainStyledAttributes, b29.z8, b29.y8);
        this.o = obtainStyledAttributes.getResourceId(f, 0);
        this.d = obtainStyledAttributes.getString(f);
        this.g = obtainStyledAttributes.getBoolean(b29.A8, false);
        this.c = ea6.a(context, obtainStyledAttributes, b29.u8);
        this.h = obtainStyledAttributes.getFloat(b29.v8, 0.0f);
        this.i = obtainStyledAttributes.getFloat(b29.w8, 0.0f);
        this.j = obtainStyledAttributes.getFloat(b29.x8, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, b29.L4);
        int i2 = b29.M4;
        this.k = obtainStyledAttributes2.hasValue(i2);
        this.l = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.q == null && (str = this.d) != null) {
            this.q = Typeface.create(str, this.e);
        }
        if (this.q == null) {
            int i = this.f;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.q = Typeface.DEFAULT;
                    } else {
                        this.q = Typeface.MONOSPACE;
                    }
                } else {
                    this.q = Typeface.SERIF;
                }
            } else {
                this.q = Typeface.SANS_SERIF;
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    private boolean m(Context context) {
        Typeface typeface;
        if (gab.a()) {
            return true;
        }
        int i = this.o;
        if (i != 0) {
            typeface = ek9.c(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.q;
    }

    @NonNull
    public Typeface f(@NonNull Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h = ek9.h(context, this.o);
                this.q = h;
                if (h != null) {
                    this.q = Typeface.create(h, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.d, e);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(@NonNull Context context, @NonNull hab habVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            habVar.b(this.q, true);
            return;
        }
        try {
            ek9.j(context, i, new a(habVar), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            habVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.d, e);
            this.p = true;
            habVar.a(-3);
        }
    }

    public void h(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull hab habVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, habVar));
    }

    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(ColorStateList colorStateList) {
        this.m = colorStateList;
    }

    public void l(float f) {
        this.n = f;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull hab habVar) {
        int i;
        int i2;
        o(context, textPaint, habVar);
        ColorStateList colorStateList = this.m;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.j;
        float f2 = this.h;
        float f3 = this.i;
        ColorStateList colorStateList2 = this.c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull hab habVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, habVar);
        }
    }

    public void p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        boolean z;
        float f;
        Typeface a2 = bpb.a(context, typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i = this.e & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.n);
        if (this.k) {
            textPaint.setLetterSpacing(this.l);
        }
    }
}
