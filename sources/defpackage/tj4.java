package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: tj4  reason: default package */
/* loaded from: classes3.dex */
public class tj4 extends si5 {
    private final int b;
    private final boolean c;
    private List<ti5> d;
    private List<vi5> e;
    private final long f;
    private long g;
    private uj4 h;

    private tj4(int i, List<ti5> list, List<vi5> list2, long j, long j2, boolean z) {
        super(true);
        this.g = 0L;
        this.b = i;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.g = j;
        this.f = j2;
        this.c = z;
    }

    public static tj4 b(Object obj) throws IOException {
        if (obj instanceof tj4) {
            return (tj4) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() == 0) {
                int readInt = dataInputStream.readInt();
                long readLong = dataInputStream.readLong();
                long readLong2 = dataInputStream.readLong();
                boolean readBoolean = dataInputStream.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < readInt; i++) {
                    arrayList.add(ti5.f(obj));
                }
                for (int i2 = 0; i2 < readInt - 1; i2++) {
                    arrayList2.add(vi5.a(obj));
                }
                return new tj4(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        } else if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    tj4 b = b(dataInputStream3);
                    dataInputStream3.close();
                    return b;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (obj instanceof InputStream) {
            return b(aza.b((InputStream) obj));
        } else {
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    public static tj4 c(byte[] bArr, byte[] bArr2) throws IOException {
        tj4 b = b(bArr);
        b.h = uj4.b(bArr2);
        return b;
    }

    private static tj4 g(tj4 tj4Var) {
        try {
            return b(tj4Var.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        return g(this);
    }

    public int d() {
        return this.b;
    }

    public synchronized uj4 e() {
        return new uj4(this.b, f().j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tj4 tj4Var = (tj4) obj;
        if (this.b != tj4Var.b || this.c != tj4Var.c || this.f != tj4Var.f || this.g != tj4Var.g || !this.d.equals(tj4Var.d)) {
            return false;
        }
        return this.e.equals(tj4Var.e);
    }

    ti5 f() {
        return this.d.get(0);
    }

    @Override // defpackage.si5, defpackage.wg3
    public synchronized byte[] getEncoded() throws IOException {
        rn1 a;
        try {
            a = rn1.f().i(0).i(this.b).j(this.g).j(this.f).a(this.c);
            for (ti5 ti5Var : this.d) {
                a.c(ti5Var);
            }
            for (vi5 vi5Var : this.e) {
                a.c(vi5Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a.b();
    }

    public int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return (((((((((this.b * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
