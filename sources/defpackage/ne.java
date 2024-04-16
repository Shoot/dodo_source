package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¨\u0006\t"}, d2 = {"Lke;", "Landroid/view/ViewStructure;", "root", "", "b", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ne  reason: default package */
/* loaded from: classes.dex */
public final class ne {
    public static final void a(ke keVar, SparseArray<AutofillValue> sparseArray) {
        z65.h(keVar, "<this>");
        z65.h(sparseArray, "values");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue a = me.a(sparseArray.get(keyAt));
            d40 d40Var = d40.a;
            z65.g(a, "value");
            if (d40Var.d(a)) {
                keVar.b().b(keyAt, d40Var.i(a).toString());
            } else if (!d40Var.b(a)) {
                if (!d40Var.c(a)) {
                    if (d40Var.e(a)) {
                        throw new k07("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                } else {
                    throw new k07("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
            } else {
                throw new k07("An operation is not implemented: b/138604541: Add onFill() callback for date");
            }
        }
    }

    public static final void b(ke keVar, ViewStructure viewStructure) {
        int c;
        int c2;
        int c3;
        int c4;
        z65.h(keVar, "<this>");
        z65.h(viewStructure, "root");
        int a = t30.a.a(viewStructure, keVar.b().a().size());
        for (Map.Entry<Integer, k40> entry : keVar.b().a().entrySet()) {
            int intValue = entry.getKey().intValue();
            k40 value = entry.getValue();
            t30 t30Var = t30.a;
            ViewStructure b = t30Var.b(viewStructure, a);
            if (b != null) {
                d40 d40Var = d40.a;
                AutofillId a2 = d40Var.a(viewStructure);
                z65.e(a2);
                d40Var.g(b, a2, intValue);
                t30Var.d(b, intValue, keVar.c().getContext().getPackageName(), null, null);
                d40Var.h(b, 1);
                List<m40> a3 = value.a();
                ArrayList arrayList = new ArrayList(a3.size());
                int size = a3.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(le.a(a3.get(i)));
                }
                d40Var.f(b, (String[]) arrayList.toArray(new String[0]));
                k99 b2 = value.b();
                if (b2 != null) {
                    c = la6.c(b2.f());
                    c2 = la6.c(b2.i());
                    c3 = la6.c(b2.g());
                    c4 = la6.c(b2.c());
                    t30.a.c(b, c, c2, 0, 0, c3 - c, c4 - c2);
                } else {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
            }
            a++;
        }
    }
}
