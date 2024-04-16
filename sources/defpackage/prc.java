package defpackage;

import java.util.Arrays;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: prc  reason: default package */
/* loaded from: classes2.dex */
public final class prc implements Comparator<bpc> {
    private final /* synthetic */ ioc a;
    private final /* synthetic */ xzc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public prc(ioc iocVar, xzc xzcVar) {
        this.a = iocVar;
        this.b = xzcVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(bpc bpcVar, bpc bpcVar2) {
        bpc bpcVar3 = bpcVar;
        bpc bpcVar4 = bpcVar2;
        ioc iocVar = this.a;
        xzc xzcVar = this.b;
        if (bpcVar3 instanceof upc) {
            if (bpcVar4 instanceof upc) {
                return 0;
            }
            return 1;
        } else if (bpcVar4 instanceof upc) {
            return -1;
        } else {
            if (iocVar == null) {
                return bpcVar3.g().compareTo(bpcVar4.g());
            }
            return (int) eyc.a(iocVar.b(xzcVar, Arrays.asList(bpcVar3, bpcVar4)).f().doubleValue());
        }
    }
}
