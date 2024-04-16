package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J$\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011"}, d2 = {"Llob;", "", "Lu34;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "a", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lob  reason: default package */
/* loaded from: classes.dex */
final class lob {
    public static final lob a = new lob();
    private static ThreadLocal<Paint> b = new ThreadLocal<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformTypefaces.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt34;", "setting", "", "a", "(Lt34;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: lob$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<t34, CharSequence> {
        final /* synthetic */ a03 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a03 a03Var) {
            super(1);
            this.a = a03Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(t34 t34Var) {
            z65.h(t34Var, "setting");
            return CoreConstants.SINGLE_QUOTE_CHAR + t34Var.c() + "' " + t34Var.b(this.a);
        }
    }

    private lob() {
    }

    private final String b(u34 u34Var, Context context) {
        return n8b.d(u34Var.a(), null, null, null, 0, null, new a(pg.a(context)), 31, null);
    }

    public final Typeface a(Typeface typeface, u34 u34Var, Context context) {
        z65.h(u34Var, "variationSettings");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (typeface == null) {
            return null;
        }
        if (u34Var.a().isEmpty()) {
            return typeface;
        }
        Paint paint = b.get();
        if (paint == null) {
            paint = new Paint();
            b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(u34Var, context));
        return paint.getTypeface();
    }
}
