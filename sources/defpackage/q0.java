package defpackage;

import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;
/* compiled from: AVIFParser.java */
/* renamed from: q0  reason: default package */
/* loaded from: classes.dex */
public class q0 {
    public static boolean a(m79 m79Var) {
        r0 r0Var;
        if (m79Var instanceof r0) {
            r0Var = (r0) m79Var;
        } else {
            r0Var = new r0(m79Var);
        }
        try {
            return AvifDecoder.isAvifImage(r0Var.a());
        } catch (IOException unused) {
            return false;
        }
    }
}
