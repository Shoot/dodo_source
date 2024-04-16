package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class i implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0221a interfaceC0221a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.a = interfaceC0221a.b(context, str);
        int a = interfaceC0221a.a(context, str, true);
        bVar.b = a;
        int i = bVar.a;
        if (i == 0) {
            i = 0;
            if (a == 0) {
                bVar.c = 0;
                return bVar;
            }
        }
        if (a >= i) {
            bVar.c = 1;
        } else {
            bVar.c = -1;
        }
        return bVar;
    }
}
