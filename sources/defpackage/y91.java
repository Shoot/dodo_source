package defpackage;

import com.huawei.hms.adapter.internal.CommonCode;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
/* compiled from: CloseFrame.java */
/* renamed from: y91  reason: default package */
/* loaded from: classes3.dex */
public class y91 extends iv1 {
    private int h;
    private String i;

    public y91() {
        super(ga7.CLOSING);
        r("");
        q(1000);
    }

    private void s() {
        byte[] f = qw0.f(this.i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(f.length + 2);
        allocate2.put(allocate);
        allocate2.put(f);
        allocate2.rewind();
        super.j(allocate2);
    }

    private void t(ByteBuffer byteBuffer, int i) throws InvalidDataException {
        try {
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.i = qw0.e(byteBuffer);
            } catch (IllegalArgumentException unused) {
                throw new InvalidDataException(1007);
            }
        } finally {
            byteBuffer.position(i);
        }
    }

    @Override // defpackage.j74
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        y91 y91Var = (y91) obj;
        if (this.h != y91Var.h) {
            return false;
        }
        String str = this.i;
        String str2 = y91Var.i;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j74, defpackage.i74
    public ByteBuffer f() {
        if (this.h == 1005) {
            return dk0.a();
        }
        return super.f();
    }

    @Override // defpackage.iv1, defpackage.j74
    public void h() throws InvalidDataException {
        super.h();
        if (this.h == 1007 && this.i.isEmpty()) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
        if (this.h == 1005 && this.i.length() > 0) {
            throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "A close frame must have a closecode if it has a reason");
        }
        int i = this.h;
        if (i > 1015 && i < 3000) {
            throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "Trying to send an illegal close code!");
        }
        if (i != 1006 && i != 1015 && i != 1005 && i <= 4999 && i >= 1000 && i != 1004) {
            return;
        }
        throw new InvalidFrameException("closecode must not be sent over the wire: " + this.h);
    }

    @Override // defpackage.j74
    public int hashCode() {
        int i;
        int hashCode = ((super.hashCode() * 31) + this.h) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // defpackage.j74
    public void j(ByteBuffer byteBuffer) {
        this.h = 1005;
        this.i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.h = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.h = CommonCode.BusInterceptor.PRIVACY_CANCEL;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.h = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                t(byteBuffer, byteBuffer.position());
            } catch (InvalidDataException unused) {
                this.h = 1007;
                this.i = null;
            }
        }
    }

    public int o() {
        return this.h;
    }

    public String p() {
        return this.i;
    }

    public void q(int i) {
        this.h = i;
        if (i == 1015) {
            this.h = 1005;
            this.i = "";
        }
        s();
    }

    public void r(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
        s();
    }

    @Override // defpackage.j74
    public String toString() {
        return super.toString() + "code: " + this.h;
    }
}
