package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: InlineParserContextImpl.java */
/* renamed from: g35  reason: default package */
/* loaded from: classes3.dex */
public class g35 implements f35 {
    private final List<mu2> a;
    private final Map<String, kq5> b;

    public g35(List<mu2> list, Map<String, kq5> map) {
        this.a = list;
        this.b = map;
    }

    @Override // defpackage.f35
    public kq5 a(String str) {
        return this.b.get(str);
    }

    @Override // defpackage.f35
    public List<mu2> b() {
        return this.a;
    }
}
