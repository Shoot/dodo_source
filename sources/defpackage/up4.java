package defpackage;

import java.util.regex.Pattern;
/* compiled from: HtmlBlockParser.java */
/* renamed from: up4  reason: default package */
/* loaded from: classes3.dex */
public class up4 extends x0 {
    private static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final tp4 a;
    private final Pattern b;
    private boolean c;
    private zc0 d;

    /* compiled from: HtmlBlockParser.java */
    /* renamed from: up4$b */
    /* loaded from: classes3.dex */
    public static class b extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            int e = ir7Var.e();
            CharSequence b = ir7Var.b();
            if (ir7Var.d() < 4 && b.charAt(e) == '<') {
                for (int i = 1; i <= 7; i++) {
                    if (i != 7 || !(u96Var.b().e() instanceof aq7)) {
                        Pattern pattern = up4.e[i][0];
                        Pattern pattern2 = up4.e[i][1];
                        if (pattern.matcher(b.subSequence(e, b.length())).find()) {
                            return jd0.d(new up4(pattern2)).b(ir7Var.getIndex());
                        }
                    }
                }
            }
            return jd0.c();
        }
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.x0, defpackage.dd0
    public void f(CharSequence charSequence) {
        this.d.a(charSequence);
        Pattern pattern = this.b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.c = true;
        }
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        if (this.c) {
            return ad0.d();
        }
        if (ir7Var.a() && this.b == null) {
            return ad0.d();
        }
        return ad0.b(ir7Var.getIndex());
    }

    @Override // defpackage.x0, defpackage.dd0
    public void h() {
        this.a.n(this.d.b());
        this.d = null;
    }

    private up4(Pattern pattern) {
        this.a = new tp4();
        this.c = false;
        this.d = new zc0();
        this.b = pattern;
    }
}
