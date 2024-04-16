package defpackage;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: ixc  reason: default package */
/* loaded from: classes2.dex */
final class ixc implements Comparator<g2d> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ixc(jyc jycVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(g2d g2dVar, g2d g2dVar2) {
        return g2dVar.getClass().getCanonicalName().compareTo(g2dVar2.getClass().getCanonicalName());
    }
}
