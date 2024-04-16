package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import kotlin.Metadata;
/* compiled from: PermissionFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lky7;", "", "", "", "permissions", "Loz3;", "Lqy7;", "a", "([Ljava/lang/String;)Loz3;", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ky7  reason: default package */
/* loaded from: classes2.dex */
public interface ky7 {
    public static final a a = a.a;

    /* compiled from: PermissionFlow.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¨\u0006\u000b"}, d2 = {"Lky7$a;", "", "Landroidx/fragment/app/d;", "activity", "Lky7;", "b", "Landroidx/fragment/app/Fragment;", "fragment", "a", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ky7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ky7 a(Fragment fragment) {
            z65.h(fragment, "fragment");
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            z65.g(childFragmentManager, "fragment.childFragmentManager");
            return new ly7(new q64(childFragmentManager));
        }

        public final ky7 b(d dVar) {
            z65.h(dVar, "activity");
            FragmentManager supportFragmentManager = dVar.getSupportFragmentManager();
            z65.g(supportFragmentManager, "activity.supportFragmentManager");
            return new ly7(new q64(supportFragmentManager));
        }
    }

    oz3<qy7> a(String... strArr);
}
