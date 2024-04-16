package defpackage;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
/* compiled from: ControlFrame.java */
/* renamed from: iv1  reason: default package */
/* loaded from: classes3.dex */
public abstract class iv1 extends j74 {
    public iv1(ga7 ga7Var) {
        super(ga7Var);
    }

    @Override // defpackage.j74
    public void h() throws InvalidDataException {
        if (e()) {
            if (!a()) {
                if (!b()) {
                    if (!d()) {
                        return;
                    }
                    throw new InvalidFrameException("Control frame can't have rsv3==true set");
                }
                throw new InvalidFrameException("Control frame can't have rsv2==true set");
            }
            throw new InvalidFrameException("Control frame can't have rsv1==true set");
        }
        throw new InvalidFrameException("Control frame can't have fin==false set");
    }
}
