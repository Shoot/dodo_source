package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: LogSourceMetrics.java */
/* renamed from: ex5  reason: default package */
/* loaded from: classes2.dex */
public final class ex5 {
    private static final ex5 c = new a().a();
    private final String a;
    private final List<rw5> b;

    /* compiled from: LogSourceMetrics.java */
    /* renamed from: ex5$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private String a = "";
        private List<rw5> b = new ArrayList();

        a() {
        }

        public ex5 a() {
            return new ex5(this.a, Collections.unmodifiableList(this.b));
        }

        public a b(List<rw5> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    ex5(String str, List<rw5> list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @pr8(tag = 2)
    public List<rw5> a() {
        return this.b;
    }

    @pr8(tag = 1)
    public String b() {
        return this.a;
    }
}
