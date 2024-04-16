package defpackage;

import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.zzjq;
import defpackage.n0d;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: n0d  reason: default package */
/* loaded from: classes2.dex */
public abstract class n0d<MessageType extends w0<MessageType, BuilderType>, BuilderType extends n0d<MessageType, BuilderType>> implements j3d {
    @Override // defpackage.j3d
    public final /* synthetic */ j3d W(byte[] bArr) throws zzjq {
        return i(bArr, 0, bArr.length);
    }

    public abstract /* synthetic */ Object clone() throws CloneNotSupportedException;

    public abstract BuilderType i(byte[] bArr, int i, int i2) throws zzjq;

    public abstract BuilderType j(byte[] bArr, int i, int i2, s1 s1Var) throws zzjq;

    @Override // defpackage.j3d
    public final /* synthetic */ j3d o1(byte[] bArr, s1 s1Var) throws zzjq {
        return j(bArr, 0, bArr.length, s1Var);
    }
}
