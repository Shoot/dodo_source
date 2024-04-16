package defpackage;

import java.util.List;
/* compiled from: MapTileRequestState.java */
/* renamed from: r76  reason: default package */
/* loaded from: classes3.dex */
public class r76 {
    private final List<m76> a;
    private final long b;
    private final ds4 c;
    private int d;
    private m76 e;

    public r76(long j, List<m76> list, ds4 ds4Var) {
        this.a = list;
        this.b = j;
        this.c = ds4Var;
    }

    public ds4 a() {
        return this.c;
    }

    public long b() {
        return this.b;
    }

    public m76 c() {
        m76 m76Var;
        if (d()) {
            m76Var = null;
        } else {
            List<m76> list = this.a;
            int i = this.d;
            this.d = i + 1;
            m76Var = list.get(i);
        }
        this.e = m76Var;
        return m76Var;
    }

    public boolean d() {
        List<m76> list = this.a;
        if (list != null && this.d < list.size()) {
            return false;
        }
        return true;
    }
}
