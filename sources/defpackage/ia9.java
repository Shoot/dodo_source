package defpackage;

import kotlin.Metadata;
/* compiled from: SnapshotMutationPolicy.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lia9;", "Lppa;", "", "a", "b", "", "", "toString", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ia9  reason: default package */
/* loaded from: classes.dex */
final class ia9 implements ppa<Object> {
    public static final ia9 a = new ia9();

    private ia9() {
    }

    @Override // defpackage.ppa
    public /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return opa.a(this, obj, obj2, obj3);
    }

    @Override // defpackage.ppa
    public boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
