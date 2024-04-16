package defpackage;

import im.threads.ui.fragments.ChatFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: NetworkResponse.java */
/* renamed from: iw6  reason: default package */
/* loaded from: classes.dex */
public class iw6 {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<en4> d;
    public final boolean e;
    public final long f;

    @Deprecated
    public iw6(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, a(map), z, j);
    }

    private static List<en4> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new en4(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<en4> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (en4 en4Var : list) {
            treeMap.put(en4Var.a(), en4Var.b());
        }
        return treeMap;
    }

    public iw6(int i, byte[] bArr, boolean z, long j, List<en4> list) {
        this(i, bArr, b(list), list, z, j);
    }

    @Deprecated
    public iw6(byte[] bArr, Map<String, String> map) {
        this((int) ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, bArr, map, false, 0L);
    }

    private iw6(int i, byte[] bArr, Map<String, String> map, List<en4> list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }
}
