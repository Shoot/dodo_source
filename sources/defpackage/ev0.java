package defpackage;

import kotlin.Metadata;
/* compiled from: ChangeLocationLogicFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lev0;", "", "Ldt5;", "newLocality", "", "forceChangeLocality", "Ldv0;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ev0  reason: default package */
/* loaded from: classes4.dex */
public interface ev0 {

    /* compiled from: ChangeLocationLogicFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ev0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ dv0 a(ev0 ev0Var, dt5 dt5Var, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return ev0Var.a(dt5Var, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }

    dv0 a(dt5 dt5Var, boolean z);
}
