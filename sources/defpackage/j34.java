package defpackage;

import defpackage.v34;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: FontMatcher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lj34;", "", "", "Lq24;", "fontList", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "a", "(Ljava/util/List;Lv34;I)Ljava/util/List;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j34  reason: default package */
/* loaded from: classes.dex */
public final class j34 {
    public final List<q24> a(List<? extends q24> list, v34 v34Var, int i) {
        z65.h(list, "fontList");
        z65.h(v34Var, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            q24 q24Var = list.get(i3);
            q24 q24Var2 = q24Var;
            if (z65.c(q24Var2.b(), v34Var) && q34.f(q24Var2.c(), i)) {
                arrayList.add(q24Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            q24 q24Var3 = list.get(i4);
            if (q34.f(q24Var3.c(), i)) {
                arrayList2.add(q24Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends q24> list2 = list;
        v34.a aVar = v34.b;
        v34 v34Var2 = null;
        if (v34Var.compareTo(aVar.j()) < 0) {
            int size3 = list2.size();
            v34 v34Var3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                v34 b = list2.get(i5).b();
                if (b.compareTo(v34Var) < 0) {
                    if (v34Var2 == null || b.compareTo(v34Var2) > 0) {
                        v34Var2 = b;
                    }
                } else if (b.compareTo(v34Var) > 0) {
                    if (v34Var3 == null || b.compareTo(v34Var3) < 0) {
                        v34Var3 = b;
                    }
                } else {
                    v34Var3 = b;
                    v34Var2 = v34Var3;
                    break;
                }
                i5++;
            }
            if (v34Var2 != null) {
                v34Var3 = v34Var2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i2 < size4) {
                q24 q24Var4 = list2.get(i2);
                if (z65.c(q24Var4.b(), v34Var3)) {
                    arrayList3.add(q24Var4);
                }
                i2++;
            }
            return arrayList3;
        } else if (v34Var.compareTo(aVar.k()) > 0) {
            int size5 = list2.size();
            v34 v34Var4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                v34 b2 = list2.get(i6).b();
                if (b2.compareTo(v34Var) < 0) {
                    if (v34Var2 == null || b2.compareTo(v34Var2) > 0) {
                        v34Var2 = b2;
                    }
                } else if (b2.compareTo(v34Var) > 0) {
                    if (v34Var4 == null || b2.compareTo(v34Var4) < 0) {
                        v34Var4 = b2;
                    }
                } else {
                    v34Var4 = b2;
                    v34Var2 = v34Var4;
                    break;
                }
                i6++;
            }
            if (v34Var4 == null) {
                v34Var4 = v34Var2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i2 < size6) {
                q24 q24Var5 = list2.get(i2);
                if (z65.c(q24Var5.b(), v34Var4)) {
                    arrayList4.add(q24Var5);
                }
                i2++;
            }
            return arrayList4;
        } else {
            v34 k = aVar.k();
            int size7 = list2.size();
            v34 v34Var5 = null;
            v34 v34Var6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                v34 b3 = list2.get(i7).b();
                if (k == null || b3.compareTo(k) <= 0) {
                    if (b3.compareTo(v34Var) < 0) {
                        if (v34Var5 == null || b3.compareTo(v34Var5) > 0) {
                            v34Var5 = b3;
                        }
                    } else if (b3.compareTo(v34Var) > 0) {
                        if (v34Var6 == null || b3.compareTo(v34Var6) < 0) {
                            v34Var6 = b3;
                        }
                    } else {
                        v34Var5 = b3;
                        v34Var6 = v34Var5;
                        break;
                    }
                }
                i7++;
            }
            if (v34Var6 != null) {
                v34Var5 = v34Var6;
            }
            ArrayList arrayList5 = new ArrayList(list2.size());
            int size8 = list2.size();
            for (int i8 = 0; i8 < size8; i8++) {
                q24 q24Var6 = list2.get(i8);
                if (z65.c(q24Var6.b(), v34Var5)) {
                    arrayList5.add(q24Var6);
                }
            }
            if (arrayList5.isEmpty()) {
                v34 k2 = v34.b.k();
                int size9 = list2.size();
                v34 v34Var7 = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= size9) {
                        break;
                    }
                    v34 b4 = list2.get(i9).b();
                    if (k2 == null || b4.compareTo(k2) >= 0) {
                        if (b4.compareTo(v34Var) < 0) {
                            if (v34Var2 == null || b4.compareTo(v34Var2) > 0) {
                                v34Var2 = b4;
                            }
                        } else if (b4.compareTo(v34Var) > 0) {
                            if (v34Var7 == null || b4.compareTo(v34Var7) < 0) {
                                v34Var7 = b4;
                            }
                        } else {
                            v34Var2 = b4;
                            v34Var7 = v34Var2;
                            break;
                        }
                    }
                    i9++;
                }
                if (v34Var7 != null) {
                    v34Var2 = v34Var7;
                }
                ArrayList arrayList6 = new ArrayList(list2.size());
                int size10 = list2.size();
                while (i2 < size10) {
                    q24 q24Var7 = list2.get(i2);
                    if (z65.c(q24Var7.b(), v34Var2)) {
                        arrayList6.add(q24Var7);
                    }
                    i2++;
                }
                return arrayList6;
            }
            return arrayList5;
        }
    }
}
