package defpackage;

import java.io.Serializable;
/* compiled from: NameTransformer.java */
/* renamed from: ps6  reason: default package */
/* loaded from: classes2.dex */
public abstract class ps6 {
    public static final ps6 a = new e();

    /* compiled from: NameTransformer.java */
    /* renamed from: ps6$a */
    /* loaded from: classes2.dex */
    static class a extends ps6 {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.ps6
        public String c(String str) {
            return this.b + str + this.c;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.b + "','" + this.c + "')]";
        }
    }

    /* compiled from: NameTransformer.java */
    /* renamed from: ps6$b */
    /* loaded from: classes2.dex */
    static class b extends ps6 {
        final /* synthetic */ String b;

        b(String str) {
            this.b = str;
        }

        @Override // defpackage.ps6
        public String c(String str) {
            return this.b + str;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.b + "')]";
        }
    }

    /* compiled from: NameTransformer.java */
    /* renamed from: ps6$c */
    /* loaded from: classes2.dex */
    static class c extends ps6 {
        final /* synthetic */ String b;

        c(String str) {
            this.b = str;
        }

        @Override // defpackage.ps6
        public String c(String str) {
            return str + this.b;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.b + "')]";
        }
    }

    /* compiled from: NameTransformer.java */
    /* renamed from: ps6$d */
    /* loaded from: classes2.dex */
    public static class d extends ps6 implements Serializable {
        protected final ps6 b;
        protected final ps6 c;

        public d(ps6 ps6Var, ps6 ps6Var2) {
            this.b = ps6Var;
            this.c = ps6Var2;
        }

        @Override // defpackage.ps6
        public String c(String str) {
            return this.b.c(this.c.c(str));
        }

        public String toString() {
            return "[ChainedTransformer(" + this.b + ", " + this.c + ")]";
        }
    }

    protected ps6() {
    }

    public static ps6 a(ps6 ps6Var, ps6 ps6Var2) {
        return new d(ps6Var, ps6Var2);
    }

    public static ps6 b(String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (str2 != null && !str2.isEmpty()) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                return new a(str, str2);
            }
            return new b(str);
        } else if (z2) {
            return new c(str2);
        } else {
            return a;
        }
    }

    public abstract String c(String str);

    /* compiled from: NameTransformer.java */
    /* renamed from: ps6$e */
    /* loaded from: classes2.dex */
    protected static final class e extends ps6 implements Serializable {
        protected e() {
        }

        @Override // defpackage.ps6
        public String c(String str) {
            return str;
        }
    }
}
