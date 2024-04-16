package defpackage;

import android.text.Spannable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ml;
import defpackage.ob8;
import defpackage.ycb;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PlaceholderExtensions.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"!\u0010\u0013\u001a\u00020\n*\u00020\u000e8BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"!\u0010\u0019\u001a\u00020\n*\u00020\u00148BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroid/text/Spannable;", "", "Lml$a;", "Ljb8;", "placeholders", "La03;", "density", "", DateTokenConverter.CONVERTER_KEY, "placeholder", "", "start", "end", c.a, "Lwcb;", "a", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Lob8;", "b", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: kb8  reason: default package */
/* loaded from: classes.dex */
public final class kb8 {
    private static final int a(long j) {
        long g = wcb.g(j);
        ycb.a aVar = ycb.b;
        if (ycb.g(g, aVar.b())) {
            return 0;
        }
        if (ycb.g(g, aVar.a())) {
            return 1;
        }
        return 2;
    }

    private static final int b(int i) {
        ob8.a aVar = ob8.a;
        if (ob8.i(i, aVar.a())) {
            return 0;
        }
        if (ob8.i(i, aVar.g())) {
            return 1;
        }
        if (ob8.i(i, aVar.b())) {
            return 2;
        }
        if (ob8.i(i, aVar.c())) {
            return 3;
        }
        if (ob8.i(i, aVar.f())) {
            return 4;
        }
        if (ob8.i(i, aVar.d())) {
            return 5;
        }
        if (ob8.i(i, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static final void c(Spannable spannable, jb8 jb8Var, int i, int i2, a03 a03Var) {
        Object[] spans = spannable.getSpans(i, i2, uf3.class);
        z65.g(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((uf3) obj);
        }
        ara.t(spannable, new mb8(wcb.h(jb8Var.c()), a(jb8Var.c()), wcb.h(jb8Var.a()), a(jb8Var.a()), a03Var.k0() * a03Var.getDensity(), b(jb8Var.b())), i, i2);
    }

    public static final void d(Spannable spannable, List<ml.a<jb8>> list, a03 a03Var) {
        z65.h(spannable, "<this>");
        z65.h(list, "placeholders");
        z65.h(a03Var, "density");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ml.a<jb8> aVar = list.get(i);
            c(spannable, aVar.a(), aVar.b(), aVar.c(), a03Var);
        }
    }
}
