package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdd;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: mvc  reason: default package */
/* loaded from: classes2.dex */
public final class mvc extends jvc.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Context g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ jvc i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvc(jvc jvcVar, String str, String str2, Context context, Bundle bundle) {
        super(jvcVar);
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = bundle;
        this.i = jvcVar;
    }

    @Override // defpackage.jvc.a
    public final void a() {
        boolean D;
        String str;
        String str2;
        String str3;
        guc gucVar;
        boolean z;
        guc gucVar2;
        String str4;
        String str5;
        try {
            D = this.i.D(this.e, this.f);
            if (D) {
                String str6 = this.f;
                String str7 = this.e;
                str5 = this.i.a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            gh8.j(this.g);
            jvc jvcVar = this.i;
            jvcVar.i = jvcVar.e(this.g, true);
            gucVar = this.i.i;
            if (gucVar == null) {
                str4 = this.i.a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.a(this.g, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.c(this.g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a, c);
            if (c < a) {
                z = true;
            } else {
                z = false;
            }
            zzdd zzddVar = new zzdd(84002L, max, z, str, str2, str3, this.h, kzc.a(this.g));
            gucVar2 = this.i.i;
            ((guc) gh8.j(gucVar2)).initialize(k57.U1(this.g), zzddVar, this.a);
        } catch (Exception e) {
            this.i.l(e, true, false);
        }
    }
}
