package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.w6;
import java.util.EnumMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class h {
    private final EnumMap<w6.a, j> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        this.a = new EnumMap<>(w6.a.class);
    }

    public static h a(String str) {
        EnumMap enumMap = new EnumMap(w6.a.class);
        if (str.length() >= w6.a.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                w6.a[] values = w6.a.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (w6.a) j.i(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new h(enumMap);
            }
        }
        return new h();
    }

    public final j b(w6.a aVar) {
        j jVar = this.a.get(aVar);
        if (jVar == null) {
            return j.UNSET;
        }
        return jVar;
    }

    public final void c(w6.a aVar, int i) {
        j jVar = j.UNSET;
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i == 30) {
                            jVar = j.INITIALIZATION;
                        }
                    }
                } else {
                    jVar = j.MANIFEST;
                }
            }
            jVar = j.API;
        } else {
            jVar = j.TCF;
        }
        this.a.put((EnumMap<w6.a, j>) aVar, (w6.a) jVar);
    }

    public final void d(w6.a aVar, j jVar) {
        this.a.put((EnumMap<w6.a, j>) aVar, (w6.a) jVar);
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (w6.a aVar : w6.a.values()) {
            j jVar = this.a.get(aVar);
            if (jVar == null) {
                jVar = j.UNSET;
            }
            c = jVar.a;
            sb.append(c);
        }
        return sb.toString();
    }

    private h(EnumMap<w6.a, j> enumMap) {
        EnumMap<w6.a, j> enumMap2 = new EnumMap<>(w6.a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
