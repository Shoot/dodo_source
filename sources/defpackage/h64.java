package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: FragmentExtensions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000H\u0000\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"Landroid/view/View;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "a", "Ll6;", "Ld7;", "Lw7;", "newAddressFields", "", "b", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: h64  reason: default package */
/* loaded from: classes2.dex */
public final class h64 {

    /* compiled from: FragmentExtensions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld7;", "oldVo", "", "", "a", "(Ld7;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h64$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<d7, List<? extends String>> {
        final /* synthetic */ w7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w7 w7Var) {
            super(1);
            this.a = w7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(d7 d7Var) {
            Object obj;
            List<String> e;
            List<String> l;
            z65.h(d7Var, "oldVo");
            Iterator<T> it = this.a.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((d7) obj).c(), d7Var.c())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            z65.e(obj);
            d7 d7Var2 = (d7) obj;
            if (z65.c(d7Var, d7Var2)) {
                l = kc1.l();
                return l;
            }
            e7.b(d7Var, d7Var2);
            e = jc1.e("update_all_fields");
            return e;
        }
    }

    public static final BottomSheetBehavior<View> a(View view) {
        z65.h(view, "<this>");
        BottomSheetBehavior<View> B = BottomSheetBehavior.B(view);
        z65.g(B, "from(...)");
        return B;
    }

    public static final void b(l6<d7> l6Var, w7 w7Var) {
        int w;
        Set K0;
        int w2;
        Set K02;
        z65.h(l6Var, "<this>");
        z65.h(w7Var, "newAddressFields");
        w = lc1.w(l6Var, 10);
        ArrayList arrayList = new ArrayList(w);
        for (d7 d7Var : l6Var) {
            arrayList.add(d7Var.c());
        }
        K0 = sc1.K0(arrayList);
        List<d7> c = w7Var.c();
        w2 = lc1.w(c, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (d7 d7Var2 : c) {
            arrayList2.add(d7Var2.c());
        }
        K02 = sc1.K0(arrayList2);
        if (z65.c(K0, K02)) {
            l6Var.w1(new a(w7Var));
            return;
        }
        l6Var.r();
        l6Var.addAll(w7Var.c());
    }
}
