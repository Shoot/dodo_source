package defpackage;

import defpackage.h53;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jsoup.SerializationException;
/* compiled from: Attributes.java */
/* renamed from: hz  reason: default package */
/* loaded from: classes3.dex */
public class hz implements Iterable<az>, Cloneable {
    private int a = 0;
    String[] b = new String[3];
    Object[] c = new Object[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Attributes.java */
    /* renamed from: hz$a */
    /* loaded from: classes3.dex */
    public class a implements Iterator<az> {
        int a = 0;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public az next() {
            hz hzVar = hz.this;
            String[] strArr = hzVar.b;
            int i = this.a;
            az azVar = new az(strArr[i], (String) hzVar.c[i], hzVar);
            this.a++;
            return azVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.a < hz.this.a) {
                hz hzVar = hz.this;
                if (!hzVar.Q(hzVar.b[this.a])) {
                    break;
                }
                this.a++;
            }
            if (this.a < hz.this.a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            hz hzVar = hz.this;
            int i = this.a - 1;
            this.a = i;
            hzVar.Y(i);
        }
    }

    private int O(String str) {
        vvb.j(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equalsIgnoreCase(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String P(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q(String str) {
        if (str == null || str.length() <= 1 || str.charAt(0) != '/') {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i) {
        boolean z;
        if (i >= this.a) {
            z = true;
        } else {
            z = false;
        }
        vvb.b(z);
        int i2 = (this.a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.c;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.a - 1;
        this.a = i4;
        this.b[i4] = null;
        this.c[i4] = null;
    }

    private void t(String str, Object obj) {
        w(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = obj;
        this.a = i + 1;
    }

    private void w(int i) {
        boolean z;
        if (i >= this.a) {
            z = true;
        } else {
            z = false;
        }
        vvb.d(z);
        String[] strArr = this.b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = 3;
        if (length >= 3) {
            i2 = this.a * 2;
        }
        if (i <= i2) {
            i = i2;
        }
        this.b = (String[]) Arrays.copyOf(strArr, i);
        this.c = Arrays.copyOf(this.c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String z(Object obj) {
        if (obj == null) {
            return "";
        }
        return (String) obj;
    }

    /* renamed from: A */
    public hz clone() {
        try {
            hz hzVar = (hz) super.clone();
            hzVar.a = this.a;
            hzVar.b = (String[]) Arrays.copyOf(this.b, this.a);
            hzVar.c = Arrays.copyOf(this.c, this.a);
            return hzVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int B(br7 br7Var) {
        Object obj;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean e = br7Var.e();
        int i2 = 0;
        while (i < this.b.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.b;
                if (i4 < strArr.length && (obj = strArr[i4]) != null) {
                    if (!e || !strArr[i].equals(obj)) {
                        if (!e) {
                            String[] strArr2 = this.b;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    Y(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    public String C(String str) {
        int J = J(str);
        if (J == -1) {
            return "";
        }
        return z(this.c[J]);
    }

    public String D(String str) {
        int O = O(str);
        if (O == -1) {
            return "";
        }
        return z(this.c[O]);
    }

    public boolean F(String str) {
        if (J(str) != -1) {
            return true;
        }
        return false;
    }

    public boolean G(String str) {
        if (O(str) != -1) {
            return true;
        }
        return false;
    }

    public String H() {
        StringBuilder b = wza.b();
        try {
            I(b, new h53("").f1());
            return wza.o(b);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(Appendable appendable, h53.a aVar) throws IOException {
        String d;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!Q(this.b[i2]) && (d = az.d(this.b[i2], aVar.p())) != null) {
                az.i(d, (String) this.c[i2], appendable.append(' '), aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int J(String str) {
        vvb.j(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equals(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public void R() {
        for (int i = 0; i < this.a; i++) {
            String[] strArr = this.b;
            strArr[i] = h07.a(strArr[i]);
        }
    }

    public hz T(az azVar) {
        vvb.j(azVar);
        U(azVar.getKey(), azVar.getValue());
        azVar.c = this;
        return this;
    }

    public hz U(String str, String str2) {
        vvb.j(str);
        int J = J(str);
        if (J != -1) {
            this.c[J] = str2;
        } else {
            h(str, str2);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(String str, String str2) {
        int O = O(str);
        if (O != -1) {
            this.c[O] = str2;
            if (!this.b[O].equals(str)) {
                this.b[O] = str;
                return;
            }
            return;
        }
        h(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hz X(String str, Object obj) {
        vvb.j(str);
        if (!Q(str)) {
            str = P(str);
        }
        vvb.j(obj);
        int J = J(str);
        if (J != -1) {
            this.c[J] = obj;
        } else {
            t(str, obj);
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hz hzVar = (hz) obj;
        if (this.a != hzVar.a) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            int J = hzVar.J(this.b[i]);
            if (J == -1) {
                return false;
            }
            Object obj2 = this.c[i];
            Object obj3 = hzVar.c[J];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public hz h(String str, String str2) {
        t(str, str2);
        return this;
    }

    public int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    public boolean isEmpty() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<az> iterator() {
        return new a();
    }

    public void p(hz hzVar) {
        boolean z;
        if (hzVar.size() == 0) {
            return;
        }
        w(this.a + hzVar.a);
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        Iterator<az> it = hzVar.iterator();
        while (it.hasNext()) {
            az next = it.next();
            if (z) {
                T(next);
            } else {
                h(next.getKey(), next.getValue());
            }
        }
    }

    public int size() {
        return this.a;
    }

    public String toString() {
        return H();
    }

    public List<az> v() {
        ArrayList arrayList = new ArrayList(this.a);
        for (int i = 0; i < this.a; i++) {
            if (!Q(this.b[i])) {
                arrayList.add(new az(this.b[i], (String) this.c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
