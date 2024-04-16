package org.jsoup.select;
/* loaded from: classes3.dex */
public class Selector {

    /* loaded from: classes3.dex */
    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str) {
            super(str);
        }

        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static se3 a(String str, re3 re3Var) {
        vvb.h(str);
        return b(f.v(str), re3Var);
    }

    public static se3 b(c cVar, re3 re3Var) {
        vvb.j(cVar);
        vvb.j(re3Var);
        return a.a(cVar, re3Var);
    }

    public static re3 c(String str, re3 re3Var) {
        vvb.h(str);
        return a.b(f.v(str), re3Var);
    }
}
