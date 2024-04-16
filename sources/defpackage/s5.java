package defpackage;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
/* compiled from: ActivityResultContract.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Ls5;", "I", "O", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "resultCode", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, c.a, "(ILandroid/content/Intent;)Ljava/lang/Object;", "Ls5$a;", "b", "(Landroid/content/Context;Ljava/lang/Object;)Ls5$a;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s5  reason: default package */
/* loaded from: classes.dex */
public abstract class s5<I, O> {

    /* compiled from: ActivityResultContract.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Ls5$a;", "T", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: s5$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        private final T a;

        public a(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, I i);

    public a<O> b(Context context, I i) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return null;
    }

    public abstract O c(int i, Intent intent);
}
