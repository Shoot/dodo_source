package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: IdnaMappingTable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lnt4;", "", "", "codePoint", "b", "position", "limit", "a", "Leh0;", "sink", "", c.a, "", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "sections", "getRanges", "ranges", "getMappings", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: nt4  reason: default package */
/* loaded from: classes3.dex */
public final class nt4 {
    private final String a;
    private final String b;
    private final String c;

    public nt4(String str, String str2, String str3) {
        z65.h(str, "sections");
        z65.h(str2, "ranges");
        z65.h(str3, "mappings");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    private final int a(int i, int i2, int i3) {
        int i4;
        int i5 = i & 127;
        int i6 = i3 - 1;
        while (true) {
            if (i2 <= i6) {
                i4 = (i2 + i6) / 2;
                int j = z65.j(i5, this.b.charAt(i4 * 4));
                if (j < 0) {
                    i6 = i4 - 1;
                } else if (j <= 0) {
                    break;
                } else {
                    i2 = i4 + 1;
                }
            } else {
                i4 = (-i2) - 1;
                break;
            }
        }
        if (i4 >= 0) {
            return i4 * 4;
        }
        return ((-i4) - 2) * 4;
    }

    private final int b(int i) {
        int i2;
        int i3 = (i & 2097024) >> 7;
        int length = (this.a.length() / 4) - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) / 2;
                int j = z65.j(i3, pt4.a(this.a, i2 * 4));
                if (j < 0) {
                    length = i2 - 1;
                } else if (j <= 0) {
                    break;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2 * 4;
        }
        return ((-i2) - 2) * 4;
    }

    public final boolean c(int i, eh0 eh0Var) {
        int length;
        z65.h(eh0Var, "sink");
        int b = b(i);
        int a = pt4.a(this.a, b + 2);
        if (b + 4 < this.a.length()) {
            length = pt4.a(this.a, b + 6);
        } else {
            length = this.b.length() / 4;
        }
        int a2 = a(i, a, length);
        char charAt = this.b.charAt(a2 + 1);
        if (charAt >= 0 && charAt < '@') {
            int a3 = pt4.a(this.b, a2 + 2);
            eh0Var.k0(this.c, a3, charAt + a3);
            return true;
        } else if ('@' <= charAt && charAt < 'P') {
            eh0Var.G(i - (this.b.charAt(a2 + 3) | (((charAt & 15) << 14) | (this.b.charAt(a2 + 2) << 7))));
            return true;
        } else if ('P' <= charAt && charAt < '`') {
            eh0Var.G(i + (this.b.charAt(a2 + 3) | ((charAt & 15) << 14) | (this.b.charAt(a2 + 2) << 7)));
            return true;
        } else if (charAt != 'w') {
            if (charAt == 'x') {
                eh0Var.G(i);
                return true;
            } else if (charAt == 'y') {
                eh0Var.G(i);
                return false;
            } else if (charAt == 'z') {
                eh0Var.V0(this.b.charAt(a2 + 2));
                return true;
            } else if (charAt == '{') {
                eh0Var.V0(this.b.charAt(a2 + 2) | 128);
                return true;
            } else if (charAt == '|') {
                eh0Var.V0(this.b.charAt(a2 + 2));
                eh0Var.V0(this.b.charAt(a2 + 3));
                return true;
            } else if (charAt == '}') {
                eh0Var.V0(this.b.charAt(a2 + 2) | 128);
                eh0Var.V0(this.b.charAt(a2 + 3));
                return true;
            } else if (charAt == '~') {
                eh0Var.V0(this.b.charAt(a2 + 2));
                eh0Var.V0(this.b.charAt(a2 + 3) | 128);
                return true;
            } else if (charAt == 127) {
                eh0Var.V0(this.b.charAt(a2 + 2) | 128);
                eh0Var.V0(this.b.charAt(a2 + 3) | 128);
                return true;
            } else {
                throw new IllegalStateException(("unexpected rangesIndex for " + i).toString());
            }
        } else {
            return true;
        }
    }
}
