package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: hpc  reason: default package */
/* loaded from: classes2.dex */
public final class hpc implements bpc {
    private final String a;
    private final ArrayList<bpc> b;

    public hpc(String str, List<bpc> list) {
        this.a = str;
        ArrayList<bpc> arrayList = new ArrayList<>();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.a;
    }

    public final ArrayList<bpc> b() {
        return this.b;
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpc)) {
            return false;
        }
        hpc hpcVar = (hpc) obj;
        String str = this.a;
        if (str == null ? hpcVar.a != null : !str.equals(hpcVar.a)) {
            return false;
        }
        ArrayList<bpc> arrayList = this.b;
        ArrayList<bpc> arrayList2 = hpcVar.b;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bpc
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.bpc
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return null;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ArrayList<bpc> arrayList = this.b;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return i3 + i2;
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.bpc
    public final bpc c() {
        return this;
    }
}
