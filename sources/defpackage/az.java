package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.h53;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.jsoup.SerializationException;
/* compiled from: Attribute.java */
/* renamed from: az  reason: default package */
/* loaded from: classes3.dex */
public class az implements Map.Entry<String, String>, Cloneable {
    private static final String[] d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    private static final Pattern f = Pattern.compile("[^-a-zA-Z0-9_:.]");
    private static final Pattern g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    private static final Pattern h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    private String a;
    private String b;
    hz c;

    public az(String str, String str2, hz hzVar) {
        vvb.j(str);
        String trim = str.trim();
        vvb.h(trim);
        this.a = trim;
        this.b = str2;
        this.c = hzVar;
    }

    public static String d(String str, h53.a.EnumC0345a enumC0345a) {
        if (enumC0345a == h53.a.EnumC0345a.xml) {
            Pattern pattern = e;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f.matcher(str).replaceAll("");
                if (!pattern.matcher(replaceAll).matches()) {
                    return null;
                }
                return replaceAll;
            }
        }
        if (enumC0345a == h53.a.EnumC0345a.html) {
            Pattern pattern2 = g;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = h.matcher(str).replaceAll("");
                if (!pattern2.matcher(replaceAll2).matches()) {
                    return null;
                }
                return replaceAll2;
            }
        }
        return str;
    }

    protected static void h(String str, String str2, Appendable appendable, h53.a aVar) throws IOException {
        String d2 = d(str, aVar.p());
        if (d2 == null) {
            return;
        }
        i(d2, str2, appendable, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(String str, String str2, Appendable appendable, h53.a aVar) throws IOException {
        appendable.append(str);
        if (!m(str, str2, aVar)) {
            appendable.append("=\"");
            wi3.e(appendable, hz.z(str2), aVar, true, false, false, false);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    public static boolean j(String str) {
        if (Arrays.binarySearch(d, h07.a(str)) >= 0) {
            return true;
        }
        return false;
    }

    protected static boolean m(String str, String str2, h53.a aVar) {
        if (aVar.p() == h53.a.EnumC0345a.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && j(str)))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public az clone() {
        try {
            return (az) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    /* renamed from: c */
    public String getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: e */
    public String getValue() {
        return hz.z(this.b);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        az azVar = (az) obj;
        String str = this.a;
        if (str == null ? azVar.a != null : !str.equals(azVar.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = azVar.b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public String f() {
        StringBuilder b = wza.b();
        try {
            g(b, new h53("").f1());
            return wza.o(b);
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    protected void g(Appendable appendable, h53.a aVar) throws IOException {
        h(this.a, this.b, appendable, aVar);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // java.util.Map.Entry
    /* renamed from: l */
    public String setValue(String str) {
        int J;
        String str2 = this.b;
        hz hzVar = this.c;
        if (hzVar != null && (J = hzVar.J(this.a)) != -1) {
            str2 = this.c.C(this.a);
            this.c.c[J] = str;
        }
        this.b = str;
        return hz.z(str2);
    }

    public String toString() {
        return f();
    }
}
