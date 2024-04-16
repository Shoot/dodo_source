package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MaskKeyframeAnimation.java */
/* renamed from: d96  reason: default package */
/* loaded from: classes.dex */
public class d96 {
    private final List<t70<yga, Path>> a;
    private final List<t70<Integer, Integer>> b;
    private final List<c96> c;

    public d96(List<c96> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<t70<yga, Path>> a() {
        return this.a;
    }

    public List<c96> b() {
        return this.c;
    }

    public List<t70<Integer, Integer>> c() {
        return this.b;
    }
}
