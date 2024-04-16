package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
/* compiled from: HandshakedataImpl1.java */
/* renamed from: rm4  reason: default package */
/* loaded from: classes3.dex */
public class rm4 implements lm4 {
    private byte[] a;
    private TreeMap<String, String> b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // defpackage.qm4
    public boolean b(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.qm4
    public Iterator<String> d() {
        return Collections.unmodifiableSet(this.b.keySet()).iterator();
    }

    @Override // defpackage.qm4
    public byte[] e() {
        return this.a;
    }

    @Override // defpackage.qm4
    public String i(String str) {
        String str2 = this.b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // defpackage.lm4
    public void put(String str, String str2) {
        this.b.put(str, str2);
    }
}
