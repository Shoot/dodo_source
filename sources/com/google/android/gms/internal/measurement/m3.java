package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class m3 extends n3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m3(int i) {
        super(i);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void h() {
        if (!q()) {
            for (int i = 0; i < i(); i++) {
                Map.Entry j = j(i);
                if (((h2d) j.getKey()).f()) {
                    j.setValue(Collections.unmodifiableList((List) j.getValue()));
                }
            }
            for (Map.Entry entry : l()) {
                if (((h2d) entry.getKey()).f()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.h();
    }
}
