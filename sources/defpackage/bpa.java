package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B+\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lbpa;", "", "", "bit", "", "v", "A", "u", "bits", "t", "z", "", "iterator", "default", "x", "", "toString", "", "a", "J", "upperSet", "b", "lowerSet", c.a, "I", "lowerBound", "", DateTokenConverter.CONVERTER_KEY, "[I", "belowBound", "<init>", "(JJI[I)V", e.a, "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bpa  reason: default package */
/* loaded from: classes.dex */
public final class bpa implements Iterable<Integer>, be5 {
    public static final a e = new a(null);
    private static final bpa f = new bpa(0, 0, 0, null);
    private final long a;
    private final long b;
    private final int c;
    private final int[] d;

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lbpa$a;", "", "Lbpa;", "EMPTY", "Lbpa;", "a", "()Lbpa;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: bpa$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bpa a() {
            return bpa.f;
        }
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lxba;", "", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    /* renamed from: bpa$b */
    /* loaded from: classes.dex */
    static final class b extends rk9 implements Function2<xba<? super Integer>, cv1<? super Unit>, Object> {
        Object b;
        int c;
        int d;
        int e;
        private /* synthetic */ Object f;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(xba<? super Integer> xbaVar, cv1<? super Unit> cv1Var) {
            return ((b) create(xbaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bpa.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private bpa(long j, long j2, int i, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r3 = defpackage.sc1.E0(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bpa A(int r20) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpa.A(int):bpa");
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        Sequence b2;
        b2 = zba.b(new b(null));
        return b2.iterator();
    }

    public final bpa t(bpa bpaVar) {
        z65.h(bpaVar, "bits");
        bpa bpaVar2 = f;
        if (bpaVar == bpaVar2) {
            return this;
        }
        if (this == bpaVar2) {
            return bpaVar2;
        }
        int i = bpaVar.c;
        int i2 = this.c;
        if (i == i2) {
            int[] iArr = bpaVar.d;
            int[] iArr2 = this.d;
            if (iArr == iArr2) {
                return new bpa(this.a & (~bpaVar.a), this.b & (~bpaVar.b), i2, iArr2);
            }
        }
        Iterator<Integer> it = bpaVar.iterator();
        bpa bpaVar3 = this;
        while (it.hasNext()) {
            bpaVar3 = bpaVar3.u(it.next().intValue());
        }
        return bpaVar3;
    }

    public String toString() {
        int w;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        w = lc1.w(this, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(hr5.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    public final bpa u(int i) {
        int[] iArr;
        int b2;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.b;
            if ((j2 & j) != 0) {
                return new bpa(this.a, j2 & (~j), i2, this.d);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.a;
            if ((j4 & j3) != 0) {
                return new bpa(j4 & (~j3), this.b, i2, this.d);
            }
        } else if (i3 < 0 && (iArr = this.d) != null && (b2 = cpa.b(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new bpa(this.a, this.b, this.c, null);
            }
            int[] iArr2 = new int[i4];
            if (b2 > 0) {
                xr.f(iArr, iArr2, 0, 0, b2);
            }
            if (b2 < i4) {
                xr.f(iArr, iArr2, b2, b2 + 1, length);
            }
            return new bpa(this.a, this.b, this.c, iArr2);
        }
        return this;
    }

    public final boolean v(int i) {
        int[] iArr;
        int i2 = i - this.c;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.b) != 0) {
                return true;
            }
            return false;
        } else if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.a) != 0) {
                return true;
            }
            return false;
        } else if (i2 > 0 || (iArr = this.d) == null) {
            return false;
        } else {
            if (cpa.b(iArr, i) < 0) {
                z = false;
            }
            return z;
        }
    }

    public final int x(int i) {
        int c;
        int c2;
        int[] iArr = this.d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.b;
        if (j != 0) {
            int i2 = this.c;
            c2 = cpa.c(j);
            return i2 + c2;
        }
        long j2 = this.a;
        if (j2 != 0) {
            c = cpa.c(j2);
            return this.c + 64 + c;
        }
        return i;
    }

    public final bpa z(bpa bpaVar) {
        z65.h(bpaVar, "bits");
        bpa bpaVar2 = f;
        if (bpaVar == bpaVar2) {
            return this;
        }
        if (this == bpaVar2) {
            return bpaVar;
        }
        int i = bpaVar.c;
        int i2 = this.c;
        if (i == i2) {
            int[] iArr = bpaVar.d;
            int[] iArr2 = this.d;
            if (iArr == iArr2) {
                return new bpa(this.a | bpaVar.a, this.b | bpaVar.b, i2, iArr2);
            }
        }
        if (this.d == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bpaVar = bpaVar.A(it.next().intValue());
            }
            return bpaVar;
        }
        Iterator<Integer> it2 = bpaVar.iterator();
        bpa bpaVar3 = this;
        while (it2.hasNext()) {
            bpaVar3 = bpaVar3.A(it2.next().intValue());
        }
        return bpaVar3;
    }
}
