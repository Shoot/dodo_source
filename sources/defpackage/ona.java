package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: ona  reason: default package */
/* loaded from: classes3.dex */
public class ona implements AlgorithmParameterSpec {
    private Map a;

    public ona() {
        this(new HashMap());
    }

    public Map a() {
        return this.a;
    }

    private ona(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }
}
