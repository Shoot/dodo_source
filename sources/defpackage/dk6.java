package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: MindboxLoggerImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, d2 = {"Ldk6;", "", "", "message", "", "exception", "", "g", Image.TYPE_HIGH, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dk6  reason: default package */
/* loaded from: classes.dex */
public interface dk6 {

    /* compiled from: MindboxLoggerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: dk6$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(dk6 dk6Var, String str, Throwable th) {
            z65.h(str, "message");
            gk6.b(dk6Var, str, th);
        }

        public static /* synthetic */ void b(dk6 dk6Var, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                dk6Var.h(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logE");
        }

        public static void c(dk6 dk6Var, String str) {
            z65.h(str, "message");
            gk6.d(dk6Var, str);
        }

        public static void d(dk6 dk6Var, String str, Throwable th) {
            z65.h(str, "message");
            gk6.e(dk6Var, str, th);
        }

        public static /* synthetic */ void e(dk6 dk6Var, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                dk6Var.g(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logW");
        }
    }

    void g(String str, Throwable th);

    void h(String str, Throwable th);
}
