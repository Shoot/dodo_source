package defpackage;

import org.slf4j.Marker;
/* compiled from: HandshakeImpl1Client.java */
/* renamed from: nm4  reason: default package */
/* loaded from: classes3.dex */
public class nm4 extends rm4 implements j91 {
    private String c = Marker.ANY_MARKER;

    @Override // defpackage.i91
    public String c() {
        return this.c;
    }

    @Override // defpackage.j91
    public void g(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }
}
