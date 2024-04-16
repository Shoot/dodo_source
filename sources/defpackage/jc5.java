package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
/* compiled from: JsonStreamContext.java */
/* renamed from: jc5  reason: default package */
/* loaded from: classes2.dex */
public abstract class jc5 {
    protected int a;
    protected int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jc5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public jc5(jc5 jc5Var) {
        this.a = jc5Var.a;
        this.b = jc5Var.b;
    }

    public final int a() {
        int i = this.b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String b();

    public abstract Object c();

    public final int d() {
        return this.b + 1;
    }

    public abstract jc5 e();

    public final boolean f() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public abstract void h(Object obj);

    public String i() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return CallerData.NA;
                }
                return "Object";
            }
            return "Array";
        }
        return "root";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                sb.append(CoreConstants.CURLY_LEFT);
                String b = b();
                if (b != null) {
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    kw0.a(sb, b);
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else {
                    sb.append('?');
                }
                sb.append(CoreConstants.CURLY_RIGHT);
            } else {
                sb.append('[');
                sb.append(a());
                sb.append(']');
            }
        } else {
            sb.append("/");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public jc5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
