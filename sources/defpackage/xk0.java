package defpackage;

import defpackage.h53;
import java.io.IOException;
import org.jsoup.UncheckedIOException;
/* compiled from: CDataNode.java */
/* renamed from: xk0  reason: default package */
/* loaded from: classes3.dex */
public class xk0 extends fcb {
    public xk0(String str) {
        super(str);
    }

    @Override // defpackage.fcb, defpackage.kz6
    void C(Appendable appendable, int i, h53.a aVar) throws IOException {
        appendable.append("<![CDATA[").append(a0());
    }

    @Override // defpackage.fcb, defpackage.kz6
    void D(Appendable appendable, int i, h53.a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // defpackage.fcb, defpackage.kz6
    /* renamed from: d0 */
    public xk0 m() {
        return (xk0) super.m();
    }

    @Override // defpackage.fcb, defpackage.kz6
    public String y() {
        return "#cdata";
    }
}
