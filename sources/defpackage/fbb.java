package defpackage;

import org.java_websocket.exceptions.InvalidDataException;
/* compiled from: TextFrame.java */
/* renamed from: fbb  reason: default package */
/* loaded from: classes3.dex */
public class fbb extends vk2 {
    public fbb() {
        super(ga7.TEXT);
    }

    @Override // defpackage.vk2, defpackage.j74
    public void h() throws InvalidDataException {
        super.h();
        if (qw0.b(f())) {
            return;
        }
        throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
    }
}
