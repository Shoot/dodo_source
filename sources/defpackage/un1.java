package defpackage;

import android.content.Intent;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CompositeActivityResultHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lun1;", "Lz5;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", c.a, "", "a", "Ljava/util/Collection;", "handlers", "<init>", "(Ljava/util/Collection;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: un1  reason: default package */
/* loaded from: classes.dex */
public final class un1 implements z5 {
    private final Collection<z5> a;

    /* JADX WARN: Multi-variable type inference failed */
    public un1(Collection<? extends z5> collection) {
        z65.h(collection, "handlers");
        this.a = collection;
    }

    @Override // defpackage.z5
    public void c(int i, int i2, Intent intent) {
        for (z5 z5Var : this.a) {
            z5Var.c(i, i2, intent);
        }
    }
}
