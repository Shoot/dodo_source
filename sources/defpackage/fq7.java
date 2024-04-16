package defpackage;

import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ParagraphIntrinsics.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"", "text", "Lrcb;", "style", "", "Lml$a;", "Lvqa;", "spanStyles", "Ljb8;", "placeholders", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "Leq7;", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: fq7  reason: default package */
/* loaded from: classes.dex */
public final class fq7 {
    public static final eq7 a(String str, rcb rcbVar, List<ml.a<vqa>> list, List<ml.a<jb8>> list2, a03 a03Var, w24.b bVar) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(list, "spanStyles");
        z65.h(list2, "placeholders");
        z65.h(a03Var, "density");
        z65.h(bVar, "fontFamilyResolver");
        return bi.a(str, rcbVar, list, list2, a03Var, bVar);
    }

    public static /* synthetic */ eq7 b(String str, rcb rcbVar, List list, List list2, a03 a03Var, w24.b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = kc1.l();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = kc1.l();
        }
        return a(str, rcbVar, list3, list2, a03Var, bVar);
    }
}
