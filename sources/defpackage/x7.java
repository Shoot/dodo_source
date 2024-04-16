package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AddressFieldsVO.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001¨\u0006\n"}, d2 = {"Lw7;", "", "isEnabled", "a", "", "fieldId", "text", "b", "visible", c.a, "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: x7  reason: default package */
/* loaded from: classes2.dex */
public final class x7 {
    public static final w7 a(w7 w7Var, boolean z) {
        int w;
        d7 a;
        z65.h(w7Var, "<this>");
        List<d7> c = w7Var.c();
        w = lc1.w(c, 10);
        ArrayList arrayList = new ArrayList(w);
        for (d7 d7Var : c) {
            a = d7Var.a((r22 & 1) != 0 ? d7Var.a : null, (r22 & 2) != 0 ? d7Var.b : null, (r22 & 4) != 0 ? d7Var.c : null, (r22 & 8) != 0 ? d7Var.d : false, (r22 & 16) != 0 ? d7Var.e : 0, (r22 & 32) != 0 ? d7Var.f : 0, (r22 & 64) != 0 ? d7Var.g : null, (r22 & 128) != 0 ? d7Var.h : false, (r22 & 256) != 0 ? d7Var.i : z, (r22 & 512) != 0 ? d7Var.j : false);
            arrayList.add(a);
        }
        return w7.b(w7Var, null, arrayList, 1, null);
    }

    public static final w7 b(w7 w7Var, String str, String str2) {
        int w;
        ArrayList arrayList;
        z65.h(w7Var, "<this>");
        z65.h(str, "fieldId");
        z65.h(str2, "text");
        List<d7> c = w7Var.c();
        w = lc1.w(c, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (d7 d7Var : c) {
            if (z65.c(d7Var.c(), str)) {
                d7Var = d7Var.a((r22 & 1) != 0 ? d7Var.a : null, (r22 & 2) != 0 ? d7Var.b : null, (r22 & 4) != 0 ? d7Var.c : str2, (r22 & 8) != 0 ? d7Var.d : false, (r22 & 16) != 0 ? d7Var.e : 0, (r22 & 32) != 0 ? d7Var.f : 0, (r22 & 64) != 0 ? d7Var.g : null, (r22 & 128) != 0 ? d7Var.h : false, (r22 & 256) != 0 ? d7Var.i : false, (r22 & 512) != 0 ? d7Var.j : false);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            arrayList.add(d7Var);
            arrayList2 = arrayList;
        }
        return w7.b(w7Var, null, arrayList2, 1, null);
    }

    public static final w7 c(w7 w7Var, boolean z) {
        int w;
        z65.h(w7Var, "<this>");
        List<d7> c = w7Var.c();
        w = lc1.w(c, 10);
        ArrayList arrayList = new ArrayList(w);
        for (d7 d7Var : c) {
            if (d7Var.l() && d7Var.i().length() == 0) {
                d7Var = d7Var.a((r22 & 1) != 0 ? d7Var.a : null, (r22 & 2) != 0 ? d7Var.b : null, (r22 & 4) != 0 ? d7Var.c : null, (r22 & 8) != 0 ? d7Var.d : false, (r22 & 16) != 0 ? d7Var.e : 0, (r22 & 32) != 0 ? d7Var.f : 0, (r22 & 64) != 0 ? d7Var.g : null, (r22 & 128) != 0 ? d7Var.h : false, (r22 & 256) != 0 ? d7Var.i : false, (r22 & 512) != 0 ? d7Var.j : z);
            }
            arrayList.add(d7Var);
        }
        return w7.b(w7Var, null, arrayList, 1, null);
    }
}
