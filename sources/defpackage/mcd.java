package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.h;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: mcd  reason: default package */
/* loaded from: classes2.dex */
public final class mcd extends b implements yd0 {
    private static final a.g k;
    private static final a.AbstractC0215a l;
    private static final a m;

    static {
        a.g gVar = new a.g();
        k = gVar;
        mad madVar = new mad();
        l = madVar;
        m = new a("Blockstore.API", madVar, gVar);
    }

    public mcd(@NonNull Context context) {
        super(context, m, a.d.I4, b.a.c);
    }

    @Override // defpackage.yd0
    public final y6b<RetrieveBytesResponse> b(final RetrieveBytesRequest retrieveBytesRequest) {
        gh8.k(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        return i(h.a().e(imc.h).c(new yc9() { // from class: b9d
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                mcd mcdVar = mcd.this;
                RetrieveBytesRequest retrieveBytesRequest2 = retrieveBytesRequest;
                ((cxc) ((zvc) obj).A()).V1(new dbd(mcdVar, (a7b) obj2), retrieveBytesRequest2);
            }
        }).d(false).f(1668).a());
    }

    @Override // defpackage.yd0
    public final y6b<Integer> c(final StoreBytesData storeBytesData) {
        return m(h.a().e(imc.d, imc.f).c(new yc9() { // from class: j6d
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                mcd mcdVar = mcd.this;
                StoreBytesData storeBytesData2 = storeBytesData;
                ((cxc) ((zvc) obj).A()).W1(new tad(mcdVar, (a7b) obj2), storeBytesData2);
            }
        }).f(1645).d(false).a());
    }

    @Override // defpackage.yd0
    public final y6b<Boolean> d(final DeleteBytesRequest deleteBytesRequest) {
        gh8.k(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        return m(h.a().e(imc.g).c(new yc9() { // from class: ead
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                mcd mcdVar = mcd.this;
                DeleteBytesRequest deleteBytesRequest2 = deleteBytesRequest;
                ((cxc) ((zvc) obj).A()).T1(new xbd(mcdVar, (a7b) obj2), deleteBytesRequest2);
            }
        }).d(false).f(1669).a());
    }

    @Override // defpackage.yd0
    public final y6b<Boolean> e() {
        return i(h.a().e(imc.e).c(new yc9() { // from class: t7d
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                ((cxc) ((zvc) obj).A()).U1(new fcd(mcd.this, (a7b) obj2));
            }
        }).d(false).f(1651).a());
    }
}
