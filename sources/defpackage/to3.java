package defpackage;

import kotlin.Metadata;
/* compiled from: FailedSelectPhoneNumber.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lto3;", "Ldc;", "Lqc;", "a", "", "I", "resultCode", "<init>", "(I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: to3  reason: default package */
/* loaded from: classes4.dex */
public final class to3 implements dc {
    private final int a;

    public to3(int i) {
        this.a = i;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(new bc("select_phone_number"), "result", "fail", false, 4, null), "error_code", Integer.valueOf(this.a), false, 4, null).a();
    }
}
