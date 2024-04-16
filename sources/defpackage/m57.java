package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: m57  reason: default package */
/* loaded from: classes2.dex */
public final class m57 {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* renamed from: m57$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final List a;
        private final Object b;

        /* synthetic */ a(Object obj, xnc xncVar) {
            gh8.j(obj);
            this.b = obj;
            this.a = new ArrayList();
        }

        @NonNull
        public a a(@NonNull String str, Object obj) {
            List list = this.a;
            gh8.j(str);
            String valueOf = String.valueOf(obj);
            list.add(str + ContainerUtils.KEY_VALUE_DELIMITER + valueOf);
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append(CoreConstants.CURLY_LEFT);
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(CoreConstants.CURLY_RIGHT);
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int b(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    public static a c(@NonNull Object obj) {
        return new a(obj, null);
    }
}
