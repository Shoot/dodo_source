package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ByteArrayPool.java */
/* renamed from: oj0  reason: default package */
/* loaded from: classes.dex */
public class oj0 {
    protected static final Comparator<byte[]> e = new a();
    private final List<byte[]> a = new ArrayList();
    private final List<byte[]> b = new ArrayList(64);
    private int c = 0;
    private final int d;

    /* compiled from: ByteArrayPool.java */
    /* renamed from: oj0$a */
    /* loaded from: classes.dex */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public oj0(int i) {
        this.d = i;
    }

    private synchronized void c() {
        while (this.c > this.d) {
            byte[] remove = this.a.remove(0);
            this.b.remove(remove);
            this.c -= remove.length;
        }
    }

    public synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = this.b.get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += bArr.length;
                c();
            }
        }
    }
}
