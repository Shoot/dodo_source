package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.bn2;
import defpackage.cn2;
import im.threads.business.transport.MessageAttributes;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.DateTimeParseException;
/* compiled from: DateTimeFormatter.java */
/* renamed from: an2  reason: default package */
/* loaded from: classes3.dex */
public final class an2 {
    public static final an2 h;
    public static final an2 i;
    public static final an2 j;
    public static final an2 k;
    public static final an2 l;
    public static final an2 m;
    public static final an2 n;
    public static final an2 o;
    public static final an2 p;
    public static final an2 q;
    public static final an2 r;
    public static final an2 s;
    public static final an2 t;
    public static final an2 u;
    public static final an2 v;
    private static final w8b<cy7> w;
    private static final w8b<Boolean> x;
    private final bn2.f a;
    private final Locale b;
    private final oo2 c;
    private final mj9 d;
    private final Set<u8b> e;
    private final p71 f;
    private final vcc g;

    /* compiled from: DateTimeFormatter.java */
    /* renamed from: an2$a */
    /* loaded from: classes3.dex */
    class a implements w8b<cy7> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public cy7 a(q8b q8bVar) {
            if (q8bVar instanceof zm2) {
                return ((zm2) q8bVar).g;
            }
            return cy7.d;
        }
    }

    /* compiled from: DateTimeFormatter.java */
    /* renamed from: an2$b */
    /* loaded from: classes3.dex */
    class b implements w8b<Boolean> {
        b() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public Boolean a(q8b q8bVar) {
            if (q8bVar instanceof zm2) {
                return Boolean.valueOf(((zm2) q8bVar).f);
            }
            return Boolean.FALSE;
        }
    }

    static {
        bn2 bn2Var = new bn2();
        h71 h71Var = h71.Y;
        ika ikaVar = ika.EXCEEDS_PAD;
        bn2 e = bn2Var.p(h71Var, 4, 10, ikaVar).e(CoreConstants.DASH_CHAR);
        h71 h71Var2 = h71.B;
        bn2 e2 = e.o(h71Var2, 2).e(CoreConstants.DASH_CHAR);
        h71 h71Var3 = h71.w;
        bn2 o2 = e2.o(h71Var3, 2);
        mj9 mj9Var = mj9.STRICT;
        an2 E = o2.E(mj9Var);
        t75 t75Var = t75.e;
        an2 m2 = E.m(t75Var);
        h = m2;
        i = new bn2().y().a(m2).i().E(mj9Var).m(t75Var);
        j = new bn2().y().a(m2).v().i().E(mj9Var).m(t75Var);
        bn2 bn2Var2 = new bn2();
        h71 h71Var4 = h71.q;
        bn2 e3 = bn2Var2.o(h71Var4, 2).e(CoreConstants.COLON_CHAR);
        h71 h71Var5 = h71.m;
        bn2 e4 = e3.o(h71Var5, 2).v().e(CoreConstants.COLON_CHAR);
        h71 h71Var6 = h71.k;
        an2 E2 = e4.o(h71Var6, 2).v().b(h71.e, 0, 9, true).E(mj9Var);
        k = E2;
        l = new bn2().y().a(E2).i().E(mj9Var);
        m = new bn2().y().a(E2).v().i().E(mj9Var);
        an2 m3 = new bn2().y().a(m2).e('T').a(E2).E(mj9Var).m(t75Var);
        n = m3;
        an2 m4 = new bn2().y().a(m3).i().E(mj9Var).m(t75Var);
        o = m4;
        p = new bn2().a(m4).v().e('[').z().s().e(']').E(mj9Var).m(t75Var);
        q = new bn2().a(m3).v().i().v().e('[').z().s().e(']').E(mj9Var).m(t75Var);
        r = new bn2().y().p(h71Var, 4, 10, ikaVar).e(CoreConstants.DASH_CHAR).o(h71.x, 3).v().i().E(mj9Var).m(t75Var);
        bn2 e5 = new bn2().y().p(v75.d, 4, 10, ikaVar).f("-W").o(v75.c, 2).e(CoreConstants.DASH_CHAR);
        h71 h71Var7 = h71.t;
        s = e5.o(h71Var7, 1).v().i().E(mj9Var).m(t75Var);
        t = new bn2().y().c().E(mj9Var);
        u = new bn2().y().o(h71Var, 4).o(h71Var2, 2).o(h71Var3, 2).v().h("+HHMMss", "Z").E(mj9Var).m(t75Var);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        v = new bn2().y().B().v().l(h71Var7, hashMap).f(", ").u().p(h71Var3, 1, 2, ika.NOT_NEGATIVE).e(' ').l(h71Var2, hashMap2).e(' ').o(h71Var, 4).e(' ').o(h71Var4, 2).e(CoreConstants.COLON_CHAR).o(h71Var5, 2).v().e(CoreConstants.COLON_CHAR).o(h71Var6, 2).u().e(' ').h("+HHMM", "GMT").E(mj9.SMART).m(t75Var);
        w = new a();
        x = new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public an2(bn2.f fVar, Locale locale, oo2 oo2Var, mj9 mj9Var, Set<u8b> set, p71 p71Var, vcc vccVar) {
        this.a = (bn2.f) g95.i(fVar, "printerParser");
        this.b = (Locale) g95.i(locale, "locale");
        this.c = (oo2) g95.i(oo2Var, "decimalStyle");
        this.d = (mj9) g95.i(mj9Var, "resolverStyle");
        this.e = set;
        this.f = p71Var;
        this.g = vccVar;
    }

    private DateTimeParseException a(CharSequence charSequence, RuntimeException runtimeException) {
        String charSequence2;
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    public static an2 h(String str) {
        return new bn2().j(str).D();
    }

    private zm2 j(CharSequence charSequence, ParsePosition parsePosition) {
        ParsePosition parsePosition2;
        String charSequence2;
        if (parsePosition != null) {
            parsePosition2 = parsePosition;
        } else {
            parsePosition2 = new ParsePosition(0);
        }
        cn2.b k2 = k(charSequence, parsePosition2);
        if (k2 != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return k2.P();
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    private cn2.b k(CharSequence charSequence, ParsePosition parsePosition) {
        g95.i(charSequence, "text");
        g95.i(parsePosition, "position");
        cn2 cn2Var = new cn2(this);
        int a2 = this.a.a(cn2Var, charSequence, parsePosition.getIndex());
        if (a2 < 0) {
            parsePosition.setErrorIndex(~a2);
            return null;
        }
        parsePosition.setIndex(a2);
        return cn2Var.u();
    }

    public String b(q8b q8bVar) {
        StringBuilder sb = new StringBuilder(32);
        c(q8bVar, sb);
        return sb.toString();
    }

    public void c(q8b q8bVar, Appendable appendable) {
        g95.i(q8bVar, "temporal");
        g95.i(appendable, "appendable");
        try {
            dn2 dn2Var = new dn2(q8bVar, this);
            if (appendable instanceof StringBuilder) {
                this.a.i(dn2Var, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.a.i(dn2Var, sb);
            appendable.append(sb);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public p71 d() {
        return this.f;
    }

    public oo2 e() {
        return this.c;
    }

    public Locale f() {
        return this.b;
    }

    public vcc g() {
        return this.g;
    }

    public <T> T i(CharSequence charSequence, w8b<T> w8bVar) {
        g95.i(charSequence, "text");
        g95.i(w8bVar, MessageAttributes.TYPE);
        try {
            return (T) j(charSequence, null).x0(this.d, this.e).T(w8bVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw a(charSequence, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bn2.f l(boolean z) {
        return this.a.b(z);
    }

    public an2 m(p71 p71Var) {
        if (g95.c(this.f, p71Var)) {
            return this;
        }
        return new an2(this.a, this.b, this.c, this.d, this.e, p71Var, this.g);
    }

    public an2 n(mj9 mj9Var) {
        g95.i(mj9Var, "resolverStyle");
        if (g95.c(this.d, mj9Var)) {
            return this;
        }
        return new an2(this.a, this.b, this.c, mj9Var, this.e, this.f, this.g);
    }

    public String toString() {
        String fVar = this.a.toString();
        if (!fVar.startsWith("[")) {
            return fVar.substring(1, fVar.length() - 1);
        }
        return fVar;
    }
}
