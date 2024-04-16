package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Paragraph.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a{\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\f\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"", "text", "Lrcb;", "style", "Lnr1;", "constraints", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "", "Lml$a;", "Lvqa;", "spanStyles", "Ljb8;", "placeholders", "", "maxLines", "", "ellipsis", "Lbq7;", "a", "(Ljava/lang/String;Lrcb;JLa03;Lw24$b;Ljava/util/List;Ljava/util/List;IZ)Lbq7;", "Leq7;", "paragraphIntrinsics", c.a, "(Leq7;JIZ)Lbq7;", "", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gq7  reason: default package */
/* loaded from: classes.dex */
public final class gq7 {
    public static final bq7 a(String str, rcb rcbVar, long j, a03 a03Var, w24.b bVar, List<ml.a<vqa>> list, List<ml.a<jb8>> list2, int i, boolean z) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(a03Var, "density");
        z65.h(bVar, "fontFamilyResolver");
        z65.h(list, "spanStyles");
        z65.h(list2, "placeholders");
        return ci.b(str, rcbVar, list, list2, i, z, j, a03Var, bVar);
    }

    public static /* synthetic */ bq7 b(String str, rcb rcbVar, long j, a03 a03Var, w24.b bVar, List list, List list2, int i, boolean z, int i2, Object obj) {
        List list3;
        List list4;
        int i3;
        boolean z2;
        List l;
        List l2;
        if ((i2 & 32) != 0) {
            l2 = kc1.l();
            list3 = l2;
        } else {
            list3 = list;
        }
        if ((i2 & 64) != 0) {
            l = kc1.l();
            list4 = l;
        } else {
            list4 = list2;
        }
        if ((i2 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return a(str, rcbVar, j, a03Var, bVar, list3, list4, i3, z2);
    }

    public static final bq7 c(eq7 eq7Var, long j, int i, boolean z) {
        z65.h(eq7Var, "paragraphIntrinsics");
        return ci.a(eq7Var, i, z, j);
    }

    public static final int d(float f) {
        return (int) Math.ceil(f);
    }
}
