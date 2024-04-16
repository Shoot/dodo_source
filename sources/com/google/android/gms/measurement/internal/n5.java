package com.google.android.gms.measurement.internal;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class n5 implements m6d {
    private final /* synthetic */ String a;
    private final /* synthetic */ g5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n5(g5 g5Var, String str) {
        this.a = str;
        this.b = g5Var;
    }

    @Override // defpackage.m6d
    public final String k(String str) {
        Map map;
        map = this.b.d;
        Map map2 = (Map) map.get(this.a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
