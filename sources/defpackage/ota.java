package defpackage;

import defpackage.adc;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: StandardZoneRules.java */
/* renamed from: ota  reason: default package */
/* loaded from: classes3.dex */
final class ota extends adc implements Serializable {
    private final long[] a;
    private final wcc[] b;
    private final long[] c;
    private final es5[] d;
    private final wcc[] e;
    private final ycc[] f;
    private final ConcurrentMap<Integer, xcc[]> g = new ConcurrentHashMap();

    private ota(long[] jArr, wcc[] wccVarArr, long[] jArr2, wcc[] wccVarArr2, ycc[] yccVarArr) {
        this.a = jArr;
        this.b = wccVarArr;
        this.c = jArr2;
        this.e = wccVarArr2;
        this.f = yccVarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            xcc xccVar = new xcc(jArr2[i], wccVarArr2[i], wccVarArr2[i2]);
            if (xccVar.E()) {
                arrayList.add(xccVar.k());
                arrayList.add(xccVar.i());
            } else {
                arrayList.add(xccVar.i());
                arrayList.add(xccVar.k());
            }
            i = i2;
        }
        this.d = (es5[]) arrayList.toArray(new es5[arrayList.size()]);
    }

    private Object j(es5 es5Var, xcc xccVar) {
        es5 k = xccVar.k();
        if (xccVar.E()) {
            if (es5Var.e0(k)) {
                return xccVar.w();
            }
            if (es5Var.e0(xccVar.i())) {
                return xccVar;
            }
            return xccVar.u();
        } else if (!es5Var.e0(k)) {
            return xccVar.u();
        } else {
            if (es5Var.e0(xccVar.i())) {
                return xccVar.w();
            }
            return xccVar;
        }
    }

    private xcc[] k(int i) {
        Integer valueOf = Integer.valueOf(i);
        xcc[] xccVarArr = this.g.get(valueOf);
        if (xccVarArr != null) {
            return xccVarArr;
        }
        ycc[] yccVarArr = this.f;
        xcc[] xccVarArr2 = new xcc[yccVarArr.length];
        for (int i2 = 0; i2 < yccVarArr.length; i2++) {
            xccVarArr2[i2] = yccVarArr[i2].b(i);
        }
        if (i < 2100) {
            this.g.putIfAbsent(valueOf, xccVarArr2);
        }
        return xccVarArr2;
    }

    private int l(long j, wcc wccVar) {
        return ds5.Z0(g95.e(j + wccVar.b0(), 86400L)).Q0();
    }

    private Object m(es5 es5Var) {
        int i = 0;
        if (this.f.length > 0) {
            es5[] es5VarArr = this.d;
            if (es5VarArr.length == 0 || es5Var.b0(es5VarArr[es5VarArr.length - 1])) {
                xcc[] k = k(es5Var.M0());
                int length = k.length;
                Object obj = null;
                while (i < length) {
                    xcc xccVar = k[i];
                    Object j = j(es5Var, xccVar);
                    if (!(j instanceof xcc) && !j.equals(xccVar.w())) {
                        i++;
                        obj = j;
                    } else {
                        return j;
                    }
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.d, es5Var);
        if (binarySearch == -1) {
            return this.e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            es5[] es5VarArr2 = this.d;
            if (binarySearch < es5VarArr2.length - 1) {
                int i2 = binarySearch + 1;
                if (es5VarArr2[binarySearch].equals(es5VarArr2[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) == 0) {
            es5[] es5VarArr3 = this.d;
            es5 es5Var2 = es5VarArr3[binarySearch];
            es5 es5Var3 = es5VarArr3[binarySearch + 1];
            wcc[] wccVarArr = this.e;
            int i3 = binarySearch / 2;
            wcc wccVar = wccVarArr[i3];
            wcc wccVar2 = wccVarArr[i3 + 1];
            if (wccVar2.b0() > wccVar.b0()) {
                return new xcc(es5Var2, wccVar, wccVar2);
            }
            return new xcc(es5Var3, wccVar, wccVar2);
        }
        return this.e[(binarySearch / 2) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ota o(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = ica.b(dataInput);
        }
        int i2 = readInt + 1;
        wcc[] wccVarArr = new wcc[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            wccVarArr[i3] = ica.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = ica.b(dataInput);
        }
        int i5 = readInt2 + 1;
        wcc[] wccVarArr2 = new wcc[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            wccVarArr2[i6] = ica.d(dataInput);
        }
        int readByte = dataInput.readByte();
        ycc[] yccVarArr = new ycc[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            yccVarArr[i7] = ycc.c(dataInput);
        }
        return new ota(jArr, wccVarArr, jArr2, wccVarArr2, yccVarArr);
    }

    private Object writeReplace() {
        return new ica((byte) 1, this);
    }

    @Override // defpackage.adc
    public wcc a(b55 b55Var) {
        wcc[] wccVarArr;
        long T = b55Var.T();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (jArr.length == 0 || T > jArr[jArr.length - 1]) {
                xcc[] k = k(l(T, this.e[wccVarArr.length - 1]));
                xcc xccVar = null;
                for (int i = 0; i < k.length; i++) {
                    xccVar = k[i];
                    if (T < xccVar.H()) {
                        return xccVar.w();
                    }
                }
                return xccVar.u();
            }
        }
        int binarySearch = Arrays.binarySearch(this.c, T);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
    }

    @Override // defpackage.adc
    public xcc b(es5 es5Var) {
        Object m = m(es5Var);
        if (m instanceof xcc) {
            return (xcc) m;
        }
        return null;
    }

    @Override // defpackage.adc
    public List<wcc> c(es5 es5Var) {
        Object m = m(es5Var);
        if (m instanceof xcc) {
            return ((xcc) m).x();
        }
        return Collections.singletonList((wcc) m);
    }

    @Override // defpackage.adc
    public boolean d(b55 b55Var) {
        return !n(b55Var).equals(a(b55Var));
    }

    @Override // defpackage.adc
    public boolean e() {
        if (this.c.length != 0 || this.f.length != 0 || !this.e[0].equals(this.b[0])) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ota) {
            ota otaVar = (ota) obj;
            if (Arrays.equals(this.a, otaVar.a) && Arrays.equals(this.b, otaVar.b) && Arrays.equals(this.c, otaVar.c) && Arrays.equals(this.e, otaVar.e) && Arrays.equals(this.f, otaVar.f)) {
                return true;
            }
            return false;
        }
        if ((obj instanceof adc.a) && e()) {
            b55 b55Var = b55.c;
            if (a(b55Var).equals(((adc.a) obj).a(b55Var))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adc
    public boolean f(es5 es5Var, wcc wccVar) {
        return c(es5Var).contains(wccVar);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.a) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public wcc n(b55 b55Var) {
        int binarySearch = Arrays.binarySearch(this.a, b55Var.T());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.b[binarySearch + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a.length);
        for (long j : this.a) {
            ica.e(j, dataOutput);
        }
        for (wcc wccVar : this.b) {
            ica.i(wccVar, dataOutput);
        }
        dataOutput.writeInt(this.c.length);
        for (long j2 : this.c) {
            ica.e(j2, dataOutput);
        }
        for (wcc wccVar2 : this.e) {
            ica.i(wccVar2, dataOutput);
        }
        dataOutput.writeByte(this.f.length);
        for (ycc yccVar : this.f) {
            yccVar.d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        wcc[] wccVarArr = this.b;
        sb.append(wccVarArr[wccVarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
