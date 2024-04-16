package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import defpackage.h53;
import java.io.IOException;
import java.util.Iterator;
/* compiled from: XmlDeclaration.java */
/* renamed from: wbc  reason: default package */
/* loaded from: classes3.dex */
public class wbc extends io5 {
    private final boolean e;

    public wbc(String str, boolean z) {
        vvb.j(str);
        this.d = str;
        this.e = z;
    }

    private void a0(Appendable appendable, h53.a aVar) throws IOException {
        Iterator<az> it = f().iterator();
        while (it.hasNext()) {
            az next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (!key.equals(y())) {
                appendable.append(' ');
                appendable.append(key);
                if (!value.isEmpty()) {
                    appendable.append("=\"");
                    wi3.e(appendable, value, aVar, true, false, false, false);
                    appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                }
            }
        }
    }

    @Override // defpackage.kz6
    void C(Appendable appendable, int i, h53.a aVar) throws IOException {
        CharSequence charSequence;
        Appendable append = appendable.append("<");
        boolean z = this.e;
        String str = CallerData.NA;
        if (z) {
            charSequence = "!";
        } else {
            charSequence = CallerData.NA;
        }
        append.append(charSequence).append(V());
        a0(appendable, aVar);
        if (this.e) {
            str = "!";
        }
        appendable.append(str).append(">");
    }

    @Override // defpackage.kz6
    /* renamed from: Z */
    public wbc m() {
        return (wbc) super.clone();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
    }

    public String b0() {
        return V();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ kz6 d(String str, String str2) {
        return super.d(str, str2);
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String e(String str) {
        return super.e(str);
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ kz6 p() {
        return super.p();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ boolean r(String str) {
        return super.r(str);
    }

    @Override // defpackage.kz6
    public String toString() {
        return A();
    }

    @Override // defpackage.kz6
    public String y() {
        return "#declaration";
    }

    @Override // defpackage.kz6
    void D(Appendable appendable, int i, h53.a aVar) {
    }
}
