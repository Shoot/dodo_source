package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: SerializedString.java */
/* renamed from: vca  reason: default package */
/* loaded from: classes2.dex */
public class vca implements mca, Serializable {
    private static final kc5 d = kc5.e();
    protected final String a;
    protected char[] b;
    protected transient String c;

    public vca(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.c = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.a);
    }

    @Override // defpackage.mca
    public int a(char[] cArr, int i) {
        char[] cArr2 = this.b;
        if (cArr2 == null) {
            cArr2 = d.f(this.a);
            this.b = cArr2;
        }
        int length = cArr2.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i, length);
        return length;
    }

    @Override // defpackage.mca
    public final char[] b() {
        char[] cArr = this.b;
        if (cArr == null) {
            char[] f = d.f(this.a);
            this.b = f;
            return f;
        }
        return cArr;
    }

    @Override // defpackage.mca
    public int c(char[] cArr, int i) {
        String str = this.a;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return this.a.equals(((vca) obj).a);
        }
        return false;
    }

    @Override // defpackage.mca
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    protected Object readResolve() {
        return new vca(this.c);
    }

    public final String toString() {
        return this.a;
    }
}
