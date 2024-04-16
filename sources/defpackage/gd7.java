package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.kl8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderDetailsItemGroupUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f¨\u0006\u0010"}, d2 = {"Lgd7;", "", "", "Lyf7;", "goods", "good", "", "a", "good1", "good2", "", "b", "", c.a, "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gd7  reason: default package */
/* loaded from: classes.dex */
public final class gd7 {
    public static final gd7 a = new gd7();

    private gd7() {
    }

    private final void a(List<yf7> list, yf7 yf7Var) {
        yf7 b;
        Iterator<yf7> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (a.b(yf7Var, it.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            yf7 yf7Var2 = list.get(i);
            b = yf7Var2.b((r34 & 1) != 0 ? yf7Var2.a : null, (r34 & 2) != 0 ? yf7Var2.b : null, (r34 & 4) != 0 ? yf7Var2.c : null, (r34 & 8) != 0 ? yf7Var2.d : null, (r34 & 16) != 0 ? yf7Var2.e : null, (r34 & 32) != 0 ? yf7Var2.f : yf7Var2.j() + yf7Var.j(), (r34 & 64) != 0 ? yf7Var2.g : null, (r34 & 128) != 0 ? yf7Var2.h : rn6.f(yf7Var2.q(), yf7Var.q()), (r34 & 256) != 0 ? yf7Var2.i : 0, (r34 & 512) != 0 ? yf7Var2.j : null, (r34 & 1024) != 0 ? yf7Var2.k : 0, (r34 & 2048) != 0 ? yf7Var2.l : null, (r34 & 4096) != 0 ? yf7Var2.m : false, (r34 & 8192) != 0 ? yf7Var2.n : null, (r34 & 16384) != 0 ? yf7Var2.o : null, (r34 & 32768) != 0 ? yf7Var2.p : null);
            list.set(i, b);
            return;
        }
        list.add(yf7Var);
    }

    private final boolean b(yf7 yf7Var, yf7 yf7Var2) {
        if (yf7Var == yf7Var2) {
            return true;
        }
        if (yf7Var.l() == yf7Var2.l()) {
            if (yf7Var.l() == kl8.e && z65.c(yf7Var.g(), yf7Var2.g())) {
                return true;
            }
            if (yf7Var.r() == yf7Var2.r() && z65.c(yf7Var.d(), yf7Var2.d()) && z65.c(yf7Var.k(), yf7Var2.k())) {
                return z65.c(yf7Var.g(), yf7Var2.g());
            }
        }
        return false;
    }

    public final List<yf7> c(List<yf7> list) {
        z65.h(list, "goods");
        ArrayList arrayList = new ArrayList();
        for (kl8 kl8Var : kl8.a.a.c()) {
            for (yf7 yf7Var : list) {
                if (kl8Var == kl8.i && yf7Var.r()) {
                    a(arrayList, yf7Var);
                }
                if (yf7Var.l() == kl8Var && !yf7Var.r()) {
                    a(arrayList, yf7Var);
                }
            }
        }
        return arrayList;
    }
}
