package defpackage;

import androidx.fragment.app.Fragment;
import defpackage.cw5;
import kotlin.Metadata;
/* compiled from: LocationSettingsResolver.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Lcw5$c;", "Landroidx/fragment/app/Fragment;", "fragment", "", "requestCode", "", "a", "location_release"}, k = 2, mv = {1, 4, 2})
/* renamed from: gw5  reason: default package */
/* loaded from: classes2.dex */
public final class gw5 {
    public static final void a(cw5.c cVar, Fragment fragment, int i) {
        z65.h(cVar, "$this$resolve");
        z65.h(fragment, "fragment");
        fragment.startIntentSenderForResult(cVar.a().a().getIntentSender(), i, null, 0, 0, 0, null);
    }
}
