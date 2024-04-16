package defpackage;

import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SnackBarExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0086\u0002¨\u0006\n"}, d2 = {"Lsoa;", "", "Lkotlin/Function1;", "Luoa;", "", "builder", "Lcom/google/android/material/snackbar/Snackbar;", "a", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: soa  reason: default package */
/* loaded from: classes.dex */
public final class soa {
    public static final soa a = new soa();

    private soa() {
    }

    public final Snackbar a(Function1<? super uoa, Unit> function1) {
        z65.h(function1, "builder");
        uoa uoaVar = new uoa();
        function1.invoke(uoaVar);
        return uoaVar.b();
    }
}
