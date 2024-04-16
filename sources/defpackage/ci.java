package defpackage;

import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ActualParagraph.android.kt.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"", "text", "Lrcb;", "style", "", "Lml$a;", "Lvqa;", "spanStyles", "Ljb8;", "placeholders", "", "maxLines", "", "ellipsis", "Lnr1;", "constraints", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "Lbq7;", "b", "(Ljava/lang/String;Lrcb;Ljava/util/List;Ljava/util/List;IZJLa03;Lw24$b;)Lbq7;", "Leq7;", "paragraphIntrinsics", "a", "(Leq7;IZJ)Lbq7;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci {
    public static final bq7 a(eq7 eq7Var, int i, boolean z, long j) {
        z65.h(eq7Var, "paragraphIntrinsics");
        return new yh((ai) eq7Var, i, z, j, null);
    }

    public static final bq7 b(String str, rcb rcbVar, List<ml.a<vqa>> list, List<ml.a<jb8>> list2, int i, boolean z, long j, a03 a03Var, w24.b bVar) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(list, "spanStyles");
        z65.h(list2, "placeholders");
        z65.h(a03Var, "density");
        z65.h(bVar, "fontFamilyResolver");
        return new yh(new ai(str, rcbVar, list, list2, bVar, a03Var), i, z, j, null);
    }
}
