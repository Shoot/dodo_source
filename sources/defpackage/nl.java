package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ml;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a*\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001aD\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\f2\u0016\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u001a(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lml;", "Ljq7;", "defaultParagraphStyle", "", "Lml$a;", "g", "", "start", "end", "Lvqa;", e.a, Image.TYPE_HIGH, "T", "ranges", DateTokenConverter.CONVERTER_KEY, "baseStart", "baseEnd", "targetStart", "targetEnd", "", c.a, "lStart", "lEnd", "rStart", "rEnd", "f", "a", "Lml;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: nl */
/* loaded from: classes.dex */
public final class nl {
    private static final ml a = new ml("", null, null, 6, null);

    public static final boolean c(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if (i3 == i4) {
                z = true;
            } else {
                z = false;
            }
            if (i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
        }
        return true;
    }

    public static final <T> List<ml.a<T>> d(List<? extends ml.a<? extends T>> list, int i, int i2) {
        if (i <= i2) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ml.a<? extends T> aVar = list.get(i3);
                ml.a<? extends T> aVar2 = aVar;
                if (f(i, i2, aVar2.f(), aVar2.d())) {
                    arrayList.add(aVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ml.a aVar3 = (ml.a) arrayList.get(i4);
                arrayList2.add(new ml.a(aVar3.e(), Math.max(i, aVar3.f()) - i, Math.min(i2, aVar3.d()) - i, aVar3.g()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    private static final List<ml.a<vqa>> e(ml mlVar, int i, int i2) {
        List<ml.a<vqa>> g;
        int l;
        int l2;
        if (i == i2 || (g = mlVar.g()) == null) {
            return null;
        }
        if (i == 0 && i2 >= mlVar.h().length()) {
            return g;
        }
        ArrayList arrayList = new ArrayList(g.size());
        int size = g.size();
        for (int i3 = 0; i3 < size; i3++) {
            ml.a<vqa> aVar = g.get(i3);
            ml.a<vqa> aVar2 = aVar;
            if (f(i, i2, aVar2.f(), aVar2.d())) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ml.a aVar3 = (ml.a) arrayList.get(i4);
            Object e = aVar3.e();
            l = i.l(aVar3.f(), i, i2);
            l2 = i.l(aVar3.d(), i, i2);
            arrayList2.add(new ml.a(e, l - i, l2 - i));
        }
        return arrayList2;
    }

    public static final boolean f(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4) && !c(i, i2, i3, i4) && !c(i3, i4, i, i2)) {
            return false;
        }
        return true;
    }

    public static final List<ml.a<jq7>> g(ml mlVar, jq7 jq7Var) {
        z65.h(mlVar, "<this>");
        z65.h(jq7Var, "defaultParagraphStyle");
        int length = mlVar.h().length();
        List<ml.a<jq7>> e = mlVar.e();
        if (e == null) {
            e = kc1.l();
        }
        ArrayList arrayList = new ArrayList();
        int size = e.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            ml.a<jq7> aVar = e.get(i);
            jq7 a2 = aVar.a();
            int b = aVar.b();
            int c = aVar.c();
            if (b != i2) {
                arrayList.add(new ml.a(jq7Var, i2, b));
            }
            arrayList.add(new ml.a(jq7Var.o(a2), b, c));
            i++;
            i2 = c;
        }
        if (i2 != length) {
            arrayList.add(new ml.a(jq7Var, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new ml.a(jq7Var, 0, 0));
        }
        return arrayList;
    }

    public static final ml h(ml mlVar, int i, int i2) {
        String str;
        if (i != i2) {
            str = mlVar.h().substring(i, i2);
            z65.g(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new ml(str, e(mlVar, i, i2), null, null, 12, null);
    }
}
