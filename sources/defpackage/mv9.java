package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: Schedule.java */
/* renamed from: mv9  reason: default package */
/* loaded from: classes4.dex */
public class mv9 implements Serializable {
    private static final a b;
    public static final mv9 c;
    private List<a> a;

    /* compiled from: Schedule.java */
    /* renamed from: mv9$a */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        private int a;
        private String b;
        private String c;
        private boolean d;

        public a(int i, String str, String str2, boolean z) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.d != aVar.d || !this.b.equals(aVar.b)) {
                return false;
            }
            return this.c.equals(aVar.c);
        }

        public int hashCode() {
            return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0);
        }
    }

    static {
        a aVar = new a(0, "", "", false);
        b = aVar;
        c = new mv9(Collections.unmodifiableList(Arrays.asList(aVar, aVar, aVar, aVar, aVar, aVar, aVar)));
    }

    public mv9(List<a> list) {
        this.a = list;
    }

    public List<a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((mv9) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
