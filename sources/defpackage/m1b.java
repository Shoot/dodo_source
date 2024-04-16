package defpackage;

import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lm1b;", "Lkua;", "", "Ltha;", "delta", "", "Z", "Y", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: m1b  reason: default package */
/* loaded from: classes3.dex */
public final class m1b extends tha<Integer> implements kua<Integer> {
    public m1b(int i) {
        super(1, Integer.MAX_VALUE, zg0.DROP_OLDEST);
        a(Integer.valueOf(i));
    }

    @Override // defpackage.kua
    /* renamed from: Y */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(L().intValue());
        }
        return valueOf;
    }

    public final boolean Z(int i) {
        boolean a;
        synchronized (this) {
            a = a(Integer.valueOf(L().intValue() + i));
        }
        return a;
    }
}
