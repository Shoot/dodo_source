package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.ek9;
import java.lang.ref.WeakReference;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class r {
    @NonNull
    private final TextView a;
    private c0 b;
    private c0 c;
    private c0 d;
    private c0 e;
    private c0 f;
    private c0 g;
    private c0 h;
    @NonNull
    private final s i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ TextView a;
        final /* synthetic */ Typeface b;
        final /* synthetic */ int c;

        b(TextView textView, Typeface typeface, int i) {
            this.a = textView;
            this.b = typeface;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setTypeface(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class e {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class g {
        static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(@NonNull TextView textView) {
        this.a = textView;
        this.i = new s(textView);
    }

    private void B(int i, float f2) {
        this.i.t(i, f2);
    }

    private void C(Context context, e0 e0Var) {
        String o;
        boolean z;
        boolean z2;
        this.j = e0Var.k(n29.X2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int k = e0Var.k(n29.c3, -1);
            this.k = k;
            if (k != -1) {
                this.j &= 2;
            }
        }
        int i2 = n29.b3;
        boolean z3 = true;
        if (!e0Var.s(i2) && !e0Var.s(n29.d3)) {
            int i3 = n29.W2;
            if (e0Var.s(i3)) {
                this.m = false;
                int k2 = e0Var.k(i3, 1);
                if (k2 != 1) {
                    if (k2 != 2) {
                        if (k2 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = n29.d3;
        if (e0Var.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface j = e0Var.j(i2, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (j != null) {
                    if (i >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(j, 0);
                        int i7 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = g.a(create, i7, z2);
                    } else {
                        this.l = j;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (o = e0Var.o(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(o, 0);
                int i8 = this.k;
                if ((this.j & 2) == 0) {
                    z3 = false;
                }
                this.l = g.a(create2, i8, z3);
                return;
            }
            this.l = Typeface.create(o, this.j);
        }
    }

    private void a(Drawable drawable, c0 c0Var) {
        if (drawable != null && c0Var != null) {
            i.i(drawable, c0Var, this.a.getDrawableState());
        }
    }

    private static c0 d(Context context, i iVar, int i) {
        ColorStateList f2 = iVar.f(context, i);
        if (f2 != null) {
            c0 c0Var = new c0();
            c0Var.d = true;
            c0Var.a = f2;
            return c0Var;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a2 = c.a(this.a);
                Drawable drawable7 = a2[0];
                if (drawable7 == null && a2[2] == null) {
                    Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                    TextView textView = this.a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.a;
                if (drawable2 == null) {
                    drawable2 = a2[1];
                }
                Drawable drawable8 = a2[2];
                if (drawable4 == null) {
                    drawable4 = a2[3];
                }
                c.b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] a3 = c.a(this.a);
        TextView textView3 = this.a;
        if (drawable5 == null) {
            drawable5 = a3[0];
        }
        if (drawable2 == null) {
            drawable2 = a3[1];
        }
        if (drawable6 == null) {
            drawable6 = a3[2];
        }
        if (drawable4 == null) {
            drawable4 = a3[3];
        }
        c.b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    private void z() {
        c0 c0Var = this.h;
        this.b = c0Var;
        this.c = c0Var;
        this.d = c0Var;
        this.e = c0Var;
        this.f = c0Var;
        this.g = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i, float f2) {
        if (!d10.C && !l()) {
            B(i, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] a2 = c.a(this.a);
            a(a2[0], this.f);
            a(a2[2], this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.i.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.i.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.i.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            return c0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            return c0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cc  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (syb.X(textView)) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (!d10.C) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i) {
        String o;
        ColorStateList c2;
        ColorStateList c3;
        ColorStateList c4;
        e0 t = e0.t(context, i, n29.U2);
        int i2 = n29.f3;
        if (t.s(i2)) {
            s(t.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = n29.Y2;
            if (t.s(i4) && (c4 = t.c(i4)) != null) {
                this.a.setTextColor(c4);
            }
            int i5 = n29.a3;
            if (t.s(i5) && (c3 = t.c(i5)) != null) {
                this.a.setLinkTextColor(c3);
            }
            int i6 = n29.Z2;
            if (t.s(i6) && (c2 = t.c(i6)) != null) {
                this.a.setHintTextColor(c2);
            }
        }
        int i7 = n29.V2;
        if (t.s(i7) && t.f(i7, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, t);
        if (i3 >= 26) {
            int i8 = n29.e3;
            if (t.s(i8) && (o = t.o(i8)) != null) {
                f.d(this.a, o);
            }
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@NonNull TextView textView, InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            yd3.f(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.i.p(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.i.q(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i) {
        this.i.r(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new c0();
        }
        c0 c0Var = this.h;
        c0Var.a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c0Var.d = z;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new c0();
        }
        c0 c0Var = this.h;
        c0Var.b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c0Var.c = z;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends ek9.e {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // defpackage.ek9.e
        public void i(@NonNull Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                if ((this.b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = g.a(typeface, i, z);
            }
            r.this.n(this.c, typeface);
        }

        @Override // defpackage.ek9.e
        public void h(int i) {
        }
    }
}
