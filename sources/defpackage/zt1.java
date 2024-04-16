package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import im.threads.ui.fragments.ChatFragment;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;
/* compiled from: ContentReference.java */
/* renamed from: zt1  reason: default package */
/* loaded from: classes2.dex */
public class zt1 implements Serializable {
    protected static final zt1 e = new zt1(false, null);
    protected final transient Object a;
    protected final int b;
    protected final int c;
    protected final boolean d;

    protected zt1(boolean z, Object obj) {
        this(z, obj, -1, -1);
    }

    public static zt1 k(boolean z, Object obj) {
        return new zt1(z, obj);
    }

    public static zt1 r() {
        return e;
    }

    protected int a(StringBuilder sb, String str) {
        sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isISOControl(charAt) || !b(sb, charAt)) {
                sb.append(charAt);
            }
        }
        sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return str.length();
    }

    protected boolean b(StringBuilder sb, int i) {
        if (i != 13 && i != 10) {
            sb.append(CoreConstants.ESCAPE_CHAR);
            sb.append('u');
            sb.append(kw0.f((i >> 12) & 15));
            sb.append(kw0.f((i >> 8) & 15));
            sb.append(kw0.f((i >> 4) & 15));
            sb.append(kw0.f(i & 15));
            return true;
        }
        return false;
    }

    protected String c(CharSequence charSequence, int[] iArr, int i) {
        f(iArr, charSequence.length());
        int i2 = iArr[0];
        return charSequence.subSequence(i2, Math.min(iArr[1], i) + i2).toString();
    }

    protected String d(byte[] bArr, int[] iArr, int i) {
        f(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i), Charset.forName("UTF-8"));
    }

    protected String e(char[] cArr, int[] iArr, int i) {
        f(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zt1)) {
            return false;
        }
        zt1 zt1Var = (zt1) obj;
        if (this.b != zt1Var.b || this.c != zt1Var.c) {
            return false;
        }
        Object obj2 = zt1Var.a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj2 == null) {
            return false;
        } else {
            if (!(obj3 instanceof File) && !(obj3 instanceof URL) && !(obj3 instanceof URI)) {
                if (obj3 == obj2) {
                    return true;
                }
                return false;
            }
            return obj3.equals(obj2);
        }
    }

    protected void f(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public StringBuilder i(StringBuilder sb) {
        Class<?> cls;
        String str;
        Object n = n();
        if (n == null) {
            sb.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            return sb;
        }
        if (n instanceof Class) {
            cls = (Class) n;
        } else {
            cls = n.getClass();
        }
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (n instanceof byte[]) {
            name = "byte[]";
        } else if (n instanceof char[]) {
            name = "char[]";
        }
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(name);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (o()) {
            int q = q();
            int[] iArr = {m(), l()};
            String str2 = " chars";
            if (n instanceof CharSequence) {
                str = c((CharSequence) n, iArr, q);
            } else if (n instanceof char[]) {
                str = e((char[]) n, iArr, q);
            } else if (n instanceof byte[]) {
                str = d((byte[]) n, iArr, q);
                str2 = " bytes";
            } else {
                str = null;
            }
            if (str != null) {
                a(sb, str);
                if (iArr[1] > q) {
                    sb.append("[truncated ");
                    sb.append(iArr[1] - q);
                    sb.append(str2);
                    sb.append(']');
                }
            }
        } else if (n instanceof byte[]) {
            int l = l();
            if (l < 0) {
                l = ((byte[]) n).length;
            }
            sb.append('[');
            sb.append(l);
            sb.append(" bytes]");
        }
        return sb;
    }

    public String j() {
        return i(new StringBuilder((int) ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY)).toString();
    }

    public int l() {
        return this.c;
    }

    public int m() {
        return this.b;
    }

    public Object n() {
        return this.a;
    }

    public boolean o() {
        return this.d;
    }

    protected int q() {
        return 500;
    }

    protected Object readResolve() {
        return e;
    }

    protected zt1(boolean z, Object obj, int i, int i2) {
        this.d = z;
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }
}
