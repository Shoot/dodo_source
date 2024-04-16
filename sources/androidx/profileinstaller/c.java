package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;
/* compiled from: DexProfileData.java */
/* loaded from: classes.dex */
class c {
    @NonNull
    final String a;
    @NonNull
    final String b;
    final long c;
    long d;
    int e;
    final int f;
    final int g;
    @NonNull
    int[] h;
    @NonNull
    final TreeMap<Integer, Integer> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@NonNull String str, @NonNull String str2, long j, long j2, int i, int i2, int i3, @NonNull int[] iArr, @NonNull TreeMap<Integer, Integer> treeMap) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = iArr;
        this.i = treeMap;
    }
}
