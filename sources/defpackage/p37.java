package defpackage;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.ByteArrayOutputStream;
/* renamed from: p37  reason: default package */
/* loaded from: classes3.dex */
public class p37 implements e23 {
    private b a = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p37$b */
    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        void a(byte[] bArr, int i) {
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i, size());
        }

        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            super.reset();
            tr.g(((ByteArrayOutputStream) this).buf);
        }
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        int size = this.a.size();
        this.a.a(bArr, i);
        reset();
        return size;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return ActionConst.NULL;
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return this.a.size();
    }

    @Override // defpackage.e23
    public void reset() {
        this.a.reset();
    }

    @Override // defpackage.e23
    public void update(byte b2) {
        this.a.write(b2);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
