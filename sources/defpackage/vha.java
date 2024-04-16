package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lvha;", "Li2;", "Ltha;", "flow", "", c.a, "", "Lcv1;", "", DateTokenConverter.CONVERTER_KEY, "(Ltha;)[Lcv1;", "", "a", "J", "index", "b", "Lcv1;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: vha  reason: default package */
/* loaded from: classes3.dex */
public final class vha extends i2<tha<?>> {
    public long a = -1;
    public cv1<? super Unit> b;

    @Override // defpackage.i2
    /* renamed from: c */
    public boolean a(tha<?> thaVar) {
        if (this.a >= 0) {
            return false;
        }
        this.a = thaVar.X();
        return true;
    }

    @Override // defpackage.i2
    /* renamed from: d */
    public cv1<Unit>[] b(tha<?> thaVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return thaVar.W(j);
    }
}
