package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufValueEncoderContext.java */
/* renamed from: ur8  reason: default package */
/* loaded from: classes2.dex */
public class ur8 implements hwb {
    private boolean a = false;
    private boolean b = false;
    private hs3 c;
    private final rr8 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ur8(rr8 rr8Var) {
        this.d = rr8Var;
    }

    private void a() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // defpackage.hwb
    @NonNull
    public hwb b(String str) throws IOException {
        a();
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.hwb
    @NonNull
    public hwb c(boolean z) throws IOException {
        a();
        this.d.o(this.c, z, this.b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(hs3 hs3Var, boolean z) {
        this.a = false;
        this.c = hs3Var;
        this.b = z;
    }
}
