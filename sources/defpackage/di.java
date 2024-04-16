package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cr4;
import defpackage.i9b;
import defpackage.vp5;
import kotlin.Metadata;
/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u001dH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Li9b;", "align", "", "l", "(Li9b;)I", "Lcr4;", "hyphens", "n", "(Lcr4;)I", "Lvp5$b;", "breakStrategy", Image.TYPE_MEDIUM, "(Lvp5$b;)I", "Lvp5$c;", "lineBreakStrictness", "o", "(Lvp5$c;)I", "Lvp5$d;", "lineBreakWordStyle", "p", "(Lvp5$d;)I", "Lybb;", "maxHeight", "j", "Lrcb;", "textStyle", "", "ellipsis", "k", "", "i", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public final class di {
    public static final /* synthetic */ CharSequence a(CharSequence charSequence) {
        return i(charSequence);
    }

    public static final /* synthetic */ int b(ybb ybbVar, int i) {
        return j(ybbVar, i);
    }

    public static final /* synthetic */ boolean c(rcb rcbVar, boolean z) {
        return k(rcbVar, z);
    }

    public static final /* synthetic */ int d(i9b i9bVar) {
        return l(i9bVar);
    }

    public static final /* synthetic */ int e(vp5.b bVar) {
        return m(bVar);
    }

    public static final /* synthetic */ int f(cr4 cr4Var) {
        return n(cr4Var);
    }

    public static final /* synthetic */ int g(vp5.c cVar) {
        return o(cVar);
    }

    public static final /* synthetic */ int h(vp5.d dVar) {
        return p(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        Spannable spannableString;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        ara.t(spannableString, new f05(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(ybb ybbVar, int i) {
        int k = ybbVar.k();
        for (int i2 = 0; i2 < k; i2++) {
            if (ybbVar.j(i2) > i) {
                return i2;
            }
        }
        return ybbVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(rcb rcbVar, boolean z) {
        if (!z || wcb.e(rcbVar.q(), xcb.e(0)) || wcb.e(rcbVar.q(), wcb.b.a()) || rcbVar.z() == null) {
            return false;
        }
        i9b z2 = rcbVar.z();
        i9b.a aVar = i9b.b;
        int f = aVar.f();
        if (z2 != null && i9b.j(z2.m(), f)) {
            return false;
        }
        i9b z3 = rcbVar.z();
        int c = aVar.c();
        if (z3 != null && i9b.j(z3.m(), c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(i9b i9bVar) {
        i9b.a aVar = i9b.b;
        int d = aVar.d();
        if (i9bVar != null && i9b.j(i9bVar.m(), d)) {
            return 3;
        }
        int e = aVar.e();
        if (i9bVar != null && i9b.j(i9bVar.m(), e)) {
            return 4;
        }
        int a = aVar.a();
        if (i9bVar != null && i9b.j(i9bVar.m(), a)) {
            return 2;
        }
        int f = aVar.f();
        if (i9bVar == null || !i9b.j(i9bVar.m(), f)) {
            int b = aVar.b();
            if (i9bVar != null && i9b.j(i9bVar.m(), b)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(vp5.b bVar) {
        vp5.b.a aVar = vp5.b.b;
        int c = aVar.c();
        if (bVar != null && vp5.b.g(bVar.j(), c)) {
            return 0;
        }
        int b = aVar.b();
        if (bVar != null && vp5.b.g(bVar.j(), b)) {
            return 1;
        }
        int a = aVar.a();
        if (bVar == null || !vp5.b.g(bVar.j(), a)) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(cr4 cr4Var) {
        cr4.a aVar = cr4.b;
        int a = aVar.a();
        if (cr4Var != null && cr4.f(cr4Var.i(), a)) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        int b = aVar.b();
        if (cr4Var != null) {
            cr4.f(cr4Var.i(), b);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(vp5.c cVar) {
        vp5.c.a aVar = vp5.c.b;
        int a = aVar.a();
        if (cVar != null && vp5.c.h(cVar.k(), a)) {
            return 0;
        }
        int b = aVar.b();
        if (cVar != null && vp5.c.h(cVar.k(), b)) {
            return 1;
        }
        int c = aVar.c();
        if (cVar != null && vp5.c.h(cVar.k(), c)) {
            return 2;
        }
        int d = aVar.d();
        if (cVar == null || !vp5.c.h(cVar.k(), d)) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(vp5.d dVar) {
        vp5.d.a aVar = vp5.d.b;
        int a = aVar.a();
        if (dVar != null && vp5.d.f(dVar.i(), a)) {
            return 0;
        }
        int b = aVar.b();
        if (dVar == null || !vp5.d.f(dVar.i(), b)) {
            return 0;
        }
        return 1;
    }
}
