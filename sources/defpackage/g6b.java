package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Tag.java */
/* renamed from: g6b  reason: default package */
/* loaded from: classes3.dex */
public class g6b implements Cloneable {
    private static final Map<String, g6b> j = new HashMap();
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private static final String[] q;
    private String a;
    private String b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", ElementGenerator.TYPE_LINK, "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", ElementGenerator.TYPE_VIDEO, "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", ElementGenerator.TEXT_ALIGN_CENTER, "template", "dir", "applet", "marquee", "listing"};
        k = strArr;
        l = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", CrashHianalyticsData.TIME, "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", RemoteMessageConst.MessageBody.PARAM, KustoStorage.KustoTable.COLUMN_SOURCE, "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", RemoteMessageConst.MessageBody.PARAM, KustoStorage.KustoTable.COLUMN_SOURCE, "track", "data", "bdi", Image.TYPE_SMALL, "strike", "nobr"};
        m = new String[]{"meta", ElementGenerator.TYPE_LINK, "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", RemoteMessageConst.MessageBody.PARAM, KustoStorage.KustoTable.COLUMN_SOURCE, "track"};
        n = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", Image.TYPE_SMALL};
        o = new String[]{"pre", "plaintext", "title", "textarea"};
        p = new String[]{"button", "fieldset", "input", "keygen", "object", "output", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "textarea"};
        q = new String[]{"input", "keygen", "object", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "textarea"};
        for (String str : strArr) {
            o(new g6b(str));
        }
        for (String str2 : l) {
            g6b g6bVar = new g6b(str2);
            g6bVar.c = false;
            g6bVar.d = false;
            o(g6bVar);
        }
        for (String str3 : m) {
            g6b g6bVar2 = j.get(str3);
            vvb.j(g6bVar2);
            g6bVar2.e = true;
        }
        for (String str4 : n) {
            g6b g6bVar3 = j.get(str4);
            vvb.j(g6bVar3);
            g6bVar3.d = false;
        }
        for (String str5 : o) {
            g6b g6bVar4 = j.get(str5);
            vvb.j(g6bVar4);
            g6bVar4.g = true;
        }
        for (String str6 : p) {
            g6b g6bVar5 = j.get(str6);
            vvb.j(g6bVar5);
            g6bVar5.h = true;
        }
        for (String str7 : q) {
            g6b g6bVar6 = j.get(str7);
            vvb.j(g6bVar6);
            g6bVar6.i = true;
        }
    }

    private g6b(String str) {
        this.a = str;
        this.b = h07.a(str);
    }

    public static boolean j(String str) {
        return j.containsKey(str);
    }

    private static void o(g6b g6bVar) {
        j.put(g6bVar.a, g6bVar);
    }

    public static g6b q(String str) {
        return r(str, br7.d);
    }

    public static g6b r(String str, br7 br7Var) {
        vvb.j(str);
        Map<String, g6b> map = j;
        g6b g6bVar = map.get(str);
        if (g6bVar == null) {
            String d = br7Var.d(str);
            vvb.h(d);
            String a = h07.a(d);
            g6b g6bVar2 = map.get(a);
            if (g6bVar2 == null) {
                g6b g6bVar3 = new g6b(d);
                g6bVar3.c = false;
                return g6bVar3;
            } else if (br7Var.f() && !d.equals(a)) {
                g6b clone = g6bVar2.clone();
                clone.a = d;
                return clone;
            } else {
                return g6bVar2;
            }
        }
        return g6bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public g6b clone() {
        try {
            return (g6b) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean c() {
        return this.d;
    }

    public String d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6b)) {
            return false;
        }
        g6b g6bVar = (g6b) obj;
        if (this.a.equals(g6bVar.a) && this.e == g6bVar.e && this.d == g6bVar.d && this.c == g6bVar.c && this.g == g6bVar.g && this.f == g6bVar.f && this.h == g6bVar.h && this.i == g6bVar.i) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return !this.c;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public boolean i() {
        return j.containsKey(this.a);
    }

    public boolean l() {
        if (!this.e && !this.f) {
            return false;
        }
        return true;
    }

    public String m() {
        return this.b;
    }

    public boolean n() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6b p() {
        this.f = true;
        return this;
    }

    public String toString() {
        return this.a;
    }
}
