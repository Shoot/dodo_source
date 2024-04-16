package com.google.android.gms.internal.measurement;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class e1 implements Comparator<d1> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(d1 d1Var, d1 d1Var2) {
        d1 d1Var3 = d1Var;
        d1 d1Var4 = d1Var2;
        a1d a1dVar = (a1d) d1Var3.iterator();
        a1d a1dVar2 = (a1d) d1Var4.iterator();
        while (a1dVar.hasNext() && a1dVar2.hasNext()) {
            int compareTo = Integer.valueOf(d1.f(a1dVar.zza())).compareTo(Integer.valueOf(d1.f(a1dVar2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(d1Var3.P()).compareTo(Integer.valueOf(d1Var4.P()));
    }
}
