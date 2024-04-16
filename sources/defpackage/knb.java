package defpackage;

import android.text.style.TtsSpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: TtsAnnotationExtensions.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, d2 = {"Ljnb;", "Landroid/text/style/TtsSpan;", "a", "Lxxb;", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: knb  reason: default package */
/* loaded from: classes.dex */
public final class knb {
    public static final TtsSpan a(jnb jnbVar) {
        z65.h(jnbVar, "<this>");
        if (jnbVar instanceof xxb) {
            return b((xxb) jnbVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(xxb xxbVar) {
        z65.h(xxbVar, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(xxbVar.a()).build();
        z65.g(build, "builder.build()");
        return build;
    }
}
