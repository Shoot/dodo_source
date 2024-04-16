package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
/* renamed from: pna  reason: default package */
/* loaded from: classes3.dex */
public class pna implements v71 {
    private Hashtable a;

    /* renamed from: pna$b */
    /* loaded from: classes3.dex */
    public static class b {
        private Hashtable a = new Hashtable();

        public b() {
        }

        public pna a() {
            return new pna(this.a);
        }

        public b b(int i, byte[] bArr) {
            if (bArr != null) {
                if (i != 0 && (i < 4 || i >= 63 || i == 48)) {
                    throw new IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
                }
                if (i != 4) {
                    this.a.put(g65.d(i), bArr);
                    return this;
                }
                throw new IllegalArgumentException("Parameter type 4 is reserved for internal use.");
            }
            throw new IllegalArgumentException("Parameter value must not be null.");
        }

        public b c(byte[] bArr) {
            return b(0, bArr);
        }

        public b(Hashtable hashtable) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                this.a.put(num, hashtable.get(num));
            }
        }
    }

    public pna() {
        this(new Hashtable());
    }

    public byte[] a() {
        return (byte[]) this.a.get(g65.d(0));
    }

    public Hashtable b() {
        return this.a;
    }

    private pna(Hashtable hashtable) {
        this.a = hashtable;
    }
}
