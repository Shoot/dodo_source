package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ClassStack.java */
/* renamed from: p81  reason: default package */
/* loaded from: classes2.dex */
public final class p81 {
    protected final p81 a;
    protected final Class<?> b;
    private ArrayList<jj9> c;

    public p81(Class<?> cls) {
        this(null, cls);
    }

    public void a(jj9 jj9Var) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(jj9Var);
    }

    public p81 b(Class<?> cls) {
        return new p81(this, cls);
    }

    public p81 c(Class<?> cls) {
        if (this.b == cls) {
            return this;
        }
        for (p81 p81Var = this.a; p81Var != null; p81Var = p81Var.a) {
            if (p81Var.b == cls) {
                return p81Var;
            }
        }
        return null;
    }

    public void d(y85 y85Var) {
        ArrayList<jj9> arrayList = this.c;
        if (arrayList != null) {
            Iterator<jj9> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().I0(y85Var);
            }
        }
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<jj9> arrayList = this.c;
        if (arrayList == null) {
            valueOf = "0";
        } else {
            valueOf = String.valueOf(arrayList.size());
        }
        sb.append(valueOf);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        for (p81 p81Var = this; p81Var != null; p81Var = p81Var.a) {
            sb.append(' ');
            sb.append(p81Var.b.getName());
        }
        sb.append(']');
        return sb.toString();
    }

    private p81(p81 p81Var, Class<?> cls) {
        this.a = p81Var;
        this.b = cls;
    }
}
