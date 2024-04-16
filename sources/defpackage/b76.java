package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MapTileAreaList.java */
/* renamed from: b76  reason: default package */
/* loaded from: classes3.dex */
public class b76 implements f76, Iterable {
    private final List<y66> a = new ArrayList();

    /* compiled from: MapTileAreaList.java */
    /* renamed from: b76$a */
    /* loaded from: classes3.dex */
    class a implements Iterator<Long> {
        private int a;
        private Iterator<Long> b;

        a() {
        }

        private Iterator<Long> a() {
            Iterator<Long> it = this.b;
            if (it != null) {
                return it;
            }
            if (this.a < b76.this.a.size()) {
                List list = b76.this.a;
                int i = this.a;
                this.a = i + 1;
                Iterator<Long> it2 = ((y66) list.get(i)).iterator();
                this.b = it2;
                return it2;
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Long next() {
            long longValue = a().next().longValue();
            if (!a().hasNext()) {
                this.b = null;
            }
            return Long.valueOf(longValue);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Iterator<Long> a = a();
            if (a != null && a.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.f76
    public boolean d(long j) {
        for (y66 y66Var : this.a) {
            if (y66Var.d(j)) {
                return true;
            }
        }
        return false;
    }

    public List<y66> f() {
        return this.a;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new a();
    }

    public int size() {
        int i = 0;
        for (y66 y66Var : this.a) {
            i += y66Var.size();
        }
        return i;
    }
}
