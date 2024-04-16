package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import defpackage.h53;
import java.io.IOException;
/* compiled from: DocumentType.java */
/* renamed from: o53  reason: default package */
/* loaded from: classes3.dex */
public class o53 extends io5 {
    public o53(String str, String str2, String str3) {
        vvb.j(str);
        vvb.j(str2);
        vvb.j(str3);
        d(Action.NAME_ATTRIBUTE, str);
        d("publicId", str2);
        d("systemId", str3);
        b0();
    }

    private boolean Z(String str) {
        return !wza.g(e(str));
    }

    private void b0() {
        if (Z("publicId")) {
            d("pubSysKey", "PUBLIC");
        } else if (Z("systemId")) {
            d("pubSysKey", "SYSTEM");
        }
    }

    @Override // defpackage.kz6
    void C(Appendable appendable, int i, h53.a aVar) throws IOException {
        if (this.b > 0 && aVar.o()) {
            appendable.append('\n');
        }
        if (aVar.p() == h53.a.EnumC0345a.html && !Z("publicId") && !Z("systemId")) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (Z(Action.NAME_ATTRIBUTE)) {
            appendable.append(" ").append(e(Action.NAME_ATTRIBUTE));
        }
        if (Z("pubSysKey")) {
            appendable.append(" ").append(e("pubSysKey"));
        }
        if (Z("publicId")) {
            appendable.append(" \"").append(e("publicId")).append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        if (Z("systemId")) {
            appendable.append(" \"").append(e("systemId")).append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        appendable.append('>');
    }

    public void a0(String str) {
        if (str != null) {
            d("pubSysKey", str);
        }
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
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

    @Override // defpackage.kz6
    public String y() {
        return "#doctype";
    }

    @Override // defpackage.kz6
    void D(Appendable appendable, int i, h53.a aVar) {
    }
}
