package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrashlyticsRemoteConfigListener.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Li12;", "Lnn9;", "Lln9;", "rolloutsState", "", "a", "Lmub;", "Lmub;", "userMetadata", "<init>", "(Lmub;)V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
/* renamed from: i12  reason: default package */
/* loaded from: classes2.dex */
public final class i12 implements nn9 {
    private final mub a;

    public i12(mub mubVar) {
        z65.h(mubVar, "userMetadata");
        this.a = mubVar;
    }

    @Override // defpackage.nn9
    public void a(ln9 ln9Var) {
        int w;
        z65.h(ln9Var, "rolloutsState");
        mub mubVar = this.a;
        Set<in9> b = ln9Var.b();
        z65.g(b, "rolloutsState.rolloutAssignments");
        Set<in9> set = b;
        w = lc1.w(set, 10);
        ArrayList arrayList = new ArrayList(w);
        for (in9 in9Var : set) {
            arrayList.add(jn9.b(in9Var.d(), in9Var.b(), in9Var.c(), in9Var.f(), in9Var.e()));
        }
        mubVar.o(arrayList);
        rx5.f().b("Updated Crashlytics Rollout State");
    }
}
