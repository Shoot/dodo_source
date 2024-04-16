package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000f\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0016\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0018\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0002\u001aD\u0010$\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001H\u0002\u001a,\u0010*\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002\u001a,\u0010,\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002¨\u0006-"}, d2 = {"", "", "address", "F", "", "L", "P", "J", "Q", "H", "I", "value", "", "X", "C", "U", "B", "A", "T", "D", "M", "O", "Y", "R", "Z", "G", "W", "E", "anchor", "V", Action.KEY_ATTRIBUTE, "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "K", "Ljava/util/ArrayList;", "Lrd;", "Lkotlin/collections/ArrayList;", "location", "effectiveSize", "S", "index", "N", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: yna  reason: default package */
/* loaded from: classes.dex */
public final class yna {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return D(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = 536870912;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = 268435456;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(ArrayList<rd> arrayList, int i, int i2) {
        int S = S(arrayList, i, i2);
        if (S < 0) {
            return -(S + 1);
        }
        return S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + D(iArr[i2 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S(ArrayList<rd> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int a = arrayList.get(i4).a();
            if (a < 0) {
                a += i2;
            }
            int j = z65.j(a, i);
            if (j < 0) {
                i3 = i4 + 1;
            } else if (j > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + D(iArr[i2 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        tn1.T(z);
        iArr[(i * 5) + 3] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0 && i2 < 67108863) {
            z = true;
        } else {
            z = false;
        }
        tn1.T(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    public static final /* synthetic */ int a(int[] iArr, int i) {
        return A(iArr, i);
    }

    public static final /* synthetic */ boolean b(int[] iArr, int i) {
        return B(iArr, i);
    }

    public static final /* synthetic */ boolean c(int[] iArr, int i) {
        return C(iArr, i);
    }

    public static final /* synthetic */ int d(int i) {
        return D(i);
    }

    public static final /* synthetic */ int e(int[] iArr, int i) {
        return E(iArr, i);
    }

    public static final /* synthetic */ int f(int[] iArr, int i) {
        return F(iArr, i);
    }

    public static final /* synthetic */ int g(int[] iArr, int i) {
        return G(iArr, i);
    }

    public static final /* synthetic */ boolean h(int[] iArr, int i) {
        return H(iArr, i);
    }

    public static final /* synthetic */ boolean i(int[] iArr, int i) {
        return I(iArr, i);
    }

    public static final /* synthetic */ boolean j(int[] iArr, int i) {
        return J(iArr, i);
    }

    public static final /* synthetic */ void k(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        K(iArr, i, i2, z, z2, z3, i3, i4);
    }

    public static final /* synthetic */ boolean l(int[] iArr, int i) {
        return L(iArr, i);
    }

    public static final /* synthetic */ int m(int[] iArr, int i) {
        return M(iArr, i);
    }

    public static final /* synthetic */ int n(ArrayList arrayList, int i, int i2) {
        return N(arrayList, i, i2);
    }

    public static final /* synthetic */ int o(int[] iArr, int i) {
        return O(iArr, i);
    }

    public static final /* synthetic */ int p(int[] iArr, int i) {
        return P(iArr, i);
    }

    public static final /* synthetic */ int q(int[] iArr, int i) {
        return Q(iArr, i);
    }

    public static final /* synthetic */ int r(int[] iArr, int i) {
        return R(iArr, i);
    }

    public static final /* synthetic */ int s(ArrayList arrayList, int i, int i2) {
        return S(arrayList, i, i2);
    }

    public static final /* synthetic */ int t(int[] iArr, int i) {
        return T(iArr, i);
    }

    public static final /* synthetic */ void u(int[] iArr, int i, boolean z) {
        U(iArr, i, z);
    }

    public static final /* synthetic */ void v(int[] iArr, int i, int i2) {
        V(iArr, i, i2);
    }

    public static final /* synthetic */ void w(int[] iArr, int i, int i2) {
        W(iArr, i, i2);
    }

    public static final /* synthetic */ void x(int[] iArr, int i, boolean z) {
        X(iArr, i, z);
    }

    public static final /* synthetic */ void y(int[] iArr, int i, int i2) {
        Y(iArr, i, i2);
    }

    public static final /* synthetic */ void z(int[] iArr, int i, int i2) {
        Z(iArr, i, i2);
    }
}
