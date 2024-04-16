package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import java.util.HashSet;
/* compiled from: DupDetector.java */
/* renamed from: i93  reason: default package */
/* loaded from: classes2.dex */
public class i93 {
    protected final Object a;
    protected String b;
    protected String c;
    protected HashSet<String> d;

    private i93(Object obj) {
        this.a = obj;
    }

    public static i93 e(ua5 ua5Var) {
        return new i93(ua5Var);
    }

    public i93 a() {
        return new i93(this.a);
    }

    public Object b() {
        return this.a;
    }

    public boolean c(String str) throws JsonParseException {
        String str2 = this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.c;
            if (str3 == null) {
                this.c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.d == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.d = hashSet;
                    hashSet.add(this.b);
                    this.d.add(this.c);
                }
                return !this.d.add(str);
            }
        }
    }

    public void d() {
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
