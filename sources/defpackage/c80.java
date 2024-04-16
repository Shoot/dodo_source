package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.d;
import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatActivity;
/* compiled from: BaseMvpActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u0006H\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lc80;", "Lmoxy/MvpAppCompatActivity;", "Ly60;", "Llm1;", "", "statusBarColor", "", "c2", "navigationBarColor", "E1", "l0", "", "n7", "y", "Lkm1;", "a", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "<init>", "()V", "b", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c80  reason: default package */
/* loaded from: classes2.dex */
public abstract class c80 extends MvpAppCompatActivity implements y60, lm1 {
    public static final a b = new a(null);
    private final km1 a = eu2.b(this);

    /* compiled from: BaseMvpActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lc80$a;", "", "", "EXTRA_KEY_APP_RESTARTED", "Ljava/lang/String;", "<init>", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c80$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.D(true);
    }

    @Override // defpackage.y60
    public void E1(int i) {
        g6c g6cVar = g6c.a;
        Window window = getWindow();
        z65.g(window, "getWindow(...)");
        g6cVar.b(window, i);
    }

    @Override // defpackage.y60
    public void c2(int i) {
        g6c g6cVar = g6c.a;
        Window window = getWindow();
        z65.g(window, "getWindow(...)");
        g6cVar.e(window, i);
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.a;
    }

    @Override // defpackage.y60
    public void l0() {
        if (isFinishing()) {
            return;
        }
        finish();
        startActivity(new Intent(this, getClass()));
    }

    public final boolean n7() {
        Boolean bool;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            bool = Boolean.valueOf(extras.getBoolean("app_restarted"));
        } else {
            bool = null;
        }
        return ((Boolean) mh5.c(bool, Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.y60
    public void y() {
        Intent putExtra = new Intent(this, getClass()).putExtra("app_restarted", true);
        z65.g(putExtra, "putExtra(...)");
        ProcessPhoenix.a(this, putExtra);
    }
}
